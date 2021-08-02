public class Bus extends Car{
    

    public Bus(String name){
        super(name);
    }

    public void ppangppang(){
        System.out.println("빵빵");
    }

    public static void main(String[] args) {

        Car bus1 = new Car("제네시스");
        System.out.println(bus1.name);


    }
}
