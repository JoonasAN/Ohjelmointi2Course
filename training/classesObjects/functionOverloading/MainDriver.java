package classesObjects.functionOverloading;

public class MainDriver {
    public static void main(String[] args) {
        //DoubleWrapper dw = new DoubleWrapper();

        //String a = "1.0";
        //dw.setVal(a);

        StringWrapper sw = new StringWrapper(1);
        //sw.setStr(5);
        System.out.println(sw.getStr());
    }
}