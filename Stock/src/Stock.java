public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName, double newPreviousClosingPrice) {
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousClosingPrice;
    }
    void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }
    double getChangePercent() {
        return (int)((currentPrice * 100 / previousClosingPrice - 100) *100) / 100.00;
    }
}
