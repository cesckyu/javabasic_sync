public class FindKim {
    public String findKim(String[] seoul) {
        int i;
        int x = 0;

        for (i = 0; i < seoul.length; i++)
            if(seoul[i] == "Kim"){
                x = i;
                break;
            }
            
            return "김 서방은 "+ x + "에 있다";

        }
        


    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};

        System.out.println(kim.findKim(names));
    }
}

