package PROLAB2;

import PROLAB2.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Delayed;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class loginPanel extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtKullaniciAdi;
	private JTextField txtSifre;
	private JTextField txtAdminGiris;
	private JPasswordField passwordFieldFirma;
	private JTextField txtKullaniciAdiFirma;
	private JTextField txtSifreFirma;
	private JTextField txtFirmaGiris;
	private JButton anaEkranButton;
	private JLabel lblHataliKullaniciAdi;

	public loginPanel(ArrayList<Company> companies)
	{
		ArrayList<String> firmaKullaniciAdi = new ArrayList<>();
		ArrayList<String> firmaSifre = new ArrayList<String>();
		for (Company company : companies)
		{
			firmaKullaniciAdi.add(company.kullaniciAdi);
			firmaSifre.add(company.sifre);

		}

		setVisible(true);
		setTitle("Giriş Paneli");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		setContentPane(contentPane);

		passwordField = new JPasswordField();
		passwordField.setBounds(362, 395, 171, 34);
		contentPane.add(passwordField);

		JLabel lblNewLabel = new JLabel("HATALI KULLANICI ADI VEYA SİFRE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(240, 240, 240));
		lblNewLabel.setBounds(135, 485, 434, 27);
		contentPane.add(lblNewLabel);

		lblHataliKullaniciAdi = new JLabel("HATALI KULLANICI ADI VEYA SİFRE");
		lblHataliKullaniciAdi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHataliKullaniciAdi.setForeground(UIManager.getColor("Button.background"));
		lblHataliKullaniciAdi.setForeground(new Color(240, 240, 240));
		lblHataliKullaniciAdi.setBounds(625, 491, 434, 27);
		contentPane.add(lblHataliKullaniciAdi);

		JFormattedTextField kullaniciAdiBosluk = new JFormattedTextField();
		kullaniciAdiBosluk.setBounds(362, 350, 207, 34);
		contentPane.add(kullaniciAdiBosluk);

		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setEditable(false);
		txtKullaniciAdi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKullaniciAdi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtKullaniciAdi.setText("KULLANICI ADI");
		txtKullaniciAdi.setBounds(135, 349, 207, 34);
		contentPane.add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);

		txtSifre = new JTextField();
		txtSifre.setEditable(false);
		txtSifre.setText("ŞİFRE");
		txtSifre.setHorizontalAlignment(SwingConstants.CENTER);
		txtSifre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSifre.setColumns(10);
		txtSifre.setBounds(135, 395, 207, 34);
		contentPane.add(txtSifre);

		txtAdminGiris = new JTextField();
		txtAdminGiris.setEditable(false);
		txtAdminGiris.setText("ADMİN GİRİŞ");
		txtAdminGiris.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdminGiris.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAdminGiris.setColumns(10);
		txtAdminGiris.setBounds(135, 305, 434, 34);
		contentPane.add(txtAdminGiris);

		JToggleButton gozButton = new JToggleButton("");
		gozButton.setSelectedIcon(new ImageIcon("C:\\Users\\melih\\Desktop\\PROJEECT\\acikgoz34.jpg"));
		gozButton.setForeground(UIManager.getColor("Button.background"));
		gozButton.setIcon(new ImageIcon("C:\\Users\\melih\\Desktop\\PROJEECT\\kapaligoz34.jpg"));
		gozButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// JButton'a tıklandığında şifreyi görünür yap veya gizle
				char echoChar = passwordField.getEchoChar();
				if (echoChar == '\u2022')
				{
					// Karakter gizli ise, görünür hale getir
					passwordField.setEchoChar((char) 0);
				}
				else
				{
					// Karakter görünür ise, gizle
					passwordField.setEchoChar('\u2022');
				}
			}
		});
		gozButton.setToolTipText("");
		gozButton.setBounds(537, 395, 34, 34);
		JButton girisButton = new JButton("GİRİŞ YAP");
		girisButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String kullaniciAdi = kullaniciAdiBosluk.getText();
				char[] sifreChars = passwordField.getPassword();
				String sifre = new String(sifreChars);
				adminErisim adminErisim = new adminErisim();
				
				if ((kullaniciAdi.equals(adminErisim.kullaniciAdiR)) && sifre.equals(adminErisim.sifreR))
				{
					adminPanel adminPanel =new adminPanel(companies);
					adminPanel.setVisible(true);
					System.out.println("Girilen Kullanici Adi: " + kullaniciAdi);
					System.out.println("Girilen Şifre: " + sifre);
					setVisible(false);

				}
				else
				{
					System.out.print("HATALI ŞİFRE VEYA KULLANICI ADI!");
					lblNewLabel.setForeground(new Color(0, 0, 0));

				}

			}
		});
		girisButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		girisButton.setBounds(135, 440, 434, 34);
		contentPane.add(girisButton);
		contentPane.add(gozButton);

		passwordFieldFirma = new JPasswordField();
		passwordFieldFirma.setBounds(852, 395, 171, 34);
		contentPane.add(passwordFieldFirma);

		JFormattedTextField kullaniciAdiBoslukFirma = new JFormattedTextField();
		kullaniciAdiBoslukFirma.setBounds(852, 350, 207, 34);
		contentPane.add(kullaniciAdiBoslukFirma);

		txtKullaniciAdiFirma = new JTextField();
		txtKullaniciAdiFirma.setEditable(false);
		txtKullaniciAdiFirma.setHorizontalAlignment(SwingConstants.CENTER);
		txtKullaniciAdiFirma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtKullaniciAdiFirma.setText("KULLANICI ADI");
		txtKullaniciAdiFirma.setBounds(625, 349, 207, 34);
		contentPane.add(txtKullaniciAdiFirma);
		txtKullaniciAdiFirma.setColumns(10);

		txtSifreFirma = new JTextField();
		txtSifreFirma.setEditable(false);
		txtSifreFirma.setText("ŞİFRE");
		txtSifreFirma.setHorizontalAlignment(SwingConstants.CENTER);
		txtSifreFirma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSifreFirma.setColumns(10);
		txtSifreFirma.setBounds(625, 395, 207, 34);
		contentPane.add(txtSifreFirma);

		txtFirmaGiris = new JTextField();
		txtFirmaGiris.setEditable(false);
		txtFirmaGiris.setText("FİRMA GİRİŞ");
		txtFirmaGiris.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirmaGiris.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFirmaGiris.setColumns(10);
		txtFirmaGiris.setBounds(625, 305, 434, 34);
		contentPane.add(txtFirmaGiris);

		JToggleButton gozButtonFirma = new JToggleButton("");
		gozButtonFirma.setSelectedIcon(new ImageIcon("C:\\Users\\melih\\Desktop\\PROJEECT\\acikgoz34.jpg"));
		gozButtonFirma.setForeground(UIManager.getColor("Button.background"));
		gozButtonFirma.setIcon(new ImageIcon("C:\\Users\\melih\\Desktop\\PROJEECT\\kapaligoz34.jpg"));
		gozButtonFirma.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// JButton'a tıklandığında şifreyi görünür yap veya gizle
				char echoChar = passwordFieldFirma.getEchoChar();
				if (echoChar == '\u2022')
				{
					// Karakter gizli ise, görünür hale getir
					passwordFieldFirma.setEchoChar((char) 0);
				}
				else
				{
					// Karakter görünür ise, gizle
					passwordFieldFirma.setEchoChar('\u2022');
				}
			}
		});
		gozButtonFirma.setToolTipText("");
		gozButtonFirma.setBounds(1027, 395, 34, 34);
		JButton girisButtonFirma = new JButton("GİRİŞ YAP");
		girisButtonFirma.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String kullaniciAdiFirma = kullaniciAdiBoslukFirma.getText();
				char[] sifreChars = passwordFieldFirma.getPassword();
				String sifreFirmaAlma = new String(sifreChars);
				firmaKullaniciAdi.clear();
				firmaSifre.clear();
				for (Company company : companies)
				{
					firmaKullaniciAdi.add(company.kullaniciAdi);
					firmaSifre.add(company.sifre);

				}
				
				int indis=-1;	
				for (int i=0;i<companies.size();i++)
				{
					if(companies.get(i).kullaniciAdi.equals(kullaniciAdiFirma))
					{
						indis=i;
					}
				}
			
				if (indis!=-1 && (companies.get(indis).sifre.equals(sifreFirmaAlma)))
				{
					
					firmaPanel firmaPanel=new firmaPanel(companies,indis);
					firmaPanel.setVisible(true);
					System.out.println("Girilen Kullanici Adi: " + kullaniciAdiFirma);
					System.out.println("Girilen Şifre: " + sifreFirmaAlma);
					setVisible(false);

				}
				else
				{
					System.out.println("HATALI ŞİFRE VEYA KULLANICI ADI!");
					lblHataliKullaniciAdi.setForeground(new Color(0, 0, 0));
				}
				
			}
		});

		girisButtonFirma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		girisButtonFirma.setBounds(625, 440, 434, 34);
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
		contentPane.add(girisButtonFirma);
		contentPane.add(gozButtonFirma);

	}
}
