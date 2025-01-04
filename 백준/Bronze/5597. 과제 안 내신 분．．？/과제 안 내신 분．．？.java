import java.util.Scanner ; 

public class Main {
    public static void main(String args [ ] ) {
        Scanner sc = new Scanner(System.in) ;
        
        int student[ ] = new int[31] ;
        
        for( int i = 1 ; i < 29 ; i++ ) {
            int pass = sc.nextInt( ) ;
            
            student[pass] = 1 ;
        }
        for( int j = 1 ; j <= 30 ; j++ ) {
            if( student[j] != 1 ) {
                System.out.println(j) ;
            }
        }
    }
}