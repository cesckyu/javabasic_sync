public class Bus extends Car{
    

    public Bus(String name){
        super(name);
    }

    public void ppangppang(){
        System.out.println("빵빵");
    }

    public static void main(String[] args) {

        Bus bus1 = new Bus("제네시스");
        System.out.println(bus1.name);

        bus1.ppangppang();

    }
}
