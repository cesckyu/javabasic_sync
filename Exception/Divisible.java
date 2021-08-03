import java.util.Arrays;

class Divisible {
  
  public int[] divisible(int[] array, int divisor){

      int ArraySize = 0;
      for(int i = 0; i < array.length; i++){
        if(array[i] % divisor == 0){
          ArraySize++;
        }

      }
      int[] ret = new int[ArraySize];
      int index = 0;
      for (int i = 0; i < array.length; i++){
        if(array[i] % divisor == 0){
          ret[index] = array[i];
          index++;
        }
      }
      return ret;
    }
  
  public static void main(String[] args) {
       
    Divisible div = new Divisible();

    int[] array = {5, 9, 7, 10};

    System.out.println(div.divisible(array, 5));
  }
}