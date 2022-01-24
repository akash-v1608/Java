package corejava.chapter7_classes_objects;

import java.util.ArrayList;

public class IceCreamDemo {
    public static void main(String[] args)
    {
        IceCream iceCream=new IceCream("black current",60,2,new ArrayList<String>());
        iceCream.addToppings("choco chips");
        iceCream.addToppings("wafer");
        System.out.println("icecream name "+iceCream.getName()+"\n"+"icecream cost "+iceCream.getCost()+"\n"+"number of scoops "+iceCream.getNumScoops());
        iceCream.printToppings();
    }
}
