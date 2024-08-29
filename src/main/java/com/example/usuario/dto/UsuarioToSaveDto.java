package com.example.usuario.dto;

public record UsuarioToSaveDto (
        Long id,
        String username,
        String password,
        String email
){
}
