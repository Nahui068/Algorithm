package algorithm;

public class Merge_sort extends Compare{
	
	boolean compare (int x, int y) {
		   
		compcount++;
		   
		   if (x >= y)
		       return true;
		   else
		       return false;
		   
	}
	
	void mergesort(int[] arr, int left, int right) {	
		
		int mid;
		
		if(left<right) {
			mid=(left+right)/2;
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	void merge(int[] arr,int left, int mid, int right) {
		
	    int[] sort = new int[arr.length];
	    
        int l = left;         
        int m = mid+1;     		 
        int k = left;             
        
        while(l<=mid && m<=right) {
            if(compare(arr[m],arr[l])) 
                sort[k] = arr[l++];
            else 
                sort[k] = arr[m++];
            k++;
        }
        
        if(l>mid) { 
            for(int i=m;i<=right;i++,k++)
                sort[k] = arr[i];   
        }else { 
            for(int i=l;i<=mid;i++,k++) 
                sort[k] = arr[i];  
        }
       
        for(int i=left;i<=right;i++) 
            arr[i] = sort[i];
 
    }
}






