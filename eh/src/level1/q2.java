package level1;

public class q2 {
  public String hello(String hHello) {
	return hHello;
	  
  }
	  public String party(String cake) {
		  return cake;
  }
	  public int tissue(int red, int blue) {
		  return red + blue;
	  }
	  public String retuurn(String pen) {
	  return pen; 
	  }
	  
	  
	  
     public int tissue2(int red, int blue, boolean green) {
    	 
    	 if (green) {
    		 return blue + red;
    	 }else {
    		 return blue * red;
    	 }
     }
    public int tissue3(int dog, int cat, boolean purple) {
    	
    	if (purple) {
    		return dog % cat;
    	} else {
    		return 0;
    	}	
   } 
    public int mug(int h, int g, boolean p) {
    	 if (h == 0) {
    		return g;
    	 } if (g == 0) {
    		return h;
    }   if (p) {
    	return h + g;
    	 }else {
    		 return h * g;
    }
}
}



