package com.api.bechallenge.repositories;

import com.api.bechallenge.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {

    public UserModel findByEmail(String email);

}
