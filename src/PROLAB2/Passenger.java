package PROLAB2;
public class Passenger extends Person
{
    private int kimlikNo;
    private String dogumTarihi;
    private int ücret;
    
    public Passenger(String ad, String soyad,int kimlikNo, String dogumTarihi) {
        super(ad, soyad);
        this.kimlikNo=kimlikNo;
        this.dogumTarihi=dogumTarihi;
    }

    // Getter ve Setter metotları
    
	public int getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(int kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public int getÜcret()
	{
		return ücret;
	}

	public void setÜcret(int ücret)
	{
		this.ücret = ücret;
	}
	
	
    
}