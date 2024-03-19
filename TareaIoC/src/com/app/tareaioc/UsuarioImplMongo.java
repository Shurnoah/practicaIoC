package com.app.tareaioc;

public class UsuarioImplMongo implements IUsuario{

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando usuario en MongoDB.");
		
	}

	@Override
	public void eliminarUsuario(int id) {
		System.out.println("Eliminando usuario " + id + " de MongoDB.");
		
	}

}
