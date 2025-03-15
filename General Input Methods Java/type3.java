// For input with brackets and integer with String--> [1 abhi 2 vishal 3 kumar 4 jaiswal]

import java.util.*;
class MyClass{
	public static void main(String[] args){
	    //input
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace("[","").replace("]","").trim();
		String[] a=s.split(" ");
		
		//input operation
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<String> name=new ArrayList<>();
		
		for(String str:a){
		    try{
		        arr.add(Integer.parseInt(str));
		    }catch(Exception e){
		        name.add(str);
		    }
		}
		
		//output
		for(int it:arr) System.out.print(it+" ");
		System.out.println();
		for(String str:name) System.out.print(str+" ");
	}
}
