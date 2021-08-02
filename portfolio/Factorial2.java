import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        int userValue; 
        int fac = 1;
        int i;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("1~10 사이의 정수 입력 : ");
        userValue = sc.nextInt();

        for (i = 1; i <= userValue; i++){
            if(userValue < 1 || userValue > 10){
                System.out.print("1~10 사이의 정수 입력 : ");
                userValue = sc.nextInt();
                continue;
            } 
            fac = fac * i;
        }
        System.out.println(userValue+"! : "+fac);    
    }
}

   
    

    





