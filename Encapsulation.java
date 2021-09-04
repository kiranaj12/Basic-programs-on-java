//EncapsulationDemo
class Encap {
	private int id;
	private String name;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setId(1);
		obj.setName("Kiran");

		int id1 = obj.getId();
		String sName = obj.getName();

		System.out.println(id1);
		System.out.println(sName);

	}

}
