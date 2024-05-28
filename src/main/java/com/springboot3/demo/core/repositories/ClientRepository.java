package com.springboot3.demo.core.repositories;

import com.springboot3.demo.core.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
