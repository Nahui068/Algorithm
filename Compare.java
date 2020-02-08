package algorithm;

public class Compare {
	
	  int compcount = 0;
	   
	   boolean compare (int x, int y) {
	      compcount++;
	      
	      if (x > y)
	         return true;
	      else
	         return false;
	   }
	   
	   void init() {
	      this.compcount = 0;
	   }
	}