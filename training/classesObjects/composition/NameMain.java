package classesObjects.composition;


public class NameMain {
    public static void main(String[] args) {
        Name fn = new Name("John");
        Name ln = new Name("Smith");
        Person p = new Person(fn, ln);
        fn.setName("Peter");
        ln = new Name("Brown");
        p.print();
    }
}

class Name
{
    private String name;
    public Name(String nn)
    {
        name = nn;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String nn)
    {
        name = nn;
    }
}

class Person
{
    private Name first;
    private Name last;
    public Person(Name fn, Name ln)
    {
        first = fn;
        last = ln;
    }
    public void print()
    {
        System.out.println(first.getName() + " " + last.getName());
    }
}
