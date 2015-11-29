package uk.co.placona.helloWorld;

/**
 * Hello may be printed to greet a selected
 * individual.
 */
public class HelloWorld
{
	/**
	 * Name of individual to be greeted
	 */
	private String name;
	
	/**
	 * Default constructor - initializes this with a given name
	 * 
	 * @param name Name of individual to be greeted
	 */
	public HelloWorld(String name)
	{
		this.name = name;
	}
	
	/**
	 * Prints a greeting to an individual in the form, "Hello, [name]!"
	 * If name was given as null or blank, prints as simple "Hello!"
	 */
	@Override
	public String toString()
	{
		if (name == null || name.length() == 0)
			return "Hello!";
		else
			return "Hello, " + name + "!";
	}
}

