package com.picpaysimplificado.services;
import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.domain.user.UserType;
import com.picpaysimplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

// Esta anotação indica para o Spring que esta classe é uma classe de Serviços e assim ele consegue injetar as dependencias da maneira correta

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT){
            throw new Exception ("Usuários do tipo 'lojista' não podem fazer transações");
        }
        if (sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Saldo insuficiente!");
        }
    }

    public User findUserById(Long id) throws Exception {

        // aqui nós estamos buscando um usuário pelo ID e caso ele não exista, nós lançamos uma exceção

        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuario não encontrado!"));
    }

    public void saveUser(User user){
        this.repository.save(user);
    }
}
