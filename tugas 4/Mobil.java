class Mobil{

	
	private int kec;
	private String posisi; 
	private String noPlat;
	private String merk;
	private String warna;
	private String mesin;


	public Mobil(int kecInput, String posisiInput, String noPlatInput, String merkInput, String warnaInput, String mesinInput)
	{
 		kec = kecInput;
	 	posisi = posisiInput; 
	 	noPlat = noPlatInput;
	 	merk = merkInput; 
	 	warna = warnaInput;
	 	mesin = mesinInput;
	}
	


	

	public void maju()
	{
		System.out.println("Mobil Maju\t= " +kec+ "Km/Hours");
	}

	public void ngebut()
	{
		kec =kec+95;
		System.out.println("Mobil Mengebut\t= " +kec+ "Km/Hours");
	}
	
	public void mundur()
	{
		kec = 30;
		System.out.println("Mobil Mundur\t= " +kec+ "Km/Hours");
	}	
	
	public void ngerem()
	{
		kec = kec - 55;
		System.out.println("Mobil Mengerem\t= " +kec+ "Km/Hours");
	}

	public void belok()
	{
		System.out.println("Mobil Belok\t= Kanan");
	}

	public void berhenti()
	{
		kec = 0;
		System.out.println("Mobil Berhenti\t= " +kec+ "Km/Hours");
	}
	


	//getter
	public int getKec()
	{
		return kec;
	}

	public String getPosisi()
	{
		return posisi;
	}

	public String getNoplat()
	{
		return noPlat;
	}

	public String getMerk()
	{
		return merk;
	}

	public String getWarna()
	{
		return warna;
	}

	public String getMesin()
	{
		return mesin;
	}



	//setter
	public int setKec(int kec)
	{
		return this.kec = kec;
	}

	public String setPosisi(String posisi)
	{
		return this.posisi = posisi;
	}

	public String setNoplat(String noPlat)
	{
		return this.noPlat = noPlat;
	}

	public String setMerk(String merk)
	{
		return this.merk = merk;
	}

	public String setWarna(String warna)
	{
		return this.warna = warna;
	}

	public String setMesin(String mesin)
	{
		return this.mesin = mesin;
	}


}