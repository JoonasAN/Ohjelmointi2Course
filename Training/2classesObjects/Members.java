public class Members {
    
    public static void main(String[] args) {
        StrWrapperDriver();
        IntWrapperDriver();
    }

    public static void StrWrapperDriver() {
        String str = "GNU";
        StringWrapper sw1 = new StringWrapper();
        sw1.str = str;
        StringWrapper sw2 = new StringWrapper();
        sw2.str = sw2.str + sw1.str + str;
        System.out.println(sw2.str);
    }

    public static void IntWrapperDriver() {
        IntWrapper iw1 = new IntWrapper();
        iw1.val = 2;
        IntWrapper iw2 = new IntWrapper();
        iw2.val = 5;
        System.out.println(iw1.val);
        System.out.println(iw2.val);
    }

}
class StringWrapper {
    public String str = "Hello";
}

class IntWrapper {
    public int val;
}
