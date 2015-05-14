class TestMobil{

	public static void main(String[] args) {
		
		Mobil daihatsu = new Mobil(100, "Di poltek", "b 1234 gpp", "avanza", "putih Metalic", "avanza gr");
		Mobil honda = new Mobil(150, "Di ub", "n 4545 trs", "avanza", "putih Metalic", "avanza z");

		System.out.println("Mobil daihatsu:\nKecepatan\t: "+daihatsu.getKec()+"Km/hour"+"\nPosisi\t\t: "+daihatsu.getPosisi()+"\nNomor Plat\t: "+daihatsu.getNoplat()+"\nMerk\t\t: "+daihatsu.getMerk()+"\nWarna\t\t: "+daihatsu.getWarna()+"\nMesin\t\t: "+daihatsu.getMesin());
		
		System.out.println();
		daihatsu.maju();
		daihatsu.ngebut();
		daihatsu.ngerem();	
		daihatsu.mundur();
		daihatsu.belok();
		daihatsu.berhenti();
		
		System.out.println();
		System.out.println("Mobil honda:\nKecepatan\t: "+honda.getKec()+"Km/hour"+"\nPosisi\t\t: "+honda.getPosisi()+"\nNomor Plat\t: "+honda.getNoplat()+"\nMerk\t\t: "+honda.getMerk()+"\nWarna\t\t: "+honda.getWarna()+"\nMesin\t\t: "+honda.getMesin());

		System.out.println();
		honda.maju();
		honda.ngebut();
		honda.ngerem();
		honda.mundur();
		honda.belok();
		honda.berhenti();

		System.out.println();
		System.out.println("Setelah Modif: \n");
		daihatsu.setKec(300);
		daihatsu.setMesin("avanza matic power>");
		daihatsu.setWarna("gold Metalic"); 
		daihatsu.setNoplat("n 4341 tA");
	
		System.out.println("Mobil :\nKecepatan\t: "+daihatsu.getKec()+"Km/hour"+"\nPosisi\t\t: "+daihatsu.getPosisi()+"\nNomor Plat\t: "+daihatsu.getNoplat()+"\nMerk\t\t: "+daihatsu.getMerk()+"\nWarna\t\t: "+daihatsu.getWarna()+"\nMesin\t\t: "+daihatsu.getMesin());


	}

	
}