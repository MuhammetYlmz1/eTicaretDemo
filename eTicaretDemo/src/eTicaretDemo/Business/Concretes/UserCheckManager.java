package eTicaretDemo.Business.Concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.Business.Abstracts.UserCheck;
import eTicaretDemo.Entities.Concretes.User;

public class UserCheckManager implements UserCheck{

	ArrayList<String> listOfMail=new ArrayList<>();
	
	
	@Override
	public boolean firstNameCheck(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("�sim bilgisi bo� ge�ilemez!!");
			return false;
		}
		else if(user.getFirstName().length()<3) {
			System.out.println("�sim bilgisi en az 2 karakterden olu�mal�d�r!!");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println("Soyisim bilgisi bo� ge�ilemez!!");
			return false;
		}
		else if(user.getLastName().length()<3) {
			System.out.println("Soyisim bilgisi en az 2 karakterden olu�mal�d�r!!");
			return false;
		}
		return true;
	}

	@Override
	public boolean emailCheck(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches()) {
			
			return true;
			
		}
		else 
		{
			System.out.println("Ge�ersiz Email Adresi");
			return false;
		}
			
	}

	@Override
	public boolean passwordCheck(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("�ifre bilgisi bo� ge�ilemez!!");
			return false;
		}
		else if(user.getPassword().length()<6) {
			System.out.println("�ifre bilgisi en az 6 karakterden olu�mal�d�r!!");
			return false;
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		if(listOfMail.contains(user.getEmail())) {
			System.out.println("B�yle bir Email zaten var");
			return false;
		}
		else {
			listOfMail.add(user.getEmail());
			return true;
		}
		
	}

	

	@Override
	public boolean isValid(User user) {
		if(firstNameCheck(user) && lastNameCheck(user) && emailCheck(user) && passwordCheck(user) && uniqueEmail(user)==true) {
			
			return true;
		}
		else
		{
			System.out.println("Bilgiler Ge�erli De�ildir.");
			return false;
		}
	}

}
