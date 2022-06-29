package eTicaretDemo.Business.Abstracts;

import eTicaretDemo.Entities.Concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);


}
