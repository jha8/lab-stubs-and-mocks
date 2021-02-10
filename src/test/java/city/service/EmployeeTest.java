package city.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

//Because this is the employee test class, you should not mock Employee.
//You could, but there we are not.
public class EmployeeTest {
    Address stubAddress() {
        return new Address("12345 67ST", "Edmonton");
    }
    @Test
    public void testCapitalize() {
        Employee testEmployee = new Employee("bob", 1, 20000, stubAddress());
        assertEquals("Bob", testEmployee.getCapitalizedName());
    }
}
