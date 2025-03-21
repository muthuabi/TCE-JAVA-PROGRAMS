package lab_ex5;
import java.util.Random;
import java.util.Scanner;

class Mk_Stock {
    private String mk_stockName;
    private double mk_currentPrice;
    private double mk_marketTrend;
    Mk_Stock(String mk_stockName) {
        this.mk_stockName = mk_stockName;
        this.mk_currentPrice = mk_generateRandomPrice();
        this.mk_marketTrend = mk_generateRandomTrend();
    }

    Mk_Stock(String mk_stockName, double mk_currentPrice) {
        this.mk_stockName = mk_stockName;
        this.mk_currentPrice = mk_currentPrice;
        this.mk_marketTrend = mk_generateRandomTrend();
    }

    Mk_Stock(String mk_stockName, double mk_currentPrice, double mk_marketTrend) {
        this.mk_stockName = mk_stockName;
        this.mk_currentPrice = mk_currentPrice;
        this.mk_marketTrend = mk_marketTrend;
    }
    double mk_predictPrice() {
        return mk_currentPrice * mk_marketTrend;
    }

    double mk_predictPrice(int mk_days) {
        return mk_currentPrice * mk_marketTrend+ mk_days;
    }

    double mk_predictPrice(int mk_days, double mk_newsImpact) {
        return mk_currentPrice * (mk_marketTrend + mk_newsImpact/100)+ mk_days;
    }

    void mk_displayStock() {
        System.out.printf("\nStock: %s | Current Price: ₹%.2f | Market Trend: %.2f%%\n", 
                          mk_stockName, mk_currentPrice, mk_marketTrend * 100);
    }

    private double mk_generateRandomPrice() {
        return new Random().nextDouble() * 500;  
    }

    private double mk_generateRandomTrend() {
        return new Random().nextDouble(); 
    }
}

public class Mk_StockMarket {
    public static void main(String[] args) {
        Scanner mk_scanner = new Scanner(System.in);

        System.out.print("Enter Stock Name: ");
        String mk_stockName = mk_scanner.nextLine();

        Mk_Stock mk_stock = new Mk_Stock(mk_stockName);
        mk_stock.mk_displayStock();

        System.out.print("Enter prediction days: ");
        int mk_days = mk_scanner.nextInt();

        System.out.print("Enter news impact factor (1-100%): ");
        double mk_newsImpact = mk_scanner.nextDouble();

        double mk_predictedPrice1 = mk_stock.mk_predictPrice();
        double mk_predictedPrice2 = mk_stock.mk_predictPrice(mk_days);
        double mk_predictedPrice3 = mk_stock.mk_predictPrice(mk_days, mk_newsImpact);

        System.out.printf("\nPredicted Price (1 Day): ₹%.2f", mk_predictedPrice1);
        System.out.printf("\nPredicted Price (%d Days): ₹%.2f", mk_days, mk_predictedPrice2);
        System.out.printf("\nPredicted Price (%d Days with News Impact): ₹%.2f\n", mk_days, mk_predictedPrice3);

        mk_scanner.close();
    }
}
