package eTicaretDemo.Core;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.Business.Abstracts.VerificationService;
import eTicaretDemo.GoogleRegister.GoogleManager;

public class GoogleManagerAdapter implements VerificationService{

	List<String> verificatedEmails=new ArrayList<String>();
	GoogleManager googleManager=new GoogleManager();
	
	//D��ar�dan projemize haz�r ald���m�z paketleri eklmek i�in Adapter y�ntemini kullan�yoruz
	
	@Override
	public void sendToVerifyMail(String email) {
		googleManager.sendToVerifyMail(email);
		
	}

	@Override
	public void verifyMail(String email) {
		googleManager.verifyMail(email);
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		
		if(googleManager.checkVerifyAccount(email));
		{
			return true;
		}
	}

	
}
