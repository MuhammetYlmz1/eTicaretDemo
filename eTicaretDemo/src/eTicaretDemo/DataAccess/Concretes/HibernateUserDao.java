package eTicaretDemo.DataAccess.Concretes;

import eTicaretDemo.DataAccess.Abstracts.UserDao;
import eTicaretDemo.Entities.Concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void userAdd(User user) {
		System.out.println("Kullan�c� ba�ar�yla eklendi "+user.getFirstName());
		
	}

	@Override
	public void userDelete(User user) {
		System.out.println("Kullan�c� ba�ar�yla silindi "+user.getFirstName());
		
	}

	@Override
	public void userUpdate(User user) {
		System.out.println("Kullan�c� ba�ar�yla g�ncellendi "+user.getFirstName());
		
	}

}
