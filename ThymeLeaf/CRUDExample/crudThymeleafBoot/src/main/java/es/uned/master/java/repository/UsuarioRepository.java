package es.uned.master.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.uned.master.java.beans.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
