final class Immutable {
	private String name;
	private int birthdate;

	public Immutable(String name, int birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public int getBirthdate() {
		return birthdate;
	}

}

public class P120_CreateanImmutableClass {

	public static void main(String[] args) {
		Immutable obj = new  Immutable("Aaditya",24);
		System.out.println(obj.getName());
		System.out.println(obj.getBirthdate());
	}
}
