import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {

try{
		int t = sc.nextInt();
		while (t-- > 0) {


		   String str=sc1.next();
		   int len=str.length();
		   //System.out.println(len);
		   int count=0;
		   for(int i=0;i<len;i++)
		   {
			   if(str.charAt(i)=='1')
			   {
				  count++;
				  for(int j=i;j<len;j++)
				  {
					  if(str.charAt(j)=='0')
				     {
						 break;
						 }
						 i++;
				 }


			   }
		   }
		   System.out.println("count "+count);
			}
			}catch(Exception P){}
		}
	}
