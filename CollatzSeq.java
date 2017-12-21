import java.util.Scanner;
public class CollatzSeq {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		while(n>1) {
			if(n%2==0) {
				n=n/2; //if n is even
				System.out.println(n);
			}
			else {
				n=3*n+1; // if n is odd
				System.out.println(n);
			}
		}
	}

}
