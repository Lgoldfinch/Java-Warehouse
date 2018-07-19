package dogPlacement;

import java.util.ArrayList;
import java.util.List;

public class DogPlacement {

// List dogP = new ArrayList();
	
	  String [] dogP = new String[101];
      //String [] dogP2 = new String [100];
      
	  public void fillList() {
	  for(int j = 0; j <= 20 ; j++) {
		  if(j == 0) {
			  dogP[j] = ("" + j+1 + "st");
		  }
		  else if(j == 1) {
			  dogP[j] = (Integer.toString(j+1) + "nd");
		  }
		  else if(j == 2) {
			  dogP[j] = (Integer.toString(j+1) + "rd");
		  }
		  else {
			  dogP[j] = (Integer.toString(j+1) + "th");
		  }
	  }
	  for (int i = 20; i < 101; i++) { 
		  if ( i % 10 == 1 ) {
			  dogP[i] = (Integer.toString(i) + "st");}
		  else if(i % 10 == 2) {
			  dogP[i] = (Integer.toString(i) + "nd");
	  }
		  else if(i % 10 == 3) {
			  dogP[i] = (Integer.toString(i) + "rd");
		  }
		  else {
			  dogP[i] = (Integer.toString(i) + "th");
		  }
	  }
	  }
//	  public String removeDog(int d) {
//      dogP[d] = null; 
//      return dogP[d];
//	  }
	  
	  public void removeDog(int d) {
	      dogP[d-1] = null; 
		  }
	  
	  public void result(int d) {
		  removeDog(d);
		  int counter = 0;
		  while(counter < 101) {
			  System.out.println(dogP[counter]);
			  counter++;
		  }
	  }
//	  public void result2(int d) {
//	  for (int k = 0; k < 100; k++) {
//		  if (k == d) {
//			  
//		  } else {
//			  dogP2[k] = dogP[k];
//		  }
//		  }
//	  int counter = 0;
//	  while(counter < 100) {
//		  System.out.println(dogP[counter]);
//		  counter++;
//	  }
//		
//	  }
	  
}

