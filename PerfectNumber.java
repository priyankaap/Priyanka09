import java.util.Scanner;;
public class PerfectNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,i,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter an interger:");
	n=sc.nextInt();
	for(i=1;i<n;i++) {
		if(n%i==0) {
			sum+=i;
		}
		
	  } 
	if (sum==n) {
		System.out.println("Its Perfect Number");
	}
		else
			System.out.println("Its not a Perfect Number");
	}
}

