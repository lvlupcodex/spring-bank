package com.lvlup.bank.repository; 
import com.lvlup.bank.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository; 
//ESTE ARCHIVO ES COMO UN mysqli_query(blablabla)
//DESDE AQUÍ SE PUEDE USAR findAll() , findById() , save() , etccc
public interface CuentaRepository extends JpaRepository<Cuenta, Long>{
    
}