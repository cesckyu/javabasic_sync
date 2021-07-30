public class RecursiveDemo {
    
    public static void Function(){
        System.out.println("hi");
        Function();
    }

    public static void main(String[] args) {
        Function();
    }
}
