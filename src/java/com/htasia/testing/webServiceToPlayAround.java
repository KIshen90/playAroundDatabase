/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.htasia.testing;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kishen
 */
@WebService(serviceName = "webServiceToPlayAround")
@Stateless()
public class webServiceToPlayAround {
    @EJB
    private userFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addRecord")
    @Oneway
    public void addRecord(@WebParam(name = "username") String username, @WebParam(name = "first_name") String first_name, @WebParam(name = "last_name") String last_name, @WebParam(name = "age") int age, @WebParam(name = "password") int password) {
        ejbRef.addRecord(username, first_name, last_name, age, password);
    }

    @WebMethod(operationName = "verify")
    public Userinfo verify(@WebParam(name = "username") String username, @WebParam(name = "password") int password) {
        return ejbRef.verify(username, password);
    }
}
