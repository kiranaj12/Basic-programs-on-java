class ProjectExample {
	int sId;
	int sAge;
	String sName;

	//method creation   
	public int add(int i, int j) {
		return (i + j);
	}

	// constructor
	public ProjectExample() {
		System.out.println("Hi");
	}

	public ProjectExample(int id, int age) {
		sId = id;
		sAge = age;
		System.out.println("Hlo");
	}

	public ProjectExample(int id, int age, String name) {
		sId = id;
		sAge = age;
		sName = name;
		System.out.println("Nice Day");
	}

	public void show() {
		sId = 1;
		sAge = 10;
		sName = "kiran";
	}
}

public class ProgramDemo {
	public static void main(String[] args) {
		
		ProjectExample obj1 = new ProjectExample();
		int k = obj1.add(2, 2);
		System.out.println(k);
		
		
		ProjectExample obj = new ProjectExample(1, 12);

		
		// int j = obj.sId = 1;
		// int k = obj.sAge = 10;
		// String l = obj.sName = "kiran";
		// System.out.println("sId : " + j + " sAge: " + k + "sName: " + l);
	}

}
