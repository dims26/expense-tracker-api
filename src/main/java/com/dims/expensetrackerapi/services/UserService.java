package com.dims.expensetrackerapi.services;

import com.dims.expensetrackerapi.domain.User;
import com.dims.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
