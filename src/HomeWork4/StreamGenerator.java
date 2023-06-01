package HomeWork4;

import java.util.stream.Stream;

public class StreamGenerator {
    public static void main(String[] args) {

        long seed = 0L;
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = generateRandomStream(seed, a, c, m);
        randomStream.limit(10).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

}
