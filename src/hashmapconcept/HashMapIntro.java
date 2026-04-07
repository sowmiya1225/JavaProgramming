package hashmapconcept;
import java.util.HashMap;
import java.util.Map;
public class HashMapIntro {
public static void main(String[] args) {
	Map<Integer,String> n=new HashMap<>();
	//   key  value
	n.put(0, "apple");
	n.put(1, "orange");
	n.put(2, "kiwi");
	n.put(3, "strawberry");
	n.put(4, "berries");
	System.out.println(n);
	System.out.println(n.size());
	System.out.println(n.containsValue("blueberry"));
	System.out.println(n.containsKey(4));
}
}
//finding frequency
import java.util.*;
class Main{
    public static void main(String[]args){
        int arr[]={1,1,2,3,4,5,2,3};
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        System.out.print(m);
    }
}
//missing number
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n=nums.length;
        int es=n*(n+1)/2;
        int m=es-sum;
        return m;
    }
}
