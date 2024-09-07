import java.util.HashMap;
import java.util.Map;

public class Portfolio {

    private final String portfolioId;

    public String getPortfolioId() {
        return portfolioId;
    }

    public Portfolio(String portfolioId, Map<String, Stock> holdings) {
        this.portfolioId = portfolioId;
        this.holdings = holdings;
    }

    public Map<String, Stock> holdings = new HashMap<>();

    public Map<String, Stock> getHoldings() {
        return holdings;
    }
}
