package Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	@Test	
	public void sum() {
		System.out.println("SUM");
		int a =10;
		int b=20;
		Assert.assertEquals(50, a+b);
		
	}
	
}
