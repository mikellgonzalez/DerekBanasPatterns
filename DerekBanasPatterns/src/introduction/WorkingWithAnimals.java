package introduction;

public class WorkingWithAnimals {

	public static void main(String[] args) {

		Dog fido = new Dog();

		fido.setName("Fido");
		System.out.println(fido.getName());

		fido.digHole();
		fido.setWeight(-1);

		// primitives types are passed by value
		int ranNum = 10;
		fido.changeVar(ranNum);
		System.out.println("ranNum affter method call: " + ranNum);

		// objects are passed by reference
		changeObjectName(fido);
		System.out.println("Dog name after method call: " + fido.getName());
	}

	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}

}
