package io.github.lfteixeira.service;

import io.github.lfteixeira.model.Cliente;
import io.github.lfteixeira.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persist(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
