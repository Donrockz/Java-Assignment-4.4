public class Obj extends ConstructorChaining {

	public Obj(String Name, String Email, String Address) {
		super(Name, Email);
		this.Address = Address;

	}

	public static void main(String[] args) {

		Obj p1 = new Obj("Raku", "xyz@gmail.com", "Calicut");
		Obj p2 = new Obj("Kaapaa", "cyz@gmail.com", "Calicut");
		Obj p3 = new Obj("Bahubali", "syz@gmail.com", "Calicut");

		String Raku = "Name : " + p1.Name + ", " + "Email :" + p1.Email;
		String Hari = "Name : " + p2.Name + ", " + "Email :" + p2.Email;
		String Rakesh = "Name : " + p3.Name + ", " + "Email :" + p3.Email;
		System.out.println("Child Constructor Output is given below...");
		System.out.println(Raku);
		System.out.println(Hari);
		System.out.println(Rakesh);

	}
}
