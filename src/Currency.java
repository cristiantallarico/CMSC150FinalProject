public class Currency{
    //instance variables
    private String name;
    private String symbol;
    private double exchengeRate;


    //constructor
    public Currency(String name, String symbol, double exchengeRate){
        
        this.name = name;
        this.symbol = symbol;
        this.exchengeRate = exchengeRate;
    }

    //getters and seters for all instance variables
    public String getName() { 
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getExchangeRate() {
        return this.exchengeRate;
    }

    public void setExchangeRate(double exchengeRate) {
        this.exchengeRate = exchengeRate;
    }


}