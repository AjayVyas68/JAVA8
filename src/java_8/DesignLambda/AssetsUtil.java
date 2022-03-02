package java_8.DesignLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssetsUtil {


    public static int totalAsstes(final List<Asset> assets) {
        return assets.stream().mapToInt(Asset::getValue).sum();
    }

    public static int totalBondValues(final List<Asset> assets) {
        return assets.stream().mapToInt(value -> value.getType() == Asset.AssetType.BOND ? value.getValue() : 0).sum();
    }
    public static int TotalStockValue(final List<Asset> assets)
    {
        return assets.stream().mapToInt(value -> value.getType()== Asset.AssetType.STOCK ? value.getValue() :0 ).sum();
    }

    final List<Asset> assetss = Arrays.asList(new Asset(Asset.AssetType.BOND, 100),
            new Asset(Asset.AssetType.STOCK, 1100), new Asset(Asset.AssetType.BOND, 2200),
            new Asset(Asset.AssetType.STOCK, 1500));

    public void print() {
        System.out.println("Total Assets Value"+totalAsstes(assetss));
        System.out.println("Total Bonds Value ="+totalBondValues(assetss));
        System.out.println("Total Stock Value ="+TotalStockValue(assetss));
    }

    public void printBond() {


    }

    public static void main(String[] args) {
        AssetsUtil assetsUtil = new AssetsUtil();
        assetsUtil.print();



    }
}




