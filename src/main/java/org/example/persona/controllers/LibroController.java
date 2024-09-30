package org.example.persona.controllers;


import org.example.persona.entities.Libro;
import org.example.persona.entities.Persona;
import org.example.persona.services.LibroServiceImpl;
import org.example.persona.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{




}
