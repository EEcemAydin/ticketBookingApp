package PROLAB2;
public class Customer 
{
	ODEME odeme =new ODEME(0, 0, null);
	BilgiVeOdeme bilgiVeOdeme = new BilgiVeOdeme(null, 0, 0, 0, 0, 0, 0, 0);
	String kartNoString;
	String adString;
	String soyadString;
	int kartCvc;
	
	public ODEME getOdeme()
	{
		return odeme;
	}
	public void setOdeme(ODEME odeme)
	{
		this.odeme = odeme;
	}
	public BilgiVeOdeme getBilgiVeOdeme()
	{
		return bilgiVeOdeme;
	}
	public void setBilgiVeOdeme(BilgiVeOdeme bilgiVeOdeme)
	{
		this.bilgiVeOdeme = bilgiVeOdeme;
	}
	public String getKartNoString()
	{
		return kartNoString;
	}
	public void setKartNoString(String kartNoString)
	{
		this.kartNoString = kartNoString;
	}
	public String getAdString()
	{
		return adString;
	}
	public void setAdString(String adString)
	{
		this.adString = adString;
	}
	public String getSoyadString()
	{
		return soyadString;
	}
	public void setSoyadString(String soyadString)
	{
		this.soyadString = soyadString;
	}
	public int getKartCvc()
	{
		return kartCvc;
	}
	public void setKartCvc(int kartCvc)
	{
		this.kartCvc = kartCvc;
	}
	
}
