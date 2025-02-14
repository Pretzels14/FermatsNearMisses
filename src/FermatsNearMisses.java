// Fermat's Last Theorem Near Misses Finder
// File: FermatNearMiss.java
// External Files: N/A
// Output Files: N/A
// Programmers: Connor Presler, Daniyal Farooqui
// Emails: connorjpresler@lewisu.edu, 
// Course: CPSC 44000-LT1
// Date: put finished date
// This program helps find near misses for Fermat's Last Theorem, and does so by searching for different values(x,y,z,n,k) that
// minimize the relative miss for the equation x^n + y^n /= z^n for any n > 2


import java.util.Scanner;

public class FermatsNearMisses {
	
	// Beginning of program, use Scanner to let a user input numbers in this block
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fermat's Last Theorem Near Misses Finder");
	
		int n; // this is our 'power'(^) number
		
		// Create a loop that will only accept numbers between 3 and 11, and ensure this by adding boundaries (<3, >11) and ask user to re enter number
		do {
			System.out.println("Enter power (n) That is Between 3 and 11: ");
			n = sc.nextInt();
		}

	}

}