class circle{
	 double radius;
	private String color;

	public circle(){
		radius=1.0;
		color="pink";
	}
	public circle (double r){
		radius=r;
		color="pink";

	}
	public circle(double r, String c){
		radius=r;
		color=c;
	}


	public double getRadius(){
		return radius + 12;
	}
	public String getColor (){
		return color;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}

	
	public void setRadius(int r){
		radius=r;
	}
	public void setColor(String c){
		color=c;
	}
}