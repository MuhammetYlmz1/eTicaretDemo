package eTicaretDemo.GoogleRegister;

import java.util.ArrayList;
import java.util.List;

public class GoogleManager {
	
	List<String> verificatedEmails=new ArrayList<String>();
	
	
	public void sendToVerifyMail(String email) {
		System.out.println(email+" kullanıcı doğrulama mail i gönderildi");
		
	}

	
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email+" başarıyla doğrulanmıştır");
		
	}

	
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email)) {
			return true;
		}
		return false;
		
		
	}
	

}
