package PROLAB2;

import java.util.*;

public class isimGenerator
{
	public String adgetir()
	{
		Random random = new Random();

		String[] adlar =
		{ "Ahmet", "Mehmet", "Ayşe", "Fatma", "Mustafa", "Emine", "Ali", "Zeynep", "Hüseyin", "Hatice", "Osman",
				"Ayten", "İsmail", "Feyza", "Ercan", "Gülsüm", "Burak", "Meltem", "Süleyman", "Yasemin", "Burcu",
				"Onur", "Elif", "Umut", "Derya", "Kemal", "Sevil", "Gökhan", "Serap", "Cem", "Gamze", "Furkan", "İrem",
				"Berk", "Selma", "Tolga", "Nesrin", "Kaan", "Sevgi", "Deniz", "Cihan", "Esra", "Okan", "Buse", "Can",
				"Ece", "Serkan", "İlayda", "Şükrü", "Özge", "Tamer", "Şeyma", "Tolunay", "Nuray", "Taylan", "Selcan",
				"Sarp", "Aslı", "Murat", "Gül", "Oğuz", "İclal", "Savaş", "Hilal", "Erkan", "Selin", "Cengiz", "Emel",
				"Yiğit", "Duygu", "Uğur", "Aysel", "Cihat", "Esma", "Ufuk", "Fadime", "Bora", "Gizem", "Oktay", "Tuğba",
				"Cemre", "Ozan", "Selvi", "Mert", "Ceyda", "Kürşat", "Leyla", "Yavuz", "Elifnaz", "Şaban"

		};

		return adlar[random.nextInt(adlar.length)];
	}

	public String soyadGetir()
	{
		Random random = new Random();
		String[] soyadlar =
		{ "Yılmaz", "Kaya", "Demir", "Çelik", "Şahin", "Öztürk", "Güneş", "Çetin", "Arslan", "Koç", "Turan", "Erdoğan",
				"Tuncer", "Aydın", "Özdemir", "Yıldırım", "Yalçın", "Taş", "Aydın", "Yavuz", "Aksoy", "Doğan",
				"Çalışkan", "Kaplan", "Bilgin", "Duru", "Gür", "Şen", "Kurt", "Sarı", "Yıldız", "Şimşek", "Erdem",
				"Alp", "Polat", "Ceylan", "Göktürk", "Karahan", "Aslan", "Sönmez", "Uzun", "Uyar", "Aksu", "Çolak",
				"Çakır", "Savaş", "Yalın", "Kurtuluş", "Bozkurt", "Bulut", "Kılıç", "Deniz", "Aslan", "Oktay", "Türk",
				"Alkan", "Gökçe", "Ateş", "Koçak", "Korkmaz", "Yücel", "Aktaş", "Erkan", "Küçük", "Acar", "Yazıcı",
				"Özkan", "Gül", "Kurtul", "Ay", "Aksakal", "Ateş", "Taştan", "Sancak", "Kılıçaslan", "Özen",
				"Yıldızoğlu", "Türkoğlu", "Büyükoğlu", "Dinçer", "Ergin", "Güzel", "Avcı", "Kurtuluş", "Özmen",
				"Yıldız", "Duman", "Güngör", "Şahiner", "Şenel"
				// Diğer soyadlarını buraya ekleyebilirsiniz...
		};

		return soyadlar[random.nextInt(soyadlar.length)];
	}

	public int personelÜcretGetir()
	{
		Random random = new Random();
		int[] dizi =
		{ 5000, 10000, 8000, 7500, 6500, 7400, 2000, 3000, 4500 };
		return dizi[random.nextInt(dizi.length)];
	}

	public int tckimlikNo()
	{
		Random random = new Random();
        int altSinir = 100000000; // 11 haneli sayının en küçük değeri
        int ustSinir = 999999999; // 11 haneli sayının en büyük değeri

        
        return altSinir + random.nextInt(ustSinir - altSinir + 1);
	}
	public String dogumTarihi() {
		Random random = new Random();

		int rastgeleYil = 1970 + random.nextInt(50);
        int rastgeleAy = 1 + random.nextInt(12);
        int rastgeleGun = 1 + random.nextInt(30);
        String dondurString = rastgeleGun+"/"+rastgeleAy+"/"+rastgeleYil;
        return dondurString;
	}

}
