package factory;

public class FactroyMain {
	public static void main(String[] args) {
		
		RobotFactory rf = new HeavyRobotFactory();
		Robot r = rf.createRobot("heavy");
		Robot r2 = rf.createRobot("light");
		
		System.out.println("�� �κ��� Ÿ���� "+r.getName()+" Ÿ�� �Դϴ�.");
		System.out.println("�� �κ��� Ÿ���� "+r2.getName()+" Ÿ�� �Դϴ�.");
		
		RobotFactory mrf = new ModifiedHeavyRobotFactory();
		Robot r3 = mrf.createRobot("factory.HeavyRobot");
		Robot r4 = mrf.createRobot("factory.LightRobot");
		
		System.out.println("�� �κ��� Ÿ���� "+r3.getName()+" Ÿ�� �Դϴ�.");
		System.out.println("�� �κ��� Ÿ���� "+r4.getName()+" Ÿ�� �Դϴ�.");
	}
}
