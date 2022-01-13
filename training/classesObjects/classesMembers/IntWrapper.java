package training.classesObjects.classesMembers;

class IntWrapper{
    private int val;
    private int count;
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
    public int getCount(){
        return count;
    }
}