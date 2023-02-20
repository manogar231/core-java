package projectDemo;

public class myProject {      
		
	
   private static  int age=56;
	String name= "raja";            //this are the globale variable declareation, in this we can use out side this class 
	boolean pension= true ;
	
	public static void main(String[] args) {
		
		System.out.println("welcome to this site!!:");
		
		Checkpension.checking();		
		checkAgain.getorNOT(56,"muthu",false);
		checkForAge.getORNOt(34,"jiva");
		
	}
	
static class Checkpension{	
	 static void checking() {		
			if(age>=55) {
				System.out.println("he/she getting pension");
				
			}else {
				System.out.println("he/she not eligible for getting the pension");				
			}		
		}	
	}
	
 static class checkAgain{
	
	 static void getorNOT(int age,String name,boolean pension) {
		
		if(pension) {

				System.out.println("your are eligible for pension money");
			}else{
				
				System.out.println("your eligible for it but u r not getting ");
			}										
	 }
				
	}
 static class checkForAge{
	 
	static void getORNOt(int age,String name) {
		
		
		if(age<=55) {
			
			System.out.println("your not eligible for this schme");
		}else {
			System.out.println("thank you for use this site:");
		}
		
	} 
	 
 }
}	
	
	
	
	

