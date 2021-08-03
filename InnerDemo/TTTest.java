public class TTTest {
    int value = 10;

    public void scopeTest(int a){
    System.out.println(value);      // 오류 X

    }
    public static void main(String []args) {

        // System.out.println(value);   // 오류

        TTTest t = new TTTest();    // 객체 생성 시 이상 무
        System.out.println(t.value);
    }
}
