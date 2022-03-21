package abstractClass;

public class Circle extends Shape {

	private double sade;
	
	public Circle() {
		sade = 2.0;
	}
	public Circle(double sade) {		
		this.sade = (sade > 0 && sade < 10) ? sade : 2.0;
	}
		
	public double getSade() {
		return sade;
	}
	
	public double getPintaAla() {
		
		return Math.PI * Math.pow(sade, 2.0);
	}
	
	public void piirra() {

		double dist = 0;
		System.out.println();

		for (int i = 0; i <= 2 * sade; i++) {  
			for (int j = 0; j <= 2 * sade; j++) { 
				dist = Math.sqrt((i - sade) * (i - sade) + (j - sade) * (j - sade)); 

				if (dist > sade - 0.5 && dist < sade + 0.5)  
					System.out.print("*");
				else 
					System.out.print(" ");       
			} 
			System.out.println();
		}
	}
	
	public void resize() {
		
		sade = sade * 2;	
	}
}
