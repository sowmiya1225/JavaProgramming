package twodimensionalArrayConcept;

import java.util.Arrays;

public class TwoDimensionalArray {
		public static void main(String[] args) {
			//int a[][]=new int[][]//output default value=0
			int a[][]= {{1,2,3},{4,5,6},{7,8,9},
						{2,3,4},{2,3,5},{3,4,5}
			};
						// 0		1		2
			for(int i=0;i<6;i++) {
				for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
			}
			System.out.println(a.length);//row
			System.out.println(a[0].length);// 0th index {1,2,3}=3
			
/*for(int[] a:arr2){
 *[ for(int num:a){
 * System.out.println(num+" ");
 * }
 * System.out.println()
 * }   ] or
			System.out.println(Arrays.toString(a));*/
		}

		}



