package abstractClass.exercise;

public abstract class BorrowableItem {
    private boolean borrowed = false;
    protected String title;

    public abstract void printInfo();
    
    public boolean isBorrowed(){
        return borrowed;
    }

    public void borrowItem(){
        this.borrowed = true;
    }

    public void returnItem(){
        this.borrowed = false;
    }
}
