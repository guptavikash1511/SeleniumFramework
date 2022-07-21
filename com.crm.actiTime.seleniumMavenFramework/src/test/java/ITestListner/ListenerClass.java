package ITestListner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListner.ListnerMain.class)
public class ListenerClass {
	@Test
	public void Test_success() {
		System.out.println("My Test case pass");
		
	}
	@Test
	public void Test_Failure() {
		System.out.println("my Test case fail");
		Assert.assertTrue(false);
	}
	@Test
	public void Test_Skipped() {
		throw new SkipException("my Test case skip");
	}

}
