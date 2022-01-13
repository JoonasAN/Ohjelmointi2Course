package training.classesObjects.visibilities;

public class Foo
{
    private int p;
    int a;
    public int u;
    public static void main(String[] args)    {
        Bar b = new Bar();
        Foo f = new Foo();
        // call methods
    }
    private void goFoo()
    {
    }
    void sayFoo()
    {
    }
    public void useFoo()
    {
    }
}
class Bar
{
    private int p;
    int a;
    public int u;
    private void goBar()
    {
    }
    void sayBar()
    {
    }
    public void useBar()
    {
    }
}