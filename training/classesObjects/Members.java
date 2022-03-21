package classesObjects;

public class Members {
    
    public static void main(String[] args) {
        StrWrapperDriver();
        IntWrapperDriver();
    }

    public static void StrWrapperDriver() {
        String str = "GNU";
        MemberStringWrapper sw1 = new MemberStringWrapper();
        sw1.str = str;
        MemberStringWrapper sw2 = new MemberStringWrapper();
        sw2.str = sw2.str + sw1.str + str;
        System.out.println(sw2.str);
    }

    public static void IntWrapperDriver() {
        MemberIntWrapper iw1 = new MemberIntWrapper();
        iw1.val = 2;
        MemberIntWrapper iw2 = new MemberIntWrapper();
        iw2.val = 5;
        System.out.println(iw1.val);
        System.out.println(iw2.val);
    }

}
class MemberStringWrapper {
    public String str = "Hello";
}

class MemberIntWrapper {
    public int val;
}
