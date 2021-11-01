package MavenTestG.MavenTestI;
import org.testng.Assert;
import org.testng.annotations.Test;
public class clsTest5 {
	@Test
	public void sum5()
	{
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		//System.out.println("Sum of a and b is :" +sum);
		System.out.println("Sum4");
			
		Assert.assertEquals(30,sum);
	}
	
	@Test
	public void div5()
	{
		int a=10;
		int b=20;
		
		int val=b/a;
		
		System.out.println("Div5");
		
		//System.out.println("Sum of a and b is :" +sum);
		
		Assert.assertEquals(2,val);
	}
	
	@Test
	public void mult5()
	{
		int a=10;
		int b=20;
		
		int val=a*b;
		System.out.println("Multi5");
		
		Assert.assertEquals(200,val);
	}
}
