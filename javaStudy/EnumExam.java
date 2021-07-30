package javaStudy;

public class EnumExam {
                        //static한 필드의 값들(상수)
    public static final String MALE = "MALE";   //final은 상수(변하지 않는)에 사용
    public static final String FEMALE = "FEMALE";   //상수 선언 시 대문자가 관례
 
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;    // 클래스명.상수
        gender1 = EnumExam.FEMALE;

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        // gender2 = "boy";
        System.out.println(gender2);
    }
}
        //Enum 이름은 클래스 명명 규칙을 따르며, 세부 항목의 이름은 모두 대문자를 사용
enum Gender{  
    MALE, FEMALE;
}