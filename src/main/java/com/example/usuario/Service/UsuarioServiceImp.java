package com.example.usuario.Service;

import com.example.usuario.dto.UsuarioMapper;
import com.example.usuario.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService{
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
}
