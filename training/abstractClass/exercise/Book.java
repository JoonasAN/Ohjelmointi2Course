package abstractClass.exercise;

public class Book extends BorrowableItem{
    //String title;
    private int pagecount;
    
    public Book(String ititle, int ipagecount) {
		this.title = ititle;
		this.pagecount = ipagecount;
	}
	
	public void printInfo(){
	    System.out.print(this.title + ": " + this.pagecount + " pages");
	}
}
