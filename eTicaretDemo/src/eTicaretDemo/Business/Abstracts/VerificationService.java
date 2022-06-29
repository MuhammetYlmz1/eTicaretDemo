package eTicaretDemo.Business.Abstracts;

public interface VerificationService {
	
	void sendToVerifyMail(String email);
	void verifyMail(String email);
	boolean checkVerifyAccount(String email);
	
}
