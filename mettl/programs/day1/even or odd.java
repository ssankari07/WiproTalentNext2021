import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		s.close();
	}
}
