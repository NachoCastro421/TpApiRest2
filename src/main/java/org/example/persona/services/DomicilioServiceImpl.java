package org.example.persona.services;

import org.example.persona.entities.Domicilio;
import org.example.persona.repositories.BaseRepository;
import org.example.persona.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServicesImpl <Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio,Long> baseRepository) {
        super(baseRepository);
    }



}