package algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Input {

	public static void main(String[] arg) throws IOException{
	
	int[] inputArray1 = new int[32];
	int[] inputArray2 = new int[32];
	int[] inputArray3 = new int[1024];
	
	BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\input1.txt"));
	BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\input2.txt"));
	BufferedWriter bw3 = new BufferedWriter(new FileWriter("C:\\Users\\kyjjj\\eclipse-workspace\\algorithm\\src\\algorithm\\input3.txt"));
	
	StringTokenizer st = null;
	
	for(int i=0; i<inputArray1.length; i++) {
		inputArray1[i]=i;
	}
	st = new StringTokenizer(Arrays.toString(inputArray1),"[,]");
	while(st.hasMoreTokens()) {
		bw1.write(st.nextToken()+" ");
	}
	bw1.close();
	
	
	for(int i=0; i<inputArray2.length; i++) {
		inputArray2[i] = (int)(Math.random()*50);
	}
	st = new StringTokenizer(Arrays.toString(inputArray2),"[,]");
	while(st.hasMoreTokens()) {
		bw2.write(st.nextToken()+" ");
	}
	bw2.close();
	
	for(int i=0; i<inputArray3.length; i++) {
		inputArray3[i] = (int)(Math.random()*10000);
	}
	st = new StringTokenizer(Arrays.toString(inputArray3),"[,]");
	while(st.hasMoreTokens()) {
		bw3.write(st.nextToken()+" ");
	}
	bw3.close();
	
	}
}



