public class Segitiga{
	double tinggi;
	double alas;
	double sisi;

	public void cetakKeLayar()
	{
		System.out.println("Segitiga");
		System.out.println("alas : " +alas);
		System.out.println("tinggi : " +tinggi);
		System.out.println("sisi : " +sisi);
	}

	public void ubahProperty(double tinggiBaru, double alasBaru, double sisiBaru)
	{
		tinggi = tinggiBaru;
		alas = alasBaru;
		sisi = sisiBaru;
	}

	public double hitungLuas()
	{
		double luas;
		luas = 0.5*alas*tinggi;
		return luas;
	}

	public double hitungKeliling()
	{
		double keliling;
		keliling = 3 * sisi;
		return keliling;
	}

}