class Solution {
    public int solution(int n, int k) {
        
        int answer = 0;
        int b = ( n / 10 ) * 2000 ;
        
        if( n >= 10 ) {
            answer = ( 12000*n + 2000*k - b) ;
        }
        else if( n < 10 ) {
            answer = ( 12000*n + 2000*k ) ;
        }
        return answer;
    }
}