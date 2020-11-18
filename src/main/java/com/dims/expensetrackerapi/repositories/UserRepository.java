package com.dims.expensetrackerapi.repositories;

import com.dims.expensetrackerapi.domain.User;
import com.dims.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer createUser(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    User findById(Integer userId);

    Integer getCountByEmail(String email);
}
