package helloWorld;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest
{
	private HelloWorld hello;
	
	@After
	public void teardown()
	{
		hello = null;
	}
	
	@Test
	public void HelloNameTest()
	{
		hello = new HelloWorld("World");
		assertTrue("Hello name test failed", hello.toString().equals("Hello, World!"));
	}
	
	@Test public void HelloBlankTest()
	{
		hello = new HelloWorld("");
		assertTrue("Hello blank test failed", hello.toString().equals("Hello!"));
	}
	
	@Test public void HelloNullTest()
	{
		hello = new HelloWorld(null);
		assertTrue("Hello null test failed", hello.toString().equals("Hello!"));
	}
}
