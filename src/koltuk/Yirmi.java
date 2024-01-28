package PROLAB2.koltuk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import PROLAB2.Passenger;
import PROLAB2.isimGenerator;

public class Yirmi extends JPanel
{

	private static final long serialVersionUID = 1L;
	public HashMap<Integer, Integer> koltuk = new HashMap<>();
	public HashMap<Integer, Passenger> yolcular = new HashMap<>();

	public Yirmi()
	{
		setLayout(null);
		Passenger passengertemp = new Passenger(null, null, 0, "00/00/0000");
		isimGenerator isimGenerator =new isimGenerator();
		JToggleButton koltuk_1 = new JToggleButton("1\r\n");
		koltuk_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_1.setBounds(360, 97, 50, 27);
		koltuk.put(1, 0);
		koltuk_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_1.isSelected())
				{
					koltuk.put(1, 2);
				}
				else
				{
					koltuk.put(1, 0);
				}

			}
		});

		add(koltuk_1);

		JToggleButton koltuk_2 = new JToggleButton("2");
		koltuk_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_2.setBounds(360, 135, 50, 27);
		koltuk.put(2, 0);
		koltuk_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_2.isSelected())
				{
					koltuk.put(2, 2);
				}
				else
				{
					koltuk.put(2, 0);
				}

			}
		});
		add(koltuk_2);

		JToggleButton koltuk_3 = new JToggleButton("3");
		koltuk_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_3.setBounds(410, 97, 50, 27);
		koltuk.put(3, 0);
		koltuk_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_3.isSelected())
				{
					koltuk.put(3, 2);
				}
				else
				{
					koltuk.put(3, 0);
				}

			}
		});
		add(koltuk_3);

		JToggleButton koltuk_4 = new JToggleButton("4");
		koltuk_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_4.setBounds(410, 135, 50, 27);
		koltuk.put(4, 0);
		koltuk_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_4.isSelected())
				{
					koltuk.put(4, 2);
				}
				else
				{
					koltuk.put(4, 0);
				}

			}
		});
		add(koltuk_4);

		JToggleButton koltuk_5 = new JToggleButton("5");
		koltuk_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_5.setBounds(410, 253, 50, 27);
		koltuk.put(5, 0);
		koltuk_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_5.isSelected())
				{
					koltuk.put(5, 2);
				}
				else
				{
					koltuk.put(5, 0);
				}

			}
		});
		add(koltuk_5);

		JToggleButton koltuk_6 = new JToggleButton("6");
		koltuk_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_6.setBounds(459, 97, 50, 27);
		koltuk.put(6, 0);
		koltuk_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_6.isSelected())
				{
					koltuk.put(6, 2);
				}
				else
				{
					koltuk.put(6, 0);
				}

			}
		});
		add(koltuk_6);

		JToggleButton koltuk_7 = new JToggleButton("7");
		koltuk_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_7.setBounds(459, 135, 50, 27);
		koltuk.put(7, 0);
		koltuk_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_7.isSelected())
				{
					koltuk.put(7, 2);
				}
				else
				{
					koltuk.put(7, 0);
				}

			}
		});
		add(koltuk_7);

		JToggleButton koltuk_8 = new JToggleButton("8");
		koltuk_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_8.setBounds(459, 253, 50, 27);
		koltuk.put(8, 0);
		koltuk_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_8.isSelected())
				{
					koltuk.put(8, 2);
				}
				else
				{
					koltuk.put(8, 0);
				}

			}
		});
		add(koltuk_8);

		JToggleButton koltuk_9 = new JToggleButton("9");
		koltuk_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_9.setBounds(507, 97, 50, 27);
		koltuk.put(9, 0);
		koltuk_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_9.isSelected())
				{
					koltuk.put(9, 2);
				}
				else
				{
					koltuk.put(9, 0);
				}

			}
		});
		add(koltuk_9);

		JToggleButton koltuk_10 = new JToggleButton("10");
		koltuk_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_10.setBounds(507, 135, 50, 27);
		koltuk.put(10, 0);
		koltuk_10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_10.isSelected())
				{
					koltuk.put(10, 2);
				}
				else
				{
					koltuk.put(10, 0);
				}

			}
		});
		add(koltuk_10);

		JToggleButton koltuk_11 = new JToggleButton("11");
		koltuk_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_11.setBounds(508, 253, 50, 27);
		koltuk.put(11, 0);
		koltuk_11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_11.isSelected())
				{
					koltuk.put(11, 2);
				}
				else
				{
					koltuk.put(11, 0);
				}

			}
		});
		add(koltuk_11);

		JToggleButton koltuk_12 = new JToggleButton("12");
		koltuk_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_12.setBounds(555, 97, 50, 27);
		koltuk.put(12, 0);
		koltuk_12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_12.isSelected())
				{
					koltuk.put(12, 2);
				}
				else
				{
					koltuk.put(12, 0);
				}

			}
		});
		add(koltuk_12);

		JToggleButton koltuk_13 = new JToggleButton("13");
		koltuk_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_13.setBounds(555, 135, 50, 27);
		koltuk.put(13, 0);
		koltuk_13.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_13.isSelected())
				{
					koltuk.put(13, 2);
				}
				else
				{
					koltuk.put(13, 0);
				}

			}
		});
		add(koltuk_13);

		JToggleButton koltuk_14 = new JToggleButton("14");
		koltuk_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_14.setBounds(555, 253, 50, 27);
		koltuk.put(14, 0);
		koltuk_14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_14.isSelected())
				{
					koltuk.put(14, 2);
				}
				else
				{
					koltuk.put(14, 0);
				}

			}
		});
		add(koltuk_14);

		JToggleButton koltuk_15 = new JToggleButton("15");
		koltuk_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_15.setBounds(602, 97, 50, 27);
		koltuk.put(15, 0);
		koltuk_15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_15.isSelected())
				{
					koltuk.put(15, 2);
				}
				else
				{
					koltuk.put(15, 0);
				}

			}
		});
		add(koltuk_15);

		JToggleButton koltuk_16 = new JToggleButton("16");
		koltuk_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_16.setBounds(602, 135, 50, 27);
		koltuk.put(16, 0);
		koltuk_16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_16.isSelected())
				{
					koltuk.put(16, 2);
				}
				else
				{
					koltuk.put(16, 0);
				}

			}
		});
		add(koltuk_16);

		JToggleButton koltuk_17 = new JToggleButton("17");
		koltuk_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_17.setBounds(602, 253, 50, 27);
		koltuk.put(17, 0);
		koltuk_17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_17.isSelected())
				{
					koltuk.put(17, 2);
				}
				else
				{
					koltuk.put(17, 0);
				}

			}
		});
		add(koltuk_17);

		JToggleButton koltuk_18 = new JToggleButton("18");
		koltuk_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_18.setBounds(648, 97, 50, 27);
		koltuk.put(18, 0);
		koltuk_18.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_18.isSelected())
				{
					koltuk.put(18, 2);
				}
				else
				{
					koltuk.put(18, 0);
				}

			}
		});
		add(koltuk_18);

		JToggleButton koltuk_19 = new JToggleButton("19");
		koltuk_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_19.setBounds(648, 135, 50, 27);
		koltuk.put(19, 0);
		koltuk_19.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_19.isSelected())
				{
					koltuk.put(19, 2);
				}
				else
				{
					koltuk.put(19, 0);
				}

			}
		});
		add(koltuk_19);

		JToggleButton koltuk_20 = new JToggleButton("20");
		koltuk_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_20.setBounds(648, 253, 50, 27);
		koltuk.put(20, 0);
		koltuk_20.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (koltuk_20.isSelected())
				{
					koltuk.put(20, 2);
				}
				else
				{
					koltuk.put(20, 0);
				}

			}
		});
		add(koltuk_20);
		
		
		yolcular.put(1, passengertemp);
		yolcular.put(2, passengertemp);
		yolcular.put(3, passengertemp);
		yolcular.put(4, passengertemp);
		yolcular.put(5, passengertemp);
		yolcular.put(6, passengertemp);
		yolcular.put(7, passengertemp);
		yolcular.put(8, passengertemp);
		yolcular.put(9, passengertemp);
		yolcular.put(10, passengertemp);
		yolcular.put(11, passengertemp);
		yolcular.put(12, passengertemp);
		yolcular.put(13, passengertemp);
		yolcular.put(14, passengertemp);
		yolcular.put(15, passengertemp);
		yolcular.put(11, passengertemp);
		yolcular.put(12, passengertemp);
		yolcular.put(13, passengertemp);
		yolcular.put(14, passengertemp);
		yolcular.put(15, passengertemp);
		yolcular.put(16, passengertemp);
		yolcular.put(17, passengertemp);
		yolcular.put(18, passengertemp);
		yolcular.put(19, passengertemp);
		yolcular.put(20, passengertemp);
		
		
		Random random = new Random();
		int rastgeleDoldurulacakOltukSayisi = random.nextInt(20);
		for (int i = 0; i < rastgeleDoldurulacakOltukSayisi; i++)
		{
			int rastgeleKoltuk = random.nextInt(19) + 1;
			koltuk.put(rastgeleKoltuk, 1);

		}
		for (Map.Entry<Integer, Integer> entry : koltuk.entrySet())
		{
			Passenger passenger=new Passenger(isimGenerator.adgetir(),isimGenerator.soyadGetir(),isimGenerator.tckimlikNo() ,isimGenerator.dogumTarihi());
			if(entry.getKey()==1)
			{
				if(entry.getValue()==1)
				{
					
					koltuk_1.setBackground(Color.RED);
					koltuk_1.setEnabled(false);
					yolcular.put(1,passenger);
				}
			}
			else if(entry.getKey()==2)
			{
				if(entry.getValue()==1)
				{
					koltuk_2.setBackground(Color.RED);
					koltuk_2.setEnabled(false);
					yolcular.put(2,passenger);
				}
			}
			else if(entry.getKey()==3)
			{
				if(entry.getValue()==1)
				{
					koltuk_3.setBackground(Color.RED);
					koltuk_3.setEnabled(false);
					yolcular.put(3,passenger);
				}
			}
			else if(entry.getKey()==4)
			{
				if(entry.getValue()==1)
				{
					koltuk_4.setBackground(Color.RED);
					koltuk_4.setEnabled(false);
					yolcular.put(4,passenger);
				}
			}
			else if(entry.getKey()==5)
			{
				if(entry.getValue()==1)
				{
					koltuk_5.setBackground(Color.RED);
					koltuk_5.setEnabled(false);
					yolcular.put(5,passenger);
				}
			}
			else if(entry.getKey()==6)
			{
				if(entry.getValue()==1)
				{
					koltuk_6.setBackground(Color.RED);
					koltuk_6.setEnabled(false);
					yolcular.put(6,passenger);
				}
			}
			else if(entry.getKey()==7)
			{
				if(entry.getValue()==1)
				{
					koltuk_7.setBackground(Color.RED);
					koltuk_7.setEnabled(false);
					yolcular.put(7,passenger);
				}
			}
			else if(entry.getKey()==8)
			{
				if(entry.getValue()==1)
				{
					koltuk_8.setBackground(Color.RED);
					koltuk_8.setEnabled(false);
					yolcular.put(8,passenger);
				}
			}
			else if(entry.getKey()==9)
			{
				if(entry.getValue()==1)
				{
					koltuk_9.setBackground(Color.RED);
					koltuk_9.setEnabled(false);
					yolcular.put(9,passenger);
				}
			}
			else if(entry.getKey()==10)
			{
				if(entry.getValue()==1)
				{
					koltuk_10.setBackground(Color.RED);
					koltuk_10.setEnabled(false);
					yolcular.put(10,passenger);
				}
			}
			else if(entry.getKey()==11)
			{
				if(entry.getValue()==1)
				{
					koltuk_11.setBackground(Color.RED);
					koltuk_11.setEnabled(false);
					yolcular.put(11,passenger);

				}
			}
			else if(entry.getKey()==12)
			{
				if(entry.getValue()==1)
				{
					koltuk_12.setBackground(Color.RED);
					koltuk_12.setEnabled(false);
					yolcular.put(12,passenger);

				}
			}
			else if(entry.getKey()==13)
			{
				if(entry.getValue()==1)
				{
					koltuk_13.setBackground(Color.RED);
					koltuk_13.setEnabled(false);
					yolcular.put(13,passenger);

				}
			}
			else if(entry.getKey()==14)
			{
				if(entry.getValue()==1)
				{
					koltuk_14.setBackground(Color.RED);
					koltuk_14.setEnabled(false);
					yolcular.put(14,passenger);

				}
			}
			else if(entry.getKey()==15)
			{
				if(entry.getValue()==1)
				{
					koltuk_15.setBackground(Color.RED);
					koltuk_15.setEnabled(false);
					yolcular.put(15,passenger);

				}
			}
			else if(entry.getKey()==16)
			{
				if(entry.getValue()==1)
				{
					koltuk_16.setBackground(Color.RED);
					koltuk_16.setEnabled(false);
					yolcular.put(16,passenger);

				}
			}
			else if(entry.getKey()==17)
			{
				if(entry.getValue()==1)
				{
					koltuk_17.setBackground(Color.RED);
					koltuk_17.setEnabled(false);
					yolcular.put(17,passenger);

				}
			}
			else if(entry.getKey()==18)
			{
				if(entry.getValue()==1)
				{
					koltuk_18.setBackground(Color.RED);
					koltuk_18.setEnabled(false);
					yolcular.put(18,passenger);

				}
			}
			else if(entry.getKey()==19)
			{
				if(entry.getValue()==1)
				{
					koltuk_19.setBackground(Color.RED);
					koltuk_19.setEnabled(false);
					yolcular.put(19,passenger);

				}
			}
			else if(entry.getKey()==20)
			{
				if(entry.getValue()==1)
				{
					koltuk_20.setBackground(Color.RED);
					koltuk_20.setEnabled(false);
					yolcular.put(20,passenger);

				}
			}
		}

		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\melih\\Desktop\\PROJEECT\\koltuk\\20.png"));
		lblNewLabel.setBounds(226, 62, 534, 257);
		add(lblNewLabel);

	}

}
