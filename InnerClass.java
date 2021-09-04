class Outer {
	public void Show() {
		//.System.out.println("Hi");

	}

}

class Inner {
	public void Show() {
		System.out.println("Hlo");
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.Show();

		Inner obj1 = new Inner();
		obj1.Show();
		
	}

}
