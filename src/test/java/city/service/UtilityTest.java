package city.service;

import org.junit.jupiter.api.Test;
import salary.service.City;
import salary.service.Salary;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UtilityTest {

    /**
    Address stubAddress() {

    }
     */

    @Test
    public void testGetAddressesByCity() {
        //Mock the City class
        City city = mock(City.class);
        List<Address> mockAddresses = new ArrayList<>();
        mockAddresses.add(new Address("address 1", "city 1"));
        mockAddresses.add(new Address("address 2", "city 1"));
        mockAddresses.add(new Address("address 3", "city 2"));
        when(city.listAddresses()).thenReturn(mockAddresses);

        Utility testUtility = new Utility();
        List<Address> expectedAddresses = new ArrayList<>();
        expectedAddresses.add(new Address("address 1", "city 1"));
        expectedAddresses.add(new Address("address 2", "city 1"));
        expectedAddresses.add(new Address("address 3", "city 2"));

        List<Address> testAddresses = testUtility.getAddressesByCity(city, "city 1");

        for (int i = 0; i < testAddresses.size(); i++) {
            //Compare addresses
            assertEquals(expectedAddresses.get(i).address, testAddresses.get(i).address);
        }
    }
    @Test
    public void testSalaryFilter() {
        Salary salary = mock(Salary.class);
        List<Integer> mockedSalaries = new ArrayList<>();
        mockedSalaries.add(40000);
        mockedSalaries.add(35000);
        mockedSalaries.add(30000);
        mockedSalaries.add(55000);
        mockedSalaries.add(65000);
        when(salary.returnSalaries()).thenReturn(mockedSalaries);

        List<Integer> expectedSalaries = new ArrayList<>();
        expectedSalaries.add(55000);
        expectedSalaries.add(65000);

        Utility utility = new Utility();
        List<Integer> salaries = utility.getSalariesOver(salary, 50000);

        for (int i = 0; i < salaries.size(); i++){
            assertEquals(salaries.get(i), expectedSalaries.get(i));
        }
    }

    @Test
    public void testCountSalariesOver() {
        Salary salary = mock(Salary.class);
        List<Integer> mockSalaries = new ArrayList<>();
        mockSalaries.add(40000);
        mockSalaries.add(55000);
        mockSalaries.add(61000);
        when(salary.returnSalaries()).thenReturn(mockSalaries);

        Utility testUtility = new Utility();
        Integer integer = 0;
        assertEquals(integer, testUtility.countSalariesOver(salary, 50000));
    }

}
