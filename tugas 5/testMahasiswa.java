public class testMahasiswa {
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("Devinta Putri", 18);

		mhs.tampilkanBiodata();
		System.out.println();
		mhs.setUmur(19);
		mhs.tampilkanBiodata();
	}
}