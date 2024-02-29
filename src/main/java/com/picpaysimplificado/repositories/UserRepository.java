package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// o repository do JPA recebe como parametro a classe que ele representará, e também o tipo do ID
public interface UserRepository extends JpaRepository<User, Long> {

    // Utilizamos o 'Optional' pois este método pode ou não, nos retornar um objeto do tipo 'User'
    //

    Optional<User> findUserByDocument(String document);
}
