package eTicaretDemo.Business.Concretes;

import eTicaretDemo.Business.Abstracts.UserCheck;
import eTicaretDemo.Business.Abstracts.UserService;
import eTicaretDemo.Business.Abstracts.VerificationService;
import eTicaretDemo.DataAccess.Abstracts.UserDao;
import eTicaretDemo.Entities.Concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserCheck checkUser;
	private VerificationService mailVerificationService;
	
	
	public UserManager(UserDao userDao,UserCheck checkUser,VerificationService mailVerificationService) {
		this.userDao=userDao;
		this.checkUser=checkUser;
		this.mailVerificationService=mailVerificationService;
	}
	
	
	@Override
	public void signUp(User user) {
		if(checkUser.isValid(user)) {
			System.out.println(user.getFirstName()+" Kullanýcýsý baþarýyla eklenmiþtir.");
			mailVerificationService.checkVerifyAccount(user.getEmail());
			userDao.userAdd(user);
		}
		
	}
	
	
	
	@Override
	public void signIn(User user) {
		mailVerificationService.verifyMail(user.getEmail());
		
		
		
		

		
	}

}
