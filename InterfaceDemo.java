/* interface MyInterface {
 void show();

}

class Interface implements MyInterface {
public void show() {
	System.out.println("Hi");
}
}

public class InterfaceDemo {

public static void main(String[] args) {
	Interface obj = new Interface();
	obj.show();

}

}   */

// Anonymous Interface  
// advantage is save memory
//we don't need to create any extra class

/* interface MyInterface {
	 void show();

}

public class InterfaceDemo {

	public static void main(String[] args) {
		MyInterface obj = new MyInterface() {
			public void show() {
				System.out.println("Hlo");
			}
		};
		obj.show();

	}

}    */

// Up to 1.7 we con't define a method inside a interface 
// above 1.8 we can define a method and declare

interface MyInterface {
	void abc();

	default void show() {
		System.out.println("Hi");

	}

}

class Interface implements MyInterface {
	public void abc() {
		System.out.println("Hlo");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		MyInterface obj = new Interface();
		obj.show();
		obj.abc();
	}

}