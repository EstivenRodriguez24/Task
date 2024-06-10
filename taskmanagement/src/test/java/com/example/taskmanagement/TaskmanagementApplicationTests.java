package com.example.taskmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TaskmanagementApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        // Verifica que el contexto de la aplicación se cargó correctamente
        assertThat(applicationContext).isNotNull();
        
        // Verifica que el bean de TaskmanagementApplication está presente en el contexto
        assertThat(applicationContext.containsBean("taskmanagementApplication")).isTrue();
        
        // Puedes agregar más afirmaciones aquí para verificar otros beans o servicios esenciales
    }
}
