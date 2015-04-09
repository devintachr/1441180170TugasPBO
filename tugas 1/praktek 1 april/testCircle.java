class testCircle {
	public static void main(String[] args) {
		circle cahya = new circle();
		circle ardi = new circle(34);
		System.out.println("Radius = "+ cahya.getRadius() + " Color = "+ cahya.getColor() + " Luas = "+ cahya.getArea());
		System.out.println("Radius = "+ ardi.getRadius() + " Color = "+ ardi.getColor() + " Luas = "+ ardi.getArea());
	}
}