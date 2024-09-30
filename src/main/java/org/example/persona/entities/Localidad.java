package org.example.persona.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Localidad extends Base  {

    @Column(name = "denominacion")
    private String denominacion;
}
