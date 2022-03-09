package com;
class Bike{
	void speed(){
		System.out.println("60km/hr");
	}
}
class Honda extends Bike{
	void color() {
		System.out.println("Grey");
	}
}
class pulsar extends Bike{
	void speed() {
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Blue");
	}
}
class Tvs extends Bike{
	void color() {
		System.out.println("Red");
	}
	void speed() {
		super.speed();
		System.out.println("10km/hr");
	}
}
public class MethodOverridingTest{
	public static void main(String[] args) {
		Honda hh=new Honda();     hh.speed(); hh.color();
		pulsar pu=new pulsar();   pu.speed(); pu.color();
		Tvs tv=new Tvs();         tv.speed(); tv.color();
	}
}
		

