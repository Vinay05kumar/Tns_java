package construction;
// demo for constructor 
public class Customer {
	
	public String Customername;
	public String customeraddress;
	private int customerid;
	
	// default constructor
	
	public Customer(){
		System.out.println("default constructor");
	}
	
	// parameterized constructor 
	
	Customer(String Customername,String customeraddress,int customerid){
		this.Customername=Customername;
		this.customeraddress=customeraddress;
		this.customerid=customerid;
		
	}
	// getter and setter 

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Override
	public String toString() {
		return "Customer [Customername=" + Customername + ", customeraddress=" + customeraddress + ", customerid="
				+ customerid + "]";
	}
	
	
	
}