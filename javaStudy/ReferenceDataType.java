package javaStudy;


public class ReferenceDataType {
    
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str1 == str2){
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        }

        if (str3 == str4){
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        } else {
            System.out.println("서로 다른 레퍼런스 입니다.");
        }

        if (str1 == str3){
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        } else {
            System.out.println("서로 다른 레퍼런스 입니다.");
        }
        
        // 해쉬 주소값 찾는 방법
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));


    }
}
