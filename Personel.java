package PROLAB2;

// Personel.java dosyası içeriği
public class Personel extends Person 
{
    //denemek için aldık private String personelBilgileri;
	int ücret;
    public Personel(String ad, String soyad, int ücret) {
        super(ad, soyad);
        this.ücret = ücret;
    }
    
}