import java.util.Scanner;
import java.util.Arrays;

public class UserInt {

    
    public static void main(String [] args) {
        
        
        Currency usd = new Currency("US Dollar", "$", 1);
        Currency chf = new Currency("Swiss Francs", "CHF", 1.5);
        Currency eur = new Currency("Euro","€", 2);

        int fromCurrency;
        int toCurrency;
        double amount;
        Currency from = null;
        Currency to = null;
        double result;


        System.out.println("Welcome to the Currency Converter");
        System.out.println("Available Currencies:");
        System.out.println("1) " + usd.getName());
        System.out.println("2) " + chf.getName());
        System.out.println("3) " + eur.getName());

        Scanner in = new Scanner(System.in);

        System.out.println("Convert from: ");
        fromCurrency = in.nextInt();
        System.out.println("Convert to: ");
        toCurrency = in.nextInt();

        System.out.println("Enter amount: ");
        amount = in.nextDouble();


        switch(fromCurrency) {
            case 1:
                from = usd;
                break;
            case 2:
                from = chf;
                break;
            case 3:
                from = eur;
                break;
        }

        switch(toCurrency) {
            case 1:
                to = usd;
                break;
            case 2:
                to = chf;
                break;
            case 3:
                to = eur;
                break;
        }
        
        result = Converter.convert(from, to, amount);

        System.out.printf(amount + " " + from.getSymbol() + " (" + from.getName() +")"  
                                 + " %.2f " + to.getSymbol() + " (" + to.getName() + ")", result);
    }
    
}
