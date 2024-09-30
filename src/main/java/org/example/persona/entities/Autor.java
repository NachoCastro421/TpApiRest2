package org.example.persona.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
@Entity
@Table(name = "autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Autor extends Base {


    @Column(name = "nombreAutor")
    private String nombre;
    @Column(name = "apellidoAutor")
    private String apellido;
    @Column(name = "biografiaAutor", length = 1500)
    private String biografia;

}
