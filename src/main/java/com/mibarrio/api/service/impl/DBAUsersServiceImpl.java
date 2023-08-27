package com.mibarrio.api.service.impl;

import com.mibarrio.api.entity.DBAUsers;
import com.mibarrio.api.repository.DBAUsersRepository;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.service.DBAUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBAUsersServiceImpl extends CRUDImpl<DBAUsers, Integer> implements DBAUsersService {

    @Autowired
    private DBAUsersRepository repository;


    @Override
    protected GenericRepository<DBAUsers, Integer> getRepository() {
        return repository;
    }


    @Override
    public List<DBAUsers> getUserByLogin(String user, String pass) {
        return repository.findUserByLogin(user,pass);
    }
}

