package com.lvlup.bank.model; 


import java.lang.annotation.Inherited;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//ESTO ES COMO UNA TABLA CUENTAS DE MYSQLS
@Entity
public class Cuenta {

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 

    //Getters y setters
    public Long getId(){
        return id;
    }
    //set Id no tiene sentido lol
    //Get en String pq devuelve string
    public String getNombreTitular(){
        this.getNombreTitular = getNombreTitular;
    }
    //Set en Void porque setea y cambia del parametro de entrada al de la clase
    public void setNombreTitular(String nombreTitular){
        this.nombreTitular=nombreTitular;
    }
    public Double getSaldo(){
        return saldo;
    }
    //DE nuevo como es SET me cambia lo del param de entrada por el valor de la clase.
    public void setSaldo(Double saldo){
        this.saldo=saldo;
    }
}