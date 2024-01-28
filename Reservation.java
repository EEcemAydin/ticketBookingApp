package PROLAB2;

public class Reservation extends Passenger
{
	private int aracNo;
	private int koltukNo;
	 public Reservation(String ad, String soyad,int kimlikNo, String dogumTarihi,int aracNo,int koltukNo)
	 {
	        super(ad, soyad,kimlikNo,dogumTarihi);
	        this.aracNo=aracNo;
	        this.koltukNo=koltukNo;
	 }
	public int getAracNo() {
		return aracNo;
	}
	public void setAracNo(int aracNo) {
		this.aracNo = aracNo;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}	 

}
