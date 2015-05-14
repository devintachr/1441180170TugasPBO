import java.util.Scanner;
class TestTabungan{
	
public static void main(String[] args) {

		Tabungan satu = new Tabungan();
		Tabungan dua = new Tabungan(2000000);
		
		
		Scanner uang = new Scanner(System.in);
		System.out.println("Pemilik Rekening Pertama	= "+ satu.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+satu.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+satu.getNoRek());
		System.out.println("Bunga 				= "+satu.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.print("Masukkan Pilihan = ");
		int s = uang.nextInt();
    	switch (s) 
    	{
    	case 1 :
			satu.menabung();
			satu.saldo();
        break;
        case 2 :
			satu.mengambil();
			satu.saldo();
		break;
		case 3 :
			satu.menransfer();
			satu.saldo();
		break;
		case 4 :
			satu.menerima();
			satu.saldo();
		break;
		default:
			System.out.println("Error");
			break;

		}
		System.out.println();
		System.out.println("Pemilik Rekening Kedua		= "+ dua.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+dua.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+dua.getNoRek());
		System.out.println("Bunga 				= "+dua.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.print("Masukkan Pilihan = ");
		int d = uang.nextInt();
    	switch (d) 
    	{
    	case 1 :
		dua.menabung();
		dua.saldo();
		break;
		case 2 :
		dua.mengambil();
		dua.saldo();
		break;
		case 3 :
		dua.saldo();
		dua.menransfer();
		break;
		case 4 :
		dua.menerima();
		dua.saldo();
		break;
		default:
			System.out.println("Error");
			break;
		}

	}
	
}
