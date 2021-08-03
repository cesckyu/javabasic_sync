public class charAt {
    public String getMiddle(String word) {
        int index = (int) Math.round(word.length() / 2);

        String middleWord = "";
        
        word.charAt(index);

        if(word.length() % 2 == 0) {
            middleWord += word.charAt(index-1);
        }

        return middleWord += word.charAt(index);
    }

    public static void main(String[] args) {
        charAt se = new charAt();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
        // se.getMiddle("power");
        // se.getMiddle("test");
        // se.getMiddle("println");
    }
}
