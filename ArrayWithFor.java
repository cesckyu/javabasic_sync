public class ArrayWithFor{

    public static void main(String[] args) {
        // int[] iarray = new int[100];

        // for (int i = 0; i < iarray.length; i++){
        //     iarray[i] = i + 1;
        //  }

        //  int sum = 0;
        //  for (int i = 0; i < iarray.length; i++){
        //     sum = sum + iarray[i];
        //  }

        //  System.out.println(sum);

        ///////////////////////////////////////////////////////
        ///////// 2차원 배열////////////////////////////////////
        ///////////////////////////////////////////////////////

        // int[][] array4 = new int[3][4];
        // array4[0][1] = 10;

        // int[][] array5 = new int[3][];
        // array5[0] = new int[1];
        // array5[0] = new int[2];
        // array5[0] = new int[3];

        // int[][] array6 = {{1}, {1,2},{1,2,3}};
        // System.out.println(array6[0][0]);

        ///////////////////////////////////////////////////////
        ////////////////////for each///////////////////////////
        ///////////////////////////////////////////////////////

        /*   for(자료형 변수명:배열명) {
                반복해서 수행할 문장들;
                }                           */
                
        int[] iarr = {10, 20, 30, 40, 50};
        for(int value:iarr) {
            System.out.println(value);
        }



    }
}