package pl.touk.cxf.ws.service;

import pl.touk.cxf.ws.model.Employee;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: mcl
 * Date: 27/12/11
 * Time: 11:10
 */
@WebService
public interface AuthService {
    Employee getEmployee(@WebParam(name="gid") String gid);
}