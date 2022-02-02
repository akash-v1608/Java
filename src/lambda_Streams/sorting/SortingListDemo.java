package lambda_Streams.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        List<lambda_Streams.Employee> employees = DataBase.getEmployees();

		/*Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());// ascending
			}
		});*/


        Collections.sort(employees, ( o1,  o2) ->(int) (o1.getSalary() - o2.getSalary()));

        employees.stream().sorted(( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(t->System.out.println(t));

    }
}