package Zalando;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Zalando2 {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Map<Integer, Long> arrayIndexValueMap = Arrays.stream(A)
                .boxed()
                .collect( Collectors.groupingBy( Function.identity(),Collectors.counting() ) );

        return arrayIndexValueMap.entrySet()
                .stream()
                .mapToInt( Zalando2::countPair ).sum();

    }
    public static int countPair(Map.Entry<Integer,Long> entry){
        return ((entry.getValue().intValue() - 1)) * entry.getValue().intValue() / 2;
    }
}
