package encapsulation;

public class Cat extends Animal
{
    public static void main (String [] args)
    {
        Cat obj = new Cat ();
        System.out.println("Hey this is Pavelllll");
        obj.sounds();
        //I'll add this Code now 
        int a = 10;
        int b = 20;
        int add = a+b;

        System.out.println(add);

        double x = 10.0;
        double y = 20.0;

        double doubleAdd = x=y;
        System.out.println(doubleAdd);

    }

}
