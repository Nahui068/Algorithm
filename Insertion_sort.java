package algorithm;

public class Insertion_sort extends Compare{

	
	void insertion(int[] input, int length) {
		
		int i;
		
		for(int j=1;j<length;j++) {
			int key = input[j];
			i = j-1;
			
			while(i>=0 && compare(input[i], key)) {
				input[i+1]=input[i];
				i--;
			}
			input[i+1] = key;
			
		}

	}

}

