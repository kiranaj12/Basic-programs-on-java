
public class SwichCases {

	public static void main(String[] args) {
		
		// Integer
		int num = 5
				;
		switch(num)
		{
		case (5) : System.out.println("Five");
		break;
		case 10 : System.out.println("Ten");
		break;
		default : System.out.println("Not found");
		}
		
		
		// Character
		char ch = 'k';
		switch(ch)
		{
		case 'd' : System.out.println("dddd");
		break;
		case 'k' : System.out.println("kkkk");
		break;
		default : System.out.println("Not found");
		}
		
		String s = "deepu";
		switch(s)
		{
		case "deepu" : System.out.println("deeepu");
		break;
		case "kiran" : System.out.println("kirannnn");
		break;
		default : System.out.println("Not found");
		}
		
		//Nested switch statements
		int n = 2;
		char c = 'A';
		switch(n)
		{
		case 1 : System.out.println("its one");
		break;
		case 2 : 
			switch(c)
			{
			case 'B' :System.out.println("char b");
			break;
			case 'A' : System.out.println("char c");
			}
			

		break;
		default : System.out.println("not valid");
		
		}
		
		// wrapper switch cases
		
		Integer age = 18;
		switch (age)
		{
		case (16) : System.out.println("age 16");
		break;
		case (18) : System.out.println("age 17");
		break;
		}
		

	}

}
