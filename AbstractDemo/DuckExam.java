public class DuckExam {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        // Bird b = new Bird(); // 추상 클래스는 부모 클래스로 사용할 수는 있지만, 
                                // 객체를 생성할 수는 없다
    }
    
}
