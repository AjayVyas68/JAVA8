package java_8.DesignLambda;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T> {
    TailCall<T> apply();
    default boolean isComplete(){
        return false;
    }
    default T Result(){
        throw  new Error("not completed");
    }
    default T invoke(){
        return Stream.iterate(this,TailCall::apply).filter(TailCall::isComplete)
                .findFirst().get().Result();
    }
}
