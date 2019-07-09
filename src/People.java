public class People {
    private int age;
    private String name;

    People(int x, String y)
    {
        this.age = x;
        this.name = y;

    }


    public void getage()
    {
        System.out.println("age is "+this.age);
    }
    public void setage(int x)
    {
        this.age = x;
        System.out.println("age is "+this.age);
    }

    public void getname()
    {
        System.out.println("name is "+this.name);
    }
    public void setname(String x)
    {
        this.name = x;
        System.out.println("name is "+this.name);
    }

    public void work()
    {
        System.out.println("People are crazy!");
    }


}
