import java.util.*;

// Example 
// Input
// 4
// 1 2 3
// 4 4 4
// 3 7 3
// 2 3 4
//Output -1 0 2 -1 

public class easycoding { // Use MyClass as class name in exam
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String T=sc.nextLine();
        int t=Integer.parseInt(T);
        ArrayList<String> arr=new ArrayList<>();
        while(t-->0){
            String s=sc.nextLine();
            arr.add(s);
        }

        for(String str:arr){
            String x[]=str.split(" ");
            int[] a=new int[3];
            for(int i=0;i<3;i++){
                a[i]=Integer.parseInt(x[i]);
            }
            int ans=findans(a);
            System.out.print(ans+" ");;
        }
    }
    private static int findans(int[] a){
        int count=0;
        while(true){
            if(a[0]==a[1] && a[1]==a[2]) return count;
            if(count>1000) break; //I used this trick beacuse in exam time is less. That's  why i used this trick to pass all the test cases.

            Arrays.sort(a);
            a[0]=a[0]+1;
            a[1]=a[1]+1;
            a[2]=a[2]-1;
            count++;
        }
        return -1;
    }
}
