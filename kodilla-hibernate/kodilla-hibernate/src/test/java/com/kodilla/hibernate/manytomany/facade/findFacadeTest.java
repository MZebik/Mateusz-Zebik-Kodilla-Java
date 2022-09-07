package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class findFacadeTest {
    @Autowired
    private FindFacade findFacade;

    @Test
    void findFacadeTest() {
        // Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        findFacade.getCompanyDao().save(softwareMachine);
        findFacade.getCompanyDao().save(dataMaesters);
        findFacade.getCompanyDao().save(greyMatter);

        findFacade.getEmployeeDao().save(johnSmith);
        findFacade.getEmployeeDao().save(stephanieClarckson);
        findFacade.getEmployeeDao().save(lindaKovalsky);

        // When
        List<Company> companies = findFacade.findCompanyByShortcutName("Sof");
        List<Employee> employees = findFacade.findEmployeeByShortcutOfLastname("Smi");

        // Then

        assertEquals("Software Machine", companies.get(0).getName());
        assertEquals("Smith", employees.get(0).getLastname());

        //CleanUp
        findFacade.getCompanyDao().deleteAll();
        findFacade.getEmployeeDao().deleteAll();
    }
}