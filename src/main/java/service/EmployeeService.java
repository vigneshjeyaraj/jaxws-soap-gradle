package service;

import domain.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EmployeeService {

     @WebMethod Employee getEmpId(int id);
}
