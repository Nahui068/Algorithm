package algorithm;

public class Quick_sort extends Compare{
	
	boolean compare (int x, int y) {
		   
		compcount++;
		   
		   if (x >= y)
		       return true;
		   else
		       return false;
		   
	}
	
	void exchange(int[] arr, int n, int m) {
		int tmp = arr[n];
		arr[n]=arr[m];
		arr[m]=tmp;
	}
	
	int partition1(int[] arr, int left, int right) { // pivot이 마지막
		
		int pivot = arr[right];
		int i = left-1;
		
		for(int j=left; j<=right-1; j++) {
			if(compare(pivot,arr[j])) {
				i=i+1;
				exchange(arr,i,j);
			}
		}
		exchange(arr,i+1,right);
		return i+1;
	}
	
	int partition2(int[] arr, int left, int right) {
		
		int idx = (int)(Math.random()*(right-left)+left+1);
		exchange(arr,right,idx);
		return partition1(arr,left,right);
		
	}
	
	int partition3(int[] arr, int left, int right) {
		
		int mid =(int)(left+right)/2;
		int pivot = 0;
		
		if(arr[left]>arr[right] && arr[left]>arr[mid]) {
			if(arr[right]>arr[mid])
				pivot=right;
			else
				pivot=mid;
		}
		else if(arr[right]>arr[left] && arr[right]>arr[mid]) {
			if(arr[left]>arr[mid])
				pivot=left;
			else
				pivot = mid;
		}
		else if(arr[mid]>arr[right] && arr[mid]>arr[left]){
			if(arr[right]>arr[left])
				pivot=right;
			else
				pivot=left;
		}
		exchange(arr,pivot,right);
		return partition1(arr,left,right);
		
	}
	
	void quicksort1(int[] arr, int left, int right) {
		
		int q;
		
		if(left<right) {
			q = partition1(arr,left,right);
			quicksort1(arr,left,q-1);
			quicksort1(arr,q+1,right);
		}
	}
	
	void quicksort2(int[] arr, int left, int right) {
		
		if(left<right) {
			int q = partition2(arr,left,right);
			quicksort2(arr,left,q-1);
			quicksort2(arr,q+1,right);
		}
		
	}
	
	void quicksort3(int[] arr, int left, int right) {
		
		int q;
		
		if(left<right) {
			q = partition3(arr,left,right);
			quicksort3(arr,left,q-1);
			quicksort3(arr,q+1,right);
		}
	}
	
}
