package com.smsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smsApi.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
