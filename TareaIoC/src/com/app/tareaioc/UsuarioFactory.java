package com.app.tareaioc;

public class UsuarioFactory {
	
	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr=usr;
	}
	
	public void getInsertarUsuario() {
		usr.insertarUsuario();
	}
	
	public void getEliminarUsuario(int id) {
		usr.eliminarUsuario(id);
	}
	
}
