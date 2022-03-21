package abstractClass;

public class Square extends Shape {

	private int sivu;
	
	public Square() {
		sivu = 3;
	}
    
	public Square(int sivu) {		
		this.sivu = (sivu > 0 && sivu < 20) ? sivu : 3;
	}
	
	public double getPintaAla() {
		
		return sivu * sivu;
	}
	
	public int getSivu() {
		return sivu;
	}
	
	public void piirra() {
		
		int i, j;
		System.out.println();
				
		for (i = 0; i < sivu; i++) {
			for (j = 0; j < sivu; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void resize() {
		
		int i, j;
		System.out.println();
		
		for (i = 0; i < sivu*2; i++) {
			for (j = 0; j < sivu*2; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();		
	}
}
