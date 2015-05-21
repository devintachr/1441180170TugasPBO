public class Segitiga{
	int tinggi;
	int alas;

	public Segitiga(int inputTinggi, int inputAlas){
		tinggi = inputAlas;
		alas = inputAlas;
	}
	public int luasSegitiga(){
		int luas;
		luas = tinggi/2 *alas;
		return luas;
	}
	public int kelilingSegitiga(){
		int keliling;
		keliling = 3*alas;
		return keliling;
	}
	public void cetakHasil(){
		System.out.println("Tinggi = "+tinggi);
		System.out.println("Alas = "+alas);
		System.out.println("Luas segitiga = "+ luasSegitiga());
		System.out.println("Keliling segitiga = "+ kelilingSegitiga());
	}

}