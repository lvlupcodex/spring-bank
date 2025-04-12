package com.lvlup.bank.repository;

import com.lvlup.bank.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
//ESTO ES COMO UNA FUNCION MYSQLI TIPO mysqli_query() DE AQUÍ SE HACEN LAS FUNCIONES findAll() findById() save() ETC
/*DESPEJAMOS:

CuentaRepository → tu interfaz personalizada

extends JpaRepository<Cuenta, Long> → le dice a Spring:

“Quiero heredar todos los métodos mágicos de Spring para trabajar con objetos Cuenta cuyo ID es tipo Long.”

¿QUÉ MÉTODOS MÁGICOS TE DA?
Método en Spring	Traducción mística
findAll()           -->   SELECT * FROM cuentas
findById(Long id)   -->	SELECT * FROM cuentas WHERE id = ?
save(Cuenta cuenta) -->	INSERT INTO cuentas (...) VALUES (...)
deleteById(Long id) -->	DELETE FROM cuentas WHERE id = ?

*/
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
