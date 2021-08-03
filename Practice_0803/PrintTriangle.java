public class PrintTriangle {
   
    public String printTriangle(int num) {
        
        for(int i = 0; i < num; i++){   // 정방형
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < num; i++){       //역삼각형
            for(int j = num; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
       
        return "";        
    }
    





    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(5) );
    }
}

