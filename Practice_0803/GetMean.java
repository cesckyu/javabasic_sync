
public class GetMean {
    int sum = 0;

    public int getMean(int[] array) {

        for(int arr : array){
            sum = sum + arr;
            
        }
        return sum / array.length;

    }

    public static void main(String[] args) {
        int[] x = {5, 4, 3};

        GetMean getmean = new GetMean();
        System.out.println(getmean.getMean(x));
    
    }

}
