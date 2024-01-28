package PROLAB2;

import java.util.ArrayList;
import PROLAB2.*;

public class main
{
	@SuppressWarnings("null")
	public static void main(String args[])
	{
		ArrayList<Company> companies = new ArrayList<>();
		
		
		Company tempCompanyA = new Company()
		{
		};
		tempCompanyA.kullaniciAdi = "A";
		tempCompanyA.sifre = "A";
		Yakit tempYakitA = new Yakit();
		tempYakitA.kilometreÜcreti = 10;
		tempYakitA.yakıtTürü = 0;
		tempCompanyA.yakits = new ArrayList<>();
		tempCompanyA.yakits.add(tempYakitA);

		Bus tempBusA_1 = new Bus();
		tempBusA_1.sofor = new ArrayList<>();
		tempBusA_1.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelA1_1 = new Personel(null, null, 0);
		Personel tempPersonelA1_2 = new Personel(null, null, 0);
		Personel tempPersonelA1_3 = new Personel(null, null, 0);
		Personel tempPersonelA1_4 = new Personel(null, null, 0);

		Bus tempBusA_2 = new Bus();
		tempBusA_2.sofor = new ArrayList<>();
		tempBusA_2.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelA2_1 = new Personel(null, null, 0);
		Personel tempPersonelA2_2 = new Personel(null, null, 0);
		Personel tempPersonelA2_3 = new Personel(null, null, 0);
		Personel tempPersonelA2_4 = new Personel(null, null, 0);

		tempCompanyA.bus = new ArrayList<>();

		tempBusA_1.aracNumarasi = 1;
		tempBusA_1.koltukSayisi = 20;
		tempBusA_1.seferTrip.seferYapılacakMı=1;
		tempBusA_1.seferTrip.guzergah=3;
		tempBusA_1.seferTrip.SeferTarihi.yıl=2023;
		tempBusA_1.seferTrip.SeferTarihi.ay=12;
		tempBusA_1.seferTrip.SeferTarihi.gün=5;
		
		tempPersonelA1_1.ad = "Melih";
		tempPersonelA1_1.soyad = "Akman";
		tempPersonelA1_1.ücret = 5000;
		tempBusA_1.sofor.add(tempPersonelA1_1);
		tempPersonelA1_2.ad = "Kemal";
		tempPersonelA1_2.soyad = "Dıgıdık";
		tempPersonelA1_2.ücret = 5000;
		tempBusA_1.sofor.add(tempPersonelA1_2);
		tempPersonelA1_3.ad = "GÖKSEL";
		tempPersonelA1_3.soyad = "GÜLDAMLA";
		tempPersonelA1_3.ücret = 2000;
		tempBusA_1.yardimciPersonel.add(tempPersonelA1_3);
		tempPersonelA1_4.ad = "CEYHAN";
		tempPersonelA1_4.soyad = "ARARAT";
		tempPersonelA1_4.ücret = 2000;
		tempBusA_1.yardimciPersonel.add(tempPersonelA1_4);
		tempCompanyA.bus.add(tempBusA_1);
		
		tempBusA_2.aracNumarasi = 2;
		tempBusA_2.koltukSayisi = 15;
		tempBusA_2.seferTrip.seferYapılacakMı=1;
		tempBusA_2.seferTrip.guzergah=3;
		tempBusA_2.seferTrip.SeferTarihi.yıl=2023;
		tempBusA_2.seferTrip.SeferTarihi.ay=12;
		tempBusA_2.seferTrip.SeferTarihi.gün=6;
		
		tempPersonelA2_1.ad = "NAZMİYE";
		tempPersonelA2_1.soyad = "BOLAT";
		tempPersonelA2_1.ücret = 5000;
		tempBusA_2.sofor.add(tempPersonelA2_1);
		tempPersonelA2_2.ad = "SIDDIKA ";
		tempPersonelA2_2.soyad = "BABAYİĞİT";
		tempPersonelA2_2.ücret = 5000;
		tempBusA_2.sofor.add(tempPersonelA2_2);
		tempPersonelA2_3.ad = "ATA";
		tempPersonelA2_3.soyad = "SERTKAYA";
		tempPersonelA2_3.ücret = 2000;
		tempBusA_2.yardimciPersonel.add(tempPersonelA2_3);
		tempPersonelA2_4.ad = "İKRAM";
		tempPersonelA2_4.soyad = "BANİ";
		tempPersonelA2_4.ücret = 2000;
		tempBusA_2.yardimciPersonel.add(tempPersonelA2_4);
		tempCompanyA.bus.add(tempBusA_2);
		companies.add(tempCompanyA);

		Company tempCompanyB = new Company()
		{
		};
		tempCompanyB.kullaniciAdi = "B";
		tempCompanyB.sifre = "B";
		Yakit tempYakitB = new Yakit();
		tempYakitB.kilometreÜcreti = 5;
		tempYakitB.yakıtTürü = 1;
		tempCompanyB.yakits = new ArrayList<>();
		tempCompanyB.yakits.add(tempYakitB);

		Bus tempBusB_1 = new Bus();
		tempBusB_1.sofor = new ArrayList<>();
		tempBusB_1.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelB1_1 = new Personel(null, null, 0);
		Personel tempPersonelB1_2 = new Personel(null, null, 0);
		Personel tempPersonelB1_3 = new Personel(null, null, 0);
		Personel tempPersonelB1_4 = new Personel(null, null, 0);

		Bus tempBusB_2 = new Bus();
		tempBusB_2.sofor = new ArrayList<>();
		tempBusB_2.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelB2_1 = new Personel(null, null, 0);
		Personel tempPersonelB2_2 = new Personel(null, null, 0);
		Personel tempPersonelB2_3 = new Personel(null, null, 0);
		Personel tempPersonelB2_4 = new Personel(null, null, 0);

		tempCompanyB.bus = new ArrayList<>();

		tempBusB_1.aracNumarasi = 1;
		tempBusB_1.koltukSayisi = 15;
		tempBusB_1.seferTrip.seferYapılacakMı=1;
		tempBusB_1.seferTrip.guzergah=3;
		tempBusB_1.seferTrip.SeferTarihi.yıl=2023;
		tempBusB_1.seferTrip.SeferTarihi.ay=12;
		tempBusB_1.seferTrip.SeferTarihi.gün=4;
		tempPersonelB1_1.ad = "TARKAN";
		tempPersonelB1_1.soyad = "UYSAK";
		tempPersonelB1_1.ücret = 3000;
		tempBusB_1.sofor.add(tempPersonelB1_1);
		tempPersonelB1_2.ad = "CÜNEYT";
		tempPersonelB1_2.soyad = "TÜLÜCE";
		tempPersonelB1_2.ücret = 3000;
		tempBusB_1.sofor.add(tempPersonelB1_2);
		tempPersonelB1_3.ad = "SU";
		tempPersonelB1_3.soyad = "ATA";
		tempPersonelB1_3.ücret = 1500;
		tempBusB_1.yardimciPersonel.add(tempPersonelB1_3);
		tempPersonelB1_4.ad = "ARİF";
		tempPersonelB1_4.soyad = "KESİK";
		tempPersonelB1_4.ücret = 1500;
		tempBusB_1.yardimciPersonel.add(tempPersonelB1_4);
		tempCompanyB.bus.add(tempBusB_1);
		
		tempBusB_2.aracNumarasi = 2;
		tempBusB_2.koltukSayisi = 20;
		tempBusB_2.seferTrip.seferYapılacakMı=1;
		tempBusB_2.seferTrip.guzergah=4;
		tempBusB_2.seferTrip.SeferTarihi.yıl=2023;
		tempBusB_2.seferTrip.SeferTarihi.ay=12;
		tempBusB_2.seferTrip.SeferTarihi.gün=8;
		tempPersonelB2_1.ad = "HATİKE";
		tempPersonelB2_1.soyad = "BÜYÜKKALAY";
		tempPersonelB2_1.ücret = 3000;
		tempBusB_2.sofor.add(tempPersonelB2_1);
		tempPersonelB2_2.ad = "BERKE";
		tempPersonelB2_2.soyad = "ALTINGÖZ";
		tempPersonelB2_2.ücret = 3000;
		tempBusB_2.sofor.add(tempPersonelB2_2);
		tempPersonelB2_3.ad = "AYTAÇ";
		tempPersonelB2_3.soyad = "BARÇA";
		tempPersonelB2_3.ücret = 1500;
		tempBusB_2.yardimciPersonel.add(tempPersonelB2_3);
		tempPersonelB2_4.ad = "ASLI";
		tempPersonelB2_4.soyad = "GEYİK";
		tempPersonelB2_4.ücret = 1500;
		tempBusB_2.yardimciPersonel.add(tempPersonelB2_4);
		tempCompanyB.bus.add(tempBusB_2);
		companies.add(tempCompanyB);

		Company tempCompanyC = new Company()
		{
		};
		tempCompanyC.kullaniciAdi = "C";
		tempCompanyC.sifre = "C";
		Yakit tempYakitC1 = new Yakit();
		Yakit tempYakitC2 = new Yakit();
		tempYakitC1.kilometreÜcreti = 6;
		tempYakitC1.yakıtTürü = 1;
		tempYakitC2.kilometreÜcreti = 25;
		tempYakitC2.yakıtTürü = 3;
		tempCompanyC.yakits = new ArrayList<>();
		tempCompanyC.yakits.add(tempYakitC1);
		tempCompanyC.yakits.add(tempYakitC2);

		Bus tempBusC_1 = new Bus();
		tempBusC_1.sofor = new ArrayList<>();
		tempBusC_1.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelC1_1 = new Personel(null, null, 0);
		Personel tempPersonelC1_2 = new Personel(null, null, 0);
		Personel tempPersonelC1_3 = new Personel(null, null, 0);
		Personel tempPersonelC1_4 = new Personel(null, null, 0);
		tempCompanyC.bus = new ArrayList<>();

		Airplane tempAirPlaneC_1 = new Airplane();
		tempAirPlaneC_1.sofor = new ArrayList<>();
		tempAirPlaneC_1.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelC2_1 = new Personel(null, null, 0);
		Personel tempPersonelC2_2 = new Personel(null, null, 0);
		Personel tempPersonelC2_3 = new Personel(null, null, 0);
		Personel tempPersonelC2_4 = new Personel(null, null, 0);

		Airplane tempAirPlaneC_2 = new Airplane();
		tempAirPlaneC_2.sofor = new ArrayList<>();
		tempAirPlaneC_2.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelC3_1 = new Personel(null, null, 0);
		Personel tempPersonelC3_2 = new Personel(null, null, 0);
		Personel tempPersonelC3_3 = new Personel(null, null, 0);
		Personel tempPersonelC3_4 = new Personel(null, null, 0);

		tempCompanyC.airplane = new ArrayList<>();

		tempBusC_1.aracNumarasi = 1;
		tempBusC_1.koltukSayisi = 20;
		tempBusC_1.seferTrip.seferYapılacakMı=1;
		tempBusC_1.seferTrip.guzergah=4;
		tempBusC_1.seferTrip.SeferTarihi.yıl=2023;
		tempBusC_1.seferTrip.SeferTarihi.ay=12;
		tempBusC_1.seferTrip.SeferTarihi.gün=9;
		tempPersonelC1_1.ad = "CAHİT";
		tempPersonelC1_1.soyad = "BADEM";
		tempPersonelC1_1.ücret = 4000;
		tempBusB_1.sofor.add(tempPersonelC1_1);
		tempPersonelC1_2.ad = "SİMENDER";
		tempPersonelC1_2.soyad = "ÇOPUR";
		tempPersonelC1_2.ücret = 4000;
		tempBusC_1.sofor.add(tempPersonelC1_2);
		tempPersonelC1_3.ad = "BARKIN";
		tempPersonelC1_3.soyad = "DARAMAN";
		tempPersonelC1_3.ücret = 2000;
		tempBusC_1.yardimciPersonel.add(tempPersonelC1_3);
		tempPersonelC1_4.ad = "FULYA";
		tempPersonelC1_4.soyad = "YENİDÜNYA";
		tempPersonelC1_4.ücret = 2000;
		tempBusC_1.yardimciPersonel.add(tempPersonelC1_4);
		tempCompanyC.bus.add(tempBusC_1);

		tempAirPlaneC_1.aracNumarasi = 1;
		tempAirPlaneC_1.koltukSayisi = 30;
		tempAirPlaneC_1.seferTrip.seferYapılacakMı=1;
		tempAirPlaneC_1.seferTrip.guzergah=5;
		tempAirPlaneC_1.seferTrip.SeferTarihi.yıl=2023;
		tempAirPlaneC_1.seferTrip.SeferTarihi.ay=12;
		tempAirPlaneC_1.seferTrip.SeferTarihi.gün=10;

		tempPersonelC2_1.ad = "NEBİL";
		tempPersonelC2_1.soyad = "AVCI";
		tempPersonelC2_1.ücret = 10000;
		tempAirPlaneC_1.sofor.add(tempPersonelC2_1);
		tempPersonelC2_2.ad = "ANIL";
		tempPersonelC2_2.soyad = "FINDIK";
		tempPersonelC2_2.ücret = 10000;
		tempAirPlaneC_1.sofor.add(tempPersonelC2_2);
		tempPersonelC2_3.ad = "GAMZE";
		tempPersonelC2_3.soyad = "ARK";
		tempPersonelC2_3.ücret = 6000;
		tempAirPlaneC_1.yardimciPersonel.add(tempPersonelC2_3);
		tempPersonelC2_4.ad = "ELİFCAN";
		tempPersonelC2_4.soyad = "CİHANOĞLU";
		tempPersonelC2_4.ücret = 6000;
		tempAirPlaneC_1.yardimciPersonel.add(tempPersonelC2_4);
		tempCompanyC.airplane.add(tempAirPlaneC_1);

		tempAirPlaneC_2.aracNumarasi = 2;
		tempAirPlaneC_2.koltukSayisi = 30;
		tempAirPlaneC_2.seferTrip.seferYapılacakMı=1;
		tempAirPlaneC_2.seferTrip.guzergah=5;
		tempAirPlaneC_2.seferTrip.SeferTarihi.yıl=2023;
		tempAirPlaneC_2.seferTrip.SeferTarihi.ay=12;
		tempAirPlaneC_2.seferTrip.SeferTarihi.gün=7;
		tempPersonelC3_1.ad = "SEZGİ";
		tempPersonelC3_1.soyad = "KUSERLİ";
		tempPersonelC3_1.ücret = 10000;
		tempAirPlaneC_2.sofor.add(tempPersonelC2_1);
		tempPersonelC3_2.ad = "SARP";
		tempPersonelC3_2.soyad = "SÜZEN";
		tempPersonelC3_2.ücret = 10000;
		tempAirPlaneC_2.sofor.add(tempPersonelC2_2);
		tempPersonelC3_3.ad = "IŞIK";
		tempPersonelC3_3.soyad = "KOPTUR";
		tempPersonelC3_3.ücret = 6000;
		tempAirPlaneC_2.yardimciPersonel.add(tempPersonelC3_3);
		tempPersonelC3_4.ad = "SERCAN";
		tempPersonelC3_4.soyad = "ATMACA";
		tempPersonelC3_4.ücret = 6000;
		tempAirPlaneC_2.yardimciPersonel.add(tempPersonelC3_4);
		tempCompanyC.airplane.add(tempAirPlaneC_2);

		companies.add(tempCompanyC);

		Company tempCompanyD = new Company()
		{
		};
		tempCompanyD.kullaniciAdi = "D";
		tempCompanyD.sifre = "D";
		Yakit tempYakitD = new Yakit();
		tempYakitD.kilometreÜcreti = 3;
		tempYakitD.yakıtTürü = 2;
		tempCompanyD.yakits = new ArrayList<>();
		tempCompanyD.yakits.add(tempYakitD);

		Train tempTrainD_1 = new Train();
		tempTrainD_1.sofor = new ArrayList<>();
		tempTrainD_1.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelD1_1 = new Personel(null, null, 0);
		Personel tempPersonelD1_2 = new Personel(null, null, 0);
		Personel tempPersonelD1_3 = new Personel(null, null, 0);
		Personel tempPersonelD1_4 = new Personel(null, null, 0);

		Train tempTrainD_2 = new Train();
		tempTrainD_2.sofor = new ArrayList<>();
		tempTrainD_2.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelD2_1 = new Personel(null, null, 0);
		Personel tempPersonelD2_2 = new Personel(null, null, 0);
		Personel tempPersonelD2_3 = new Personel(null, null, 0);
		Personel tempPersonelD2_4 = new Personel(null, null, 0);

		Train tempTrainD_3 = new Train();
		tempTrainD_3.sofor = new ArrayList<>();
		tempTrainD_3.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelD3_1 = new Personel(null, null, 0);
		Personel tempPersonelD3_2 = new Personel(null, null, 0);
		Personel tempPersonelD3_3 = new Personel(null, null, 0);
		Personel tempPersonelD3_4 = new Personel(null, null, 0);
		tempCompanyD.train = new ArrayList<>();

		tempTrainD_1.aracNumarasi = 1;
		tempTrainD_1.koltukSayisi = 25;
		tempTrainD_1.seferTrip.seferYapılacakMı=1;
		tempTrainD_1.seferTrip.guzergah=1;
		tempTrainD_1.seferTrip.SeferTarihi.yıl=2023;
		tempTrainD_1.seferTrip.SeferTarihi.ay=12;
		tempTrainD_1.seferTrip.SeferTarihi.gün=4;
		tempPersonelD1_1.ad = "BURHAN";
		tempPersonelD1_1.soyad = "OKTAY";
		tempPersonelD1_1.ücret = 2000;
		tempTrainD_1.sofor.add(tempPersonelD1_1);
		tempPersonelD1_2.ad = "DİDEM";
		tempPersonelD1_2.soyad = "ILGAZ";
		tempPersonelD1_2.ücret = 2000;
		tempTrainD_1.sofor.add(tempPersonelD1_2);
		tempPersonelD1_3.ad = "AYLİA";
		tempPersonelD1_3.soyad = "EĞRİ";
		tempPersonelD1_3.ücret = 1000;
		tempTrainD_1.yardimciPersonel.add(tempPersonelD1_3);
		tempPersonelD1_4.ad = "SONER";
		tempPersonelD1_4.soyad = "MANSUR";
		tempPersonelD1_4.ücret = 1000;
		tempTrainD_1.yardimciPersonel.add(tempPersonelD1_4);
		tempCompanyD.train.add(tempTrainD_1);

		tempTrainD_2.aracNumarasi = 2;
		tempTrainD_2.koltukSayisi = 25;
		tempTrainD_2.seferTrip.seferYapılacakMı=1;
		tempTrainD_2.seferTrip.guzergah=1;
		tempTrainD_2.seferTrip.SeferTarihi.yıl=2023;
		tempTrainD_2.seferTrip.SeferTarihi.ay=12;
		tempTrainD_2.seferTrip.SeferTarihi.gün=8;
		tempPersonelD2_1.ad = "SAVAŞ";
		tempPersonelD2_1.soyad = "YAVAŞİ";
		tempPersonelD2_1.ücret = 2000;
		tempTrainD_2.sofor.add(tempPersonelD2_1);
		tempPersonelD2_2.ad = "SERVET";
		tempPersonelD2_2.soyad = "KAYKISIZ";
		tempPersonelD2_2.ücret = 2000;
		tempTrainD_2.sofor.add(tempPersonelD2_2);
		tempPersonelD2_3.ad = "ERDEM";
		tempPersonelD2_3.soyad = "KÜPELİ";
		tempPersonelD2_3.ücret = 1000;
		tempTrainD_2.yardimciPersonel.add(tempPersonelD2_3);
		tempPersonelD2_4.ad = "ADEM";
		tempPersonelD2_4.soyad = "BOSTANCI";
		tempPersonelD2_4.ücret = 1000;
		tempTrainD_2.yardimciPersonel.add(tempPersonelD2_4);
		tempCompanyD.train.add(tempTrainD_2);

		tempTrainD_3.aracNumarasi = 3;
		tempTrainD_3.koltukSayisi = 25;
		tempTrainD_3.seferTrip.seferYapılacakMı=1;
		tempTrainD_3.seferTrip.guzergah=2;
		tempTrainD_3.seferTrip.SeferTarihi.yıl=2023;
		tempTrainD_3.seferTrip.SeferTarihi.ay=12;
		tempTrainD_3.seferTrip.SeferTarihi.gün=8;
		tempPersonelD3_1.ad = "ALPER";
		tempPersonelD3_1.soyad = "KURALAY";
		tempPersonelD3_1.ücret = 2000;
		tempTrainD_3.sofor.add(tempPersonelD3_1);
		tempPersonelD3_2.ad = "MERVE";
		tempPersonelD3_2.soyad = "DURUK";
		tempPersonelD3_2.ücret = 2000;
		tempTrainD_3.sofor.add(tempPersonelD2_2);
		tempPersonelD3_3.ad = "ECE";
		tempPersonelD3_3.soyad = "ALPINAR";
		tempPersonelD3_3.ücret = 1000;
		tempTrainD_3.yardimciPersonel.add(tempPersonelD3_3);
		tempPersonelD3_4.ad = "BELİZ";
		tempPersonelD3_4.soyad = "ARPAT";
		tempPersonelD3_4.ücret = 1000;
		tempTrainD_3.yardimciPersonel.add(tempPersonelD3_4);
		tempCompanyD.train.add(tempTrainD_3);
		companies.add(tempCompanyD);

		Company tempCompanyF = new Company()
		{
		};
		tempCompanyF.kullaniciAdi = "F";
		tempCompanyF.sifre = "F";
		Yakit tempYakitF = new Yakit();
		tempYakitF.kilometreÜcreti = 20;
		tempYakitF.yakıtTürü = 3;
		tempCompanyF.yakits = new ArrayList<>();
		tempCompanyF.yakits.add(tempYakitF);

		Airplane tempAirPlaneF_1 = new Airplane();
		tempAirPlaneF_1.sofor = new ArrayList<>();
		tempAirPlaneF_1.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelF1_1 = new Personel(null, null, 0);
		Personel tempPersonelF1_2 = new Personel(null, null, 0);
		Personel tempPersonelF1_3 = new Personel(null, null, 0);
		Personel tempPersonelF1_4 = new Personel(null, null, 0);

		Airplane tempAirPlaneF_2 = new Airplane();
		tempAirPlaneF_2.sofor = new ArrayList<>();
		tempAirPlaneF_2.yardimciPersonel = new ArrayList<>();
		Personel tempPersonelF2_1 = new Personel(null, null, 0);
		Personel tempPersonelF2_2 = new Personel(null, null, 0);
		Personel tempPersonelF2_3 = new Personel(null, null, 0);
		Personel tempPersonelF2_4 = new Personel(null, null, 0);

		tempCompanyF.airplane = new ArrayList<>();

		tempAirPlaneF_1.aracNumarasi = 1;
		tempAirPlaneF_1.koltukSayisi = 30;
		tempAirPlaneF_1.seferTrip.seferYapılacakMı=1;
		tempAirPlaneF_1.seferTrip.guzergah=6;
		tempAirPlaneF_1.seferTrip.SeferTarihi.yıl=2023;
		tempAirPlaneF_1.seferTrip.SeferTarihi.ay=12;
		tempAirPlaneF_1.seferTrip.SeferTarihi.gün=9;
		tempPersonelF1_1.ad = "IŞIL";
		tempPersonelF1_1.soyad = "BACAK";
		tempPersonelF1_1.ücret = 7500;
		tempAirPlaneF_1.sofor.add(tempPersonelF1_1);
		tempPersonelF1_2.ad = "AYKAN";
		tempPersonelF1_2.soyad = "ŞENER";
		tempPersonelF1_2.ücret = 7500;
		tempAirPlaneF_1.sofor.add(tempPersonelF1_2);
		tempPersonelF1_3.ad = "NİL";
		tempPersonelF1_3.soyad = "DAM";
		tempPersonelF1_3.ücret = 4000;
		tempAirPlaneF_1.yardimciPersonel.add(tempPersonelF1_3);
		tempPersonelF1_4.ad = "KEVSER";
		tempPersonelF1_4.soyad = "GÜROCAK";
		tempPersonelF1_4.ücret = 4000;
		tempAirPlaneF_1.yardimciPersonel.add(tempPersonelF1_4);
		tempCompanyF.airplane.add(tempAirPlaneF_1);

		tempAirPlaneF_2.aracNumarasi = 2;
		tempAirPlaneF_2.koltukSayisi = 30;
		tempAirPlaneF_2.seferTrip.seferYapılacakMı=1;
		tempAirPlaneF_2.seferTrip.guzergah=6;
		tempAirPlaneF_2.seferTrip.SeferTarihi.yıl=2023;
		tempAirPlaneF_2.seferTrip.SeferTarihi.ay=12;
		tempAirPlaneF_2.seferTrip.SeferTarihi.gün=5;
		
		tempPersonelF2_1.ad = "ZARİFE";
		tempPersonelF2_1.soyad = "VURGAN";
		tempPersonelF2_1.ücret = 7500;
		tempAirPlaneF_2.sofor.add(tempPersonelF2_1);
		tempPersonelF2_2.ad = "NEHİR";
		tempPersonelF2_2.soyad = " KIZMAZ";
		tempPersonelF2_2.ücret = 7500;
		tempAirPlaneF_2.sofor.add(tempPersonelF2_2);
		tempPersonelF2_3.ad = "FİKRİ";
		tempPersonelF2_3.soyad = "AKCA";
		tempPersonelF2_3.ücret = 4000;
		tempAirPlaneF_2.yardimciPersonel.add(tempPersonelF2_3);
		tempPersonelF2_4.ad = "FAİK";
		tempPersonelF2_4.soyad = "ALĞAN";
		tempPersonelF2_4.ücret = 4000;
		tempAirPlaneF_2.yardimciPersonel.add(tempPersonelF2_4);
		tempCompanyF.airplane.add(tempAirPlaneF_2);
		companies.add(tempCompanyF);
		for (Company company : companies)
		{
			System.out.println("Kullanıcı Adı: " + company.kullaniciAdi + " Şifre: " + company.sifre);

			// Tren verilerini yazdırma
			if (company.train != null)
			{
				for (Train train : company.train)
				{
					// Tren verilerini yazdırın
					System.out.println("Tren Bilgileri: ..."); // Tren bilgilerini buraya ekleyin
				}
			}

			// Otobüs verilerini yazdırma
			if (company.bus != null)
			{
				for (Bus bus : company.bus)
				{
					// Otobüs verilerini yazdırın
					System.out.println("Otobüs Bilgileri: Arac Numarası: " + bus.aracNumarasi + " Koltuk Sayısı: "
							+ bus.koltukSayisi);

					// Şoför bilgilerini yazdırma
					for (Personel driver : bus.sofor)
					{
						System.out.println("Şoför Adı: " + driver.ad + " Şoför Soyadı: " + driver.soyad
								+ " Şoför Ücreti: " + driver.ücret);
					}

					// Yardımcı personel bilgilerini yazdırma
					for (Personel staff : bus.yardimciPersonel)
					{
						System.out.println("Yardımcı Personel Adı: " + staff.ad + " Yardımcı Personel Soyadı: "
								+ staff.soyad + " Yardımcı Personel Ücreti: " + staff.ücret);
					}
				}
			}

			// Uçak verilerini yazdırma
			if (company.airplane != null)
			{
				for (Airplane airplane : company.airplane)
				{
					// Uçak verilerini yazdırın
					System.out.println("Uçak Bilgileri: ..."); // Uçak bilgilerini buraya ekleyin
				}
			}

			// Yakıt verilerini yazdırma
			if (company.yakits != null)
			{
				for (Yakit yakit : company.yakits)
				{
					// Yakıt verilerini yazdırın
					System.out.println("Yakıt Bilgileri: ..."); // Yakıt bilgilerini buraya ekleyin
				}
			}
		}

		girisEkrani girisEkraniAEkrani = new girisEkrani(companies);
		girisEkraniAEkrani.setVisible(true);

	}

}
