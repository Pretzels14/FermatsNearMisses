package fermatsNearMiss;

// Fermat's Last Theorem Near Misses Finder
// File: FermatNearMisses.java
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
	
	public static void findFermatsNearMisses(int n, int k) {
		int zValue; // this will be used to give us the z value that provides the smallest miss
		double smallestRelMiss = Double.MAX_VALUE; // this helps us keep track of the smallest miss found
		String bestMissDetails = "";
		
		// Message indcating that the search for the smalles near miss is occuring 
        System.out.println("\nSearching for near misses for FMS w/ n = " + n + " and x, y in [10, " + k + "]..\n");
		
		// loop over the combinations of x and y within the range of numbers
		for (int x = 10; x <= k; x++) {
			for (int y = 10; y <= k; y++) {
				// Calculate x^n + y^n
				double powersSummed = Math.pow(x, n) + Math.pow(y, n);
				// take the nth root to help approximate z
				int z = (int) Math.pow(powersSummed, 1.0 / n);
				
				// set our upper and lower boundaries that will be used later to calculate the value
				double lower = Math.pow(z, n);
				double upper = Math.pow(z + 1,  n); // this is for z+1 ^ n
				
				// Calculate the difference in the upper and lower bounds
				double lowerBoundMiss = Math.abs(powersSummed - lower);
				double upperBoundMiss = Math.abs(upper - powersSummed);
				
				// Choose the smallest miss
				double miss = (lowerBoundMiss < upperBoundMiss) ? lowerBoundMiss : upperBoundMiss;
				
				// used to calculate the relative miss value
				double relativeMiss = miss / powersSummed;
				
				// Check if the current relative miss is the smallest found so far
				if (relativeMiss < smallestRelMiss) {
					smallestRelMiss = relativeMiss;
					
					// Format the new best miss for output
					bestMissDetails = String.format("x = %d, y = %d, z = %d, miss = %.0f, relative miss = %.10f",
						x, y, z + (upperBoundMiss < lowerBoundMiss ? 1 : 0), miss, relativeMiss * 100);
					
					// Print the new best miss for each new best miss found
					System.out.println("\nNew best miss found:");
					System.out.println(bestMissDetails);
				}
			}
		}
		
		// Final output after checking all combinations
		System.out.println("\nThe smallest relative miss found was:");
		System.out.println(bestMissDetails);
	}
	
	// Beginning of program, use Scanner to let a user input numbers in this block
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fermat's Last Theorem Near Misses Finder");
	
		int num; // this is our 'power'(^) number
		
		// Create a loop that will only accept numbers between 3 and 11, and ensure this by adding boundaries (<3, >11) and ask user to re-enter number
		do {
			System.out.print("Enter power (n) that is between 3 and 11: ");
			num = sc.nextInt();
			if (num < 3 || num > 11) {
				System.out.println("Not a valid input, the number has to be between 3 and 11\n");
			}
		} while (num < 3 || num > 11);
		
		int k; // upper limit
		
		// Loop that makes sure k is at least 10
		do {
			System.out.print("Enter upper limit k (greater than or equal to 10): ");
			k = sc.nextInt();
			if (k < 10) {
				System.out.println("Not a valid input, k has to be at least 10\n");
			}
		} while (k < 10);
		
		// Call the method to find Fermat's near misses
		findFermatsNearMisses(num, k);
		sc.nextLine(); // Consume the remaining newline
		sc.nextLine(); // Wait for user to press enter
		sc.close();
	}
}