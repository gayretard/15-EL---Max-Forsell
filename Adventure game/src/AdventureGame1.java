import java.util.Scanner;

public class AdventureGame1 {
	public static void main(String[] args) {

		String f�rnamn;
		String efternamn;
		String spelarnamn;
		int �lder;
		int pengar=10;
		float h�lsa =100;
		int x=0,y=0,steg=0;
		String kommando="";

		while(!(kommando.equals("Suicide!") || h�lsa == 0))
		{
		System.out.println("Du befinner dig p� "+x+":"+y+" och din h�lsa �r: "+h�lsa);
		System.out.print("Vad vill du g�ra: ");
		Scanner command = new Scanner(System.in);
		kommando = command.nextLine();
		if (kommando.equals("w")) {
			y+=1;
			System.out.println("Du gick Norr");
		}
		else if (kommando.equals("s")) {
			y-=1;
			System.out.println("Du gick S�der");
		}
		else if (kommando.equals("a")) {
			x-=1;
			System.out.println("Du gick V�ster");
		}
		else if (kommando.equals("d")) {
			x+=1;
			System.out.println("Du gick �ster");
		}
		
		h�lsa -= 0.1;
		pengar = 10;
		
		System.out.println("Du har "+pengar+" mynt");
		
		int procent = (int) (Math.random() * 100);
				if (procent < 1) {
					System.out.println("Du har hittat ett monster!");
					
					int Monster = (int) (Math.random()* 100);
					if (Monster > 30) {
						
						
						int skada = (int) (Math.random() * 10) +1;
						h�lsa = h�lsa - skada;	
						System.out.println("Monstret skadade "+skada);
						
					}
					System.out.println("Du har d�dat monstret!");	
				}
				
				
				else if (procent < 10) {
					System.out.println("Du har hittat en NPC");
					
					int NPC = (int) (Math.random() * 100);
							if (NPC < 10) {
								
						
								float TjuvNPC = (int) (Math.random() * 40) +30;
								TjuvNPC= TjuvNPC /100;
								int tog = (int) (((float)pengar) * TjuvNPC);
								pengar = pengar - tog;
								System.out.println("NPC Tog "+TjuvNPC+" pengar fr�n dig");
								System.out.println("du har nu "+pengar+" pengar kvar");
							
							}else {
								int Extrah�lsa = (int) (Math.random() * 5) +1;
								h�lsa += Extrah�lsa;
								System.out.println("Du har nu "+Extrah�lsa+ " h�lsa"); 
							}
				}
							
							else if (procent < 3) {
								System.out.println("Du har fallit i en grop");
								
								int Fallgrop = (int) (Math.random() * 5) +1;
										
									h�lsa = h�lsa - Fallgrop;
								System.out.println("Du har tagit "+Fallgrop+" Skada");
										
								
							}
				}
					
		System.out.println("Du har d�tt!");
		}		
	}																									
							
