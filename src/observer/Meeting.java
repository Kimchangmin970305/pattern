package observer;

public class Meeting {

	public static void main(String[] args) {
		Singer mc = new Singer();
		
		SingerFan fan1 = new SingerFan("��1");
		SingerFan fan2 = new SingerFan("��2");
		
		mc.addFan(fan1);
		mc.addFan(fan2);
		
		mc.speak();
		
		mc.deleteFan(fan1);
		
		SingerFan fan3 = new SingerFan("��3");
		mc.addFan(fan3);
		
		mc.speak();
	}
}
