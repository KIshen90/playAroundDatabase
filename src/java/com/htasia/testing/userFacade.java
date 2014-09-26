/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htasia.testing;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kishen
 */
@Stateless
public class userFacade implements userFacadeLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
    EntityManager em;

    public void addRecord(String username, String first_name, String last_name, int age, int password) {
        Userinfo ui = new Userinfo();
        ui.setUsername(username);
        ui.setFirstName(first_name);
        ui.setLastName(last_name);
        ui.setAge(age);
        ui.setPassword(password);

        em.persist(ui);
    }

    public Userinfo verify(String username, int password) {
        Userinfo ui = em.find(Userinfo.class, username);
        String tempUsername;
        int tempPassword;
        try {
            tempUsername = ui.getUsername();
            tempPassword = ui.getPassword();

            if (ui.getUsername().equals(username) && ui.getPassword() == password) {
                return ui;
            }
        } catch (NullPointerException e) {
            return null;
        }
        return null;
    }

}
