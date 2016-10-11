import javax.swing.*;
import java.awt.*;

public class Grafik extends JPanel {
	
	private int width = 100;
	private int height = 100;
	private int d = 50; //diameter
	private int x = 0;
	private int y = 0;
	
	private void moveball(){
		x += 1;
		y += 1;
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.fillOval(x, y, d, d); 
	}

	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Grafik grafik = new Grafik();
		
		frame.setSize(700, 800); //x,y
		frame.setLocation(300, 200);
		frame.setDefaultCloseOperation(3);
		frame.add(grafik);
		frame.setTitle("Mitt första grafiska projekt");
		frame.setResizable(false);
		frame.setVisible(true);
		
		while(true){
			grafik.moveball();
			grafik.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
			
		}
		
	}

}
