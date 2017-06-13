
public class ConstructorChaining {

	String Name;
	String Email;
	String Address = "Calicut";

	public ConstructorChaining(String name, String email) {
		
		Name = name;
		Email = email;
		System.out.println("Name of the user :" + name);
	}

}

