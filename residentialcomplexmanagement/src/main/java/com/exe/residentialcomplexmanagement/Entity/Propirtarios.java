package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "propirtarios")
public class Propirtarios {
    private long idPropietario;
    private String nombre;
    private String telefono;
    private String email;
}
