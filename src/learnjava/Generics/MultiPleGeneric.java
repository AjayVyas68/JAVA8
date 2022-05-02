package learnjava.Generics;

public class MultiPleGeneric {
    interface MuliPle<K,V,R>
    {
        R sum(K k,V v);
    }

    public static void main(String[] args) {
        MuliPle<Integer,Double,String> muliPle=(key,value)->String.valueOf(key+value);
        System.out.printf("value in map"+muliPle.sum(10,20.41));
    }
}
