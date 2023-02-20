package projectDemo;

import java.io.FileReader;
import java.util.ArrayList;

public class TestPro {
	
          public static void main(String[] args) {
        	  	  
        	      	  
        	  ArrayList<Integer> ar=new ArrayList<Integer>();
        	  ar.add(23);
        	  ar.add(45);
        	  ar.add(566);
        	  ar.add(6677);
        	  ar.add(68);
        	  ar.add(0);
        	  
        	System.out.println(ar);
        	System.out.println("after updating the arraylist ");
        	ar.set(3, 66);
        	System.out.println(ar);
        	ar.remove(5);
        	System.out.println("remove the last elements");
        	System.out.println(ar);


        	try {
        		      		
        		System.out.println("the index of 6th in arraylist"+" "+ar.get(5));
        	}
        	catch(Exception e){
        		System.out.println(e);
        	}
        	
        	
        	 try {
				
				 @SuppressWarnings("resource")
				FileReader filer=new FileReader("Mycomputer/mano/dp.txt");
				filer.read();
				
				
				
			} catch (Exception e) {
				
				//System.out.println(e);
				System.out.println("FileNotFound 404 error");
				
			}
        	  
        	 System.out.println();
        	  
        	  
          }
	
}
