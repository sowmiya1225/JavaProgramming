package conditionaloperator;

public class NestedIf {
public static void main(String[] args) {
	int marks=40;
	if(marks>=0 && marks<=100)
	{
		if(marks<35)
		{
			System.out.println("Fail");
		}
		else if(marks>=35&& marks<=50)
		{
			System.out.println("Average");
		}
		else if(marks>=50&&marks<=85)
		{
			System.out.println("Good");
		}
		else {
			System.out.println("Excellent");
		}
	}
		
}

}
