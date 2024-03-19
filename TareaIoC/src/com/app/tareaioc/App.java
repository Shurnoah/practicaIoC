package com.app.tareaioc;

public class App {
	
	public static void main(String[] args) {
		
	UsuarioFactory objOracle = new UsuarioFactory(new UsuarioImplOracle());
	
	objOracle.getInsertarUsuario();
	objOracle.getEliminarUsuario(0);
	
	UsuarioFactory objMongo = new UsuarioFactory(new UsuarioImplMongo());
	
	objMongo.getInsertarUsuario();
	objMongo.getEliminarUsuario(1);
	
	}
	
}
