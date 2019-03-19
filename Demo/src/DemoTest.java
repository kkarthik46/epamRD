import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	@BeforeClass
	public void before()
	{
		System.out.println("beforeclass");
	}
	
	
	
	
	
	
	@Test
	public void test1() {
	System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}

}
