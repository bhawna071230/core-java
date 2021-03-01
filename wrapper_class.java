package core_java;

public class wrapper_class {
	public static void main(String args[]) {
		int i = 6;
		double j = 5.55;
		
		Integer ii = new Integer(i);
		System.out.println("boxing of primitive data typ to its object in integer value done");
		
		Double  jj = new Double(j);
		System.out.println("boxing of primitive data typ to its object in double value done");
		
        int k = ii.intValue();
        double l = jj.doubleValue();
				    // converts into primitive types
				   

	    System.out.println("The value of k: " + k);
        System.out.println("The value of l: " + l);
				  }
				
		
	}


