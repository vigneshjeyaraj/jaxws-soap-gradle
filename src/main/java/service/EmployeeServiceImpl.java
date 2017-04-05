package service;

import domain.Employee;

import javax.jws.WebService;

@WebService
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmpId(int id) {
        return new Employee("Vignesh Jeyaraj", 1);
    }
}
