package lambda_Streams.mapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {

        List<Customer> customers = DataBase.getAll();

        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);


        List<List<String>> phoneNumbers = customers.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);


        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
