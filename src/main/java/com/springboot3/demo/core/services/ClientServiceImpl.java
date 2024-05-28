package com.springboot3.demo.core.services;

import com.springboot3.demo.core.models.Client;
import com.springboot3.demo.core.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client getById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client create(Client incoming) {
        return clientRepository.save(incoming);
    }

    @Override
    public Client update(Client incoming) {
        return clientRepository.save(incoming);
    }

    @Override
    public void delete(Long id) {
        Client vanish = this.getById(id);
        clientRepository.delete(vanish);
    }
}
