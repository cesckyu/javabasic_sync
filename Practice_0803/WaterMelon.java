public class WaterMelon {
    public String watermelon (int n) {

        String result = "";
        
        int i, j;
    
        for(i = 1; i <= n; i+=2){
            result += "수";
            for(j = 2; j <= n; j+=2){
                result += "박";
            }
            }
   

      
    
        return result;
            
    }
    

    public static void main(String[] args) {
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));    
        
    
    
    }



}
