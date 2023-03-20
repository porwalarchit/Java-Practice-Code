package Lambda_Expressions;

import java.util.stream.IntStream;

public class isPrime_usingLambda {
    //Declarative approach
    private static boolean isPrime(int number){
        return number > 1
                && IntStream.range(2, number).noneMatch(
                index -> number % index == 0);
    }

//  Readable Apporaoch
//    private static boolean isPrime(int number) {
//        IntPredicate isDivisible = index -> number % index == 0;
//
//        return number > 1
//                && IntStream.range(2, number).noneMatch(
//                isDivisible);
//    }
}
