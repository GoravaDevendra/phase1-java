import java.util.Scanner;
class MG {
	void a1() {
		System.out.println("A1 in MG");
	}
}
class car extends MG {
	void a2() {
		System.out.println("a2 in car");
	}
}
class engine extends car{
	void a3() {
		System.out.println("a3 in engine");
	}
}
public class Test {
		public static void main(String[]args) {
			car car1=new car();
			engine engine1=new engine();
			car1.a1();
			car1.a2();
			engine1.a2();
	}

}
