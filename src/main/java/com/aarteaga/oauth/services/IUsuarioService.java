package com.aarteaga.oauth.services;

import com.aarteaga.commons.usuarios.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario update(Usuario usuario, Long id);
}
