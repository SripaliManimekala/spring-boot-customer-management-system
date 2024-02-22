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
@Table(name="family_member")
public class FamilyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "primary_customer_id", nullable = false)
    private Customer primaryCustomer;

    @ManyToOne
    @JoinColumn(name = "family_member_id", nullable = false)
    private Customer familyMember;
}
