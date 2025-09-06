package com.exe.residentialcomplexmanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "apartamento")
public class Apartamento {
    private long idApartamento;
    private String numeroApartamento;
    private String torre;
}
