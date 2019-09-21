package spears_p1;
import java.util.*;

/*
 * A company that wants to send data over the Internet has 
 * asked you to write a program that will encrypt it so that 
 * it may be transmitted more securely. All the data is 
 * transmitted as four-digit integers. Your application should 
 * read a four-digit integer entered by the user and encrypt 
 * it as follows: Replace each digit with the result of adding 
 * 7 to the digit and getting the remainder after dividing the 
 * new value by 10. Then swap the first digit with the third, 
 * and swap the second digit with the fourth. Then print the 
 * encrypted integer. 
 */

public class DataEncryptor {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a 4 digit number for encryption: ");
		
		int n = scnr.nextInt();
		
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		c = c * 1000;
		d = d * 100;
		a = a * 10;
		b = b * 1;
		
		n = c + d + a + b;
		
		System.out.println("Encrypting...");
		System.out.println(n);
	}
}
