import java.util.Scanner;

class Hillstations
{
    void famousfood()
    {
        System.out.println("Famous food of hill station");
    }

    void famousfor()
    {
        System.out.println("Famous for natural beauty");
    }
}

class Manali extends Hillstations
{
    void famousfood()
    {
        System.out.println("Manali famous food: Siddu");
    }

    void famousfor()
    {
        System.out.println("Manali famous for: Snow mountains");
    }
}

class Ooty extends Hillstations
{
    void famousfood()
    {
        System.out.println("Ooty famous food: Chocolates");
    }

    void famousfor()
    {
        System.out.println("Ooty famous for: Tea gardens");
    }
}

class Matheran extends Hillstations
{
    void famousfood()
    {
        System.out.println("Matheran famous food: Chikki");
    }

    void famousfor()
    {
        System.out.println("Matheran famous for: Eco point");
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Hillstations h;

        System.out.println("Select Hill Station:");
        System.out.println("1. Manali");
        System.out.println("2. Ooty");
        System.out.println("3. Matheran");

        int choice = sc.nextInt();

        if(choice == 1)
            h = new Manali();
        else if(choice == 2)
            h = new Ooty();
        else
            h = new Matheran();

        h.famousfood();
        h.famousfor();
    }
}