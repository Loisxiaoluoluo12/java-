package computer;

public class Pc {
	Cpu cpu;
	HardDisk HD;
	private float price;
	private String brand;
	Pc(){
		
	}
	Pc(float price,String brand){
		this.price=price;
		this.brand=brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Cpu getCpu() {
		return cpu;
	}
	public HardDisk getHD() {
		return HD;
	}
	public void setCpu(Cpu c) {
		this.cpu = c;
	}
	public void setHD(HardDisk h) {
		HD = h;
	}
	public void check(float price){
		if(price>8000){
			System.out.println("审批通过");
		}else{
			System.out.println("审核不通过，请购买其他的商品");
		}
		}
	public void show(){
		System.out.println("Cpu的速度是:"+cpu.getSpeed());
		System.out.println("硬盘容量:"+HD.getAccount());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
 
}
