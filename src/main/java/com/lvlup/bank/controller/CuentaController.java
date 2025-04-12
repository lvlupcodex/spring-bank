package com.lvlup.bank.controller; 

import com.lvlup.bank.model.Cuenta;
import com.lvlup.bank.service.CuentaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cuentas")
public class CuentaController{
    private final CuentaService cuentaService; 
    public CuentaController(CuentaService cuentaService){
        this.cuentaService=cuentaService;   
    }
    //Quiero una lista de cuentas POR FUNCION getAll() que es el SQLn't
    @GetMapping
    public List<Cuenta> getAll(){
        return cuentaService.obtenerTodas();
    }
    //QUIERO CUENTAS POR EL ID COMO EL PHP cuentas?id=$id
    @GetMapping("/{id}")
    public Optional<Cuenta> getById(@PathVariable Long id){
        return cuentaService.obtenerPorId(id);
    }
    //POST MANDAR CREAR CUENTA
    @PostMapping
    public Cuenta crear(@RequestBody Cuenta cuenta){
        return cuentaService.crear(cuenta);
    }
    //Borrar CUENTA POR ID.
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        cuentaService.eliminar(id);
    }
}