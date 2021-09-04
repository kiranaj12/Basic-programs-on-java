// static interface 
interface InterFaceDemo1{
	final int n =1;
	void show();
	static void Abcd() {
		System.err.println("Hi kiran");
	}
}

class DemoInter implements InterFaceDemo1{
	public void show() {
		System.out.println("kyaaa");
	//+	n=2;  // we con't override final key value
		
	}
}
public class StaticInterface {

	public static void main(String[] args) {
		InterFaceDemo1.Abcd();

	}

}
