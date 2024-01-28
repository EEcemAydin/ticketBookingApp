package PROLAB2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class firmaPanel extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFirmaPaneli;
	private JTextField txtAralar;
	private JTextField txtAraEkleme;
	private JTextField txtAraSil;
	private JTextField txtSeferIlemleri;
	private JTextField txtSeferEkleme;
	private JTextField txtSeferSil;
	private JTextField txtTaitTr;
	private JTextField txtKoltukSayisi;
	private JTextField txtAraNumarasi;
	private JTextField arac_ekle_aracNumarasi_textField;
	private JComboBox arac_sil_tasitTuru_comboBox;
	private JTextField txtAraTr;
	private JTextField txtAraNumarasi_1;
	private JTextField txtAraTr_1;
	private JTextField textField_1;
	private JTextField txtRotaNumarasi;
	private JTextField txtSeferEkle;
	private JTextField txtAraTr_2;
	private JTextField txtSeferNumarasi;
	private JButton sefer_ekle_tasitTuruSec_button;
	private JTextField txtTarih;
	private JTextField txtKarzararHesapla;
	private JTextField textField;
	private JButton kar_zarar_hesapla;
	private JButton anaEkranButton;


	public firmaPanel(ArrayList<Company> companies, int secilenSirketIndis)
	{
		isimGenerator isimGenerator =new isimGenerator();
		Trip trip = new Trip();
		if (secilenSirketIndis == -1)
		{
			System.out.println("HOOOPPP Seçilen Şirket Listede YOK");
		}
		ArrayList<Integer> aracNumarasIntegers = new ArrayList<>();

		JComboBox arac_sil_aracNumarasi_comboBox = new JComboBox();
		arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "ARAÇ TÜRÜ SEÇİNİZ ARDINDAN GÜNCELLEYE BASIN" }));

		setTitle("Firma Paneli");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFirmaPaneli = new JTextField();
		txtFirmaPaneli.setEditable(false);
		txtFirmaPaneli.setBackground(new Color(240, 240, 240));
		txtFirmaPaneli.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaPaneli.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFirmaPaneli.setText("FİRMA PANELİ");
		txtFirmaPaneli.setBounds(377, 11, 342, 59);
		contentPane.add(txtFirmaPaneli);
		txtFirmaPaneli.setColumns(10);

		txtAralar = new JTextField();
		txtAralar.setEditable(false);
		txtAralar.setText("ARAÇ  İŞLEMLERİ");
		txtAralar.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralar.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAralar.setColumns(10);
		txtAralar.setBackground(UIManager.getColor("Button.background"));
		txtAralar.setBounds(96, 81, 310, 46);
		contentPane.add(txtAralar);

		txtAraEkleme = new JTextField();
		txtAraEkleme.setEditable(false);
		txtAraEkleme.setText("ARAÇ  EKLEME");
		txtAraEkleme.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraEkleme.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraEkleme.setColumns(10);
		txtAraEkleme.setBackground(UIManager.getColor("Button.background"));
		txtAraEkleme.setBounds(96, 138, 310, 35);
		contentPane.add(txtAraEkleme);

		JComboBox arac_ekle_tasitTuru_comboBox = new JComboBox();
		arac_ekle_tasitTuru_comboBox.setMaximumRowCount(3);
		arac_ekle_tasitTuru_comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		arac_ekle_tasitTuru_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "OTOBÜS", "UÇAK", "TREN" }));
		arac_ekle_tasitTuru_comboBox.setBounds(96, 232, 310, 31);
		contentPane.add(arac_ekle_tasitTuru_comboBox);

		JComboBox arac_ekle_koltukSayisi_comboBox = new JComboBox();
		arac_ekle_koltukSayisi_comboBox.setModel(new DefaultComboBoxModel(new Integer[]
		{ 15, 20, 25, 30 }));
		arac_ekle_koltukSayisi_comboBox.setMaximumRowCount(4);
		arac_ekle_koltukSayisi_comboBox.setBounds(96, 313, 310, 31);
		contentPane.add(arac_ekle_koltukSayisi_comboBox);

		arac_ekle_aracNumarasi_textField = new JTextField();
		arac_ekle_aracNumarasi_textField.setColumns(10);
		arac_ekle_aracNumarasi_textField.setBounds(96, 399, 310, 31);
		contentPane.add(arac_ekle_aracNumarasi_textField);

		JButton arac_ekle_button = new JButton("EKLE");
		arac_ekle_button.setFont(new Font("Tahoma", Font.BOLD, 15));
		arac_ekle_button.setBounds(200, 438, 89, 23);
		arac_ekle_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int aracNumarasi = -1;
				int arac_ekle_koltukSayisi = (int) arac_ekle_koltukSayisi_comboBox.getSelectedItem();
				String aracNumarasiString = arac_ekle_aracNumarasi_textField.getText();
				try
				{
					aracNumarasi = Integer.parseInt(aracNumarasiString);

				}
				catch (Exception e2)
				{
					System.out.println("Geçersiz sayısal ifade");
				}
				int aracTuru = -1;
				aracTuru = arac_ekle_tasitTuru_comboBox.getSelectedIndex();

				switch (aracTuru)
				{
				case 0:// otobüs
					int aracNumarasiKontrolBus = 0;
					Bus tempBus = new Bus();
					if (companies.get(secilenSirketIndis).bus != null)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
						{
							if (companies.get(secilenSirketIndis).bus.get(i).aracNumarasi == aracNumarasi)
							{
								aracNumarasiKontrolBus = 1;
							}

						}
					}

					if (aracNumarasiKontrolBus == 0)
					{
						tempBus.aracNumarasi = aracNumarasi;
						tempBus.koltukSayisi = arac_ekle_koltukSayisi;
						// tempbus.seferNo=
						// yeni şöför ve yardımcılar eklenicek rastgele isim generatör
						Personel temPersonel =new Personel(isimGenerator.adgetir(), isimGenerator.soyadGetir(), isimGenerator.personelÜcretGetir());
						tempBus.sofor.add(temPersonel);
						temPersonel.ad=isimGenerator.adgetir();
						temPersonel.soyad=isimGenerator.soyadGetir();
						temPersonel.ücret=isimGenerator.personelÜcretGetir();
						tempBus.sofor.add(temPersonel);
						Personel temPersonel2 =new Personel(isimGenerator.adgetir(), isimGenerator.soyadGetir(), isimGenerator.personelÜcretGetir());
						tempBus.yardimciPersonel.add(temPersonel2);
						temPersonel2.ad=isimGenerator.adgetir();
						temPersonel2.soyad=isimGenerator.soyadGetir();
						temPersonel2.ücret=isimGenerator.personelÜcretGetir();
						tempBus.yardimciPersonel.add(temPersonel2);
						

						companies.get(secilenSirketIndis).bus.add(tempBus);
						System.out.println(aracNumarasi + " numaralı otobüs koltuk sayısı= " + arac_ekle_koltukSayisi);
						arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
						{ "GÜNCELLEYE BASIN" }));
						

					}
					else
					{
						System.out.println(
								aracNumarasi + " numaraya sahip bir otobüs var otobüs numaraları farklı olmalıdır");
					}

					break;

				case 1:// uçak
					int aracNumarasiKontrolAirplane = 0;
					Airplane tempAirplane = new Airplane();
					if (companies.get(secilenSirketIndis).airplane != null)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
						{
							if (companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi == aracNumarasi)
							{
								aracNumarasiKontrolAirplane = 1;
							}

						}
					}

					if (aracNumarasiKontrolAirplane == 0)
					{
						tempAirplane.aracNumarasi = aracNumarasi;
						tempAirplane.koltukSayisi = arac_ekle_koltukSayisi;
						// tempbus.seferNo=
						// yeni şöför ve yardımcılar eklenicek rastgele isim generatör
						Personel temPersonel =new Personel(isimGenerator.adgetir(), isimGenerator.soyadGetir(), isimGenerator.personelÜcretGetir());
						tempAirplane.sofor.add(temPersonel);
						temPersonel.ad=isimGenerator.adgetir();
						temPersonel.soyad=isimGenerator.soyadGetir();
						temPersonel.ücret=isimGenerator.personelÜcretGetir();
						tempAirplane.sofor.add(temPersonel);
						Personel temPersonel2 =new Personel(isimGenerator.adgetir(), isimGenerator.soyadGetir(), isimGenerator.personelÜcretGetir());
						tempAirplane.yardimciPersonel.add(temPersonel2);
						temPersonel2.ad=isimGenerator.adgetir();
						temPersonel2.soyad=isimGenerator.soyadGetir();
						temPersonel2.ücret=isimGenerator.personelÜcretGetir();
						tempAirplane.yardimciPersonel.add(temPersonel2);

						companies.get(secilenSirketIndis).airplane.add(tempAirplane);
						System.out.println(aracNumarasi + " numaralı uçak koltuk sayısı= " + arac_ekle_koltukSayisi);
						arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
						{ "GÜNCELLEYE BASIN" }));

					}
					else
					{
						System.out.println(
								aracNumarasi + " numaraya sahip bir uçak var uçak numaraları farklı olmalıdır");
					}

					break;

				case 2:// tren
					int aracNumarasiKontrolTrain = 0;
					Train tempTrain = new Train();

					if (companies.get(secilenSirketIndis).train != null)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
						{
							if (companies.get(secilenSirketIndis).train.get(i).aracNumarasi == aracNumarasi)
							{
								aracNumarasiKontrolTrain = 1;
							}

						}
					}

					if (aracNumarasiKontrolTrain == 0)
					{
						tempTrain.aracNumarasi = aracNumarasi;
						tempTrain.koltukSayisi = arac_ekle_koltukSayisi;
						// tempbus.seferNo=
						// yeni şöför ve yardımcılar eklenicek rastgele isim generatör
						Personel temPersonel =new Personel(isimGenerator.adgetir(), isimGenerator.soyadGetir(), isimGenerator.personelÜcretGetir());
						tempTrain.sofor.add(temPersonel);
						temPersonel.ad=isimGenerator.adgetir();
						temPersonel.soyad=isimGenerator.soyadGetir();
						temPersonel.ücret=isimGenerator.personelÜcretGetir();
						tempTrain.sofor.add(temPersonel);
						Personel temPersonel2 =new Personel(isimGenerator.adgetir(), isimGenerator.soyadGetir(), isimGenerator.personelÜcretGetir());
						tempTrain.yardimciPersonel.add(temPersonel2);
						temPersonel2.ad=isimGenerator.adgetir();
						temPersonel2.soyad=isimGenerator.soyadGetir();
						temPersonel2.ücret=isimGenerator.personelÜcretGetir();

						tempTrain.yardimciPersonel.add(temPersonel2);

						companies.get(secilenSirketIndis).train.add(tempTrain);
						System.out.println(aracNumarasi + " numaralı tren koltuk sayısı= " + arac_ekle_koltukSayisi);
						arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
						{ "GÜNCELLEYE BASIN" }));

					}
					else
					{
						System.out.println(
								aracNumarasi + " numaraya sahip bir tren var. tren numaraları farklı olmalıdır");
					}

					break;

				default:
					break;
				}

			}
		});

		contentPane.add(arac_ekle_button);

		txtAraSil = new JTextField();
		txtAraSil.setEditable(false);
		txtAraSil.setText("ARAÇ  SİL");
		txtAraSil.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraSil.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraSil.setColumns(10);
		txtAraSil.setBackground(UIManager.getColor("Button.background"));
		txtAraSil.setBounds(96, 501, 310, 35);
		contentPane.add(txtAraSil);

		JButton arac_sil_button = new JButton("SİL");
		arac_sil_button.setFont(new Font("Tahoma", Font.BOLD, 15));
		arac_sil_button.setBounds(200, 727, 89, 23);
		contentPane.add(arac_sil_button);

		txtSeferIlemleri = new JTextField();
		txtSeferIlemleri.setEditable(false);
		txtSeferIlemleri.setText("SEFER  İŞLEMLERİ");
		txtSeferIlemleri.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeferIlemleri.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSeferIlemleri.setColumns(10);
		txtSeferIlemleri.setBackground(UIManager.getColor("Button.background"));
		txtSeferIlemleri.setBounds(477, 81, 310, 46);
		contentPane.add(txtSeferIlemleri);

		txtSeferEkleme = new JTextField();
		txtSeferEkleme.setEditable(false);
		txtSeferEkleme.setText("SEFER EKLEME");
		txtSeferEkleme.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeferEkleme.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSeferEkleme.setColumns(10);
		txtSeferEkleme.setBackground(UIManager.getColor("Button.background"));
		txtSeferEkleme.setBounds(487, 81, 283, 40);
		contentPane.add(txtSeferEkleme);

		txtSeferSil = new JTextField();
		txtSeferSil.setEditable(false);
		txtSeferSil.setText("SEFER  SİL");
		txtSeferSil.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeferSil.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSeferSil.setColumns(10);
		txtSeferSil.setBackground(UIManager.getColor("Button.background"));
		txtSeferSil.setBounds(477, 562, 310, 35);
		contentPane.add(txtSeferSil);

		txtTaitTr = new JTextField();
		txtTaitTr.setText("TAŞIT TÜRÜ");
		txtTaitTr.setHorizontalAlignment(SwingConstants.CENTER);
		txtTaitTr.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTaitTr.setEditable(false);
		txtTaitTr.setColumns(10);
		txtTaitTr.setBackground(UIManager.getColor("Button.background"));
		txtTaitTr.setBounds(96, 189, 310, 31);
		contentPane.add(txtTaitTr);

		txtKoltukSayisi = new JTextField();
		txtKoltukSayisi.setText("KOLTUK SAYISI");
		txtKoltukSayisi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKoltukSayisi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtKoltukSayisi.setEditable(false);
		txtKoltukSayisi.setColumns(10);
		txtKoltukSayisi.setBackground(UIManager.getColor("Button.background"));
		txtKoltukSayisi.setBounds(96, 274, 310, 31);
		contentPane.add(txtKoltukSayisi);

		txtAraNumarasi = new JTextField();
		txtAraNumarasi.setText("ARAÇ NUMARASI");
		txtAraNumarasi.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraNumarasi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraNumarasi.setEditable(false);
		txtAraNumarasi.setColumns(10);
		txtAraNumarasi.setBackground(UIManager.getColor("Button.background"));
		txtAraNumarasi.setBounds(96, 357, 310, 31);
		contentPane.add(txtAraNumarasi);

		arac_sil_tasitTuru_comboBox = new JComboBox();
		arac_sil_tasitTuru_comboBox.setMaximumRowCount(3);
		arac_sil_tasitTuru_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "OTOBÜS", "UÇAK", "TREN" }));
		arac_sil_tasitTuru_comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		arac_sil_tasitTuru_comboBox.setBounds(96, 595, 199, 31);
		contentPane.add(arac_sil_tasitTuru_comboBox);
		txtAraTr = new JTextField();
		txtAraTr.setText("ARAÇ TÜRÜ");
		txtAraTr.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraTr.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraTr.setEditable(false);
		txtAraTr.setColumns(10);
		txtAraTr.setBackground(UIManager.getColor("Button.background"));
		txtAraTr.setBounds(96, 552, 310, 31);
		contentPane.add(txtAraTr);

		arac_sil_aracNumarasi_comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		arac_sil_aracNumarasi_comboBox.setBounds(96, 686, 310, 31);
		contentPane.add(arac_sil_aracNumarasi_comboBox);

		txtAraNumarasi_1 = new JTextField();
		txtAraNumarasi_1.setText("ARAÇ NUMARASI");
		txtAraNumarasi_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraNumarasi_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraNumarasi_1.setEditable(false);
		txtAraNumarasi_1.setColumns(10);
		txtAraNumarasi_1.setBackground(UIManager.getColor("Button.background"));
		txtAraNumarasi_1.setBounds(96, 643, 310, 31);
		contentPane.add(txtAraNumarasi_1);

		JButton arac_sil_tasitTuruSec_button = new JButton("GÜNCELLE");
		arac_sil_tasitTuruSec_button.setFont(new Font("Tahoma", Font.BOLD, 12));

		arac_sil_tasitTuruSec_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int arac_sil_tasitTuruSecilen = -1;
				arac_sil_tasitTuruSecilen = arac_sil_tasitTuru_comboBox.getSelectedIndex();

				switch (arac_sil_tasitTuruSecilen)
				{
				case 0:
					aracNumarasIntegers.clear();
					if (companies.get(secilenSirketIndis).bus != null
							&& companies.get(secilenSirketIndis).bus.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
						{
							aracNumarasIntegers.add(companies.get(secilenSirketIndis).bus.get(i).aracNumarasi);
						}
						System.out.println("Otobüs Seçildi " + aracNumarasIntegers);
						arac_sil_aracNumarasi_comboBox
								.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
					}
					else
					{
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Otobüsü Yok");
						arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
						{ "OTOBÜS BULUNAMADI" }));

					}
					break;
				case 1:
					aracNumarasIntegers.clear();
					if (companies.get(secilenSirketIndis).airplane != null
							&& companies.get(secilenSirketIndis).airplane.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
						{
							aracNumarasIntegers.add(companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi);
						}
						System.out.println("Uçak Seçildi " + aracNumarasIntegers);
						arac_sil_aracNumarasi_comboBox
								.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
					}
					else
					{
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Uçak Yok");
						arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
						{ "UÇAK BULUNAMADI" }));

					}
					break;
				case 2:
					aracNumarasIntegers.clear();
					if (companies.get(secilenSirketIndis).train != null
							&& companies.get(secilenSirketIndis).train.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
						{
							aracNumarasIntegers.add(companies.get(secilenSirketIndis).train.get(i).aracNumarasi);
						}
						System.out.println("Tren Seçildi " + aracNumarasIntegers);
						arac_sil_aracNumarasi_comboBox
								.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
					}
					else
					{
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Treni Yok");
						arac_sil_aracNumarasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
						{ "TREN BULUNAMADI" }));

					}

					break;
				default:
					System.out.println("HATA");
					break;
				}

			}
		});

		arac_sil_tasitTuruSec_button.setBounds(305, 595, 101, 31);
		contentPane.add(arac_sil_tasitTuruSec_button);

		txtAraTr_1 = new JTextField();
		txtAraTr_1.setText("ARAÇ TÜRÜ");
		txtAraTr_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraTr_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraTr_1.setEditable(false);
		txtAraTr_1.setColumns(10);
		txtAraTr_1.setBackground(UIManager.getColor("Button.background"));
		txtAraTr_1.setBounds(477, 189, 310, 31);
		contentPane.add(txtAraTr_1);

		textField_1 = new JTextField();
		textField_1.setText("ARAÇ NUMARASI");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(UIManager.getColor("Button.background"));
		textField_1.setBounds(477, 274, 310, 31);
		contentPane.add(textField_1);

		txtRotaNumarasi = new JTextField();
		txtRotaNumarasi.setText("ROTA NUMARASI");
		txtRotaNumarasi.setHorizontalAlignment(SwingConstants.CENTER);
		txtRotaNumarasi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtRotaNumarasi.setEditable(false);
		txtRotaNumarasi.setColumns(10);
		txtRotaNumarasi.setBackground(UIManager.getColor("Button.background"));
		txtRotaNumarasi.setBounds(477, 358, 310, 31);
		contentPane.add(txtRotaNumarasi);

		txtSeferEkle = new JTextField();
		txtSeferEkle.setText("SEFER  EKLE/GÜNCELLE");
		txtSeferEkle.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeferEkle.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSeferEkle.setEditable(false);
		txtSeferEkle.setColumns(10);
		txtSeferEkle.setBackground(UIManager.getColor("Button.background"));
		txtSeferEkle.setBounds(477, 138, 310, 35);
		contentPane.add(txtSeferEkle);

		txtAraTr_2 = new JTextField();
		txtAraTr_2.setText("ARAÇ TÜRÜ");
		txtAraTr_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtAraTr_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtAraTr_2.setEditable(false);
		txtAraTr_2.setColumns(10);
		txtAraTr_2.setBackground(UIManager.getColor("Button.background"));
		txtAraTr_2.setBounds(477, 608, 310, 31);
		contentPane.add(txtAraTr_2);

		txtSeferNumarasi = new JTextField();
		txtSeferNumarasi.setText("SEFER BİLGİLERİ");
		txtSeferNumarasi.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeferNumarasi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSeferNumarasi.setEditable(false);
		txtSeferNumarasi.setColumns(10);
		txtSeferNumarasi.setBackground(UIManager.getColor("Button.background"));
		txtSeferNumarasi.setBounds(477, 693, 310, 31);
		contentPane.add(txtSeferNumarasi);

		arac_sil_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				int aracTuru = arac_sil_tasitTuru_comboBox.getSelectedIndex();
				int secilenAracNumarasi = -1;
				try
				{
					secilenAracNumarasi = (int) arac_sil_aracNumarasi_comboBox.getSelectedItem();
				}
				catch (Exception e2)
				{
					System.out.println("Hatalı Seçim");
				}

				String aracTuruString = "HATA";
				switch (aracTuru)
				{
				case 0:
					// otobüs
					aracTuruString = "Otobüs";
					if (secilenAracNumarasi != -1)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
						{
							if (companies.get(secilenSirketIndis).bus.get(i).aracNumarasi == secilenAracNumarasi)
							{
								companies.get(secilenSirketIndis).bus.remove(i);

								break;
							}

						}
						aracNumarasIntegers.clear();
						if (companies.get(secilenSirketIndis).bus != null)
						{
							for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
							{
								aracNumarasIntegers.add(companies.get(secilenSirketIndis).bus.get(i).aracNumarasi);
							}
							arac_sil_aracNumarasi_comboBox
									.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
						}

					}

					break;
				case 1:
					// uçak
					if (secilenAracNumarasi != -1)
					{
						aracTuruString = "Uçak";
						for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
						{
							if (companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi == secilenAracNumarasi)
							{
								companies.get(secilenSirketIndis).airplane.remove(i);

								break;
							}

						}
						aracNumarasIntegers.clear();
						if (companies.get(secilenSirketIndis).airplane != null)
						{
							for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
							{
								aracNumarasIntegers.add(companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi);
							}
							arac_sil_aracNumarasi_comboBox
									.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
						}
					}
					break;
				case 2:
					// tren
					if (secilenAracNumarasi != -1)
					{
						aracTuruString = "Tren";
						for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
						{
							if (companies.get(secilenSirketIndis).train.get(i).aracNumarasi == secilenAracNumarasi)
							{
								companies.get(secilenSirketIndis).train.remove(i);

								break;
							}

						}
						aracNumarasIntegers.clear();
						if (companies.get(secilenSirketIndis).train != null)
						{
							for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
							{
								aracNumarasIntegers.add(companies.get(secilenSirketIndis).train.get(i).aracNumarasi);
							}
							arac_sil_aracNumarasi_comboBox
									.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
						}
					}
					break;

				default:
					break;
				}

				System.out.println("Silinen " + aracTuruString + " Numarasi " + secilenAracNumarasi);
			}

		});

		JComboBox sefer_ekle_tasitTuru_comboBox = new JComboBox();
		sefer_ekle_tasitTuru_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "OTOBÜS", "UÇAK", "TREN" }));
		sefer_ekle_tasitTuru_comboBox.setMaximumRowCount(3);
		sefer_ekle_tasitTuru_comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		sefer_ekle_tasitTuru_comboBox.setBounds(477, 232, 199, 31);
		contentPane.add(sefer_ekle_tasitTuru_comboBox);

		JComboBox sefer_ekle_aracNumarasi_comboBox_1 = new JComboBox();
		sefer_ekle_aracNumarasi_comboBox_1.setMaximumRowCount(10);
		sefer_ekle_aracNumarasi_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		sefer_ekle_aracNumarasi_comboBox_1.setBounds(477, 316, 310, 31);
		sefer_ekle_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel<>(new String[]
		{ "GÜNCELLE BUTONUNA BASINIZ" }));
		contentPane.add(sefer_ekle_aracNumarasi_comboBox_1);

		JComboBox sefer_ekle_rotaNumarasi = new JComboBox();
		sefer_ekle_rotaNumarasi.setBounds(477, 400, 310, 31);
		sefer_ekle_rotaNumarasi.setModel(new DefaultComboBoxModel<>(new String[]
		{ "GÜNCELLE BUTONUNA BASINIZ" }));
		contentPane.add(sefer_ekle_rotaNumarasi);

		JComboBox sefer_ekle_gün_comboBox = new JComboBox();
		sefer_ekle_gün_comboBox.setModel(new DefaultComboBoxModel(new Integer[]
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
				30 }));
		sefer_ekle_gün_comboBox.setBounds(477, 483, 100, 31);
		contentPane.add(sefer_ekle_gün_comboBox);

		JComboBox sefer_ekle_ay_comboBox = new JComboBox();
		sefer_ekle_ay_comboBox.setModel(new DefaultComboBoxModel(new Integer[]
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12 }));
		sefer_ekle_ay_comboBox.setBounds(581, 483, 100, 31);
		contentPane.add(sefer_ekle_ay_comboBox);

		JComboBox sefer_ekle_yıl_comboBox = new JComboBox();
		sefer_ekle_yıl_comboBox.setModel(new DefaultComboBoxModel(new Integer[]
		{ 2023, 2024 }));
		sefer_ekle_yıl_comboBox.setBounds(687, 483, 100, 31);
		contentPane.add(sefer_ekle_yıl_comboBox);
		
		JComboBox sefer_sil_aracNumarasi_comboBox_1 = new JComboBox();
		sefer_sil_aracNumarasi_comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
		{ "GÜNCELLEYE BASINIZ" }));
		sefer_sil_aracNumarasi_comboBox_1.setBounds(477, 736, 310, 31);
		contentPane.add(sefer_sil_aracNumarasi_comboBox_1);

		JButton sefer_ekle_button = new JButton("EKLE");
		sefer_ekle_button.setFont(new Font("Tahoma", Font.BOLD, 15));
		sefer_ekle_button.setBounds(581, 529, 89, 23);
		sefer_ekle_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int aracNo = -1;
				int guzergahNo = -1;
				int aracTuru = sefer_ekle_tasitTuru_comboBox.getSelectedIndex();
				try
				{
					aracNo = (int) sefer_ekle_aracNumarasi_comboBox_1.getSelectedItem();
					guzergahNo = (int) sefer_ekle_rotaNumarasi.getSelectedItem();
				}
				catch (Exception e2)
				{
					System.out.println("Hatalı Seçim");
				}

				int gun = (int) sefer_ekle_gün_comboBox.getSelectedItem();
				int ay = (int) sefer_ekle_ay_comboBox.getSelectedItem();
				int yıl = (int) sefer_ekle_yıl_comboBox.getSelectedItem();

				switch (aracTuru)
				{
				case 0:
					int secilenAracİndisBus = -1;

					for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
					{
						if (companies.get(secilenSirketIndis).bus.get(i).aracNumarasi == aracNo)
						{
							secilenAracİndisBus = i;
						}

					}
					if (secilenAracİndisBus != -1)
					{
						companies.get(secilenSirketIndis).bus.get(secilenAracİndisBus).seferTrip.seferYapılacakMı = 1;
						companies.get(secilenSirketIndis).bus.get(secilenAracİndisBus).seferTrip.guzergah = guzergahNo;
						// gün ay yıl
						companies.get(secilenSirketIndis).bus.get(secilenAracİndisBus).seferTrip.SeferTarihi.gün = gun;
						companies.get(secilenSirketIndis).bus.get(secilenAracİndisBus).seferTrip.SeferTarihi.ay = ay;
						companies.get(secilenSirketIndis).bus.get(secilenAracİndisBus).seferTrip.SeferTarihi.yıl = yıl;
						
						System.out.println("Otobüsün numarası= " + aracNo + "güzergah numarası= " + guzergahNo + "Gün= "
								+ gun + "Ay= " + ay + "yıl= " + yıl);

					}

					break;
				case 1:
					int secilenAracİndisAirplane = -1;
					for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
					{
						if (companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi == aracNo)
						{
							secilenAracİndisAirplane = i;
						}
					}
					if (secilenAracİndisAirplane != -1)
					{
						companies.get(secilenSirketIndis).airplane
								.get(secilenAracİndisAirplane).seferTrip.seferYapılacakMı = 1;
						companies.get(secilenSirketIndis).airplane
								.get(secilenAracİndisAirplane).seferTrip.guzergah = (int) sefer_ekle_rotaNumarasi
										.getSelectedItem();
						// gün ay yıl
						companies.get(secilenSirketIndis).airplane
								.get(secilenAracİndisAirplane).seferTrip.SeferTarihi.gün = gun;
						companies.get(secilenSirketIndis).airplane
								.get(secilenAracİndisAirplane).seferTrip.SeferTarihi.ay = ay;
						companies.get(secilenSirketIndis).airplane
								.get(secilenAracİndisAirplane).seferTrip.SeferTarihi.yıl = yıl;
						System.out.println("Trenin numarası= " + aracNo + "güzergah numarası= " + guzergahNo + "Gün= "
								+ gun + "Ay= " + ay + "yıl= " + yıl);
					}

					break;
				case 2:
					int secilenAracİndisTrain = -1;
					for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
					{
						if (companies.get(secilenSirketIndis).train.get(i).aracNumarasi == aracNo)
						{
							secilenAracİndisTrain = i;
						}

					}
					if (secilenAracİndisTrain != -1)
					{
						companies.get(secilenSirketIndis).train
								.get(secilenAracİndisTrain).seferTrip.seferYapılacakMı = 1;
						companies.get(secilenSirketIndis).train
								.get(secilenAracİndisTrain).seferTrip.guzergah = (int) sefer_ekle_rotaNumarasi
										.getSelectedItem();
						// gün ay yıl
						companies.get(secilenSirketIndis).train
								.get(secilenAracİndisTrain).seferTrip.SeferTarihi.gün = gun;
						companies.get(secilenSirketIndis).train
								.get(secilenAracİndisTrain).seferTrip.SeferTarihi.ay = ay;
						companies.get(secilenSirketIndis).train
								.get(secilenAracİndisTrain).seferTrip.SeferTarihi.yıl = yıl;
						System.out.println("Uçağın numarası= " + aracNo + "güzergah numarası= " + guzergahNo + "Gün= "
								+ gun + "Ay= " + ay + "yıl= " + yıl);
					}

					break;
				default:
					break;
				}
				sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "GÜNCELLEYE BASINIZ" }));

			}
		});
		contentPane.add(sefer_ekle_button);

		JComboBox sefer_sil_tasitTuru_comboBox = new JComboBox();
		sefer_sil_tasitTuru_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "OTOBÜS", "UÇAK", "TREN" }));
		sefer_sil_tasitTuru_comboBox.setMaximumRowCount(3);
		sefer_sil_tasitTuru_comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		sefer_sil_tasitTuru_comboBox.setBounds(477, 651, 199, 31);
		contentPane.add(sefer_sil_tasitTuru_comboBox);

		

		JButton sefer_sil_tasitTuruSec_button = new JButton("GÜNCELLE");
		sefer_sil_tasitTuruSec_button.addActionListener(new ActionListener()
		{
			@SuppressWarnings(
			{ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e)
			{
				int sefer_sil_tasitTuruSecilen = -1;
				sefer_sil_tasitTuruSecilen = sefer_sil_tasitTuru_comboBox.getSelectedIndex();

				switch (sefer_sil_tasitTuruSecilen)
				{
				case 0:
					aracNumarasIntegers.clear();
					ArrayList<String> seferBilgileriList = new ArrayList<>();
					if (companies.get(secilenSirketIndis).bus != null
							&& companies.get(secilenSirketIndis).bus.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
						{
							if (companies.get(secilenSirketIndis).bus.get(i).seferTrip.seferYapılacakMı == 1)
							{
								aracNumarasIntegers.add(companies.get(secilenSirketIndis).bus.get(i).aracNumarasi);
								seferBilgileriList.add("Otobüs "
										+ companies.get(secilenSirketIndis).bus.get(i).aracNumarasi + " Güzergah "
										+ companies.get(secilenSirketIndis).bus.get(i).seferTrip.guzergah + " Tarih "
										+ companies.get(secilenSirketIndis).bus.get(i).seferTrip.SeferTarihi.gün + "/"
										+ companies.get(secilenSirketIndis).bus.get(i).seferTrip.SeferTarihi.ay + "/"
										+ companies.get(secilenSirketIndis).bus.get(i).seferTrip.SeferTarihi.yıl);

							}
						}
						if (aracNumarasIntegers.size() != 0)
						{
							sefer_sil_aracNumarasi_comboBox_1
									.setModel(new DefaultComboBoxModel<>(seferBilgileriList.toArray(new String[0])));
						}
						else
						{
							System.out
									.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin seferi Yok");
							sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
							{ "SEFER BULUNAMADI" }));
						}
					}
					else
					{
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin seferi Yok");
						sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "SEFER BULUNAMADI" }));

					}
					break;
				case 1:
					aracNumarasIntegers.clear();
					ArrayList<String> seferBilgileriList1 = new ArrayList<>();

					if (companies.get(secilenSirketIndis).airplane != null
							&& companies.get(secilenSirketIndis).airplane.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
						{
							if (companies.get(secilenSirketIndis).airplane.get(i).seferTrip.seferYapılacakMı == 1)
							{
								aracNumarasIntegers.add(companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi);
								seferBilgileriList1.add("Uçak "
										+ companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi + " Güzergah "
										+ companies.get(secilenSirketIndis).airplane.get(i).seferTrip.guzergah
										+ " Tarih "
										+ companies.get(secilenSirketIndis).airplane.get(i).seferTrip.SeferTarihi.gün
										+ "/"
										+ companies.get(secilenSirketIndis).airplane.get(i).seferTrip.SeferTarihi.ay
										+ "/"
										+ companies.get(secilenSirketIndis).airplane.get(i).seferTrip.SeferTarihi.yıl);

							}
						}
						if (aracNumarasIntegers.size() != 0)
						{
							sefer_sil_aracNumarasi_comboBox_1
									.setModel(new DefaultComboBoxModel<>(seferBilgileriList1.toArray(new String[0])));
						}
						else
						{
							System.out
									.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin seferi Yok");
							sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
							{ "SEFER BULUNAMADI" }));
						}
					}
					else
					{
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Uçak Yok");
						sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "SEFER BULUNAMADI" }));

					}
					break;
				case 2:
					aracNumarasIntegers.clear();
					ArrayList<String> seferBilgileriList11 = new ArrayList<>();

					if (companies.get(secilenSirketIndis).train != null
							&& companies.get(secilenSirketIndis).train.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
						{
							if (companies.get(secilenSirketIndis).train.get(i).seferTrip.seferYapılacakMı == 1)
							{
								aracNumarasIntegers.add(companies.get(secilenSirketIndis).train.get(i).aracNumarasi);
								seferBilgileriList11.add("Tren "
										+ companies.get(secilenSirketIndis).train.get(i).aracNumarasi + " Güzergah "
										+ companies.get(secilenSirketIndis).train.get(i).seferTrip.guzergah + " Tarih "
										+ companies.get(secilenSirketIndis).train.get(i).seferTrip.SeferTarihi.gün + "/"
										+ companies.get(secilenSirketIndis).train.get(i).seferTrip.SeferTarihi.ay + "/"
										+ companies.get(secilenSirketIndis).train.get(i).seferTrip.SeferTarihi.yıl);

							}
						}
						if (aracNumarasIntegers.size() != 0)
						{
							sefer_sil_aracNumarasi_comboBox_1
									.setModel(new DefaultComboBoxModel<>(seferBilgileriList11.toArray(new String[0])));
						}
						else
						{
							System.out
									.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin seferi Yok");
							sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
							{ "SEFER BULUNAMADI" }));
						}
					}
					else
					{
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Treni Yok");
						sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "SEFER BULUNAMADI" }));

					}

					break;
				default:
					System.out.println("HATA");
					break;
				}

			}
		});

		sefer_sil_tasitTuruSec_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		sefer_sil_tasitTuruSec_button.setBounds(686, 651, 101, 31);
		contentPane.add(sefer_sil_tasitTuruSec_button);

		JButton sefer_sil_button = new JButton("SİL");
		sefer_sil_button.setFont(new Font("Tahoma", Font.BOLD, 15));
		sefer_sil_button.setBounds(581, 786, 89, 23);
		sefer_sil_button.addActionListener(new ActionListener()
		{
			@SuppressWarnings(
			{ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e)
			{
				String aracNoString = (String) sefer_sil_aracNumarasi_comboBox_1.getSelectedItem();
				char[] aracNochar = null;
				try
				{
					aracNochar = aracNoString.toCharArray();
				}
				catch (Exception e2)
				{
					System.out.println("Hatalı Seçim");
				}
				int aracNo =-1;
				int aracTuru = (int) sefer_sil_tasitTuru_comboBox.getSelectedIndex();
				switch (aracTuru)
				{
				case 0:
					aracNo = aracNochar[7] - '0';
					for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
					{
						if (companies.get(secilenSirketIndis).bus.get(i).aracNumarasi == aracNo)
						{
							companies.get(secilenSirketIndis).bus.get(i).seferTrip.seferYapılacakMı = 0;
							sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
							{ "GÜNCELLEYE BASINIZ" }));
						}
					}
					break;
				case 1:
					aracNo = aracNochar[5] - '0';

					for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
					{
						if (companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi == aracNo)
						{
							companies.get(secilenSirketIndis).airplane.get(i).seferTrip.seferYapılacakMı = 0;
							sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
							{ "GÜNCELLEYE BASINIZ" }));
						}
					}

					break;
				case 2:
					aracNo = aracNochar[5] - '0';

					for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
					{
						if (companies.get(secilenSirketIndis).train.get(i).aracNumarasi == aracNo)
						{
							companies.get(secilenSirketIndis).train.get(i).seferTrip.seferYapılacakMı = 0;
							sefer_sil_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
							{ "GÜNCELLEYE BASINIZ" }));
						}
					}

					break;
				default:
					break;
				}

			}
		});
		contentPane.add(sefer_sil_button);
		sefer_ekle_tasitTuruSec_button = new JButton("GÜNCELLE");
		sefer_ekle_tasitTuruSec_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		sefer_ekle_tasitTuruSec_button.setBounds(686, 232, 101, 31);
		sefer_ekle_tasitTuruSec_button.addActionListener(new ActionListener()
		{
			@SuppressWarnings(
			{ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e)
			{
				int sefer_ekle_tasitTuruSecilen = -1;
				sefer_ekle_tasitTuruSecilen = sefer_ekle_tasitTuru_comboBox.getSelectedIndex();

				switch (sefer_ekle_tasitTuruSecilen)
				{
				case 0:
					aracNumarasIntegers.clear();
					if (companies.get(secilenSirketIndis).bus != null
							&& companies.get(secilenSirketIndis).bus.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).bus.size(); i++)
						{
							aracNumarasIntegers.add(companies.get(secilenSirketIndis).bus.get(i).aracNumarasi);
						}
						System.out.println("Otobüs Seçildi " + aracNumarasIntegers);
						sefer_ekle_aracNumarasi_comboBox_1
								.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
						ArrayList<Integer> rotanoArrayList = new ArrayList<>();
						rotanoArrayList.add(trip.guzargahKaraYolu[0][0] - 15);
						rotanoArrayList.add(trip.guzargahKaraYolu[1][0] - 13);
						System.out.println("Otobüs Rot" + rotanoArrayList);
						sefer_ekle_rotaNumarasi
								.setModel(new DefaultComboBoxModel<>(rotanoArrayList.toArray(new Integer[0])));

					}
					else
					{
						sefer_ekle_rotaNumarasi.setModel(new DefaultComboBoxModel<>(new String[]
						{ "OTOBÜS BULUNAMADI" }));

						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Otobüsü Yok");
						sefer_ekle_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "OTOBÜS BULUNAMADI" }));

					}
					break;
				case 1:
					aracNumarasIntegers.clear();
					if (companies.get(secilenSirketIndis).airplane != null
							&& companies.get(secilenSirketIndis).airplane.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).airplane.size(); i++)
						{
							aracNumarasIntegers.add(companies.get(secilenSirketIndis).airplane.get(i).aracNumarasi);
						}
						System.out.println("Uçak Seçildi " + aracNumarasIntegers);
						sefer_ekle_aracNumarasi_comboBox_1
								.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
						ArrayList<Integer> rotanoArrayList = new ArrayList<>();
						rotanoArrayList.add(trip.guzargahHavaYolu[0][0] - 11);
						rotanoArrayList.add(trip.guzargahHavaYolu[1][0] - 9);
						System.out.println("Uçak Rot" + rotanoArrayList);
						sefer_ekle_rotaNumarasi
								.setModel(new DefaultComboBoxModel<>(rotanoArrayList.toArray(new Integer[0])));
					}
					else
					{
						sefer_ekle_rotaNumarasi.setModel(new DefaultComboBoxModel<>(new String[]
						{ "UÇAK BULUNAMADI" }));
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Uçak Yok");
						sefer_ekle_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "UÇAK BULUNAMADI" }));

					}
					break;
				case 2:
					aracNumarasIntegers.clear();
					if (companies.get(secilenSirketIndis).train != null
							&& companies.get(secilenSirketIndis).train.size() != 0)
					{
						for (int i = 0; i < companies.get(secilenSirketIndis).train.size(); i++)
						{
							aracNumarasIntegers.add(companies.get(secilenSirketIndis).train.get(i).aracNumarasi);
						}
						System.out.println("Tren Seçildi " + aracNumarasIntegers);
						sefer_ekle_aracNumarasi_comboBox_1
								.setModel(new DefaultComboBoxModel<>(aracNumarasIntegers.toArray(new Integer[0])));
						ArrayList<Integer> rotanoArrayList = new ArrayList<>();
						rotanoArrayList.add(trip.guzargahDemirYolu[0][0] - 19);
						rotanoArrayList.add(trip.guzargahDemirYolu[1][0] - 17);
						System.out.println("Uçak Rot" + rotanoArrayList);
						sefer_ekle_rotaNumarasi
								.setModel(new DefaultComboBoxModel<>(rotanoArrayList.toArray(new Integer[0])));
					}
					else
					{
						sefer_ekle_rotaNumarasi.setModel(new DefaultComboBoxModel<>(new String[]
						{ "TREN BULUNAMADI" }));
						System.out.println(companies.get(secilenSirketIndis).kullaniciAdi + " Şirketinin Treni Yok");
						sefer_ekle_aracNumarasi_comboBox_1.setModel(new DefaultComboBoxModel(new String[]
						{ "TREN BULUNAMADI" }));

					}

					break;
				default:
					System.out.println("HATA");
					break;
				}

			}
		});

		contentPane.add(sefer_ekle_tasitTuruSec_button);

		txtTarih = new JTextField();
		txtTarih.setText("TARİH");
		txtTarih.setHorizontalAlignment(SwingConstants.CENTER);
		txtTarih.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTarih.setEditable(false);
		txtTarih.setColumns(10);
		txtTarih.setBackground(UIManager.getColor("Button.background"));
		txtTarih.setBounds(477, 441, 310, 31);
		contentPane.add(txtTarih);
		
		txtKarzararHesapla = new JTextField();
		txtKarzararHesapla.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtKarzararHesapla.setHorizontalAlignment(SwingConstants.CENTER);
		txtKarzararHesapla.setText("KAR/ZARAR HESAPLA");
		txtKarzararHesapla.setEditable(false);
		txtKarzararHesapla.setBounds(824, 81, 310, 46);
		contentPane.add(txtKarzararHesapla);
		txtKarzararHesapla.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(824, 138, 310, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Route route=new Route();
		
		
		kar_zarar_hesapla = new JButton("HESAPLA");
		kar_zarar_hesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int km=0;
				int karzarar=0;
				int harcananYakıtÜcreti=0;
				for (Bus bus : companies.get(secilenSirketIndis).bus)
				{
					km=0;
					if(bus.seferTrip.seferYapılacakMı==1) {
						for (int i = 1; i < bus.seferTrip.guzargahKaraYolu[bus.seferTrip.guzergah-3].length-1; i++)
						{
							
							km+=route.matrisKarayoluKm[bus.seferTrip.guzargahKaraYolu[bus.seferTrip.guzergah-3][i]][bus.seferTrip.guzargahKaraYolu[bus.seferTrip.guzergah-3][i+1]]; 
						}
						karzarar-=km*companies.get(secilenSirketIndis).yakits.get(0).kilometreÜcreti;
						for (Personel personel : bus.sofor)
						{
							karzarar-=personel.ücret;
						}
						for (Personel personel : bus.yardimciPersonel)
						{
							karzarar-=personel.ücret;
						}
						switch (bus.koltukSayisi)
						{
						case 15:
							for (Map.Entry<Integer, Integer> entry : bus.onbes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.onbes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : bus.onbes2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.onbes2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							

							break;
						case 20:
							for (Map.Entry<Integer, Integer> entry : bus.yirmi1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.yirmi1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : bus.yirmi2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.yirmi2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}

							break;
						case 25:
							for (Map.Entry<Integer, Integer> entry : bus.yirmiBes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.yirmiBes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : bus.yirmiBes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.yirmiBes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							break;
						case 30:
							for (Map.Entry<Integer, Integer> entry : bus.otuz1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.otuz1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : bus.otuz2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=bus.otuz2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}

							break;

						default:
							break;
						}
						
						
					}
					System.out.println(bus.aracNumarasi+" "+km+"Kar Zarar"+karzarar);
				}
				for (Train train : companies.get(secilenSirketIndis).train)
				{
					km=0;
					if(train.seferTrip.seferYapılacakMı==1) {
						for (int i = 1; i < train.seferTrip.guzargahDemirYolu[train.seferTrip.guzergah-1].length-1; i++)
						{
							
							km+=route.matrisDemiryoluKm[train.seferTrip.guzargahDemirYolu[train.seferTrip.guzergah-1][i]][train.seferTrip.guzargahDemirYolu[train.seferTrip.guzergah-1][i+1]]; 
						}
						karzarar-=km*companies.get(secilenSirketIndis).yakits.get(0).kilometreÜcreti;
						for (Personel personel : train.sofor)
						{
							karzarar-=personel.ücret;
						}
						for (Personel personel : train.yardimciPersonel)
						{
							karzarar-=personel.ücret;
						}
						switch (train.koltukSayisi)
						{
						case 15:
							for (Map.Entry<Integer, Integer> entry : train.onbes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.onbes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : train.onbes2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.onbes2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							

							break;
						case 20:
							for (Map.Entry<Integer, Integer> entry : train.yirmi1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.yirmi1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : train.yirmi2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.yirmi2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}

							break;
						case 25:
							for (Map.Entry<Integer, Integer> entry : train.yirmiBes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.yirmiBes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : train.yirmiBes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.yirmiBes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							break;
						case 30:
							for (Map.Entry<Integer, Integer> entry : train.otuz1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=300;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.otuz1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : train.otuz2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=400;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=train.otuz2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}

							break;

						default:
							break;
						}
						
						
					}
					System.out.println(train.aracNumarasi+" "+km+"Kar Zarar"+karzarar);
				}
				for (Airplane airplane : companies.get(secilenSirketIndis).airplane)
				{
					km=0;
					if(airplane.seferTrip.seferYapılacakMı==1) {
						for (int i = 1; i < airplane.seferTrip.guzargahHavaYolu[airplane.seferTrip.guzergah-5].length-1; i++)
						{
							
							km+=route.matrisHavayoluKm[airplane.seferTrip.guzargahHavaYolu[airplane.seferTrip.guzergah-5][i]][airplane.seferTrip.guzargahDemirYolu[airplane.seferTrip.guzergah-5][i+1]]; 
						}
						karzarar-=km*companies.get(secilenSirketIndis).yakits.get(0).kilometreÜcreti;
						for (Personel personel : airplane.sofor)
						{
							karzarar-=personel.ücret;
						}
						for (Personel personel : airplane.yardimciPersonel)
						{
							karzarar-=personel.ücret;
						}
						switch (airplane.koltukSayisi)
						{
						case 15:
							for (Map.Entry<Integer, Integer> entry : airplane.onbes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.onbes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : airplane.onbes2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.onbes2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							

							break;
						case 20:
							for (Map.Entry<Integer, Integer> entry : airplane.yirmi1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.yirmi1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : airplane.yirmi2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.yirmi2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}

							break;
						case 25:
							for (Map.Entry<Integer, Integer> entry : airplane.yirmiBes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.yirmiBes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : airplane.yirmiBes1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.yirmiBes1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							break;
						case 30:
							for (Map.Entry<Integer, Integer> entry : airplane.otuz1.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.otuz1.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}
							for (Map.Entry<Integer, Integer> entry : airplane.otuz2.koltuk.entrySet())
							{
								
								if (entry.getValue()==1)
								{
									karzarar+=1200;
									
									
								}
								if (entry.getValue()==2)
								{
									
									Passenger passenger=airplane.otuz2.yolcular.get(entry.getKey());
									karzarar+=passenger.getÜcret();
								}
							}

							break;

						default:
							break;
						}
						
						
					}
					System.out.println(airplane.aracNumarasi+" "+km+"Kar Zarar"+karzarar);
				}
				karzarar-=adminErisim.sistemHizmetBedeli*7;
				textField.setText(""+karzarar);
				
			}
		});
		kar_zarar_hesapla.setBounds(933, 184, 89, 23);
		
		contentPane.add(kar_zarar_hesapla);
		anaEkranButton = new JButton("ANA EKRAN");
		anaEkranButton.setBackground(new Color(0, 255, 255));
		anaEkranButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				girisEkrani girisEkrani = new girisEkrani(companies);
				girisEkrani.setVisible(true);
				setVisible(false);

			}
		});
		anaEkranButton.setBounds(10, 11, 117, 46);
		contentPane.add(anaEkranButton);

	}
}
