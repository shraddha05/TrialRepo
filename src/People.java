public class People {
    private int age;
    private String name;

    People(int x, String y)
    {
        this.age = x;
        this.name = y;

    }

    People()
    {

    }

    void public getage()
    {
        System.out.println("age is "+this.age);
    }
    void public setage(int x)
    {
        this.age = x;
        System.out.println("age is "+this.age);
    }

    void public getname()
    {
        System.out.println("name is "+this.name);
    }
    void public setname(String x)
    {
        this.name = x;
        System.out.println("name is "+this.name);
    }

    void public work()
    {
        System.out.println("People are crazy!");
    }
}
