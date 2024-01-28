package PROLAB2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton;

public class BiletAra extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKalkiNoktasi;
	private JTextField txtVariNoktasi;
	private JTextField txtTarih;
	private JTextField txtUlaimTipi;
	private JTextField txtAralikPazartesi;
	private JTextField txtAralikSali;
	private JTextField txtAralikaramba;
	private JTextField txtAralikPerembe;
	private JTextField txtAralikCuma;
	private JTextField txtAralikCumartesi;
	private JTextField txtAralikPazar;
	private JTextField ücret;

	public BiletAra(ArrayList<Company> companies)
	{
		Trip trip=new Trip();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(40, 400, 1100, 450);
		contentPane.add(layeredPane);

		txtKalkiNoktasi = new JTextField();
		txtKalkiNoktasi.setEditable(false);
		txtKalkiNoktasi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKalkiNoktasi.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtKalkiNoktasi.setText("KALKIŞ NOKTASI");
		txtKalkiNoktasi.setBounds(450, 45, 300, 31);
		contentPane.add(txtKalkiNoktasi);
		txtKalkiNoktasi.setColumns(10);

		JComboBox kalkis_noktasi_comboBox = new JComboBox();
		kalkis_noktasi_comboBox.setBounds(450, 87, 300, 29);
		contentPane.add(kalkis_noktasi_comboBox);

		txtVariNoktasi = new JTextField();
		txtVariNoktasi.setEditable(false);
		txtVariNoktasi.setText("VARIŞ NOKTASI");
		txtVariNoktasi.setHorizontalAlignment(SwingConstants.CENTER);
		txtVariNoktasi.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtVariNoktasi.setColumns(10);
		txtVariNoktasi.setBounds(825, 45, 300, 31);
		contentPane.add(txtVariNoktasi);

		JComboBox varis_noktasi_comboBox = new JComboBox();
		varis_noktasi_comboBox.setBounds(825, 87, 300, 29);
		contentPane.add(varis_noktasi_comboBox);

		txtTarih = new JTextField();
		txtTarih.setEditable(false);
		txtTarih.setText("TARİH");
		txtTarih.setHorizontalAlignment(SwingConstants.CENTER);
		txtTarih.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtTarih.setColumns(10);
		txtTarih.setBounds(10, 163, 1160, 31);
		contentPane.add(txtTarih);

		txtAralikPazartesi = new JTextField();
		txtAralikPazartesi.setText("4 ARALIK PAZARTESİ");
		txtAralikPazartesi.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikPazartesi.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikPazartesi.setEditable(false);
		txtAralikPazartesi.setColumns(10);
		txtAralikPazartesi.setBounds(10, 217, 140, 31);
		contentPane.add(txtAralikPazartesi);

		JComboBox Aralık_4_ComboBox = new JComboBox();
		Aralık_4_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_4_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_4_ComboBox.setBounds(10, 259, 140, 29);
		contentPane.add(Aralık_4_ComboBox);

		txtAralikSali = new JTextField();
		txtAralikSali.setText("5 ARALIK SALI");
		txtAralikSali.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikSali.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikSali.setEditable(false);
		txtAralikSali.setColumns(10);
		txtAralikSali.setBounds(180, 217, 140, 31);
		contentPane.add(txtAralikSali);

		JComboBox Aralık_5_ComboBox = new JComboBox();
		Aralık_5_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_5_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_5_ComboBox.setBounds(180, 259, 140, 29);
		contentPane.add(Aralık_5_ComboBox);

		txtAralikaramba = new JTextField();
		txtAralikaramba.setText("6 ARALIK ÇARŞAMBA");
		txtAralikaramba.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikaramba.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikaramba.setEditable(false);
		txtAralikaramba.setColumns(10);
		txtAralikaramba.setBounds(350, 217, 140, 31);
		contentPane.add(txtAralikaramba);

		JComboBox Aralık_6_ComboBox = new JComboBox();
		Aralık_6_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_6_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_6_ComboBox.setBounds(350, 259, 140, 29);
		contentPane.add(Aralık_6_ComboBox);

		txtAralikPerembe = new JTextField();
		txtAralikPerembe.setText("7 ARALIK PERŞEMBE");
		txtAralikPerembe.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikPerembe.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikPerembe.setEditable(false);
		txtAralikPerembe.setColumns(10);
		txtAralikPerembe.setBounds(520, 217, 140, 31);
		contentPane.add(txtAralikPerembe);

		JComboBox Aralık_7_ComboBox = new JComboBox();
		Aralık_7_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_7_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_7_ComboBox.setBounds(520, 259, 140, 29);
		contentPane.add(Aralık_7_ComboBox);

		txtAralikCuma = new JTextField();
		txtAralikCuma.setText("8 ARALIK CUMA");
		txtAralikCuma.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikCuma.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikCuma.setEditable(false);
		txtAralikCuma.setColumns(10);
		txtAralikCuma.setBounds(690, 217, 140, 31);
		contentPane.add(txtAralikCuma);

		JComboBox Aralık_8_ComboBox = new JComboBox();
		Aralık_8_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_8_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_8_ComboBox.setBounds(690, 259, 140, 29);
		contentPane.add(Aralık_8_ComboBox);

		txtAralikCumartesi = new JTextField();
		txtAralikCumartesi.setText("9 ARALIK CUMARTESİ");
		txtAralikCumartesi.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikCumartesi.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikCumartesi.setEditable(false);
		txtAralikCumartesi.setColumns(10);
		txtAralikCumartesi.setBounds(860, 217, 140, 31);
		contentPane.add(txtAralikCumartesi);

		JComboBox Aralık_9_ComboBox = new JComboBox();
		Aralık_9_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_9_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_9_ComboBox.setBounds(860, 259, 140, 29);
		contentPane.add(Aralık_9_ComboBox);

		txtAralikPazar = new JTextField();
		txtAralikPazar.setText("10 ARALIK PAZAR");
		txtAralikPazar.setHorizontalAlignment(SwingConstants.CENTER);
		txtAralikPazar.setFont(new Font("Tahoma", Font.BOLD, 10));
		txtAralikPazar.setEditable(false);
		txtAralikPazar.setColumns(10);
		txtAralikPazar.setBounds(1030, 217, 140, 31);
		contentPane.add(txtAralikPazar);

		JComboBox Aralık_10_ComboBox = new JComboBox();
		Aralık_10_ComboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "SEFER BUL" }));
		Aralık_10_ComboBox.setFont(new Font("Tahoma", Font.BOLD, 10));
		Aralık_10_ComboBox.setBounds(1030, 259, 140, 29);
		contentPane.add(Aralık_10_ComboBox);

		txtUlaimTipi = new JTextField();
		txtUlaimTipi.setEditable(false);
		txtUlaimTipi.setText("ULAŞIM TİPİ");
		txtUlaimTipi.setHorizontalAlignment(SwingConstants.CENTER);
		txtUlaimTipi.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtUlaimTipi.setColumns(10);
		txtUlaimTipi.setBounds(75, 45, 300, 31);
		contentPane.add(txtUlaimTipi);

		JComboBox ulasim_tipi_sec_comboBox = new JComboBox();
		ulasim_tipi_sec_comboBox.setMaximumRowCount(3);
		ulasim_tipi_sec_comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		ulasim_tipi_sec_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "KARAYOLU", "DEMİRYOLU", "HAVAYOLU" }));
		ulasim_tipi_sec_comboBox.setBounds(75, 87, 300, 29);
		contentPane.add(ulasim_tipi_sec_comboBox);

		JButton noktaları_getir_button = new JButton("GETİR");
		noktaları_getir_button.setFont(new Font("Tahoma", Font.BOLD, 15));
		noktaları_getir_button.setBounds(175, 120, 100, 23);
		noktaları_getir_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int aracTuru = (int) ulasim_tipi_sec_comboBox.getSelectedIndex();
				layeredPane.removeAll();
				switch (aracTuru)
				{
				case 0:// karayolu
					kalkis_noktasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
					{ "İstanbul", "Kocaeli", "Ankara", "Eskişehir", "Konya" }));
					varis_noktasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
					{ "İstanbul", "Kocaeli", "Ankara", "Eskişehir", "Konya" }));
					break;
				case 1:// demiyolu
					kalkis_noktasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
					{ "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya" }));
					varis_noktasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
					{ "İstanbul", "Kocaeli", "Bilecik", "Ankara", "Eskişehir", "Konya" }));
					break;

				case 2:// havayolu
					kalkis_noktasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
					{ "İstanbul", "Ankara", "Konya" }));
					varis_noktasi_comboBox.setModel(new DefaultComboBoxModel(new String[]
					{ "İstanbul", "Ankara", "Konya" }));
					break;

				default:

					break;
				}

			}
		});

		contentPane.add(noktaları_getir_button);
		ücret = new JTextField();
		ücret.setHorizontalAlignment(SwingConstants.LEFT);
		ücret.setFont(new Font("Tahoma", Font.BOLD, 14));
		ücret.setEditable(false);
		ücret.setBounds(40, 345, 221, 37);
		contentPane.add(ücret);
		ücret.setColumns(10);
		
		JButton sefer_bul_button = new JButton("BUL");
		sefer_bul_button.setFont(new Font("Tahoma", Font.BOLD, 15));
		sefer_bul_button.setBounds(741, 122, 100, 23);
		sefer_bul_button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				layeredPane.removeAll();
				Aralık_4_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				Aralık_5_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				Aralık_6_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				Aralık_7_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				Aralık_8_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				Aralık_9_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				Aralık_10_ComboBox.setModel(new DefaultComboBoxModel(new String[]
				{ "SEFER BUL" }));
				int aracTuru = (int) ulasim_tipi_sec_comboBox.getSelectedIndex();
				int kalkis = (int) kalkis_noktasi_comboBox.getSelectedIndex() + 1;
				int varis = (int) varis_noktasi_comboBox.getSelectedIndex() + 1;
				
				switch (aracTuru)
				{
				case 0:// karayolu

					ArrayList<String> pazartesiString = new ArrayList<>();
					ArrayList<String> saliString = new ArrayList<>();
					ArrayList<String> carsambaString = new ArrayList<>();
					ArrayList<String> persemeStrings = new ArrayList<>();
					ArrayList<String> cumaString = new ArrayList<>();
					ArrayList<String> cumartesiString = new ArrayList<>();
					ArrayList<String> pazarString = new ArrayList<>();
					ücret.setText("Ücret = "+trip.matrisKarayoluUcret[kalkis][varis]);
					for (Company company : companies)
					{
						for (int i = 0; i < company.bus.size(); i++)
						{
							int guzargah = company.bus.get(i).seferTrip.guzergah - 3;
							int kalkisIndis = -1;
							int varisIndis = -1;
							switch (company.bus.get(i).seferTrip.SeferTarihi.gün)
							{
							case 4:
								pazartesiString.clear();
								pazartesiString.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;
								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 4 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazartesiString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");

									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 4 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazartesiString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_4_ComboBox.setModel(
											new DefaultComboBoxModel<>(pazartesiString.toArray(new String[0])));
									

								}

								break;
							case 5:
								saliString.clear();
								saliString.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 5 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										saliString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 5 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										saliString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_5_ComboBox
											.setModel(new DefaultComboBoxModel<>(saliString.toArray(new String[0])));

								}

								break;
							case 6:
								carsambaString.clear();
								carsambaString.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 6 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										carsambaString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 6 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										carsambaString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_6_ComboBox.setModel(
											new DefaultComboBoxModel<>(carsambaString.toArray(new String[0])));

								}

								break;
							case 7:
								persemeStrings.clear();
								persemeStrings.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 7 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										persemeStrings.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 7 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										persemeStrings.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_7_ComboBox.setModel(
											new DefaultComboBoxModel<>(persemeStrings.toArray(new String[0])));

								}

								break;
							case 8:
								cumaString.clear();
								cumaString.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 8 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumaString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 8 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumaString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_8_ComboBox
											.setModel(new DefaultComboBoxModel<>(cumaString.toArray(new String[0])));

								}

								break;
							case 9:
								cumartesiString.clear();
								cumartesiString.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 9 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumartesiString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 9 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumartesiString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_9_ComboBox.setModel(
											new DefaultComboBoxModel<>(cumartesiString.toArray(new String[0])));

								}

								break;
							case 10:
								pazarString.clear();
								pazarString.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; j++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah].length; k++)
								{
									if (company.bus.get(i).seferTrip.guzargahKaraYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 10 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazarString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "Otobüs "
												+ company.bus.get(i).aracNumarasi + " gün 10 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazarString.add(company.kullaniciAdi + " Firması" + " Otobüs "
												+ company.bus.get(i).aracNumarasi + " 2");

									}
									Aralık_10_ComboBox
											.setModel(new DefaultComboBoxModel<>(pazarString.toArray(new String[0])));

								}

								break;

							default:

							}

						}

					}
					break;
				case 1:// demiyolu

					ArrayList<String> pazartesiStringd = new ArrayList<>();
					ArrayList<String> saliStringd = new ArrayList<>();
					ArrayList<String> carsambaStringd = new ArrayList<>();
					ArrayList<String> persemeStringsd = new ArrayList<>();
					ArrayList<String> cumaStringd = new ArrayList<>();
					ArrayList<String> cumartesiStringd = new ArrayList<>();
					ArrayList<String> pazarStringd = new ArrayList<>();
					ücret.setText("Ücret = "+trip.matrisDemiryoluUcret[kalkis][varis]);
					for (Company company : companies)
					{
						for (int i = 0; i < company.train.size(); i++)
						{
							int guzargah = company.train.get(i).seferTrip.guzergah - 1;
							int kalkisIndis = -1;
							int varisIndis = -1;
							switch (company.train.get(i).seferTrip.SeferTarihi.gün)
							{
							case 4:
								pazartesiStringd.clear();
								pazartesiStringd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;
								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 4 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazartesiStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");

									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 4 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazartesiStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_4_ComboBox.setModel(
											new DefaultComboBoxModel<>(pazartesiStringd.toArray(new String[0])));

								}

								break;
							case 5:
								saliStringd.clear();
								saliStringd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 5 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										saliStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 5 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										saliStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_5_ComboBox
											.setModel(new DefaultComboBoxModel<>(saliStringd.toArray(new String[0])));

								}

								break;
							case 6:
								carsambaStringd.clear();
								carsambaStringd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 6 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										carsambaStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 6 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										carsambaStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_6_ComboBox.setModel(
											new DefaultComboBoxModel<>(carsambaStringd.toArray(new String[0])));

								}

								break;
							case 7:
								persemeStringsd.clear();
								persemeStringsd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 7 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										persemeStringsd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 7 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										persemeStringsd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_7_ComboBox.setModel(
											new DefaultComboBoxModel<>(persemeStringsd.toArray(new String[0])));

								}

								break;
							case 8:
								cumaStringd.clear();
								cumaStringd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 8 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumaStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 8 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumaStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_8_ComboBox
											.setModel(new DefaultComboBoxModel<>(cumaStringd.toArray(new String[0])));

								}

								break;
							case 9:
								cumartesiStringd.clear();
								cumartesiStringd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 9 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumartesiStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 9 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumartesiStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_9_ComboBox.setModel(
											new DefaultComboBoxModel<>(cumartesiStringd.toArray(new String[0])));

								}

								break;
							case 10:
								pazarStringd.clear();
								pazarStringd.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.train
										.get(i).seferTrip.guzargahDemirYolu[guzargah].length; j++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis
										+ 1; k < company.train.get(i).seferTrip.guzargahDemirYolu[guzargah].length; k++)
								{
									if (company.train.get(i).seferTrip.guzargahDemirYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 10 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazarStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "tren "
												+ company.train.get(i).aracNumarasi + " gün 10 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazarStringd.add(company.kullaniciAdi + " Firması" + " tren "
												+ company.train.get(i).aracNumarasi + " 2");

									}
									Aralık_10_ComboBox
											.setModel(new DefaultComboBoxModel<>(pazarStringd.toArray(new String[0])));

								}

								break;

							default:

							}

						}

					}

					break;

				case 2:// havayolu

					ArrayList<String> pazartesiStringh = new ArrayList<>();
					ArrayList<String> saliStringh = new ArrayList<>();
					ArrayList<String> carsambaStringh = new ArrayList<>();
					ArrayList<String> persemeStringh = new ArrayList<>();
					ArrayList<String> cumaStringh = new ArrayList<>();
					ArrayList<String> cumartesiStringh = new ArrayList<>();
					ArrayList<String> pazarStringh = new ArrayList<>();
					ücret.setText("Ücret = "+trip.matrisHavayoluUcret[kalkis][varis]);
					for (Company company : companies)
					{
						for (int i = 0; i < company.airplane.size(); i++)
						{
							int guzargah = company.airplane.get(i).seferTrip.guzergah - 5;
							int kalkisIndis = -1;
							int varisIndis = -1;
							switch (company.airplane.get(i).seferTrip.SeferTarihi.gün)
							{
							case 4:
								pazartesiStringh.clear();
								pazartesiStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;
								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 4 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazartesiStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");

									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 4 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazartesiStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_4_ComboBox.setModel(
											new DefaultComboBoxModel<>(pazartesiStringh.toArray(new String[0])));

								}

								break;
							case 5:
								saliStringh.clear();
								saliStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 5 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										saliStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 5 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										saliStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_5_ComboBox
											.setModel(new DefaultComboBoxModel<>(saliStringh.toArray(new String[0])));

								}

								break;
							case 6:
								carsambaStringh.clear();
								carsambaStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 6 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										carsambaStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 6 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										carsambaStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_6_ComboBox.setModel(
											new DefaultComboBoxModel<>(carsambaStringh.toArray(new String[0])));

								}

								break;
							case 7:
								persemeStringh.clear();
								persemeStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 7 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										persemeStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 7 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										persemeStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_7_ComboBox.setModel(
											new DefaultComboBoxModel<>(persemeStringh.toArray(new String[0])));

								}

								break;
							case 8:
								cumaStringh.clear();
								cumaStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 8 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumaStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 8 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumaStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_8_ComboBox
											.setModel(new DefaultComboBoxModel<>(cumaStringh.toArray(new String[0])));

								}

								break;
							case 9:
								cumartesiStringh.clear();
								cumartesiStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 9 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumartesiStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 9 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										cumartesiStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_9_ComboBox.setModel(
											new DefaultComboBoxModel<>(cumartesiStringh.toArray(new String[0])));

								}

								break;
							case 10:
								pazarStringh.clear();
								pazarStringh.add("SEFER SEÇ");
								kalkisIndis = -1;
								varisIndis = -1;

								for (int j = 1; j < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; j++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][j] == kalkis)
									{
										kalkisIndis = j;
										break;
									}
								}
								for (int k = kalkisIndis + 1; k < company.airplane
										.get(i).seferTrip.guzargahHavaYolu[guzargah].length; k++)
								{
									if (company.airplane.get(i).seferTrip.guzargahHavaYolu[guzargah][k] == varis)
									{
										varisIndis = k;
										break;
									}

								}
								if (kalkisIndis != -1 && varisIndis != -1 && kalkis != varis)
								{
									if (kalkis < varis)
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 10 Gidiş 1");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazarStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 1");
									}
									else
									{
										System.out.println(company.kullaniciAdi + " Firması " + "ucak "
												+ company.airplane.get(i).aracNumarasi + " gün 10 Dönüş 2");
										System.out.println("Kalkis " + kalkis + " Kalkis indis " + kalkisIndis);
										System.out.println("Varis " + varis + " Varis indis " + varisIndis);
										pazarStringh.add(company.kullaniciAdi + " Firması" + " ucak "
												+ company.airplane.get(i).aracNumarasi + " 2");

									}
									Aralık_10_ComboBox
											.setModel(new DefaultComboBoxModel<>(pazarStringh.toArray(new String[0])));

								}

								break;

							default:

							}

						}

					}

					break;

				default:

					break;
				}

			}
		});

		contentPane.add(sefer_bul_button);

		JButton aracı_getir_button_1 = new JButton("GETİR");
		aracı_getir_button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		aracı_getir_button_1.setBounds(550, 299, 100, 23);
		aracı_getir_button_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int aracturu = ulasim_tipi_sec_comboBox.getSelectedIndex();
				int birdenFazlamıKontrol = 0;
				int hangisibir = 0;
				String hangiIndis = new String();
				if (Aralık_4_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 4;
					hangiIndis = (String) Aralık_4_ComboBox.getSelectedItem();
				}
				if (Aralık_5_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 5;
					hangiIndis = (String) Aralık_5_ComboBox.getSelectedItem();
				}
				if (Aralık_6_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 6;
					hangiIndis = (String) Aralık_6_ComboBox.getSelectedItem();
				}
				if (Aralık_7_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 7;
					hangiIndis = (String) Aralık_7_ComboBox.getSelectedItem();
				}
				if (Aralık_8_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 8;
					hangiIndis = (String) Aralık_8_ComboBox.getSelectedItem();
				}
				if (Aralık_9_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 9;
					hangiIndis = (String) Aralık_9_ComboBox.getSelectedItem();
				}
				if (Aralık_10_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 10;
					hangiIndis = (String) Aralık_10_ComboBox.getSelectedItem();
				}
				if (birdenFazlamıKontrol == 1)
				{
					System.out.println(hangisibir + " gün secildi seçilen indis " + hangiIndis);
					char[] hangiIndisChar = hangiIndis.toCharArray();
					String firmaString = Character.toString(hangiIndisChar[0]);
					switch (aracturu)
					{
					case 0:
						int otobüsNO = hangiIndisChar[17] - '0';
						int yön = hangiIndisChar[19] - '0';
						System.out.println("otobüsNO=" + otobüsNO + "Yön" + yön);
						for (int i = 0; i < companies.size(); i++)
						{

							if (companies.get(i).kullaniciAdi.equals(firmaString))
							{
								for (int j = 0; j < companies.get(i).bus.size(); j++)
								{
									if (companies.get(i).bus.get(j).aracNumarasi == otobüsNO)
									{
										switch (companies.get(i).bus.get(j).koltukSayisi)
										{
										case 15:
											if (yön == 1)
											{
												companies.get(i).bus.get(j).onbes1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).onbes1);
											}
											else if (yön == 2)
											{
												companies.get(i).bus.get(j).onbes2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).onbes2);
											}

											break;
										case 20:
											if (yön == 1)
											{
												companies.get(i).bus.get(j).yirmi1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).yirmi1);
											}
											else if (yön == 2)
											{
												companies.get(i).bus.get(j).yirmi2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).yirmi2);
											}

											break;
										case 25:
											if (yön == 1)
											{
												companies.get(i).bus.get(j).yirmiBes1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).yirmiBes1);
											}
											else if (yön == 2)
											{
												companies.get(i).bus.get(j).yirmiBes2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).yirmiBes2);
											}

											break;
										case 30:
											if (yön == 1)
											{
												companies.get(i).bus.get(j).otuz1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).otuz1);
											}
											else if (yön == 2)
											{
												companies.get(i).bus.get(j).otuz2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(companies.get(i).bus.get(j).otuz2);
											}

											break;

										default:
											break;
										}

									}
								}

							}
						}

						break;
					case 1:// tren
						int trenNO = hangiIndisChar[15] - '0';
						int yönd = hangiIndisChar[17] - '0';
						System.out.println("Tren=" + trenNO + "Yön" + yönd);
						for (Company company : companies)
						{
							if (company.kullaniciAdi.equals(firmaString))
							{
								for (Train train : company.train)
								{
									if (train.aracNumarasi == trenNO)
									{
										switch (train.koltukSayisi)
										{
										case 15:
											if (yönd == 1)
											{
												train.onbes1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.onbes1);
											}
											else if (yönd == 2)
											{
												train.onbes2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.onbes2);
											}

											break;
										case 20:
											if (yönd == 1)
											{
												train.yirmi1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.yirmi1);
											}
											else if (yönd == 2)
											{
												train.yirmi2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.yirmi2);
											}

											break;
										case 25:
											if (yönd == 1)
											{
												train.yirmiBes1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.yirmiBes1);
											}
											else if (yönd == 2)
											{
												train.yirmiBes2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.yirmiBes2);
											}

											break;
										case 30:
											if (yönd == 1)
											{
												train.otuz1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.otuz1);
											}
											else if (yönd == 2)
											{
												train.otuz2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(train.otuz2);
											}

											break;

										default:
											break;
										}

									}
								}

							}
						}
						break;

					case 2:// uçak
						int ucakNo = hangiIndisChar[15] - '0';
						int yönh = hangiIndisChar[17] - '0';
						System.out.println("ucakNO=" + ucakNo + "Yön" + yönh);
						for (Company company : companies)
						{
							if (company.kullaniciAdi.equals(firmaString))
							{
								for (Airplane airplane : company.airplane)
								{
									if (airplane.aracNumarasi == ucakNo)
									{
										switch (airplane.koltukSayisi)
										{
										case 15:
											if (yönh == 1)
											{
												airplane.onbes1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.onbes1);
											}
											else if (yönh == 2)
											{
												airplane.onbes2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.onbes2);
											}

											break;
										case 20:
											if (yönh == 1)
											{
												airplane.yirmi1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.yirmi1);
											}
											else if (yönh == 2)
											{
												airplane.yirmi2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.yirmi2);
											}

											break;
										case 25:
											if (yönh == 1)
											{
												airplane.yirmiBes1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.yirmiBes1);
											}
											else if (yönh == 2)
											{
												airplane.yirmiBes2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.yirmiBes2);
											}

											break;
										case 30:
											if (yönh == 1)
											{
												airplane.otuz1.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.otuz1);
											}
											else if (yönh == 2)
											{
												airplane.otuz2.setBounds(100, 25, 1000, 400);
												layeredPane.removeAll();
												layeredPane.add(airplane.otuz2);
											}

											break;

										default:
											break;
										}

									}
								}

							}
						}

						break;
					default:
						break;
					}
				}
				else
				{
					System.out.println("Birden Fazla Sefer Seçildi");
				}

			}
		});

		contentPane.add(aracı_getir_button_1);
		
		JButton btnNewButton = new JButton("ONAYLA VE DEVAM ET");
		btnNewButton.setBounds(903, 352, 237, 37);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int aracTuru = (int) ulasim_tipi_sec_comboBox.getSelectedIndex();
				int kalkis = (int) kalkis_noktasi_comboBox.getSelectedIndex() + 1;
				int varis = (int) varis_noktasi_comboBox.getSelectedIndex() + 1;
				int aracturu = ulasim_tipi_sec_comboBox.getSelectedIndex();
				int birdenFazlamıKontrol = 0;
				int hangisibir = 0;
				String hangiIndis = new String();
				if (Aralık_4_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 4;
					hangiIndis = (String) Aralık_4_ComboBox.getSelectedItem();
				}
				if (Aralık_5_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 5;
					hangiIndis = (String) Aralık_5_ComboBox.getSelectedItem();
				}
				if (Aralık_6_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 6;
					hangiIndis = (String) Aralık_6_ComboBox.getSelectedItem();
				}
				if (Aralık_7_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 7;
					hangiIndis = (String) Aralık_7_ComboBox.getSelectedItem();
				}
				if (Aralık_8_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 8;
					hangiIndis = (String) Aralık_8_ComboBox.getSelectedItem();
				}
				if (Aralık_9_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 9;
					hangiIndis = (String) Aralık_9_ComboBox.getSelectedItem();
				}
				if (Aralık_10_ComboBox.getSelectedIndex() != 0)
				{
					birdenFazlamıKontrol++;
					hangisibir = 10;
					hangiIndis = (String) Aralık_10_ComboBox.getSelectedItem();
				}
				if (birdenFazlamıKontrol == 1)
				{
					System.out.println(hangisibir + " gün secildi seçilen indis " + hangiIndis);
					char[] hangiIndisChar = hangiIndis.toCharArray();
					String firmaString = Character.toString(hangiIndisChar[0]);
					int companyIndes=-1;
					for (int i = 0; i < companies.size(); i++)
					{
						if (companies.get(i).kullaniciAdi.equals(firmaString))
						{
							companyIndes=i;
							break;
						}
						
					}
					switch (aracturu)
					{
					case 0:
						int otobüsNO = hangiIndisChar[17] - '0';
						int yön = hangiIndisChar[19] - '0';
						System.out.println("otobüsNO=" + otobüsNO + "Yön" + yön);
						BilgiVeOdeme bilgiVeOdeme0 =new BilgiVeOdeme(companies,companyIndes,aracTuru,otobüsNO,yön,kalkis,varis,trip.matrisKarayoluUcret[kalkis][varis]);
						bilgiVeOdeme0.setVisible(true);

						break;
					case 1:// tren
						int trenNO = hangiIndisChar[15] - '0';
						int yönd = hangiIndisChar[17] - '0';
						System.out.println("Tren=" + trenNO + "Yön" + yönd);
						BilgiVeOdeme bilgiVeOdeme1 =new BilgiVeOdeme(companies,companyIndes,aracTuru,trenNO,yönd,kalkis,varis,trip.guzargahDemirYolu[kalkis][varis]);
						bilgiVeOdeme1.setVisible(true);
						break;

					case 2:// uçak
						int ucakNo = hangiIndisChar[15] - '0';
						int yönh = hangiIndisChar[17] - '0';
						System.out.println("ucakNO=" + ucakNo + "Yön" + yönh);
						BilgiVeOdeme bilgiVeOdeme2 =new BilgiVeOdeme(companies,companyIndes,aracTuru,ucakNo,yönh,kalkis,varis,trip.matrisHavayoluUcret[kalkis][varis]);
						bilgiVeOdeme2.setVisible(true);

						break;
					default:
						break;
					}
				}
				else
				{
					System.out.println("Birden Fazla Sefer Seçildi");
				}


				
				setVisible(false);
				
			}
		});

	}
}
