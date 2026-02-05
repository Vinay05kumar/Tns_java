package encapsulationdemo;
// demo for encapsulation

public class Encapsulationdemo {
	int serialnumber;// data members or variables 
	String name;
	int age;
	
	void show() {// member function or fun
	System.out.println(serialnumber+" "+name+ " "+" "+age);	
	}
public static void main(String[] args) {
	Encapsulationdemo e=new Encapsulationdemo();
	e.serialnumber=1;
	e.name="vinay";
	e.age=22;
	
	e.show();
}
}