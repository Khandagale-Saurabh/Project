import java.io.*;
import java.util.*;

public class Next_Greater{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
      display(nge);
   solve(a);
 }

 public static int[] solve(int[] arr)
 {
   int n= arr.length;
   int nger[]=new int[n];
   nger[n-1]=-1;
   Stack<Integer> st=new Stack();

   st.push(arr[n-1]);
   for(int i=n-2;i>=0;i--)
    {
		int val=nger[i];
		while(st.size()>0 && st.peek()<=val)
		{
			st.pop();
		}
		if(st.size()==0)
		{
			nger[i]=-1;
		}
		else
		{
			nger[i]=st.peek();
		}
		st.push(val);
	}
	return nger;
 }

}
