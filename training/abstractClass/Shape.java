package abstractClass;

public abstract class Shape {

	private int x;
	private int y;
	
	public abstract double getPintaAla();
	public abstract void piirra();
	public abstract void resize();
	
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public boolean setX(int x) {
		boolean status = false;
		if (x > 0 && x < 10) {
			this.x = x;
			status = true;
		}
		return status;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean setY(int y) {
		boolean status = false;
		if (y > 0 && y < 10) {
			this.y = y;
			status = true;
		}
		return status;
	}	
}