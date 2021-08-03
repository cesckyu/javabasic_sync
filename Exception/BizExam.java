import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class BizExam {
    public static void main(String[] args) {
        
        BizService biz = new BizService();

        biz.bizMethod(5);
        biz.bizMethod(-3);  
        System.out.println("프로그램 종료"); 

        
    }
    
    
    
}
