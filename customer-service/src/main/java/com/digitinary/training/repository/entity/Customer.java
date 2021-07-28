package com.digitinary.training.repository.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The customer entity.
 *
 * @author Salah Abu Msameh
 */
@Entity
@Table(name = "CUSTOMERS")
public class Customer implements Serializable {

    private Long customerId;
    private String name;
    private String mobileNo;
    private String email;
    private String addressLine1;
    private String addressLine2;
    private LocalDate createdDate;

    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(generator = "customerIdGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "customerIdGen", sequenceName = "CUSTOMER_ID_SEQ", allocationSize = 1)
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    @NotNull(message = "customer name is mandatory")
    @Size(min = 3, max = 50)
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @NotNull(message = "customer mobile number is mandatory")
    @Column(name = "MOBILE_NO")
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(final String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @NotNull(message = "customer email is mandatory")
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @NotNull(message = "customer address line one is mandatory")
    @Column(name = "ADDRESS_LINE_1")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(final String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Column(name = "ADDRESS_LINE_2")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(final String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Column(name = "CREATED_DATE")
    public LocalDate getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(final LocalDate createdDate) {
        this.createdDate = createdDate;
    }
    
    @Override
    public int hashCode() {
        return this.customerId.hashCode();
    }
    
    @Override
    public boolean equals(final Object obj) {
        
        if(this.customerId == null || !(obj instanceof Customer)) {
           return false;
        }
        
        Customer otherCustomer = (Customer) obj;
        
        if(this.customerId.equals(otherCustomer.getCustomerId())) {
            return true;
        }
        
        return false;
    }
}
