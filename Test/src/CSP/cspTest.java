package CSP;
import java.util.Scanner;
public class cspTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 
		 int n=scan.nextInt();
		 
		 int array[]=new int [n];
		 int i,j,sum=0;
		 
		 for(i=0;i<n;i++) {
			 array[i]=scan.nextInt();
		 }
		 
		 for(i=0;i<n;i++) {
			 for(j=i+1;j<n;j++) {
				 if(array[i]-array[j]==1||array[j]-array[i]==1)
					 sum++;
			 }
		 }
		 
		 System.out.println(sum);
		 }

}
