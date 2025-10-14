package whileloop;

public class MinMax {
public static void main(String[] args) {
	
   int n=789024;
   int min=9;
   int max=0;
    while(n!=0) {
    	int las=n%10;
    	if(las<min){
    		min=las;
    	}
    	if(las>max)
    	{
    		max=las;
    	}
    	n=n/10;
    }
    System.out.println("maximum: "+max);
    System.out.println("minimum: "+min);
}
}