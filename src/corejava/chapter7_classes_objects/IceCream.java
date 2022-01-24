package corejava.chapter7_classes_objects;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;
    IceCream(String name, int cost, int numScoops, ArrayList<String> toppings)
    {
        this.name=name;
        this.cost=cost;
        this.numScoops=numScoops;
        this.toppings=toppings;
    }
    String getName()
    {
        return name;
    }
    int getCost()
    {
        return cost;
    }
    int getNumScoops()
    {
        return numScoops;
    }
    void addToppings(String newTopping)
    {
        toppings.add(newTopping);
    }
    void printToppings()
    {
        System.out.println("Following are the selected toppings");
        for(String x:toppings)
        {
            System.out.println(x);
        }
    }
}
