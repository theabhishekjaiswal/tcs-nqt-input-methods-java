// For input--> 1 2 3 4 5 6 7 8 9 0

import java.util.*;
class MyClass{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		int[] arr=new int[a.length];
		for(int i=0;i<a.length;i++){
			arr[i]=Integer.parseInt(a[i]);
		}
		for(int it:arr){
			System.out.print(it +" ");
		}
	}
}
