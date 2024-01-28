package PROLAB2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.naming.ldap.ExtendedRequest;

abstract class User implements ILoginable// ortak olan giriş yapmak
{

}

abstract class Admin extends User // admin ekranına giriş,olan firmaları görüntüle, firma kaydı yap,firma
									// sil,hizmet bedeli belirleme
{

}

abstract class Company// girma paneli ile giriş,araç ekleme çıkarma,sefer ekleme çıkarma,günlük kar //
						// hesabı
{

	String kullaniciAdi;
	String sifre;
	ArrayList<Train> train = new ArrayList<>();
	ArrayList<Bus> bus = new ArrayList<>();
	ArrayList<Airplane> airplane = new ArrayList<>();
	ArrayList<Yakit> yakits=new ArrayList<>();
	
}

class adminErisim
{
	String kullaniciAdiR = "admin";
	String sifreR = "admin";
	static int sistemHizmetBedeli=1000;
	

}

class companyErisim extends adminErisim
{

}

class Yakit
{

	int yakıtTürü;// 0=benzin,1=motorin,2=elektirik,3=gaz
	int kilometreÜcreti;

	public Yakit()
	{

	}

	public Yakit(int yakıtTürü, int kilometreÜcreti)
	{
		this.yakıtTürü = yakıtTürü;
		this.kilometreÜcreti = kilometreÜcreti;

	}

}
