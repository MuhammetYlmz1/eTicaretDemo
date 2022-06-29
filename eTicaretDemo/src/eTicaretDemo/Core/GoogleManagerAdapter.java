package eTicaretDemo.Core;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.Business.Abstracts.VerificationService;
import eTicaretDemo.GoogleRegister.GoogleManager;

public class GoogleManagerAdapter implements VerificationService{

	List<String> verificatedEmails=new ArrayList<String>();
	GoogleManager googleManager=new GoogleManager();
	
	//Dýþarýdan projemize hazýr aldýðýmýz paketleri eklmek için Adapter yöntemini kullanýyoruz
	
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
