package abstractClass;

public class Triangle extends Shape {

	private int sivu;
	
	public Triangle() {
		sivu = 2;
	}
	public Triangle(int sivu) {		
		this.sivu = (sivu> 0 && sivu < 10) ? sivu : 2;
	}
	
	public double getPintaAla() {
		
		return (sivu * sivu)/2;
	}
		
	public int getSivu() {
		return sivu;
	}
	
	public void piirra() {
		
		int i, j, k;
		System.out.println();
				
		for (i = 0; i < sivu; i++) {
			for (j = 0; j < sivu; j++) {
				if (j == 0) {
					for (k = 0; k < (sivu - (i+1)); k++) {
						System.out.print(" ");
						j++;
					}
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void resize() {
		
		int i, j, k;
		System.out.println();
		
		for (i = 0; i < sivu*2; i++) {
			for (j = 0; j < sivu*2; j++) {
				if (j == 0) {
					for (k = 0; k < (2*sivu - (i+1)); k++) {
						System.out.print(" ");
						j++;
					}
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
