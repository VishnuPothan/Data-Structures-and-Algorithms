import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {8,5,6,1,10,25,3};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] data) {
        for(int i=0; i<data.length-1 ; i++) {
            int min = i;
            for(int j=i+1; j<data.length ; j++) 
                if(data[j] < data[min]) 
                    min = j;
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
}
