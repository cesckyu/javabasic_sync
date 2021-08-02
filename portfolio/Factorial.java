import java.util.Scanner;

public class Factorial {

    public static int factorial(int userValue){

        if (userValue == 1){
            return 1;
        } 
        else {
            return userValue * factorial(userValue -1);
        } 
    }

    public static void main(String[] args) {
        int userValue; 

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("1~10 사이의 정수 입력 : ");
            userValue = sc.nextInt();
            } 
            while (userValue > 10 || userValue < 1);
        
        System.out.println(userValue+"! : "+factorial(userValue));    
    }
    
}
