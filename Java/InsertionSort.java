import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] data = {8,5,6,1,10,25,3};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data) {
        for(int i=1; i<data.length; i++) {
            int curr = data[i];
            int j = i-1;
            while(j>=0 && data[j]>curr) {
                System.out.println(j + " " + data[j]);
                data[j+1] = data[j];
                j--;
            data[j+1] = curr;
            }
        }
    }
}