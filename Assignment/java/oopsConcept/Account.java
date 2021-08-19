public class Account {
	String name,  type; 
	Account(){
		name = "your name ";
		type = "saving_account";
		
	}
	void Details()
	{
		System.out.print(name+"  "+type);
	}
}
class  Saving_Account extends Account {
	String name ;
	int amount ;
	Saving_Account(){
		name = "Meena";
		amount = 3000;
	}
	void Histoty() {
		System.out.println(name+" "+amount);	 
 }
}
class Current_Account extends Account {
	private static final String History = null;
	int details ;
	int amount ;
	Current_Account(){
		details = 1;
		amount = 3000;
	}
	void History() {
		System.out.println(details+" "+amount);	 
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account A = new Account();
		  A.Details();
		 Current_Account  C = new  Current_Account();
		  C.History();
		  Saving_Account S = new  Saving_Account();
		  S.Histoty();
		 
		  
		  
		
		

	}

}
