package algorithm;

import java.util.*;
import java.io.*;

public class Output {
	
	static void inputLoad(int[] arr1, int[] arr2, int[] arr3) throws IOException{
		
		int i=0,s;
		BufferedReader br = null;
		StringTokenizer st = null;
		StringBuffer b = new StringBuffer();
		
		File file1 = new File("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\input1.txt");
		br = new BufferedReader(new FileReader(file1));
		
		while((s=br.read()) != -1) {
			b.append((char)s);
		}
		st = new StringTokenizer(b.toString()," ");
		b = null;
		while(st.hasMoreTokens()) {
			arr1[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		br.close();
		
		b = new StringBuffer();
		File file2 = new File("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\input2.txt");
		br = new BufferedReader(new FileReader(file2));
		
		while((s=br.read()) != -1) {
			b.append((char)s);
		}
		st = new StringTokenizer(b.toString()," ");
		b = null;
		i=0;
		while(st.hasMoreTokens()) {
			arr2[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		br.close();
		
		b = new StringBuffer();
		File file3 = new File("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\input3.txt");
		br = new BufferedReader(new FileReader(file3));
		
		while((s=br.read()) != -1) {
			b.append((char)s);
		}
		st = new StringTokenizer(b.toString()," ");
		i=0;
		while(st.hasMoreTokens()) {
			arr3[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		br.close();
	}
	
	static void outputFile(int arr[], FileWriter fw, int count, double seconds) throws IOException{
		fw.write("Output = [");
		for (int i = 0; i < arr.length; i++)
		   fw.write(arr[i] + ((i == arr.length - 1)? "]\r\n":", "));
		fw.write("비교횟수 : " + count + "\r\n실행시간 : " + seconds + "초\r\n");
	 }

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\output.txt");
		FileWriter fw = new FileWriter(file);
		double starttime, endtime, estimatedtime;
		
		int[] inputArray1 = new int[32];
		int[] inputArray2 = new int[32];
		int[] inputArray3 = new int[1024];
		
		inputLoad(inputArray1,inputArray2,inputArray3);
		
		Insertion_sort insertion = new Insertion_sort();
		Merge_sort merge = new Merge_sort();
		Heap_sort heap = new Heap_sort();
		Quick_sort quick = new Quick_sort();
		
		fw.write("input:"+ Arrays.toString(inputArray1)+"\r\n\n");
		
		//insertion
		starttime = System.nanoTime();
		insertion.insertion(inputArray1, inputArray1.length);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime) / 1000000000;

		fw.write("Insertion sort\r\n");
		outputFile(inputArray1,fw,insertion.compcount,estimatedtime);
		fw.write("\n");
		
		//mergesort
		starttime = System.nanoTime();
		merge.mergesort(inputArray1, 0, inputArray1.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime) / 1000000000;
		
		fw.write("Merge sort\r\n");
		outputFile(inputArray1,fw,merge.compcount,estimatedtime);
		fw.write("\n");
		
		//heapsort
		starttime = System.nanoTime();
		heap.heapsort(inputArray1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Heap sort\r\n");
		outputFile(inputArray1,fw,heap.compcount,estimatedtime);
		fw.write("\n");
		
		//quicksort1
		starttime = System.nanoTime();
		quick.quicksort1(inputArray1, 0, inputArray1.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(last pivot)\r\n");
		outputFile(inputArray1,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		
		//quicksort2
		starttime = System.nanoTime();
		quick.quicksort2(inputArray1, 0, inputArray1.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(random pivot)\r\n");
		outputFile(inputArray1,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		//quicksort3
		starttime = System.nanoTime();
		quick.quicksort3(inputArray1, 0, inputArray1.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(median pivot)\r\n");
		outputFile(inputArray1,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		fw.write("input:"+ Arrays.toString(inputArray2)+"\r\n\n");			
		//insertion
		starttime = System.nanoTime();
		insertion.insertion(inputArray2, inputArray2.length);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime) / 1000000000;
		
		fw.write("Insertion sort\r\n");
		outputFile(inputArray2,fw,insertion.compcount,estimatedtime);
		fw.write("\n");
		
		//mergesort
		starttime = System.nanoTime();
		merge.mergesort(inputArray2, 0, inputArray2.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime) / 1000000000;
		
		fw.write("Merge sort\r\n");
		outputFile(inputArray2,fw,merge.compcount,estimatedtime);
		fw.write("\n");
		
		//heapsort
		starttime = System.nanoTime();
		heap.heapsort(inputArray2);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
						
		fw.write("Heap sort\r\n");
		outputFile(inputArray2,fw,heap.compcount,estimatedtime);
		fw.write("\n");
		
		//quicksort1
		starttime = System.nanoTime();
		quick.quicksort1(inputArray2, 0, inputArray2.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(last pivot)\r\n");
		outputFile(inputArray2,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		//quicksort2
		starttime = System.nanoTime();
		quick.quicksort2(inputArray2, 0, inputArray2.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(random pivot)\r\n");
		outputFile(inputArray2,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		//quicksort3
		starttime = System.nanoTime();
		quick.quicksort3(inputArray2, 0, inputArray2.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(median pivot)\r\n");
		outputFile(inputArray2,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		fw.write("input:"+ Arrays.toString(inputArray3)+"\r\n\n");
		
		//insertion
		starttime = System.nanoTime();
		insertion.insertion(inputArray3, inputArray3.length);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime) / 1000000000;
		
		fw.write("Insertion sort\r\n");
		outputFile(inputArray3,fw,insertion.compcount,estimatedtime);
		fw.write("\n");
		
		//mergesort
		starttime = System.nanoTime();
		merge.mergesort(inputArray3, 0, inputArray3.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime) / 1000000000;
		
		fw.write("Merge sort\r\n");
		outputFile(inputArray3,fw,merge.compcount,estimatedtime);
		fw.write("\n");
		
		//heapsort
		starttime = System.nanoTime();
		heap.heapsort(inputArray3);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
						
		fw.write("Heap sort\r\n");
		outputFile(inputArray3,fw,heap.compcount,estimatedtime);
		fw.write("\n");
		
		//quicksort1 - pivot 마지막
		starttime = System.nanoTime();
		quick.quicksort1(inputArray3, 0, inputArray3.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(last pivot)\r\n");
		outputFile(inputArray3,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		//quicksort2
		starttime = System.nanoTime();
		quick.quicksort2(inputArray3, 0, inputArray3.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(random pivot)\r\n");
		outputFile(inputArray3,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		quick.init();
		
		//quicksort3
		starttime = System.nanoTime();
		quick.quicksort3(inputArray3, 0, inputArray3.length-1);
		endtime = System.nanoTime();
		estimatedtime = (endtime-starttime)/1000000000;
		
		fw.write("Quick sort(median pivot)\r\n");
		outputFile(inputArray3,fw,quick.compcount,estimatedtime);
		fw.write("\n");
		fw.close();
		

	}

}
