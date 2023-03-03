public class Converter {

    public static double convert(Currency from, Currency to, double amount) {
                double rate = from.getExchangeRate() / to.getExchangeRate();
                return amount * rate;
    }
    
}
