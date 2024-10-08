package org.example.persona.services;

import org.example.persona.entities.Libro;
import org.example.persona.repositories.BaseRepository;
import org.example.persona.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServicesImpl <Libro, Long> implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro,Long> baseRepository) {
        super(baseRepository);
    }



}