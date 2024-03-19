package com.app.tareaioc;

/** This class is not afected by any changes thanks to the IoC*/
public class UserFactory {
	
	IUser usr;
	
	public UserFactory(IUser usr) {
		this.usr=usr;
	}
	
	public void getInsertrUser() {
		usr.insertUser();
	}
	
	public void getDeleteUser(int id) {
		usr.deleteUser(id);
	}
	
}
