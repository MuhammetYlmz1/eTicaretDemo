package eTicaretDemo.Business.Concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.Business.Abstracts.VerificationService;

public class MailVerificationManager implements VerificationService {

	UserCheckManager userManager;
	
	List<String> verificatedEmails=new ArrayList<String>();
	
	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email+" kullanýcý doðrulama mail i gönderildi");
		
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email+" baþarýyla doðrulanmýþtýr");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email)) {
			return true;
		}
		return false;
		
		
	}
	
	
}
