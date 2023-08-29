package com.mibarrio.api.service.impl;

import com.mibarrio.api.DTO.DBAUsersDTO;
import com.mibarrio.api.entity.DBAUsers;
import com.mibarrio.api.mapper.DBAUsersMapper;
import com.mibarrio.api.repository.DBAUsersRepository;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.service.DBAUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DBAUsersServiceImpl  implements DBAUsersService {

    @Autowired
    private DBAUsersMapper mapper;
    @Autowired
    private DBAUsersRepository repository;


    protected GenericRepository<DBAUsers, Integer> getRepository() {
        return repository;
    }

    @Override
    public List<DBAUsers> findByUserAndPass(String user, String pass) {
        return (List<DBAUsers>) repository.findUserAndPass(user, pass);
    }


    public List<DBAUsersDTO> findByUserAndPassDTO(String user, String pass) {
        return mapper.toDtos(repository.findUserAndPass(user, pass));
    }

    @Override
    public DBAUsers findUser(String user) {
        return (DBAUsers) repository.findUser(user);
    }

    @Override
    public List<DBAUsers> findByPersona(String persona) {
        return (List<DBAUsers>) repository.findByPersona(persona);
    }


    @Override
    public DBAUsersDTO registerDto(DBAUsersDTO dto) {
        DBAUsers userExist = (DBAUsers) repository.findUser(dto.getUsuario());
        List<DBAUsers> personaExist = (List<DBAUsers>) repository.findByPersona(dto.getIdPer());
        if (userExist != null || personaExist != null)   {
            return new DBAUsersDTO();
        } else {
            return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
        }
    }

    @Override
    public DBAUsers register(DBAUsers dbaUsers) {
        return getRepository().save(dbaUsers);
    }

    @Override
    public List<DBAUsers> getAll() {
        return getRepository().findAll();
    }

    @Override
    public DBAUsers update(DBAUsers dbaUsers) {
        return getRepository().save(dbaUsers);
    }

    @Override
    public DBAUsers getById(Integer integer) {
        return getRepository().findById(integer)
                .orElseThrow(() -> new RuntimeException("ID NO ENCONTRADO " + integer));
    }

    @Override
    public void delete(Integer integer) {
        getById(integer);
        getRepository().deleteById(integer);
    }
}

