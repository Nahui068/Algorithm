package algorithm;

import java.io.*;
import java.util.*;

public class Heap_sort extends Compare{
	
	
	void exchange(int[] arr, int n, int max) {
		int tmp = arr[n];
		arr[n]=arr[max];
		arr[max]=tmp;
	}
	
	void maxheapify(int[] arr, int size, int n) {
		
		int l=2*n+1;
		int r=2*n+2;
		int max=n;
		
		if(l<=size-1 && compare(arr[l],arr[n]))
			max= l;
		
		if(r<=size-1 && compare(arr[r],arr[max]))
			max=r;

		if (max != n) {
			exchange(arr,n,max);
			maxheapify(arr,size,max);
		}
	}

	void buildheap (int[] arr){
		
		int size = arr.length;
		
		for(int i=(size/2)-1; i>=0; i--)
			maxheapify(arr,size,i);
	}
	
	void heapsort(int[] arr) {
		
		buildheap(arr);
		int size = arr.length;
		
		for(int i=size-1; i>=1; i--) {
			exchange(arr,0,i);
			maxheapify(arr,i,0);
		}
		
	}
	
}


