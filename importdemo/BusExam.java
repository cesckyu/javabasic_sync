public class BusExam {
    public static void main(String[] args) {
        
        Bus bus = new Bus("Genesis");
        bus.run();
        bus.ppangppang();

        // Car car = new Car();
        // car.run();
        // car.ppangppang();    //Car는 부모이므로 자식(Bus)의 메서드 사용 불가
        
        // System.out.println(bus.name);
    }
}
