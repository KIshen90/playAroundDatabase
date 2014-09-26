/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.htasia.testing;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kishen
 */
@Entity
@Table(name = "userinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userinfo.findAll", query = "SELECT u FROM Userinfo u"),
    @NamedQuery(name = "Userinfo.findByUsername", query = "SELECT u FROM Userinfo u WHERE u.username = :username"),
    @NamedQuery(name = "Userinfo.findByPassword", query = "SELECT u FROM Userinfo u WHERE u.password = :password"),
    @NamedQuery(name = "Userinfo.findByFirstName", query = "SELECT u FROM Userinfo u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Userinfo.findByLastName", query = "SELECT u FROM Userinfo u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Userinfo.findByAge", query = "SELECT u FROM Userinfo u WHERE u.age = :age")})
public class Userinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private Integer password;
    @Size(max = 30)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 30)
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private Integer age;

    public Userinfo() {
    }

    public Userinfo(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userinfo)) {
            return false;
        }
        Userinfo other = (Userinfo) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.htasia.testing.Userinfo[ username=" + username + " ]";
    }

    List listUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
