package com.springboot3.demo.core.controllers;

import com.springboot3.demo.core.models.Client;
import com.springboot3.demo.core.services.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Client> getAll(){

        try{
            log.info("EXECUTED clientService.getAll()");
            return clientService.getAll();
        }catch(Exception exception){
            log.info("ERROR at clientService.getAll()");
            return Collections.emptyList();
        }
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    Client detail(@PathVariable Long id){
        return clientService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Client create(@RequestBody Client incoming){
        return clientService.create(incoming);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    Client update(@RequestBody Client incoming, @PathVariable Long id){
        return clientService.update(incoming);
    }
}
