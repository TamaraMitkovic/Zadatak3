

public class Aplikacija {
	public static void main(String [] args) {
		Smartphone sm=new Smartphone("069668046", new OSistem(Tip.ANDROID, 8),Stanje.ISKLJUCEN, -1);
		System.out.println(sm.turnOn());
		System.out.println(sm.sleep());
		System.out.println(sm.wakeUp());
		System.out.println(sm.startUpdate(9));
		System.out.println(sm.finishUpdate());
		System.out.println(sm.turnOff());
		System.out.println();
		System.out.println(sm);
	}
}
