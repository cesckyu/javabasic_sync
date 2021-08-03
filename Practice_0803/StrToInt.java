public class StrToInt {

    public int getStrToInt(String str) {
        char c = str.charAt(0);
        int result = 0;
        int sign = 1;
        int index = 1;

        switch(c){
            case '-' : sign = -1;
            break;
            case '+' : sign = +1;
            break;
            default : index = 0;
        } 
        for(int i = index; i < str.length(); i++){
            result = result * 10 + (str.charAt(i)-'0');        
            }

        return sign * result;

    }

    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1254"));
        System.out.println(strToInt.getStrToInt("+1254"));
        System.out.println(strToInt.getStrToInt("1254"));
    }
}


// for (int i = index; i < str.length(); i++) {
//     result = result * 10 + (str.charAt(i)-'0');
// }
// return sign * result;

