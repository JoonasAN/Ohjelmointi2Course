package training.classesObjects.functionOverloading;

public class StringWrapper {
    private String str = "";

    public void setStr(String newstr) {
        str = newstr;
    }

    public void setStr(int ival) {
        str = String.valueOf(ival);
    }

    public StringWrapper(String istr){
        str = istr;
    }

    public StringWrapper(int ival){
        str = String.valueOf(ival);
    }

    public String getStr() {
        return str;
    }
}
