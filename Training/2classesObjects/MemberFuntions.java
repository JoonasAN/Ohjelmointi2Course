
public class MemberFuntions {

    public static void main(String[] args) {
        //intWrap();
        intWrapGet();
    }

    public static void intWrap() {
        IntWrapper iw1 = new IntWrapper();
        IntWrapper iw2 = new IntWrapper();
    
        for(int i = 0; i <= 5; i++){
            iw2.dec(1);
            iw1.inc(iw2.val);
        }
        iw2.dec(10);
        System.out.println(iw1.val);
    }

    public static void intWrapGet() {
        IntWrapperGet iw = new IntWrapperGet();
        iw.setVal(5);
        System.out.println(iw.getVal());
    }

}

class IntWrapper{
    public int val = 0;
    public void inc(int amount){
        val+=amount;
    }
    public void dec(int amount){
        val-=amount;
    }
}

class IntWrapperGet{
    private int val;
    public int getVal(){
        return val;
    }
    public void setVal(int newval)
    {
        val = newval;
    }
}