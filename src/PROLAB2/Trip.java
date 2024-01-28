package PROLAB2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trip
{
	// seferleri temsil eden classtır her sefeimn biğr aracı güzergahı zamanı ve
	// fiyatı burda tanımlanacak

	

	int[][] guzargahDemirYolu =

	{
			{ 20, 1, 2, 3, 5, 4, 5, 3, 2, 1 },
			{ 19, 1, 2, 3, 5, 6, 5, 3, 2, 1 }, };
	
	int[][] guzargahKaraYolu =

		{ 
				{ 18, 1, 2, 3, 2, 1},
				{ 17, 1, 2, 4, 5, 4, 2, 1 } };

	int[][] guzargahHavaYolu =

	{
			{ 16, 1, 3, 1 },
			{ 15, 1, 2, 1 } };
	
	int matrisKarayoluUcret[][] =
	{
			{ 0, 1, 2, 3, 4, 5 },
			{ 1, 0, 50, 300, 150, 300 },
			{ 2, 50, 0, 400, 100, 250 },
			{ 3, 300, 400, 0, 0, 0 },
			{ 4, 150, 100, 0, 0, 150 },
			{ 5, 300, 250, 0, 150, 0 } };
	int matrisDemiryoluUcret[][] =
	{
			{ 0, 1, 2, 3, 4, 5, 6 },
			{ 1, 0, 50, 150, 250, 200, 300 },
			{ 2, 50, 0, 50, 200, 100, 250 },
			{ 3, 150, 50, 0, 150, 50, 200 },
			{ 4, 250, 200, 150, 0, 100, 0 },
			{ 5, 200, 100, 50, 100, 0, 150 },
			{ 6, 300, 250, 200, 0, 150, 0 } };
	int matrisHavayoluUcret[][] =
	{
			{ 0, 1, 2, 3 },
			{ 1, 0, 1000, 1200 },
			{ 2, 1000, 0, 0 },
			{ 3, 1200, 0, 0 } };

	int guzergah;
	tarih SeferTarihi=new tarih();
	int seferYapılacakMı = 0;

}
class tarih
{
	int gün=0;
	int ay=0;
	int yıl=0;
}
