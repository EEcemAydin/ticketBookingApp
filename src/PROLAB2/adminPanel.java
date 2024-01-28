package PROLAB2;

import javax.swing.JFrame;
import PROLAB2.*;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.*;
import java.awt.*;

public class adminPanel extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firmaEkleBosluk;
	private JPasswordField firmaSifreBosluk;
	private JTextField txtFirmaEkle;
	private JTextField txtFirmaAdi;
	private JTextField txtFirmaifresi;
	private JTextField txtFirmaSil;
	private JTextField txtFirmaListesi;
	private JButton anaEkranButton;
	private JTextField txtHizmetBedeli;
	private JTextField textField;
	private JButton btnNewButton_1;

	public adminPanel(ArrayList<Company> companies)
	{
		ArrayList<String> firmaKullaniciAdi = new ArrayList<>();
		for (Company company : companies)
		{
			firmaKullaniciAdi.add(company.kullaniciAdi);

		}
		Company tempCompany=new Company()
		{
		};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		setTitle("Admin Panel");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		adminErisim adminErisim = new adminErisim();
		String[] firmalar = new String[firmaKullaniciAdi.size()];
		firmaKullaniciAdi.toArray(firmalar);
		contentPane.setLayout(null);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(731, 495, 275, 40);
		comboBox.setModel(new DefaultComboBoxModel(firmalar));
		contentPane.add(comboBox);

		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Arial", Font.BOLD, 15));
		list.setBackground(new Color(240, 240, 240));
		list.setModel(new AbstractListModel()
		{
			String[] values = firmalar;

			public int getSize()
			{
				return values.length;
			}

			public Object getElementAt(int index)
			{
				return values[index];
			}
		});

		list.setBounds(520, 112, 209, 269);
		contentPane.add(list);

		firmaEkleBosluk = new JTextField();
		firmaEkleBosluk.setBounds(241, 495, 275, 40);
		contentPane.add(firmaEkleBosluk);
		firmaEkleBosluk.setColumns(10);

		firmaSifreBosluk = new JPasswordField();
		firmaSifreBosluk.setBounds(241, 546, 275, 40);
		contentPane.add(firmaSifreBosluk);

		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String kullaniciAdi = firmaEkleBosluk.getText();
				char[] sifreChars = firmaSifreBosluk.getPassword();
				String sifre = new String(sifreChars);
				tempCompany.kullaniciAdi=kullaniciAdi;
				tempCompany.sifre=sifre;
				Yakit tempYakit= new Yakit();
				tempYakit.kilometreÜcreti=5;
				tempYakit.yakıtTürü=2;
				tempCompany.yakits.add(tempYakit);
				//adminErisim.firmaKullaniciAdi.add(kullaniciAdi);
				//adminErisim.firmaSifre.add(sifre);
				
				
				companies.add(tempCompany);
				firmaKullaniciAdi.clear();
				for (Company company : companies)
				{
					
					firmaKullaniciAdi.add(company.kullaniciAdi);

				}
				System.out.println(firmaKullaniciAdi);
				comboBox.setModel(new DefaultComboBoxModel<>(firmaKullaniciAdi.toArray(new String[0])));
				list.setModel(new DefaultComboBoxModel<>(firmaKullaniciAdi.toArray(new String[0])));

				list.setBounds(520, 112, 209, 269);
				contentPane.add(list);
				

			}
		});
		btnNewButton.setBounds(408, 597, 107, 40);
		contentPane.add(btnNewButton);

		txtFirmaEkle = new JTextField();
		txtFirmaEkle.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaEkle.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFirmaEkle.setEditable(false);
		txtFirmaEkle.setText("FİRMA EKLE");
		txtFirmaEkle.setBounds(95, 443, 421, 40);
		contentPane.add(txtFirmaEkle);
		txtFirmaEkle.setColumns(10);

		txtFirmaAdi = new JTextField();
		txtFirmaAdi.setText("FİRMA ADI");
		txtFirmaAdi.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaAdi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFirmaAdi.setEditable(false);
		txtFirmaAdi.setColumns(10);
		txtFirmaAdi.setBounds(95, 494, 136, 40);
		contentPane.add(txtFirmaAdi);

		txtFirmaifresi = new JTextField();
		txtFirmaifresi.setText("FİRMA ŞİFRE");
		txtFirmaifresi.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaifresi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFirmaifresi.setEditable(false);
		txtFirmaifresi.setColumns(10);
		txtFirmaifresi.setBounds(95, 546, 136, 40);
		contentPane.add(txtFirmaifresi);

		txtFirmaSil = new JTextField();
		txtFirmaSil.setText("FİRMA SİL");
		txtFirmaSil.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaSil.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFirmaSil.setEditable(false);
		txtFirmaSil.setColumns(10);
		txtFirmaSil.setBounds(731, 443, 275, 40);
		contentPane.add(txtFirmaSil);

		txtFirmaListesi = new JTextField();
		txtFirmaListesi.setText("FİRMA LİSTESİ");
		txtFirmaListesi.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaListesi.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtFirmaListesi.setEditable(false);
		txtFirmaListesi.setColumns(10);
		txtFirmaListesi.setBounds(455, 61, 208, 40);
		contentPane.add(txtFirmaListesi);

		JButton btnSil = new JButton("SİL");
		btnSil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSil.setBounds(899, 546, 107, 40);
		btnSil.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String selectedData = comboBox.getSelectedItem().toString();
				System.out.println(selectedData);
				int indis=0;	
				
				for (int i=0;i<companies.size();i++)
				{
					if(companies.get(i).kullaniciAdi.equals(selectedData))
					{
						indis=i;
					}
				}
				companies.remove(indis);
				firmaKullaniciAdi.clear();
				for (Company company : companies)
				{
					
					firmaKullaniciAdi.add(company.kullaniciAdi);

				}
				comboBox.setModel(new DefaultComboBoxModel<>(firmaKullaniciAdi.toArray(new String[0])));
				list.setModel(new DefaultComboBoxModel<>(firmaKullaniciAdi.toArray(new String[0])));

				list.setBounds(520, 112, 209, 269);
				contentPane.add(list);

			}
		});
		
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
		contentPane.add(btnSil);
		
		txtHizmetBedeli = new JTextField();
		txtHizmetBedeli.setHorizontalAlignment(SwingConstants.CENTER);
		txtHizmetBedeli.setEditable(false);
		txtHizmetBedeli.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtHizmetBedeli.setText("HİZMET BEDELİ");
		txtHizmetBedeli.setBounds(731, 684, 275, 40);
		contentPane.add(txtHizmetBedeli);
		txtHizmetBedeli.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(731, 735, 159, 40);
		contentPane.add(textField);
		textField.setText(""+adminErisim.sistemHizmetBedeli);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("GÜNCELLE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					int güncel_hizmetBedeli =Integer.parseInt(textField.getText());
					adminErisim.sistemHizmetBedeli=güncel_hizmetBedeli;
					System.out.println("Günçellenmiş Hizmet Bedeli"+adminErisim.sistemHizmetBedeli);
				}
				catch (Exception e2)
				{
					System.out.println("Hatalı Bedel Girişi");
				}
				
			}
		});
		btnNewButton_1.setBounds(899, 735, 107, 40);
		contentPane.add(btnNewButton_1);

	}

}
