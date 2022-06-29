package eTicaretDemo.Business.Abstracts;

import eTicaretDemo.Entities.Concretes.User;

public interface UserCheck {
	boolean firstNameCheck(User user);
	boolean lastNameCheck(User user);
	boolean emailCheck(User user);
	boolean passwordCheck(User user);
	boolean uniqueEmail(User user);
	boolean isValid(User user);



}
