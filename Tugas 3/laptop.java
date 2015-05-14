public class laptop {
	
		private String merk;
		private String warna;
		private String wifi;
		private int baterai;

		public laptop (){
			
		 merk	="Toshiba";
		 warna	="merah";
		 wifi 	="Nyala";
		 baterai =50;
		}
		public laptop (String inputmerk,String inputwarna ){
			
		 merk	= inputmerk;
		 warna	= inputwarna;
		 wifi 	="mati";
		 baterai = 30;
		 
		}
		public laptop (String inputmerk,String inputwarna, String inputwifi){
			
		 merk	= inputmerk;
		 warna	= inputwarna;
		 wifi 	= inputwifi;
		 baterai =75;
		 
		}
		public laptop (String inputmerk,String inputwarna, String inputwifi, int inputbaterai){
			
		 merk	= inputmerk;
		 warna	= inputwarna;
		 wifi 	= inputwifi;
		 baterai = inputbaterai;

		 
		}


		public static void menyala (){
			System.out.println("Welcome to Laptop");
		}
		public void mati (){
			System.out.println("Thankyou have a nice day");
		}
		public void indikatorBaterai(){
			System.out.println("Baterai tinggal: "+ baterai + "%");
		}
		public void indikatorWifi(){
			System.out.println("Status wifi: "+wifi);
		}
		


		public String getMerk(){
			return merk;
		}
		public String getWarna(){
			return warna;
		}
		public String getWifi(){
			return wifi;
		}
		public int getBaterai(){
			return baterai;
		}
		


		public void setMerk(String inputmerk){
		merk=inputmerk;
		}
		public void setWarna(String inputwarna){
		warna=inputwarna;
		}
		public void setWifi(String inputwifi){
		wifi=inputwifi;
		}
		public void setBaterai(int inputbaterai){
		baterai=inputbaterai;
		}
	}

