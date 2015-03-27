public class delapan {
	public static void main(String[] args) {
		int n;
		for (n=1; n<21; n++){
			if(n%5==0){
				System.out.print("JONI");
			}
			else {
				System.out.print(n+" ");
			}
			if (n%11==0){
				System.out.print("\n");
			}
		}
	}
}