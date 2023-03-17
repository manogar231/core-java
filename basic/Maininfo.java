package basic;



@FunctionalInterface
interface Demo{
	
	void demo(int number, String name);
}

@FunctionalInterface
interface Add{
	int adding(int number1,int number2);
}

public class Maininfo {

	public static void main(String[] args) {
		
		//lambda expresion
		 
		Demo objDemo= (number,name) -> System.out.println ("id  "+number+"  "+"name  "+name);
         
        objDemo.demo(23,"vector");
         
        Add objAdd=(number1,number2) -> number1+number2;
 
        int result=objAdd.adding(23,30); 
        System.out.println(result); 
       /*       
         //anonymous class (inner class)for demo functional interface
          
		Demo objDemo=new Demo() {

			
			public void demo(int number, String name) {
				
			System.out.println(number+" "+name);
			}	
		};
		
         objDemo.demo(23, "vector");
         
         //anonymous clss for add functional interface
           
       
         Add objadd=new Add(){
         
         public int adding(int number1, int number2){
         
         return number1=number2;
         
         }
          int result=objadd.adding(23,30);
          System.out.println(result);
          
         }

        */
         
	}

}
