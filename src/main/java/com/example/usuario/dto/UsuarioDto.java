package com.example.usuario.dto;

public record UsuarioDto (
        Long id,
        String username,
        String password,
        String email
){
}
