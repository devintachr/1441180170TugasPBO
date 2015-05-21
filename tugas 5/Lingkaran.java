public class Lingkaran{
	int rad;

	public void cetakKeLayar()
	{
		System.out.println("Lingkaran");
		System.out.println("rad = " +rad);
	}

	public void ubahProperty(int radBaru)
	{
		rad = radBaru;
	}

	public double hitungLuas(){
		double luas;
		luas = Math.PI * rad * rad;
		return luas;
	}

	public double hitungKeliling()
	{
		double keliling;
		keliling = 2*rad*Math.PI;
		return keliling;
	}

}