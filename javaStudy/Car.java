package javaStudy;

public class Car {
    String name; // 객체변수(필드)
    int number;

    

    public Car(){               // 1번 기본형
    //     this.name = "이름없음";
    //     this.number = 0;
        this("이름없음", 0); // ==> this 키워드는 자기 자신을 가리킴 
                            // this에 괄호를 붙이면 자기 자신의 생성자를 의미
                            // 자기 자신의 생성자에 ‘이름없음’과 ‘0’을 넣어서 호출
    }

    public Car(String name){        //2번 이름만
        // this.name = name;
        this(name, 0);          // 양식을 3번 형식으로 바꿔주고, 자동으로 3번으로 넘어감
    }

    public Car(String name, int number){        // 3번
        this.name = name;
        this.number = number;
    }

}
