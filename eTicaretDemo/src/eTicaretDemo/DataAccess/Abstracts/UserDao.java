package eTicaretDemo.DataAccess.Abstracts;

import eTicaretDemo.Entities.Concretes.User;

public interface UserDao {
	void userAdd(User user);
	void userDelete(User user);
	void userUpdate(User user);
	
}
