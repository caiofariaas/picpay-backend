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

    public void validateTransaction(User sender, BigDecimal amount){
        if (sender.getUserType() == UserType.MERCHANT){

        }
    }
}
