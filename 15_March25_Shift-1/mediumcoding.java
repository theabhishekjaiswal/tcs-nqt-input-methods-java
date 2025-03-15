import java.util.*;

//Example 
// Input: 0 3
//OutPut: 6
public class mediumcoding{ // Use MyClass as class name in exam
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        try{
            String arr[]=s.split(" ");
            int i=Integer.parseInt(arr[0]);
            int j=Integer.parseInt(arr[1]);

            if(i<0 || j<0 || j>=10000 ||  i>=10000){
                System.out.println("Invalid Input: i and j must be 0<=i<=j<10,000."); 
                // Always read note because this is one of the private test case. 
                //But this test case is failing , i dont know the reason.
            }
            else{
                long sum=findans(i,j);
                System.out.println(sum);;
            }
        }catch(Exception e){
            System.out.println("Invalid Input:....."); 
            // Always read note because this is one of the private test case.
        }
    }
    private static long findans(int i,int j){
        long sum=0;
        for(int x=i;x<=j;x++){
            sum=sum+x;
        }
        return sum;
    }
}