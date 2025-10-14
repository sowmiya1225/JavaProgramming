package methods;

public class CallByReference{
	
		//call by reference

		void refer(int ar[]) {

			ar[0]=25;

			System.out.println(ar);

		}




		public static void main(String [] vcet) {

			CallByReference v=new CallByReference();

		
			//method passing reference

			System.out.println("\n\nmethod passing reference");

			int arr[]= {1,2};

			System.out.println("Before call: "+arr[0]);

			v.refer(arr);

			System.out.println("After call: "+arr[0]);

			System.out.println(arr);

		}

}
