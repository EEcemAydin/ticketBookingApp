package PROLAB2;

import java.util.ArrayList;

import PROLAB2.koltuk.Onbes;
import PROLAB2.koltuk.Otuz;
import PROLAB2.koltuk.Yirmi;
import PROLAB2.koltuk.YirmiBes;

abstract class Vehicle // taşıt numarası,koltuk sayısı,
{
	int koltukSayisi;
	int aracNumarasi;
	ArrayList<Personel> sofor=new ArrayList<>();
	ArrayList<Personel> yardimciPersonel=new ArrayList<>();
	Trip seferTrip = new Trip();
	Onbes onbes1 = new Onbes();
	Yirmi yirmi1 = new Yirmi();
	YirmiBes yirmiBes1 = new YirmiBes();
	Otuz otuz1 = new Otuz();
	Onbes onbes2 = new Onbes();
	Yirmi yirmi2 = new Yirmi();
	YirmiBes yirmiBes2 = new YirmiBes();
	Otuz otuz2 = new Otuz();

}

class Bus extends Vehicle
{
	public Bus()
	{
	
	}

	public Bus(int koltukSayisi, int aracNumarasi, ArrayList<Personel> sofor, ArrayList<Personel> yardimciPersonel,
			Trip seferTrip)
	{
		this.koltukSayisi = koltukSayisi;
		this.aracNumarasi = aracNumarasi;
		this.sofor = sofor;
		this.yardimciPersonel = yardimciPersonel;
		this.seferTrip = seferTrip;
		
	}

}

class Train extends Vehicle
{
	public Train()
	{
		
	}

	public Train(int koltukSayisi, int aracNumarasi, ArrayList<Personel> sofor, ArrayList<Personel> yardimciPersonel,
			Trip seferTrip)
	{
		this.koltukSayisi = koltukSayisi;
		this.aracNumarasi = aracNumarasi;
		this.sofor = sofor;
		this.yardimciPersonel = yardimciPersonel;
		this.seferTrip = seferTrip;
	}
}

class Airplane extends Vehicle
{
	public Airplane()
	{
		
	}

	public Airplane(int koltukSayisi, int aracNumarasi, ArrayList<Personel> sofor, ArrayList<Personel> yardimciPersonel,
			Trip seferTrip)
	{
		this.koltukSayisi = koltukSayisi;
		this.aracNumarasi = aracNumarasi;
		this.sofor = sofor;
		this.yardimciPersonel = yardimciPersonel;
		this.seferTrip = seferTrip;
	}

}
