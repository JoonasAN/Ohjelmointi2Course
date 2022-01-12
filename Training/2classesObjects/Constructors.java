public class Constructors {
    public static void main(String[] args) {
        strWrap();
        intWrap();
    }
    public static void strWrap() {
        String str = "Bar";
        StringWrapper sw1 = new StringWrapper(str);
        StringWrapper sw2 = new StringWrapper(sw1.str + str);
        sw2.str += "Foo";
        System.out.println(sw2.str);
    }
    public static void intWrap() {
        IntWrapper iw1 = new IntWrapper(2);
        IntWrapper iw2 = new IntWrapper(5);
        iw1.getVal();
        iw2.getVal();
        System.out.println(iw1.getVal());
        System.out.println(iw2.getVal());
    }
}
class StringWrapper{
    String str = "Foo";
    public StringWrapper(String istr)
    {
        str = istr;
    }
}

class IntWrapper{
    private int val = 0;
    public IntWrapper(int ival)
    {
        val = ival;
    }
    public int getVal()
    {
        return val;
    }
}