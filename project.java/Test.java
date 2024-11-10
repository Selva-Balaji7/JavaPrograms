package polymorphism;
class Account
{
int id;
String name;
long accno;
double bal;
    public Account(int id,String name,long accno)
    {
    	this.id=id;
    	this.name=name;
    	this.accno=accno;
    	
    }
    public void withdraw(double amt)
    {
    	if(bal>=amt)
    	{
    		bal-=amt;
    		System.out.println(bal);
    	}
    	else
    		System.out.println("Insufficient fund");
    }
    public void deposit(double amt) {
    	if(amt>0)
    	{
    		bal+=amt;
    		System.out.println("Deposited");
    	}
    	else
    		System.out.println("Invalid Amount");
    }
    public void checkbal() {
    	System.out.print(bal);
    }
}

  class Current extends Account {
	double minbal=5000;
	public Current(int id,String name,long accno) {
		super(id,name,accno);
		
	}
	@Override
	public void withdraw(double amt)
	{
		if(bal-amt>=minbal) {
			bal-=amt;
			System.out.println(bal);
		}
		else {
			System.out.println("Insufficient fund");
		}
	}
  }

public class Test  {
	public static void main(String[] args) {
	 Current c=new Current(101,"allen",999238923894l);
	  c.deposit(18000);
//	  c.withdraw(1000);
//	  c.checkbal();
	 c.withdraw(2000);

	}
}
