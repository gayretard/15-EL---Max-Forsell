import java.util.Scanner;

public class AdventureGame1 {
	public static void main(String[] args) {

		String förnamn;
		String efternamn;
		String spelarnamn;
		int ålder;
		int pengar=10;
		float hälsa =100;
		int x=0,y=0,steg=0;
		String kommando="";

		while(!(kommando.equals("Suicide!") || hälsa == 0))
		{
		System.out.println("Du befinner dig på "+x+":"+y+" och din hälsa är: "+hälsa);
		System.out.print("Vad vill du göra: ");
		Scanner command = new Scanner(System.in);
		kommando = command.nextLine();
		if (kommando.equals("w")) {
			y+=1;
			System.out.println("Du gick Norr");
		}
		else if (kommando.equals("s")) {
			y-=1;
			System.out.println("Du gick Söder");
		}
		else if (kommando.equals("a")) {
			x-=1;
			System.out.println("Du gick Väster");
		}
		else if (kommando.equals("d")) {
			x+=1;
			System.out.println("Du gick Öster");
		}
		
		hälsa -= 0.1;
		pengar = 10;
		
		System.out.println("Du har "+pengar+" mynt");
		
		int procent = (int) (Math.random() * 100);
				if (procent < 1) {
					System.out.println("Du har hittat ett monster!");
					
					int Monster = (int) (Math.random()* 100);
					if (Monster > 30) {
						
						
						int skada = (int) (Math.random() * 10) +1;
						hälsa = hälsa - skada;	
						System.out.println("Monstret skadade "+skada);
						
					}
					System.out.println("Du har dödat monstret!");	
				}
				
				
				else if (procent < 10) {
					System.out.println("Du har hittat en NPC");
					
					int NPC = (int) (Math.random() * 100);
							if (NPC < 10) {
								
						
								float TjuvNPC = (int) (Math.random() * 40) +30;
								TjuvNPC= TjuvNPC /100;
								int tog = (int) (((float)pengar) * TjuvNPC);
								pengar = pengar - tog;
								System.out.println("NPC Tog "+TjuvNPC+" pengar från dig");
								System.out.println("du har nu "+pengar+" pengar kvar");
							
							}else {
								int Extrahälsa = (int) (Math.random() * 5) +1;
								hälsa += Extrahälsa;
								System.out.println("Du har nu "+Extrahälsa+ " hälsa"); 
							}
				}
							
							else if (procent < 3) {
								System.out.println("Du har fallit i en grop");
								
								int Fallgrop = (int) (Math.random() * 5) +1;
										
									hälsa = hälsa - Fallgrop;
								System.out.println("Du har tagit "+Fallgrop+" Skada");
										
								
							}
				}
					
		System.out.println("Du har dött!");
		}		
	}																									
							
