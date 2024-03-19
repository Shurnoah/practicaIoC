package com.app.tareaioc;

/** Class main*/
public class App {
	
	public static void main(String[] args) {
		
	// call to UsuarioImplOracle
	UserFactory objOracle = new UserFactory(new UserImplOracle());
	
	objOracle.getInsertrUser();
	objOracle.getDeleteUser(0);
	
	// call to UsuarioImplMongo
	UserFactory objMongo = new UserFactory(new UserImplMongo());
	
	objMongo.getInsertrUser();
	objMongo.getDeleteUser(1);
	
	}
	
}
