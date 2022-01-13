package training.classesObjects.classesMembers;

public class TheInt {
    public static void main(String[] args) {
        TheInts iw1 = new TheInts();
        TheInts iw2 = new TheInts();

        for(int i = 0; i <= 5; i++){
            iw2.dec(1);
            iw1.inc(TheInts.val);
        }
        iw2.dec(-10);
        System.out.println(TheInts.val);
    }
}

class TheInts{
    static int val = 0;
    public void inc(int amount)
    {
        val+=amount;
    }
    public void dec(int amount)
    {
        val-=amount;
    }
}
