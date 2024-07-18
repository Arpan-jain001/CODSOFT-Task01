import java.util.Scanner;
class CurrencyConvertor 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("```` Welcome ````\n");

        System.out.println("===================================");
        System.out.println(("1. USD to Rupee "));
        System.out.println(("2. Rupee to USD "));
        System.out.println(("3. Euro to Rupee "));
        System.out.println(("4. Rupee to Euro \n"));
        System.out.println("===================================");


        System.out.println("Enter only one Choice : ");
        
        int ch = sc.nextInt();
        if(ch == 1)
        {
            System.out.println("Enter USD ammount: ");
            double USD = sc.nextDouble();
            double Rupee = UsdToRupee(USD);
            System.out.println("Converted Rupee: " + Rupee);
        }
        else if(ch == 2)
        {
            System.out.println("Enter Rupee ammount: ");
            double Rupee = sc.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted USD: " + USD);
        }
        else if(ch == 3)
        {
            System.out.println("Enter EURO ammount: ");
            double EURO = sc.nextDouble();
            double Rupee = EuroToRupee(EURO);
            System.out.println("Converted Rupee: " + Rupee);
        }
        else if(ch == 4)
        {
            System.out.println("Enter Rupee ammount: ");
            double Rupee = sc.nextDouble();
            double EURO = RupeeToEuro(Rupee);
            System.out.println("Converted USD: " + EURO);
        }
        else
        {
            System.out.println("invalid choice : please select correct choice");
        }
        sc.close();
    }

    public static double UsdToRupee(double USD) {
        return USD * 83.64;      //18 july 2024 : 9:29 PM
    }

    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.012;    //18 july 2024 : 9:30 PM
    }

    public static double EuroToRupee(double EURO) {
        return EURO * 91.29;      //18 july 2024 : 9:30 PM
    }

    public static double RupeeToEuro(double Rupee) {
        return Rupee * 0.011;      //18 july 2024 : 9:31 PM
    }
    

}
