/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.htasia.testing;

import javax.ejb.Local;

/**
 *
 * @author Kishen
 */
@Local
public interface userFacadeLocal {
    public void addRecord(String username, String first_name, String last_name, int age,int password);
    public Userinfo verify(String username,int password);
}
