package My_Pack;

public class doWhileSum 
{
	public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        do {
            sum += i;
            i++;
        } while (i <= 10);
        
        System.out.println("The sum of numbers 1 to 10 is: " + sum);
    }
}
