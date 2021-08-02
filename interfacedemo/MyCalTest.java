public class MyCalTest {
    public static void main(String[] args) {
        
        Calculator cal = new MyCal();

        // cal.plus(3, 4);
        // int i = cal.exec(5, 6);

        // System.out.println(i);
        System.out.println(cal.plus(1, 3)); 
        System.out.println(Calculator.exec2(2, 4));     // static 메서드 사용 시 인터페이스명.메서드명(); 형식으로만 호출 
    }
}
