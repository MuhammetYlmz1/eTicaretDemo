package eTicaretDemo.DataAccess.Concretes;

import eTicaretDemo.DataAccess.Abstracts.UserDao;
import eTicaretDemo.Entities.Concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void userAdd(User user) {
		System.out.println("Kullanýcý baþarýyla eklendi "+user.getFirstName());
		
	}

	@Override
	public void userDelete(User user) {
		System.out.println("Kullanýcý baþarýyla silindi "+user.getFirstName());
		
	}

	@Override
	public void userUpdate(User user) {
		System.out.println("Kullanýcý baþarýyla güncellendi "+user.getFirstName());
		
	}

}
