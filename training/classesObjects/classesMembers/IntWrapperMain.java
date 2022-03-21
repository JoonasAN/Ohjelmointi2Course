package classesObjects.classesMembers;

public class IntWrapperMain {
    public static void main(String[] args) {
        System.out.println(IntWrapper.getCount());
    }
}
class IntWrapper{
    private int val;
    private static int count;
    public IntWrapper()
    {
        val = 0;
        count++;
    }
    public IntWrapper(int ival)
    {
        val = ival;
        count++;
    }
    public static int getCount(){
        return count;
    }
}