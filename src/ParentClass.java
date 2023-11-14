import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ParentClass {

	public void parentTestclass()
	{
		System.out.println("Test Parent class!");
	}
	@BeforeTest
	public void beforeParentclass()
	{
		System.out.println("Before Test Parent class!");
	}
	@AfterTest
	public void afterParentclass()
	{
		System.out.println("After Test Parent class!");
	}
}
