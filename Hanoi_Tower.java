package Hanoi;

public class Hanoi_Tower {

		    // Function to recursively solve the Hanoi Tower problem
		    static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
		       
		        if (n == 1) {
		            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
		            return;
		        }

		        // Move the top n-1 disks from fromRod to auxRod, using toRod as auxiliary
		        solveHanoi(n - 1, fromRod, auxRod, toRod);

		        
		        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);

		        // Move the n-1 disks from auxRod to toRod, using fromRod as auxiliary
		        solveHanoi(n - 1, auxRod, toRod, fromRod);
		    }

		    public static void main(String[] args) {
		        int numDisks = 3; // Number of disks to be moved
		        solveHanoi(numDisks, 'A', 'C', 'B'); // A, C, and B are names of rods
		    }
		


		
}
