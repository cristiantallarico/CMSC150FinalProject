import java.util.Scanner;
import java.util.Arrays;

public class UserInt {
    public static void main(String [] args) {
        //Might want to only create the object when you need it, if you had a ton of currencies you would be creating many objects, most of which wouldn't be used
        //I put the objects into an array later, I think you would have to create all of them here if you want to do it that way
        Currency usd = new Currency("US Dollar", "$", 1);
        Currency chf = new Currency("Swiss Francs", "CHF", 1.5);
        Currency eur = new Currency("Euro","€", 2);

        Currency[] currencies = {usd, chf, eur}; //Creating array to replace switch function

        int fromCurrency;
        int toCurrency;
        double amount;
        Currency from = null;
        Currency to = null;
        double result;

        System.out.println("Welcome to the Currency Converter");
        System.out.println("Available Currencies:");
        System.out.println("1) " + usd.getName()); //You could make a toString method for currencies, but this also makes sense
        System.out.println("2) " + chf.getName());
        System.out.println("3) " + eur.getName());

        Scanner in = new Scanner(System.in);

        //Make it clear you have to input an int, and if the input isn't a number, loop the prompt again
        boolean validInput;
        do{
            validInput = true;
            System.out.println("Convert from [int]: ");
            fromCurrency = in.nextInt(); //Causes errors if user inputs a string. May want to take in a String with nextLine, convert to Integer wrapper class, while checking if input is valid
            if(fromCurrency < 1 || fromCurrency > 3){
                validInput = false;
                System.out.println("Invalid input. Try again.");
            }
        }while(validInput == false);

        //Check for valid input here
        System.out.println("Convert to [int]: ");
        toCurrency = in.nextInt();

        //Check for valid input here
        System.out.println("Enter amount: ");
        amount = in.nextDouble();

        //Think an easier way to do this would be to list the objects in an array, accessing the objects directly with the int the user input (using it as the index)
        //I created the array above
        from = currencies[fromCurrency - 1]; //-1 to line up the index
        to = currencies[toCurrency - 1];

        result = convert(from, to, amount); //Turned converter into a method within UserInt.java

        System.out.printf(amount + " " + from.getSymbol() + " (" + from.getName() +")"  
                                 + " %.2f " + to.getSymbol() + " (" + to.getName() + ")", result);
    }

    public static double convert(Currency from, Currency to, double amount) {
        double rate = from.getExchangeRate() / to.getExchangeRate();
        return amount * rate;
    }
}
