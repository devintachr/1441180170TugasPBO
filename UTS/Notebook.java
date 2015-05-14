public class Notebook extends komputer {
	int prosesor;
	int baterai;
	
	public Notebook(int inputprosesor, int inputmemori, int inputstorage, int inputbaterai){
		prosesor = inputprosesor;
		memori = inputmemori;
		storage = inputstorage;
		baterai = inputbaterai;

	}
	public void CetakSpesifikasi(){
		System.out.println("Kecepatan prosesor komputer ="+ getProsesor());
		System.out.println("Kecepatan prosesor notebook ="+prosesor);
		System.out.println("Kapasitas memori ="+memori);
		System.out.println("Kapasitas storage ="+storage);
		System.out.println("Kapasitas baterai ="+baterai);
		System.out.println();
		
	}
	public void Overclock(int prosesor){
		prosesor = prosesor;
		System.out.println("Notebook dioverclock dengan kecepatan prosesor "+ prosesor);

	}
}