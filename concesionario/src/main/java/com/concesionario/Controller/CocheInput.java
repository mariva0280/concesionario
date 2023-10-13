package com.concesionario.Controller;

import com.concesionario.Domain.Coche;
import com.concesionario.Domain.InvalidArgumentException;

public class CocheInput {
    private String matricula;
    private String marca;
    private String modelo;
    private int anyo;

    public CocheInput(String matricula, String marca, String modelo, int anyo) throws InvalidArgumentException {
        if (matricula == null) throw new InvalidArgumentException("matricula nno puede ser nula");
        if (matricula.trim().equalsIgnoreCase("")) throw new InvalidArgumentException("matricula nno puede ser nula");
        this.matricula = matricula;
        if (marca == null) throw new InvalidArgumentException("matricula nno puede ser nula");
        if (marca.trim().equalsIgnoreCase("")) throw new InvalidArgumentException("matricula nno puede ser nula");
        this.marca = marca;
        if (modelo == null) throw new InvalidArgumentException("matricula nno puede ser nula");
        if (modelo.trim().equalsIgnoreCase("")) throw new InvalidArgumentException("matricula nno puede ser nula");
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
