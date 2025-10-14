package methods;

public class CallByValue {
	//call by value

			void meth(int num) {

				num=10;

			}
			public static void main(String [] vcet) {

				CallByValue v=new CallByValue();
				//method passing value

				System.out.println("method passing Value");

				int num=5;

				System.out.println("Before call: "+num);

				v.meth(num);

				System.out.println("After call: "+num);


			}
}
