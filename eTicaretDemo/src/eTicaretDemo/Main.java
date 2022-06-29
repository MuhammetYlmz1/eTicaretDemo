package eTicaretDemo;

import eTicaretDemo.Business.Concretes.MailVerificationManager;
import eTicaretDemo.Business.Concretes.UserCheckManager;
import eTicaretDemo.Business.Concretes.UserManager;
import eTicaretDemo.DataAccess.Concretes.HibernateUserDao;
import eTicaretDemo.Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		
		user1.setFirstName("Muhammet");
		user1.setLastName("Yýlmaz");
		user1.setEmail("asd@gmail.com");
		user1.setPassword("1234568");
		
		User user2=new User();
		
		user2.setFirstName("qwerww");
		user2.setLastName("wetewrwe");
		user2.setEmail("asdw@gmail.com");
		user2.setPassword("1234568");
		
		
		UserManager manager=new UserManager(new HibernateUserDao(), new UserCheckManager(),new MailVerificationManager());
		
		manager.signUp(user1);
		manager.signUp(user2);
		manager.signIn(user1);
		/*UserCheckManager manager1=new UserCheckManager();
		manager1.emailCheck(user1);*/
		//manager1.uniqueEmail(user2);
		
		

	}

}
