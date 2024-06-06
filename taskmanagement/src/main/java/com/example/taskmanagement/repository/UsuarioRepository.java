package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
