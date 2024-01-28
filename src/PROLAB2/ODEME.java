package PROLAB2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Delayed;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ODEME extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtdemeBilgileri;
	private JTextField txtKartNumarasi;
	private JTextField txtSkt;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtCvv;
	private JTextField txtKartSahibi;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtMelihTutarYazmayi;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	
	public ODEME(int biletSayisi,int bilet_Ücreti,ArrayList<Company> companies)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(360, 90, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtdemeBilgileri = new JTextField();
		txtdemeBilgileri.setText("ÖDEME BİLGİLERİ");
		txtdemeBilgileri.setHorizontalAlignment(SwingConstants.CENTER);
		txtdemeBilgileri.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtdemeBilgileri.setEditable(false);
		txtdemeBilgileri.setColumns(10);
		txtdemeBilgileri.setBounds(413, 263, 359, 36);
		contentPane.add(txtdemeBilgileri);
		
		txtKartNumarasi = new JTextField();
		txtKartNumarasi.setText("KART NUMARASI");
		txtKartNumarasi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKartNumarasi.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtKartNumarasi.setEditable(false);
		txtKartNumarasi.setColumns(10);
		txtKartNumarasi.setBounds(413, 357, 122, 36);
		contentPane.add(txtKartNumarasi);
		
		txtSkt = new JTextField();
		txtSkt.setText("S.K.T");
		txtSkt.setHorizontalAlignment(SwingConstants.CENTER);
		txtSkt.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSkt.setEditable(false);
		txtSkt.setColumns(10);
		txtSkt.setBounds(413, 404, 122, 36);
		contentPane.add(txtSkt);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(545, 310, 227, 36);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(545, 357, 227, 36);
		contentPane.add(textField_4);
		
		txtCvv = new JTextField();
		txtCvv.setText("CVV");
		txtCvv.setHorizontalAlignment(SwingConstants.CENTER);
		txtCvv.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtCvv.setEditable(false);
		txtCvv.setColumns(10);
		txtCvv.setBounds(413, 451, 122, 36);
		contentPane.add(txtCvv);
		
		txtKartSahibi = new JTextField();
		txtKartSahibi.setText("KART SAHİBİ");
		txtKartSahibi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKartSahibi.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtKartSahibi.setEditable(false);
		txtKartSahibi.setColumns(10);
		txtKartSahibi.setBounds(413, 310, 122, 36);
		contentPane.add(txtKartSahibi);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(545, 404, 227, 36);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(545, 451, 227, 36);
		contentPane.add(textField_8);
		
		txtMelihTutarYazmayi = new JTextField();
		txtMelihTutarYazmayi.setHorizontalAlignment(SwingConstants.CENTER);
		txtMelihTutarYazmayi.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtMelihTutarYazmayi.setEditable(false);
		txtMelihTutarYazmayi.setText("TOPLAM TUTAR="+bilet_Ücreti*biletSayisi);
		txtMelihTutarYazmayi.setBounds(300, 160, 631, 58);
		contentPane.add(txtMelihTutarYazmayi);
		txtMelihTutarYazmayi.setColumns(10);
		JLabel lblNewLabel = new JLabel("ÖDEME BAŞARIYLA ALINDI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(477, 545, 233, 50);
		lblNewLabel.setVisible(false);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("ÖDEME YAP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(true);
				
				Timer timer = new Timer(3000, new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	lblNewLabel.setVisible(false); // Yazıyı gizle
		            	setVisible(false);
		            	girisEkrani girisEkrani= new girisEkrani(companies);
		            	girisEkrani.setVisible(true);
		            }
		        });
				
				timer.setRepeats(false); // Tek seferlik çalışması için
                timer.start(); // Timer'ı başlatmayı unutmayın
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(496, 498, 152, 36);
		contentPane.add(btnNewButton);
		
		
	}
}
