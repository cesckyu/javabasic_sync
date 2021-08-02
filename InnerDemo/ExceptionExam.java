public class ExceptionExam {
    public static void main(String[] args) {
        
        int i = 10;
        int j = 0;
        
        try {
            int k = i/j;
            System.out.println(k);
        } 
        
        // catch(ArithmeticException e) {
        //     System.out.println("0으로 나눌 수 없습니다." + e.toString());   // 예외 정보 출력(java....~)
        // }
        
        catch(NullPointerException e) { // Null 에러가 아니기 때문에 처리 불가.
            System.out.println("Null은 처리할 수 없습니다." + e.toString());
        }           // 여기서 종료돼버리기 때문에 main end 출력 x


        // catch(Exception e) {
        //     System.out.println("예외 발생." + e.toString());
        // }

        
        finally{
            System.out.println("예외와 상관없이 무조건 실행!");
        }
        

        System.out.println("main end!!");

    }
}
