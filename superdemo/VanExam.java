public class VanExam {
    public static void main(String[] args) {

        // Van van = new Van();
        // van.run();

        Car c= new Van();   // Van 타입이 Car 타입(부모)을 가리키고 있음
        c.run();
        // c.ppangppang(); //부모 타입으로 자식을 가리킬 수는 있지만 
                        //이때 부모가 가진 메서드만 사용 가능

        Van van = (Van) c ; // 다시 자식 형으로 변형
        van.run();
        van.ppangppang();

    }
}
