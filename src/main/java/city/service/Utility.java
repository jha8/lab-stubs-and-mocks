package city.service;

import salary.service.City;
import salary.service.Salary;

import java.util.ArrayList;
import java.util.List;

public class Utility {
    public List<Integer> getSalariesOver(Salary employeeSalary, Integer filter){
        List<Integer> salaries = employeeSalary.returnSalaries();
        List<Integer> filteredSalaries = new ArrayList<>();

        for (Integer salary : salaries){
            if (salary > filter){
                filteredSalaries.add(salary);
            }
        }
        return filteredSalaries;
    }

    public List<Address> getAddressesByCity(City city, String cityName){
        List<Address> addresses = city.listAddresses();
        List<Address> filteredAddresses = new ArrayList<>();
        for (Address address: addresses){
            if (address.city == cityName){
                filteredAddresses.add(address);
            }
        }
        return filteredAddresses;
    }

    public Integer countAddressesByCity(City city, String cityName) {
        //List<Address> filteredAddresses = new ArrayList<>();
        Integer count = 0;
        List<Address> allAddresses = new ArrayList<>();
        for (Address address : allAddresses) {
            if (address.city.equals(cityName)) {
                //filteredAddresses.add(address);
                count++;
            }
        }

        return count;
    }

    public Integer countSalariesOver(Salary salary, Integer fitler) {
        List<Integer> salaries = salary.returnSalaries();
        Integer count = 0;
        return count;
    }
}
