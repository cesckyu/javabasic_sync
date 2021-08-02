import java.util.Scanner;

public class Factorial3 {

    public static void main(String[] args) {
        int i;
        int fac = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("1~10 사이의 정수 입력 : ");
        int userValue = sc.nextInt();
        
        if(userValue < 1 || userValue > 10){
            while(userValue < 1 || userValue > 10){
                System.out.print("1~10 사이의 정수 입력 : ");
                userValue = sc.nextInt();
            }

        } else {  
            for (i = 1; i <= userValue; i++){
            fac = fac * i;
            } 
            System.out.println(userValue+"! : "+fac);    
        }
        
    }
}

   
    

    





