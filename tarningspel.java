

import java.util.Scanner;

public class tarningspel {
	
	public static void main(String[] args) {
		int datortarning;
		int spelartarning;
		
		System.out.println("Tärningsspel");
		System.out.println("Du vinner om ditt tarningskast är högre än datorns");
		
		datortarning = (int)( Math.random() * 6 )+1;
		
		System.out.print("Skriv in ett tal 1-6");
		
		Scanner in = new Scanner(System.in);
		
		spelartarning = in.nextInt();
		in.close();
		
		System.out.println("Datorn hade: "+datortarning);
		
		if (spelartarning > datortarning)
			System.out.println("Du vann!");
		else
			System.out.println("RIP!");
	
				
	}
}
