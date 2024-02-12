package com.smsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smsApi.entity.Clients;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Long>{

}
