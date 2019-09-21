package spears_p1;
import java.util.*;

/*
 * Write a separate application that inputs 
 * an encrypted four-digit integer and decrypts 
 * it (by reversing the encryption scheme) 
 * to form the original number.
 */

public class DataDecryptor {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a 4 digit number for decryption: ");
		
		int n = scnr.nextInt();
		
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		
		c = c * 1000;
		d = d * 100;
		a = a * 10;
		b = b * 1;
		
		n = c + d + a + b;
		
		System.out.println("Decrypting...");
		System.out.println(n);
	}
}
