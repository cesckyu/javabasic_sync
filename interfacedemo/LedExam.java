public class LedExam {
    public static void main(String[] args) {
        
    TV tv = new LedTV();    //TV 인터페이스 타입, LedTV 인스턴스 참조

    tv.turnOff();
    tv.turnOn();
    tv.changeVolume(8);
    tv.changeChannel(39);
    }
}
