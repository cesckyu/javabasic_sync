public class LedTV implements TV {

    int volume, channel;

@Override   // 확인해봐라는 의미
public void turnOn() {
    System.out.println("켜다");
}

@Override
public void turnOff() {
    System.out.println("끄다");
}


@Override
public void changeVolume(int volume){
    this.volume = volume;
    System.out.println("볼륨을 "+this.volume+"으로 조절하다.");
    
}


@Override
public void changeChannel(int channel) {
    this.channel = channel;
    System.out.println("채널을 "+channel+ "번으로 변경하다.");
}

}
