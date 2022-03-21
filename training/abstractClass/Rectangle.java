package abstractClass;

public class Rectangle extends Shape {

	private int korkeus;
	private int leveys;
	
	public Rectangle() {
		korkeus = 2;
		leveys = 4;
	}
	public Rectangle(int korkeus, int leveys) {		
		this.korkeus = (korkeus > 0 && korkeus < 10) ? korkeus : 2;
		this.leveys = (leveys > 0 && leveys < 10) ? leveys : 4;
	}
		
	public int getKorkeus() {
		return korkeus;
	}
	
	public int getLeveys() {
		return leveys;
	}
	
	public double getPintaAla() {
		
		return korkeus * leveys;
	}
	
	public void piirra() {
		
		int i, j;
		System.out.println();
				
		for (i = 0; i < korkeus; i++) {
			for (j = 0; j < leveys; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void resize() {
		
		int i, j;
		System.out.println();
		
		for (i = 0; i < korkeus*2; i++) {
			for (j = 0; j < leveys*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
	}
}