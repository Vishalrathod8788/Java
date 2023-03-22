package My_Pack;

public class PrimeNumbers 
{
	
		public static void main(String[] args) {
	        int n = 10; // Replace with the desired number of prime numbers
	        
	        System.out.println("The first " + n + " prime numbers are:");
	        int count = 0, i = 2;
	        while(count < n) {
	            if(isPrime(i)) {
	                System.out.print(i + " ");
	                count++;
	            }
	            i++;
	        }
	    }
		
		  public static boolean isPrime(int num) {
		        if(num < 2) {
		            return false;
		        }
		        for(int i = 2; i <= Math.sqrt(num); i++) {
		            if(num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
}
