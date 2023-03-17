package projectDemo;

//import javax.swing.JFrame;
//import javax.swing.JPanel;

public class ThisFun {
	
	int number;
	String name;
	String address;
	public  void Data(String name,String address) {

		this.name=name;
		this.address=address;
		
	}
	
	public  void Data(int number,String name,String address) {
		this.number=number;
		this.name=name;
		this.address=address;
	}

	public static void main(String[] args) {
		
		System.out.println("Hello User!!");
		
		ThisFun thisfun=new ThisFun();
		thisfun.Data("arun", "india");
		System.out.println(thisfun.number);
		System.out.println(thisfun.name);
		System.out.println(thisfun.address);
		thisfun.Data(23, "jack","pondy");
		
		System.out.println("This is from  three argument data");
		System.out.println(thisfun.number);
		System.out.println(thisfun.name);
		System.out.println(thisfun.address);
		
	/*    JPanel tp=new JPanel();
		JFrame fr=new JFrame();
		fr.setSize(250,250);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this part is for the panel form the GUI
		fr.setVisible(true);
		fr.add(tp);
		tp.setLayout(null);*/
		
	}

}
