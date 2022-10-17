package com.example.cloudstorage.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Files> userFiles;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
