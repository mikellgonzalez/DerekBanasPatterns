package introduction;

public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dug a hole");
	}

	public Dog() {
		super();
		setSound("Bark");
	}

	public void changeVar(int ranNum) {

		ranNum = 12;
		System.out.println("ranNum in method: " + ranNum);

	}

}
