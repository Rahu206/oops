import java.util.Scanner;
public class LineComparisonTest{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the x1: ");
		int x1 = sc1.nextInt();
		System.out.println("Enter the x2: ");
		int x2 = sc1.nextInt();
		System.out.println("Enter the y1: ");
		int y1 = sc1.nextInt();
		System.out.println("Enter the y2: ");
		int y2 = sc1.nextInt();
                System.out.println("Enter the p1: ");
                int p1 = sc1.nextInt();
                System.out.println("Enter the p2: ");
                int p2 = sc1.nextInt();
                System.out.println("Enter the q1: ");
                int q1 = sc1.nextInt();
                System.out.println("Enter the q2: ");
                int q2 = sc1.nextInt();

		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		LineComparisonEqual l = new LineComparisonEqual();
		boolean result = l.isEqualTo(x1,x2,y1,y2,p1,p2,q1,q2);
		System.out.println("Length of 2 points is" + result);
	}
}
