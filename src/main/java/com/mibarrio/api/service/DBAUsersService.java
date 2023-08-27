package com.mibarrio.api.service;


import com.mibarrio.api.entity.DBAUsers;

import java.util.List;

public interface DBAUsersService extends CRUD<DBAUsers, Integer> {

    List<DBAUsers> getUserByLogin(String user, String pass);
}

