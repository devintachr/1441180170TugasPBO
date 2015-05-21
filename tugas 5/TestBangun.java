public class TestBangun
{
	public static void main(String[] args)
	{
		Lingkaran bundar = new Lingkaran();

		bundar.rad = 7;

		bundar.cetakKeLayar();

		System.out.println("luas: " + bundar.hitungLuas());

		System.out.println("keliling: " + bundar.hitungKeliling());

		bundar.ubahProperty(14);

		System.out.println("Property Baru =");

		bundar.cetakKeLayar();

		System.out.println("luas baru: " + bundar.hitungLuas());

		System.out.println("keliling baru: " + bundar.hitungKeliling());

		Segitiga bentuk = new Segitiga();

		bentuk.alas = 5;

		bentuk.tinggi = 7;

		bentuk.sisi = 8;

		bentuk.cetakKeLayar();

		System.out.println("luas: " + bentuk.hitungLuas());

		System.out.println("keliling: " + bentuk.hitungKeliling());

		bentuk.ubahProperty(6,8,9);

		System.out.println("Property Baru =");

		bundar.cetakKeLayar();

		System.out.println("luas baru: " + bentuk.hitungLuas());

		System.out.println("keliling baru: " + bentuk.hitungKeliling());
}
}
