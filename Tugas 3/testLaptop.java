class testLaptop {

	public static void main(String[] args) {

		laptop satu = new laptop();
		laptop dua = new laptop("Dell", "biru");
		laptop tiga = new laptop("Acer", "kuning","Nyala");
		laptop empat = new laptop("Asus", "hitam","Mati", 25);



		//getters
		System.out.println("Laptop satu       Merk = " + satu.getMerk() + 
			"  Warna = " + satu.getWarna() + "  Wifi = " + satu.getWifi() + "  Baterai = " + satu.getBaterai()+"%");
		System.out.println("Laptop dua       Merk = " + dua.getMerk() + 
			"  Warna = " + dua.getWarna() + "  Wifi = " + dua.getWifi() + "  Baterai = " + dua.getBaterai() + "%");
		System.out.println("Laptop tiga       Merk = " + tiga.getMerk() + 
			"  Warna = " + tiga.getWarna() + "  Wifi = " + tiga.getWifi() + "  Baterai = " + tiga.getBaterai() + "%");
		System.out.println("Laptop empat       Merk = " + empat.getMerk() + 
			"  Warna = " + empat.getWarna() + "  Wifi = " + empat.getWifi() + "  Baterai = " + empat.getBaterai() + "%");


		System.out.println();
		System.out.println();
		System.out.println();


		//setters
		satu.setWarna("Hijau");
		dua.setMerk("Samsung");
		tiga.setMerk("Lenovo");
		tiga.setWarna("Merah Jambu");
		empat.setBaterai(99);
		empat.setMerk("Merk Baru");


		System.out.println("Laptop satu       Merk = " + satu.getMerk() + 
			"  Warna = " + satu.getWarna() + "  Wifi = " + satu.getWifi() + "  Baterai = " + satu.getBaterai()+"%");
		System.out.println("Laptop dua       Merk = " + dua.getMerk() + 
			"  Warna = " + dua.getWarna() + "  Wifi = " + dua.getWifi() + "  Baterai = " + dua.getBaterai() + "%");
		System.out.println("Laptop tiga       Merk = " + tiga.getMerk() + 
			"  Warna = " + tiga.getWarna() + "  Wifi = " + tiga.getWifi() + "  Baterai = " + tiga.getBaterai() + "%");
		System.out.println("Laptop empat       Merk = " + empat.getMerk() + 
			"  Warna = " + empat.getWarna() + "  Wifi = " + empat.getWifi() + "  Baterai = " + empat.getBaterai() + "%");

	}
}