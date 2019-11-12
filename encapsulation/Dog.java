package encapsulation;
//Is like child class
public class Dog extends Animal
{
    public static void main (String [] args)
    {
        Dog obj = new Dog();

        System.out.println();
       // obj.sounds();
        //obj.sounds();
       // System.out.println(obj.sounds());

    }

    public void sounds()
    {
        System.out.println("Bark Bark ");
    }



}
