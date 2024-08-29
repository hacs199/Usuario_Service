package com.example.usuario.Service;

import com.example.usuario.dto.UsuarioDto;
import com.example.usuario.dto.UsuarioToSaveDto;

public interface UsuarioService {
    UsuarioDto guardarUsuario (UsuarioToSaveDto usuarioToSaveDto);
    UsuarioDto getUsuarioId (Long id);

}
