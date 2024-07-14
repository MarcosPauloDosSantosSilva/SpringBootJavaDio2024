package br.com.mpss.SpringBootJava.repository;

import br.com.mpss.SpringBootJava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
