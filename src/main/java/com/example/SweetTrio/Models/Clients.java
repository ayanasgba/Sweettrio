package com.example.SweetTrio.Models;

import com.example.SweetTrio.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor // empty
@AllArgsConstructor // al non-optional const
@Entity(name = "clients")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nameOfClient", nullable = false,length = 120)
    private String nameOfClient;

    @Column(name = "lastNameOfClient", nullable = false,length = 120)
    private String lastNameOfClient;

    @Column(name = "addressOfClient", nullable = false,length = 200)
    private String addressOfClient;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}

