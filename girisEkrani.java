package PROLAB2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class girisEkrani extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public girisEkrani(ArrayList<Company> companies)
	{
		setTitle("ANA EKRAN");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton biletAraButonu = new JButton("BİLET ARA");
		biletAraButonu.setFont(new Font("Arial", Font.BOLD, 20));
		biletAraButonu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				BiletAra biletAra =new BiletAra(companies);
				biletAra.setVisible(true);
				setVisible(false); 
			}
		});
		biletAraButonu.setBounds(743, 113, 382, 56);
		contentPane.add(biletAraButonu);

		JButton btnGiriYap = new JButton("GİRİŞ YAP");
		btnGiriYap.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				loginPanel LoginPanel = new loginPanel(companies);
				LoginPanel.setVisible(true);
				setVisible(false);
			}

		});
		btnGiriYap.setFont(new Font("Arial", Font.BOLD, 20));
		btnGiriYap.setBounds(743, 46, 382, 56);
		contentPane.add(btnGiriYap);
		
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



	}
}
