package javaStudy;

public class CarExam3 {
    
    public static void main(String[] args) {
        Car c1 = new Car("소방차");
        Car c2 = new Car(); // 생성자가 있기 때문에 문자열을 반드시 줘야함
        Car c3 = new Car("구급차", 1234);

        System.out.println(c1.name);
        System.out.println(c2.name+" "+c2.number);
        System.out.println(c3.name + c3.number);
    }
}
