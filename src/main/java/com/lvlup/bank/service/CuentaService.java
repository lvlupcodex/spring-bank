package com.lvlup.bank.service; 
import com.lvlup.bank.model.Cuenta;
import com.lvlup.bank.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional;

@Service 
public class CuentaService{
    //Private final lo que es (clase) y el objeto
    private final CuentaRepository cuentaRepository; 

    public CuentaService(CuentaRepository cuentaRepository){
        this.cuentaRepository = cuentaRepository;
    }

    //Me devuelve un ARRAY de Cuentas
    
    public List<Cuenta> obtenerTodas(){
        return cuentaRepository.findAll();
    }

    public Optional<Cuenta> obtenerPorId(Long id){
        return cuentaRepository.findById(id);
    }
    //EL ORDEN: Tipo de objeto y objeto
    //NECESITO DE TIPO Cuenta un objeto cuenta
    //momento mayus
    public Cuenta crear(Cuenta cuenta){
        return cuentaRepository.save(cuenta);
    }
    public void eliminar(Long id){
        cuentaRepository.deleteById(id);
    }
}