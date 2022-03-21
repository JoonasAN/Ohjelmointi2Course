package abstractClass.exercise;

public class Disc extends BorrowableItem{
    //String title;
    private int length;
    
    public Disc(String ititle, int ilength) {
		this.length = ilength;
		this.title = ititle;
	}
	
	public void printInfo(){
	    System.out.print(this.title + ": " + this.length + " mins");
	}

	public void name() {
		System.out.print(this.getClass().getSimpleName());
	}

}