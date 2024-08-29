package com.example.usuario.dto;

import com.example.usuario.entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
    UsuarioDto usuarioToUsuarioDto (Usuario usuario);
    Usuario usuarioDtoToUsuario (UsuarioDto usuarioDto);
    @Mapping(target = "id", ignore = true)
    Usuario usuarioToSaveDto (UsuarioToSaveDto usuarioToSaveDto);
}
