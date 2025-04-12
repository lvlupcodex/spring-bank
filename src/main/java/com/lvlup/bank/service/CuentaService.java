package com.lvlup.bank.service; 
import com.lvlup.bank.model.Cuenta;
import com.lvlup.bank.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional;

@Service 
public class CuentaService{
    //Private (no sale de esta clase) final (no se puede reasignar una vez init) lo que es (clase) y el nombre de la variable que es un objeto de la instancia cuentaRepository
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
    public Cuenta crear(Cuenta cuenta) {
        System.out.println("GUARDANDO CUENTA: " + cuenta.getNombreTitular());
        return cuentaRepository.save(cuenta);
    }
    
    /* TENEMOS PUT, vamos a probarlo CON POSTMAN :D

            PUT /cuentas/1
            {
            "nombreTitular": "Laura Burns",
            "saldo": 9999.99
            }
            Y se actualiza en la BBDD si existe una cuenta con ID 1. 
            RECUERDA SIEMPRE EN DEPENDENCIES (pom.xml) PONER SWAGGER UI*/
    public void eliminar(Long id){
        cuentaRepository.deleteById(id);
    }
}