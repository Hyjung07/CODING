import java.util.Scanner;

public class Soulotion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();

		System.out.print(str) ;
		for( int i = 1 ; i < n ; i++ ) {
			System.out.print(str);
		}
	}
}