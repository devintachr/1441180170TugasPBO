class TestKomputer
{
	public static void main(String[] args)
	{
		Notebook asus = new Notebook(3500, 4000, 80000, 7000);
		asus.CetakSpesifikasi();
		asus.Overclock(3000);
		asus.Overclock(3200);
	}
}
