import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine() ;
		int b = sc.nextInt( ) ;

		for( int i = 0 ; i < 1 ; i++ ) {
			System.out.print(a.charAt(b-1)) ;
		}
	}
}
