import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

public class TeachApplication {


    public void testStock() throws IOException {
        Stock stock = YahooFinance.get("AMD");

        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

        stock.print();
    }


    public static void main(String[] args) throws IOException {
        TeachApplication app = new TeachApplication();

        app.testStock();
    }

}
