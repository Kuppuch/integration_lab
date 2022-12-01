package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "author")
public class Author {
    String name;
    String lastname;
    String middlename;
    String email;
    boolean admin;

    public Author() {}

    public Author(String name, String lastname, String middlename, String email, boolean admin) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.email = email;
        this.admin = admin;
    };

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    @XmlElement
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    @XmlElement
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    @XmlElement
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String toString() {
        return lastname + " " + name + " " + middlename;
    }
}