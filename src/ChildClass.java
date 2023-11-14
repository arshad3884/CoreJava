import org.testng.annotations.Test;

public class ChildClass extends ParentClass {

	@Test
	public void childTestClass()
	{
		//Calling parent class method using inheritance (extends keyword)
		//If we call methods of the parent class the it also execute @before and @after methods
		parentTestclass();
		
		ReuseableMethods obj = new ReuseableMethods(3); //sending the instance variable in constructor
		System.out.println(obj.increament()); //calling reusableMethod class method
		System.out.println(obj.decreament()); //calling reusableMethod class method
		System.out.println(obj.multiplyTwo()); //calling reusableMethod2 class methods using inheritance
		System.out.println(obj.multiplyThree()); //calling reusableMethod2 class methods using inheritance
		
		
	}

}
