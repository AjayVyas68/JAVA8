package learnjava.DesignLambda;

import java.util.Arrays;
import java.util.List;

public class RodCutterBasic {
    final List<Integer> prices;

    public RodCutterBasic(List<Integer> prices) {
        this.prices = prices;
    }




    public int maxProfit(final int length) {
        int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
        for (int i = 1; i < length; i++) {
            int priceWhencut = maxProfit(1) + maxProfit(length - 1);
            if (profit < priceWhencut)
                profit = priceWhencut;
        }

        return profit;
    }

    public static void main(String[] args) {
        final List<Integer> pricevalue = Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
        final RodCutterBasic rodCutterBasic = new RodCutterBasic(pricevalue);
        System.out.println(rodCutterBasic.maxProfit(5));
        System.out.println(rodCutterBasic.maxProfit(22));


    }
}
