package projectDemo;

interface Forchild{          //this is 1st interface
	
    int starttime=5;
	int endtime=9;
	
		void ball();		
		void food();		
		void play();		
		void sleep();		
}

 interface ForFather{        //this is 2nd interface
	
	 int officetime=10;
	 
        void takeCarefamily();
        void Enjoyment();
        void Workingday();
	
}

   //main method and class 
public  class TestInterface implements Forchild,ForFather {

	public static void main(String[] args) {
		
		// main method object are delceared 
		
		
		
		ForFather isFather=new TestInterface();
		isFather.Enjoyment();
		// System.out.println("This is form the main method");
	//	isFather.ball();
		TestInterface tf=new TestInterface();
		tf.ball1();
		tf.ball();
		tf.food();
		tf.play();
		tf.sleep();
		System.out.println("the playtime is starting at:"+ " "+Forchild.starttime);

	}

	//this part is from 1 interface (class)
	public  void ball() {
		
		System.out.println(" You should take the ball eveing only ");
	}
	
	public void ball1() {
		
		System.out.println(" This will be 2nd one ");
		
	}
	
	public void food() {
		
		System.out.println(" Take food before 8:30 ");
	}
	
	public void play() {
		
		System.out.println(" Don't play after taking food ");
	}
	public void sleep() {
		
		System.out.println(" Sleep after taking food ");
	}
	
	
	// this part is another interface(class)
	public void takeCarefamily(){
		
		System.out.println(" Take care everyday ");
	}
	public void Enjoyment(){

		System.out.println(" enjoyment only in weekends ");
	}
	public void Workingday(){
		
		System.out.println(" Monday to friday ");
	}

	
}
