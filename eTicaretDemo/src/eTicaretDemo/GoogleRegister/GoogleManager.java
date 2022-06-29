package eTicaretDemo.GoogleRegister;

import java.util.ArrayList;
import java.util.List;

public class GoogleManager {
	
	List<String> verificatedEmails=new ArrayList<String>();
	
	
	public void sendToVerifyMail(String email) {
		System.out.println(email+" kullan�c� do�rulama mail i g�nderildi");
		
	}

	
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email+" ba�ar�yla do�rulanm��t�r");
		
	}

	
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email)) {
			return true;
		}
		return false;
		
		
	}
	

}
