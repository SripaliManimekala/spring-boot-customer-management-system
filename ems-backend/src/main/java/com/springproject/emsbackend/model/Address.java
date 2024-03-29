package com.springproject.emsbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;

    @Column(name="address_line1")
    private String addressLine1;
    @Column(name="address_line2")
    private String addressLine2;

    @ManyToOne
    @JoinColumn(name="city_id", nullable = false)
    private City city;
    @ManyToOne
    @JoinColumn(name="country_id", nullable = false)
    private Country country;

    // Constructor without city and country parameters
    public Address(Long id, Customer customer, String addressLine1, String addressLine2) {
        this.id = id;
        this.customer = customer;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

}
