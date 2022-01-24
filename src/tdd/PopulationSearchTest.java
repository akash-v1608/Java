package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class PopulationSearchTest
{
    @Test
    public void findPopulation() {
        String city="Bangalore";
        int expectedPopulationCount=200000;
        PopulationSearch ps=new PopulationSearch();
        int count=ps.getPopulation(city);
        assertEquals(expectedPopulationCount, count);
    }

    @Test
    public void findPopulationWithEmptyInput() {
        String city="";
        int expectedPopulationCount=0;
        PopulationSearch ps=new PopulationSearch();
        int count=ps.getPopulation(city);
        Assertions Assert = null;
        Assert.assertEquals(expectedPopulationCount, count);
    }

    @Test
    public void findPopulationWithInavlidInput() {
        String city="XYZ";
        int expectedPopulationCount=0;
        PopulationSearch ps=new PopulationSearch();
        int count=ps.getPopulation(city);
        Assertions Assert = null;
        assertEquals(expectedPopulationCount, count);
    }
}