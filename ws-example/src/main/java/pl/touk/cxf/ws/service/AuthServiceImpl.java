package pl.touk.cxf.ws.service;

import pl.touk.cxf.ws.model.Employee;

import javax.jws.WebService;

@WebService(endpointInterface = "pl.touk.cxf.ws.service.AuthService", serviceName = "AuthService")
public class AuthServiceImpl implements AuthService {

    public Employee getEmployee(String gid) {
        Employee emp = new Employee();
        emp.setFirstName("Jan");
        emp.setLastName("Kowalski");
        emp.setGid("123124");
        return emp;
    }

}