package projectDemo;

// import java.util.*;
//this program is for constructor
class Mine{
	
	Mine(){
		int id=102;
		String name="well";
		System.out.println("this is my name:"+" "+name);	
		System.out.println("this is my id:"+" " +id);	
		
	}
}

 class TestDemo {
           TestDemo(){
        	   
        	   
    	   int id = 101;               //this part is constructor
           String name= "raja";
	     // System.out.println("its gonna show the id and name :"+ id+" "+ name);
           System.out.println("this is my name:"+" "+name);	
   		   System.out.println("this is my id:"+" " +id);	
   		
	 
 }
	public static void main(String[]args) {
		
		
		System.out.println("This part is running in main class(testdemo) that is also a constructor class");
		System.out.println();
		@SuppressWarnings("unused")
		TestDemo td=new TestDemo();	
		System.out.println();
		System.out.println("This part is gonna run in Mine constructor:");
		System.out.println();
		@SuppressWarnings("unused")
		Mine m=new Mine();
		
		
	}
 }
	
