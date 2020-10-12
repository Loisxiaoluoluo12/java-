package computer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu cpu=new Cpu();
		HardDisk disk=new HardDisk();
		Pc pc=new Pc(4000,"联想");
		pc.check(pc.getPrice());
		cpu.setSpeed(2200);
		disk.setAccount(200);
		pc.setCpu(cpu);
		pc.setHD(disk);
		pc.show();
	}

}
