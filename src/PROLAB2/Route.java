package PROLAB2;



public class Route
{
	private String kalkisNoktasi;
	private String varisNoktasi;
	private double mesafe;

	int matrisKarayoluKm[][] =
	{
			{ 0, 1, 2, 3, 4, 5 },
			{ 1, 0, 100, 500, 300, 600 },
			{ 2, 100, 0, 400, 200, 500 },
			{ 3, 500, 400, 0, 0, 0 },
			{ 4, 300, 200, 0, 0, 300 },
			{ 5, 600, 500, 0, 300, 0 } };
	int matrisDemiryoluKm[][] =
	{
			{ 0, 1, 2, 3, 4, 5, 6 },
			{ 1, 0, 75, 225, 375, 300, 450 },
			{ 2, 75, 0, 75, 300, 150, 350 },
			{ 3, 225, 75, 0, 225, 75, 300 },
			{ 4, 375, 300, 225, 0, 150, 0 },
			{ 5, 300, 150, 75, 150, 0, 225 },
			{ 6, 450, 350, 300, 0, 225, 0 } };
	int matrisHavayoluKm[][] =
	{
			{ 0, 1, 2, 3 },
			{ 1, 0, 250, 300 },
			{ 2, 250, 0, 0 },
			{ 3, 300, 0, 0 } };

	/*
	 * public Route(String kalkisNoktasi, String varisNoktasi, double mesafeKm) {
	 * this.kalkisNoktasi = kalkisNoktasi; this.varisNoktasi = varisNoktasi;
	 * this.mesafe = mesafeKm; }
	 * 
	 * // Getter ve Setter metotları public String getKalkisNoktasi() { return
	 * kalkisNoktasi; }
	 * 
	 * public void setKalkisNoktasi(String kalkisNoktasi) { this.kalkisNoktasi =
	 * kalkisNoktasi; }
	 * 
	 * public String getVarisNoktasi() { return varisNoktasi; }
	 * 
	 * public void setVarisNoktasi(String varisNoktasi) { this.varisNoktasi =
	 * varisNoktasi; }
	 * 
	 * public double getMesafeKm() { return mesafe; }
	 * 
	 * public void setMesafeKm(double mesafeKm) { this.mesafe = mesafeKm; }
	 */
}
