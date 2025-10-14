package conditionaloperator;

public class IfElseIf {
	public static void main(String[] args) {
		int mark=99;
		if(mark<35)
		{
			System.out.println("Fail");
		}
		else if(mark>35&&mark<50)
		{
			System.out.println("average");
		}
		else if(mark>=50&&mark<=85)
		{
			System.out.println("Good");
		}
		else {
			System.out.println("Excellent");
		}
	}
	
	}


