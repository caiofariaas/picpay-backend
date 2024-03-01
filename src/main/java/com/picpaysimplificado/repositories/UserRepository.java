package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


// o repository do JPA recebe como parametro a classe que ele representará, e também o tipo do ID
public interface UserRepository extends JpaRepository<User, Long> {

    // Utilizamos o 'Optional' pois este método pode ou não, nos retornar um objeto do tipo 'User'
    // Não precisamos necessáriamente fazer a declaração deste método, pois,
    // o JPA consegue entender um certo padrão de sintaxe e ele ja consegue montar essa query em nosso banco de dados

    // quando declaramos como 'findUserByDocument' o JPA ja entende oque queremos fazer e cria esse método em 'runtime'

    Optional<User> findUserByDocument(String document);
    Optional<User> findUserByID(Long id);
}
