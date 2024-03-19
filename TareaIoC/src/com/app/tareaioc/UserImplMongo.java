package com.app.tareaioc;

/**This class implements the interface Iusuario to implement the IoC*/
public class UserImplMongo implements IUser{

	@Override
	public void insertUser() {
		System.out.println("Insertando usuario en MongoDB.");
		
	}

	@Override
	public void deleteUser(int id) {
		System.out.println("Eliminando usuario " + id + " de MongoDB.");
		
	}

}
