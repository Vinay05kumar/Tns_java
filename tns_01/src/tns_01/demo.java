package tns_01;
// demo for access modifier program
// public

 public class demo {
	
	public int a=70;  // properties 
	 public String s="vinni";
	
	void drink() {
		
	}
	
	public static void main(String[] args) {
		demo d=new demo(); // object created 
		System.out.println(d.a);
		System.out.println(d.s);
	}

}