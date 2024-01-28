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

public class Otuz extends JPanel
{

	private static final long serialVersionUID = 1L;
	public HashMap<Integer, Integer> koltuk=new HashMap<>();
	public HashMap<Integer, Passenger> yolcular = new HashMap<>();
	public Otuz()
	{
setLayout(null);
		Passenger passengertemp = new Passenger(null, null, 0, "00/00/0000");
		isimGenerator isimGenerator =new isimGenerator();
		JToggleButton koltuk_1 = new JToggleButton("1");
		koltuk_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_1.setBounds(352, 93, 50, 27);
		koltuk.put(1,0);
		koltuk_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_1.isSelected())
				{
					koltuk.put(1,2);
				}
				else 
				{
					koltuk.put(1,0);
				}
				
			}
		});
		add(koltuk_1);
		
		JToggleButton koltuk_2 = new JToggleButton("2");
		koltuk_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_2.setBounds(352, 133, 50, 27);
		koltuk.put(2,0);
		koltuk_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_2.isSelected())
				{
					koltuk.put(2,2);
				}
				else 
				{
					koltuk.put(2,0);
				}
				
			}
		});
		add(koltuk_2);
		
		JToggleButton koltuk_3 = new JToggleButton("3");
		koltuk_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_3.setBounds(352, 253, 50, 27);
		koltuk.put(3,0);
		koltuk_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_3.isSelected())
				{
					koltuk.put(3,2);
				}
				else 
				{
					koltuk.put(3,0);
				}
				
			}
		});
		add(koltuk_3);
		
		JToggleButton koltuk_4 = new JToggleButton("4");
		koltuk_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_4.setBounds(400, 93, 50, 27);
		koltuk.put(4,0);
		koltuk_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_4.isSelected())
				{
					koltuk.put(4,2);
				}
				else 
				{
					koltuk.put(4,0);
				}
				
			}
		});
		add(koltuk_4);
		
		JToggleButton koltuk_5 = new JToggleButton("5");
		koltuk_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_5.setBounds(400, 133, 50, 27);
		koltuk.put(5,0);
		koltuk_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_5.isSelected())
				{
					koltuk.put(5,2);
				}
				else 
				{
					koltuk.put(5,0);
				}
				
			}
		});
		add(koltuk_5);
		
		JToggleButton koltuk_6 = new JToggleButton("6");
		koltuk_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_6.setBounds(400, 253, 50, 27);
		koltuk.put(6,0);
		koltuk_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_6.isSelected())
				{
					koltuk.put(6,2);
				}
				else 
				{
					koltuk.put(6,0);
				}
				
			}
		});
		add(koltuk_6);
		
		JToggleButton koltuk_7 = new JToggleButton("7");
		koltuk_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_7.setBounds(448, 93, 50, 27);
		koltuk.put(7,0);
		koltuk_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_7.isSelected())
				{
					koltuk.put(7,2);
				}
				else 
				{
					koltuk.put(7,0);
				}
				
			}
		});
		add(koltuk_7);
		
		JToggleButton koltuk_8 = new JToggleButton("8");
		koltuk_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_8.setBounds(448, 133, 50, 27);
		koltuk.put(8,0);
		koltuk_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_8.isSelected())
				{
					koltuk.put(8,2);
				}
				else 
				{
					koltuk.put(8,0);
				}
				
			}
		});
		add(koltuk_8);
		
		JToggleButton koltuk_9 = new JToggleButton("9");
		koltuk_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_9.setBounds(448, 253, 50, 27);
		koltuk.put(9,0);
		koltuk_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_9.isSelected())
				{
					koltuk.put(9,2);
				}
				else 
				{
					koltuk.put(9,0);
				}
				
			}
		});
		add(koltuk_9);
		
		JToggleButton koltuk_10 = new JToggleButton("10");
		koltuk_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_10.setBounds(494, 93, 50, 27);
		koltuk.put(10,0);
		koltuk_10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_10.isSelected())
				{
					koltuk.put(10,2);
				}
				else 
				{
					koltuk.put(10,0);
				}
				
			}
		});
		add(koltuk_10);
		
		JToggleButton koltuk_11 = new JToggleButton("11");
		koltuk_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_11.setBounds(494, 133, 50, 27);
		koltuk.put(11,0);
		koltuk_11.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_11.isSelected())
				{
					koltuk.put(11,2);
				}
				else 
				{
					koltuk.put(11,0);
				}
				
			}
		});
		add(koltuk_11);
		
		JToggleButton koltuk_12 = new JToggleButton("12");
		koltuk_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_12.setBounds(494, 253, 50, 27);
		koltuk.put(12,0);
		koltuk_12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_12.isSelected())
				{
					koltuk.put(12,2);
				}
				else 
				{
					koltuk.put(12,0);
				}
				
			}
		});
		add(koltuk_12);
		
		JToggleButton koltuk_13 = new JToggleButton("13");
		koltuk_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_13.setBounds(541, 93, 50, 27);
		koltuk.put(13,0);
		koltuk_13.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_13.isSelected())
				{
					koltuk.put(13,2);
				}
				else 
				{
					koltuk.put(13,0);
				}
				
			}
		});
		add(koltuk_13);
		
		JToggleButton koltuk_14 = new JToggleButton("14");
		koltuk_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_14.setBounds(541, 133, 50, 27);
		koltuk.put(14,0);
		koltuk_14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_14.isSelected())
				{
					koltuk.put(14,2);
				}
				else 
				{
					koltuk.put(14,0);
				}
				
			}
		});
		add(koltuk_14);
		
		JToggleButton koltuk_15 = new JToggleButton("15");
		koltuk_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_15.setBounds(541, 253, 50, 27);
		koltuk.put(15,0);
		koltuk_15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_15.isSelected())
				{
					koltuk.put(15,2);
				}
				else 
				{
					koltuk.put(15,0);
				}
				
			}
		});
		add(koltuk_15);
		
		JToggleButton koltuk_16 = new JToggleButton("16");
		koltuk_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_16.setBounds(588, 93, 50, 27);
		koltuk.put(16,0);
		koltuk_16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_16.isSelected())
				{
					koltuk.put(16,2);
				}
				else 
				{
					koltuk.put(16,0);
				}
				
			}
		});
		
		add(koltuk_16);
		
		JToggleButton koltuk_17 = new JToggleButton("17");
		koltuk_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_17.setBounds(588, 133, 50, 27);
		koltuk.put(17,0);
		koltuk_17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_17.isSelected())
				{
					koltuk.put(17,2);
				}
				else 
				{
					koltuk.put(17,0);
				}
				
			}
		});
		add(koltuk_17);
		
		JToggleButton koltuk_18 = new JToggleButton("18");
		koltuk_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_18.setBounds(588, 253, 50, 27);
		koltuk.put(18,0);
		koltuk_18.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_18.isSelected())
				{
					koltuk.put(18,2);
				}
				else 
				{
					koltuk.put(18,0);
				}
				
			}
		});
		add(koltuk_18);
		
		JToggleButton koltuk_19 = new JToggleButton("19");
		koltuk_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_19.setBounds(636, 93, 50, 27);
		koltuk.put(19,0);
		koltuk_19.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_19.isSelected())
				{
					koltuk.put(19,2);
				}
				else 
				{
					koltuk.put(19,0);
				}
				
			}
		});
		add(koltuk_19);
		
		JToggleButton koltuk_20 = new JToggleButton("20");
		koltuk_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_20.setBounds(636, 133, 50, 27);
		koltuk.put(20,0);
		koltuk_20.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_20.isSelected())
				{
					koltuk.put(20,2);
				}
				else 
				{
					koltuk.put(20,0);
				}
				
			}
		});
		add(koltuk_20);
		
		JToggleButton koltuk_21 = new JToggleButton("21");
		koltuk_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_21.setBounds(636, 253, 50, 27);
		koltuk.put(21,0);
		koltuk_21.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_21.isSelected())
				{
					koltuk.put(21,2);
				}
				else 
				{
					koltuk.put(21,0);
				}
				
			}
		});
		add(koltuk_21);
		
		JToggleButton koltuk_22 = new JToggleButton("22");
		koltuk_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_22.setBounds(686, 95, 50, 27);
		koltuk.put(22,0);
		koltuk_22.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_22.isSelected())
				{
					koltuk.put(22,2);
				}
				else 
				{
					koltuk.put(22,0);
				}
				
			}
		});
		add(koltuk_22);
		
		JToggleButton koltuk_23 = new JToggleButton("23");
		koltuk_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_23.setBounds(686, 133, 50, 27);
		koltuk.put(23,0);
		koltuk_23.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_23.isSelected())
				{
					koltuk.put(23,2);
				}
				else 
				{
					koltuk.put(23,0);
				}
				
			}
		});
		add(koltuk_23);
		
		JToggleButton koltuk_24 = new JToggleButton("24");
		koltuk_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_24.setBounds(686, 253, 50, 27);
		koltuk.put(24,0);
		koltuk_24.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_24.isSelected())
				{
					koltuk.put(24,2);
				}
				else 
				{
					koltuk.put(24,0);
				}
				
			}
		});
		add(koltuk_24);
		
		JToggleButton koltuk_25 = new JToggleButton("25");
		koltuk_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_25.setBounds(734, 95, 50, 27);
		koltuk.put(25,0);
		koltuk_25.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_25.isSelected())
				{
					koltuk.put(25,2);
				}
				else 
				{
					koltuk.put(25,0);
				}
				
			}
		});
		add(koltuk_25);
		
		JToggleButton koltuk_26 = new JToggleButton("26");
		koltuk_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_26.setBounds(734, 133, 50, 27);
		koltuk.put(26,0);
		koltuk_26.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_26.isSelected())
				{
					koltuk.put(26,2);
				}
				else 
				{
					koltuk.put(26,0);
				}
				
			}
		});
		add(koltuk_26);
		
		JToggleButton koltuk_27 = new JToggleButton("27");
		koltuk_27.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_27.setBounds(734, 253, 50, 27);
		koltuk.put(27,0);
		koltuk_27.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_27.isSelected())
				{
					koltuk.put(27,2);
				}
				else 
				{
					koltuk.put(27,0);
				}
				
			}
		});
		add(koltuk_27);
		
		JToggleButton koltuk_28 = new JToggleButton("28");
		koltuk_28.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_28.setBounds(780, 95, 50, 27);
		koltuk.put(28,0);
		koltuk_28.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_28.isSelected())
				{
					koltuk.put(28,2);
				}
				else 
				{
					koltuk.put(28,0);
				}
				
			}
		});
		add(koltuk_28);
		
		JToggleButton koltuk_29 = new JToggleButton("29");
		koltuk_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_29.setBounds(780, 133, 50, 27);
		koltuk.put(29,0);
		koltuk_29.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_29.isSelected())
				{
					koltuk.put(29,2);
				}
				else 
				{
					koltuk.put(29,0);
				}
				
			}
		});
		add(koltuk_29);
		
		JToggleButton koltuk_30 = new JToggleButton("30");
		koltuk_30.setFont(new Font("Tahoma", Font.PLAIN, 15));
		koltuk_30.setBounds(780, 253, 50, 27);
		koltuk.put(30,0);
		koltuk_30.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(koltuk_30.isSelected())
				{
					koltuk.put(30,2);
				}
				else 
				{
					koltuk.put(30,0);
				}
				
			}
		});
		add(koltuk_30);
		
		
		for (int i = 1; i < 31; i++)
		{
			yolcular.put(i, passengertemp);

		}
		
		Random random = new Random();
		
		
		int rastgeleDoldurulacakOltukSayisi = random.nextInt(26);
		for (int i = 0; i < rastgeleDoldurulacakOltukSayisi; i++)
		{
			int rastgeleKoltuk = random.nextInt(25) + 1;
			koltuk.put(rastgeleKoltuk, 1);

		}
		for(Map.Entry<Integer, Integer> entry: koltuk.entrySet()) {
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
			else if(entry.getKey()==21)
			{
				if(entry.getValue()==1)
				{
					koltuk_21.setBackground(Color.RED);
					koltuk_21.setEnabled(false);
					yolcular.put(21,passenger);

				}
			}
			else if(entry.getKey()==22)
			{
				if(entry.getValue()==1)
				{
					koltuk_22.setBackground(Color.RED);
					koltuk_22.setEnabled(false);
					yolcular.put(22,passenger);

				}
			}
			else if(entry.getKey()==23)
			{
				if(entry.getValue()==1)
				{
					koltuk_23.setBackground(Color.RED);
					koltuk_23.setEnabled(false);
					yolcular.put(23,passenger);

				}
			}
			else if(entry.getKey()==24)
			{
				if(entry.getValue()==1)
				{
					koltuk_24.setBackground(Color.RED);
					koltuk_24.setEnabled(false);
					yolcular.put(24,passenger);

				}
			}
			else if(entry.getKey()==25)
			{
				if(entry.getValue()==1)
				{
					koltuk_25.setBackground(Color.RED);
					koltuk_25.setEnabled(false);
					yolcular.put(25,passenger);

				}
			}
			else if(entry.getKey()==26)
			{
				if(entry.getValue()==1)
				{
					koltuk_26.setBackground(Color.RED);
					koltuk_26.setEnabled(false);
					yolcular.put(26,passenger);

				}
			}
			else if(entry.getKey()==27)
			{
				if(entry.getValue()==1)
				{
					koltuk_27.setBackground(Color.RED);
					koltuk_27.setEnabled(false);
					yolcular.put(27,passenger);

				}
			}
			else if(entry.getKey()==28)
			{
				if(entry.getValue()==1)
				{
					koltuk_28.setBackground(Color.RED);
					koltuk_28.setEnabled(false);
					yolcular.put(28,passenger);

				}
			}
			else if(entry.getKey()==29)
			{
				if(entry.getValue()==1)
				{
					koltuk_29.setBackground(Color.RED);
					koltuk_29.setEnabled(false);
					yolcular.put(29,passenger);

				}
			}
			else if(entry.getKey()==30)
			{
				if(entry.getValue()==1)
				{
					koltuk_30.setBackground(Color.RED);
					koltuk_30.setEnabled(false);
					yolcular.put(30,passenger);

				}
			}
			
			
			
			
		}
		

		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\melih\\Desktop\\PROJEECT\\koltuk\\30.png"));
		lblNewLabel.setBounds(226, 62, 604, 257);
		add(lblNewLabel);


	}

}
