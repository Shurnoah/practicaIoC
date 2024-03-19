package com.app.tareaioc;

public class UsuarioImplOracle implements IUsuario{

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando usuario en Oracle.");
		
	}

	@Override
	public void eliminarUsuario(int id) {
		System.out.println("Eliminando usuario " + id + " de Oracle.");
		
	}

}
