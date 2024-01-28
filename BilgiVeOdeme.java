package PROLAB2;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.TableView.TableCell;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BilgiVeOdeme extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtYolcuBilgileri;
	private JTextField txtAd;
	private JTextField txtSoyad;
	private JTextField ad_bosluk;
	private JTextField soyad_bosluk;
	private JTextField txtTc;
	private JTextField txtDoumTarihi;
	private JTextField tc_bosluk;
	private JTextField txtKoltukNo;

	public BilgiVeOdeme(ArrayList<Company> companies, int companyIndes, int aracTuru, int aracNo, int aracYon,
			int kalkis, int varis,int bilet_Ücreti)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ArrayList<Integer> koltukNo = new ArrayList<>();
		switch (aracTuru)
		{
		case 0:
			int secileOtobusIndıs = -1;
			for (int i = 0; i < companies.get(companyIndes).bus.size(); i++)
			{
				if (companies.get(companyIndes).bus.get(i).aracNumarasi == aracNo)
				{
					secileOtobusIndıs = i;
					break;
				}

			}

			switch (companies.get(companyIndes).bus.get(secileOtobusIndıs).koltukSayisi)
			{
			case 15:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).onbes1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).onbes2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 20:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).yirmi1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).yirmi2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 25:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).yirmiBes1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).yirmiBes2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 30:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).otuz1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).bus
							.get(secileOtobusIndıs).otuz2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;

			default:
				break;
			}

			break;
		case 1:
			int secileTrenIndıs = -1;
			for (int i = 0; i < companies.get(companyIndes).train.size(); i++)
			{
				if (companies.get(companyIndes).train.get(i).aracNumarasi == aracNo)
				{
					secileTrenIndıs = i;
				}

			}
			switch (companies.get(companyIndes).train.get(secileTrenIndıs).koltukSayisi)
			{
			case 15:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).onbes1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).onbes2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 20:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).yirmi1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).yirmi2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 25:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).yirmiBes1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).yirmiBes2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 30:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).otuz1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).train
							.get(secileTrenIndıs).otuz2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;

			default:
				break;
			}

			break;
		case 2:
			int secileUçakIndıs = -1;
			for (int i = 0; i < companies.get(companyIndes).airplane.size(); i++)
			{
				if (companies.get(companyIndes).airplane.get(i).aracNumarasi == aracNo)
				{
					secileUçakIndıs = i;
				}
			}
			switch (companies.get(companyIndes).airplane.get(secileUçakIndıs).koltukSayisi)
			{
			case 15:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).onbes1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).onbes2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 20:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).yirmi1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).yirmi2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 25:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).yirmiBes1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).yirmiBes2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;
			case 30:
				if (aracYon == 1)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).otuz1.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}
				else if (aracYon == 2)
				{
					for (Map.Entry<Integer, Integer> entry : companies.get(companyIndes).airplane
							.get(secileUçakIndıs).otuz2.koltuk.entrySet())
					{
						if (entry.getValue() == 2)
						{
							System.out.println(entry.getKey());
							koltukNo.add(entry.getKey());
						}

					}
				}

				break;

			default:
				break;
			}
			break;

		default:
			break;
		}

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtYolcuBilgileri = new JTextField();
		txtYolcuBilgileri.setEditable(false);
		txtYolcuBilgileri.setHorizontalAlignment(SwingConstants.CENTER);
		txtYolcuBilgileri.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtYolcuBilgileri.setText("YOLCU BİLGİLERİ");
		txtYolcuBilgileri.setBounds(436, 156, 359, 36);
		contentPane.add(txtYolcuBilgileri);
		txtYolcuBilgileri.setColumns(10);

		txtAd = new JTextField();
		txtAd.setEditable(false);
		txtAd.setHorizontalAlignment(SwingConstants.CENTER);
		txtAd.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtAd.setText("AD");
		txtAd.setBounds(436, 203, 122, 36);
		contentPane.add(txtAd);
		txtAd.setColumns(10);

		txtSoyad = new JTextField();
		txtSoyad.setEditable(false);
		txtSoyad.setText("SOYAD");
		txtSoyad.setHorizontalAlignment(SwingConstants.CENTER);
		txtSoyad.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSoyad.setColumns(10);
		txtSoyad.setBounds(436, 250, 122, 36);
		contentPane.add(txtSoyad);

		ad_bosluk = new JTextField();
		ad_bosluk.setHorizontalAlignment(SwingConstants.CENTER);
		ad_bosluk.setFont(new Font("Tahoma", Font.BOLD, 13));
		ad_bosluk.setColumns(10);
		ad_bosluk.setBounds(568, 203, 227, 36);
		contentPane.add(ad_bosluk);

		soyad_bosluk = new JTextField();
		soyad_bosluk.setHorizontalAlignment(SwingConstants.CENTER);
		soyad_bosluk.setFont(new Font("Tahoma", Font.BOLD, 13));
		soyad_bosluk.setColumns(10);
		soyad_bosluk.setBounds(568, 250, 227, 36);
		contentPane.add(soyad_bosluk);

		txtTc = new JTextField();
		txtTc.setText("TC");
		txtTc.setHorizontalAlignment(SwingConstants.CENTER);
		txtTc.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTc.setEditable(false);
		txtTc.setColumns(10);
		txtTc.setBounds(436, 297, 122, 36);
		contentPane.add(txtTc);

		txtDoumTarihi = new JTextField();
		txtDoumTarihi.setText("DOĞUM TARİHİ");
		txtDoumTarihi.setHorizontalAlignment(SwingConstants.CENTER);
		txtDoumTarihi.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDoumTarihi.setEditable(false);
		txtDoumTarihi.setColumns(10);
		txtDoumTarihi.setBounds(436, 344, 122, 36);
		contentPane.add(txtDoumTarihi);

		tc_bosluk = new JTextField();
		tc_bosluk.setHorizontalAlignment(SwingConstants.CENTER);
		tc_bosluk.setFont(new Font("Tahoma", Font.BOLD, 13));
		tc_bosluk.setColumns(10);
		tc_bosluk.setBounds(568, 297, 227, 36);
		contentPane.add(tc_bosluk);

		txtKoltukNo = new JTextField();
		txtKoltukNo.setText("KOLTUK NO");
		txtKoltukNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtKoltukNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtKoltukNo.setEditable(false);
		txtKoltukNo.setColumns(10);
		txtKoltukNo.setBounds(436, 102, 359, 36);
		contentPane.add(txtKoltukNo);

		JComboBox gün_comboBox = new JComboBox();
		gün_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				"21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
		gün_comboBox.setBounds(568, 345, 42, 36);
		contentPane.add(gün_comboBox);

		JComboBox ay_comboBox = new JComboBox();
		ay_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
		ay_comboBox.setBounds(620, 344, 68, 36);
		contentPane.add(ay_comboBox);

		JComboBox yıl_comboBox = new JComboBox();
		yıl_comboBox.setModel(new DefaultComboBoxModel(new String[]
		{ "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962",
				"1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975",
				"1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988",
				"1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001",
				"2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
				"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
		yıl_comboBox.setBounds(698, 344, 97, 36);
		contentPane.add(yıl_comboBox);

		JButton sonraki = new JButton("SONRAKİ KİŞİYE GEÇ");
		sonraki.setFont(new Font("Tahoma", Font.BOLD, 15));
		sonraki.setBounds(436, 391, 359, 36);

		System.out.println(koltukNo);

		txtKoltukNo.setText("KOLTUK NO:" + koltukNo.get(0));

		sonraki.addActionListener(new ActionListener()
		{
			int biletIndis = 0;
			
			public void actionPerformed(ActionEvent e)
			{
				
				
				if (biletIndis < koltukNo.size())
				{
					System.out.println("KOLTUK SİZE"+koltukNo.size())		;
					int tc = 0;
					try
					{
						tc = Integer.parseInt(tc_bosluk.getText());
					}
					catch (Exception e2)
					{
						System.out.println("TC 10 HANELİ OLMALIDIR");
					}
					Passenger passenger = new Passenger(ad_bosluk.getText(), soyad_bosluk.getText(), tc,
							((String) gün_comboBox.getSelectedItem() + "/" + (String) ay_comboBox.getSelectedItem()
									+ "/" + (String) yıl_comboBox.getSelectedItem()));
					passenger.setÜcret(bilet_Ücreti);
					switch (aracTuru)
					{
					case 0:
						int secileOtobusIndıs = -1;
						for (int i = 0; i < companies.get(companyIndes).bus.size(); i++)
						{
							if (companies.get(companyIndes).bus.get(i).aracNumarasi == aracNo)
							{
								secileOtobusIndıs = i;
								break;
							}

						}

						switch (companies.get(companyIndes).bus.get(secileOtobusIndıs).koltukSayisi)
						{
						case 15:
							if (aracYon == 1)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).onbes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).onbes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 20:
							if (aracYon == 1)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).yirmi1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).yirmi2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 25:
							if (aracYon == 1)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).yirmiBes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).yirmiBes2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 30:
							if (aracYon == 1)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).otuz1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).bus.get(secileOtobusIndıs).otuz2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;

						default:
							break;
						}

						break;
					case 1:
						int secileTrenIndıs = -1;
						for (int i = 0; i < companies.get(companyIndes).train.size(); i++)
						{
							if (companies.get(companyIndes).train.get(i).aracNumarasi == aracNo)
							{
								secileTrenIndıs = i;
							}

						}
						switch (companies.get(companyIndes).train.get(secileTrenIndıs).koltukSayisi)
						{
						case 15:
							if (aracYon == 1)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).onbes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).onbes2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 20:
							if (aracYon == 1)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).yirmi1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).yirmi2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 25:
							if (aracYon == 1)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).yirmiBes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).yirmiBes2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 30:
							if (aracYon == 1)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).otuz1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).train.get(secileTrenIndıs).otuz2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;

						}

						break;
					case 2:
						int secileUçakIndıs = -1;
						for (int i = 0; i < companies.get(companyIndes).airplane.size(); i++)
						{
							if (companies.get(companyIndes).airplane.get(i).aracNumarasi == aracNo)
							{
								secileUçakIndıs = i;
							}
						}
						switch (companies.get(companyIndes).airplane.get(secileUçakIndıs).koltukSayisi)
						{
						case 15:
							if (aracYon == 1)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).onbes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).onbes2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}
							break;
						case 20:
							if (aracYon == 1)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).yirmi1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).yirmi2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}
							break;
						case 25:
							if (aracYon == 1)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).yirmiBes1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).yirmiBes2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}

							break;
						case 30:
							if (aracYon == 1)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).otuz1.yolcular
										.put(koltukNo.get(biletIndis), passenger);
							}
							else if (aracYon == 2)
							{
								companies.get(companyIndes).airplane.get(secileUçakIndıs).otuz2.yolcular
										.put(koltukNo.get(biletIndis), passenger);

							}
						}
						break;

					}
				
					if(biletIndis==koltukNo.size()-2) {
						sonraki.setText("ÖDEME YAP");
					}
					biletIndis++;
					if (biletIndis!=koltukNo.size())
					{
						txtKoltukNo.setText("KOLTUK NO:" + koltukNo.get(biletIndis));

					}
					
				}
				if(biletIndis==koltukNo.size()) {
					txtKoltukNo.setText("ÖDEME YAP");
					ODEME odeme=new ODEME(koltukNo.size(),bilet_Ücreti,companies);
					odeme.setVisible(true);
					setVisible(false);
				}
				

			}
			
		});
		contentPane.add(sonraki);

	}
}
