package org.example.persona.controllers;


import org.example.persona.entities.Domicilio;
import org.example.persona.entities.Persona;
import org.example.persona.services.DomicilioService;
import org.example.persona.services.DomicilioServiceImpl;
import org.example.persona.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{

}
