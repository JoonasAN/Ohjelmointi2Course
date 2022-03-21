package abstractClass;

public class Main {

	public static void main(String [] args) {
		
		Square nelio = new Square(5);
		Rectangle suorakulmio = new Rectangle();
		Triangle kolmio = new Triangle(6);
		Circle ympyra = new Circle(4);
			
		System.out.println("Nelion sivu: " + nelio.getSivu());
		System.out.println("Nelion pinta_ala: " + nelio.getPintaAla());
		nelio.piirra();
		
		System.out.println("Suorakulmion koko: " + suorakulmio.getKorkeus() + 
				" * " + suorakulmio.getLeveys());
		System.out.println("Suorakulmion pinta_ala: " + suorakulmio.getPintaAla());
		suorakulmio.piirra();
		
		System.out.println("Kolmion sivu: " + kolmio.getSivu());
		System.out.println("Kolmion pinta_ala: " + kolmio.getPintaAla());
		kolmio.piirra();
		
		System.out.println("Ympyrän säde: " + ympyra.getSade());
		System.out.printf("Ympyran ala: %.2f\n", ympyra.getPintaAla());
		ympyra.piirra();
		
		nelio.resize();
		suorakulmio.resize();
		kolmio.resize();
		ympyra.resize();
		ympyra.piirra();		
	}
}