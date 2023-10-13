package com.concesionario.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Coche {
    @Id
    private String matricula;
    private String marca;
    private String modelo;
    private int anyo;

    public Coche() {
    }

    public Coche(String matricula) throws InvalidArgumentException {
        String errorMatricula = "Matricula es obligatoria";
        if (matricula == null) {
            throw new InvalidArgumentException(errorMatricula);
        }
        if (matricula.trim().length() == 0) throw new InvalidArgumentException(errorMatricula);
        this.matricula = matricula;
    }

    public Coche(String matricula, String marca, String modelo, int anyo) throws InvalidArgumentException {
        this(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnyo() {
        return anyo;
    }
}
