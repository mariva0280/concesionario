package com.concesionario.Service;

import com.concesionario.Controller.CocheMatriculaOutput;
import com.concesionario.Controller.CocheOutput;
import com.concesionario.Domain.Coche;
import com.concesionario.Domain.InvalidArgumentException;
import com.concesionario.Repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CocheService {
    @Autowired
    private CocheRepository cocheRepository;

    public List<CocheOutput> listCoches() throws InvalidArgumentException {
        List<Coche> coches = cocheRepository.findAll();
        List<CocheOutput> cochesOutput = new ArrayList<>();
        for(Coche item : coches) {
            cochesOutput.add(CocheOutput.getCoche(item));
        }
        return cochesOutput;

    }

    public CocheMatriculaOutput getCocheByMatricula(String matricula) throws NotFoundException, InvalidArgumentException {
        Coche coche = cocheRepository.findById(matricula).orElse(null);
        if (coche != null){
            return new  CocheMatriculaOutput(coche.getMatricula());
        }else {
            throw new NotFoundException("El coche con la matricula " + matricula + " no existe");
        }

    }
}
