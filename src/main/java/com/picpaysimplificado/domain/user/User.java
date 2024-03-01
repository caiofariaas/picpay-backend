package com.picpaysimplificado.domain.user;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

// 'Entity' é utilizado para dar um nome a entidade
// 'Table' para o nome da tabela em nosso banco

// Utilizamos as anotações do 'lombok' para criar automaticamente os 'getters and setters'
// também usamos para criar um construtor com todos os argumentos e um sem nenhum argumento!

//Equals and HashCode

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    // aqui dizemos que este dado precisa ser único nesta coluna

    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;
}
