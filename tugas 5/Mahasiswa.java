  public class Mahasiswa {
  	String nama;
  	int umur;

  	public Mahasiswa (String inputNama, int inputUmur){
  		nama = inputNama;
  		umur = inputUmur;
  	}
  	public String getNama(){
  		return nama;
  	}
  	public void setNama(String namaMhs){
  		nama = namaMhs;
  	}
  	public int getUmur(){
  		return umur;
  	}
  	public void setUmur(int umurMhs){
  	umur = umurMhs;
  	}

  	public void tampilkanBiodata(){
  		System.out.println("BIODATA");
  		System.out.println();
  		System.out.println("nama = "+getNama());
  		System.out.println("umur = "+getUmur());
  	}
  }