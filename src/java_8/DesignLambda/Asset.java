package java_8.DesignLambda;

import java.util.Arrays;
import java.util.List;

public class Asset {
    public enum AssetType{
        BOND,STOCK
    };
    private final AssetType type;
    private final int value;

    public Asset(AssetType type, int value) {
        this.type = type;
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }


}
