package lambda_Streams.functions;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("printing: "+t);
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().forEach(consumer);
    }
}