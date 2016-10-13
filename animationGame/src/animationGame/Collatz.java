package animationGame;

import java.io.*;

public class Collatz {
	

	   public static void main(String[] args) throws IOException {
		   
		   int n;		   
		   
		   BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		   System.out.println("Bitte Zahl eingeben");
		    n = Integer.parseInt(input.readLine());
	        collatz(n);
	        System.out.println();
	        
	    }

	   public static void collatz(int n) {
		   
		 
	        System.out.print(n + " ");
	        if (n == 1) return;
	        else if (n % 2 == 0) collatz(n / 2);
	        else collatz(3*n + 1);
	    }

	 

	}

