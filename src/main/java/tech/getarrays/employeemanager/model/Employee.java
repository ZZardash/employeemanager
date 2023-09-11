package tech.getarrays.employeemanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity //Entity allows us to do OOP on DB tables and mapping it to the DB.
@Getter
@Setter
@Table(name = "EMPLOYEES")
public class Employee implements Serializable {
    //Serializable allows us to cast our class to different streams.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;

    private String email;

    private String jobTitle;

    private String phone;

    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;
}
