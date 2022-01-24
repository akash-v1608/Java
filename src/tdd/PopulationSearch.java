package tdd;
import java.util.*;
public class PopulationSearch {


    public int getPopulation(String city) {
        Map<String, Integer> populationMap = null;
        int populationCount = 0;
        if (city.isEmpty()) {
            return 0;
        }
        populationMap = getPopulationStatistic();
        if (!populationMap.containsKey(city)) {
            return 0;
        } else {
            populationCount = populationMap.get(city);
        }
        return populationCount;
    }
    // user can give empty input
    // input may not be present in db

    private Map<String, Integer> getPopulationStatistic() {
        Map<String, Integer> populationMap = new HashMap<>();
        populationMap.put("Bangalore", 200000);
        populationMap.put("Hyderabad", 500000);
        populationMap.put("Pune", 300000);
        populationMap.put("Mumbai", 800000);
        return populationMap;
    }
}
