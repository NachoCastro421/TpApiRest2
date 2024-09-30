package org.example.persona.controllers;


import org.example.persona.entities.Autor;
import org.example.persona.entities.Persona;
import org.example.persona.services.AutorServiceImpl;
import org.example.persona.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
