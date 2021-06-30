package com.varnaa.sellyo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

/**
 * @author swethavarnaa
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
    @NotBlank(message = "First Name can not be blank")
    @Size(min = 4)
    private String firstName;

    @NotNull
    @NotBlank(message = "Last Name can not be blank")
    @Size(min = 4)
    private String lastName;

    @NotNull
    @NotBlank(message = "Batch can not be blank")
    @Positive
    @Size(min = 4, max = 4)
    private String batch;

    @NotNull
    @NotBlank(message = "Department can not be blank")
    private String department;

    @NotNull
    @OneToOne
    private Contact contact;

    public User() {}

    public User(String id, String firstName, String lastName, String batch, String department, Contact contact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.batch = batch;
        this.department = department;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
