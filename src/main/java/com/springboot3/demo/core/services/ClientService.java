package com.springboot3.demo.core.services;

import com.springboot3.demo.core.models.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAll();

    Client getById(Long id);

    Client create(Client incoming);

    Client update(Client incoming);

    void delete(Long id);
}
