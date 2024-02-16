package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UsuarioServicioTest {

	@DisplayName("Crear un usuario")
    @Test
    public void crearUsuario() {
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Nombre");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre);
        Assertions.assertEquals(esperado, resultado);
    }
    
    @Test
    public void test2() {
        UsuarioDto esperado = new UsuarioDto(1L, "Nombre");
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        final UsuarioDto resultado = usuarioServicio.crearUsuario(1L, "Prueba");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre);
        Assertions.assertNotEquals(esperado, resultado);
    }
}
