
public class ReuseableMethods extends ReuseableMethods2{
	int a;
	//Default Constructor
	public ReuseableMethods(int a2) {
		super(a2); //Parent class constructor is invoked
		this.a=a2; //this refers to the current class variable assigning a2 (Instance variable) to class variable
	}

	public int increament ()
	{
		a= a+1;
		return a;
	}
	public int decreament()
	{
		a=a-1;
		return a;
	}
}
