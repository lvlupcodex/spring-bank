package com.lvlup.bank.repository;

import com.lvlup.bank.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
//ESTO ES COMO UNA FUNCION MYSQLI TIPO mysqli_query() DE AQUÍ SE HACEN LAS FUNCIONES findAll() findById() save() ETC
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
