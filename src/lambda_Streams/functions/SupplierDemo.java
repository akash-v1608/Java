package lambda_Streams.functions;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class SupplierDemo {
    public static void main(String[] args)
    {
        Supplier<String> supplier=()->"No element found";
        List<Object> list= Arrays.asList("a");
       System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}
