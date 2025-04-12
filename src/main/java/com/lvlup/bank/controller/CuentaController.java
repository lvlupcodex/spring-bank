package com.lvlup.bank.controller; 

import com.lvlup.bank.model.Cuenta;
import com.lvlup.bank.service.CuentaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


//private -> solo accesible dentro de esta clase //final -> no se puede reasignar una vez inicializado
@RestController
@RequestMapping("/cuentas")
public class CuentaController{
    private final CuentaService cuentaService; 
    public CuentaController(CuentaService cuentaService){
        this.cuentaService=cuentaService;   
    }

    /* @RequestMapping("/cuentas")
“Esto significa que solo dejo que actúen en /cuentas y luego cosas tipo /cuentas/id”
SÍÍÍÍ.
Es como decir:

"Todos los endpoints dentro de esta clase van a comenzar con /cuentas."

Entonces:

@GetMapping dentro de esto = GET /cuentas

@GetMapping("/{id}") = GET /cuentas/1 */
    //
    

    @GetMapping
    public List<Cuenta> getAll(){
        return cuentaService.obtenerTodas();
    }
    //QUIERO CUENTAS POR EL ID COMO EL PHP cuentas?id=$id
    @GetMapping("/{id}")
    public Optional<Cuenta> getById(@PathVariable Long id){
        return cuentaService.obtenerPorId(id);
    }
    @PostMapping
    public Cuenta crear(@RequestBody Cuenta cuenta) {
    return cuentaService.crear(cuenta);
    }


    /* 
    //POST MANDAR CREAR CUENTA Y CURL SE QUEDA CALLADO POR NO RETURN
    @PostMapping
    public Cuenta crear(@RequestBody Cuenta cuenta){
        return cuentaService.crear(cuenta);
    }*/

    //Borrar CUENTA POR ID.
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        cuentaService.eliminar(id);
    }
    //PutMapping a través de ID que Don Java pilla y haremos update o insert!
    @PutMapping("/{id}")
    // para actualizar necesito la URL Y LO QUE VARIA ES EL ID que es un Long id
    // El otro param es que lo que me llega es un JSON que se convierte en una cuenta de tipo Cuenta
    public Cuenta actualizar(@PathVariable Long id , @RequestBody Cuenta cuenta){
        cuenta.setId(id); //Me aseguro que se use el ID QUE ME LELGA DEL MAPPING ACTUAL
        //IMP USAMOS crear(cuenta) PQ .save() HACE UPDATE SI YA EXISTE EL ID
        return cuentaService.crear(cuenta);
    }

}