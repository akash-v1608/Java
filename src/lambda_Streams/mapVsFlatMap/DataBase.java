package lambda_Streams.mapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {


    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "bob marley", "bob@gmail.com", Arrays.asList("397937955", "21654725")),
                new Customer(102, "jagganadh", "jagan@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "cavin peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "akash velagala", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }


}