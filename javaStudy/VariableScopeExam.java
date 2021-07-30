package javaStudy;

public class VariableScopeExam {
    int globalScope = 10;   // 전역 변수 선언 (+인스턴스 변수 : 인스턴스(객체) 생성 시 생성, 소멸 시 소멸)
    static int staticVal = 7; // => (+클래스 변수 : main에서 인스턴스(객체) 생성 없이 사용 가능)
                                // 따라서 값을 저장할 공간도 하나뿐이므로 서로 공유함

    public void scopeTest(int value) {
        int localScope = 20;    // 지역 변수(메서드 안) 선언

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        
        // System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {    // static -> 
        System.out.println(staticVal);          // 객체 생성 없이 사용 가능

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);

        VariableScopeExam v2 = new VariableScopeExam();

        v1.globalScope = 10;
        v2.globalScope = 20;

        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        ///////////////////////////////////////////
        v1.staticVal = 50;
        v2.staticVal = 100;     // 값을 공유한다!
        VariableScopeExam.staticVal = 200;

        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        System.out.println(VariableScopeExam.staticVal);
            
        }


        /////////////////
        // System.out.println(v1.localScope);
        // System.out.println(value);
    }

