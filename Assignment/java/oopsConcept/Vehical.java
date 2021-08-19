package vehical;

public class vehical {
	int a ; 
	String name ;
	vehical(){
		a = 0; 
		name = "car model name" ;
	}
	void model() {
		System.out.print(a+" "+name);
	}	

}
class DeriveCar extends vehical {
	int type ;
	int weight ;
	
	void price() {
		System.out.print(type+" "+weight);
		
	}	
}
class Bus extends vehical{
	int color ;
	int BusNumber;
	void vehicalNumber() {
		System.out.print(color+" "+BusNumber);	
	}
}
class c {
	public static void main(String[] s) {
		vehical v = new vehical();
		v.model();
	}
}