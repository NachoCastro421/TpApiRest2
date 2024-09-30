package org.example.persona.controllers;


import org.example.persona.entities.Localidad;
import org.example.persona.entities.Persona;
import org.example.persona.services.LocalidadServiceImpl;
import org.example.persona.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad,LocalidadServiceImpl>{

}
