import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] data = {8,7,6,4,2};
		new BubbleSort().sort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				} 
			}
		}
	}

}