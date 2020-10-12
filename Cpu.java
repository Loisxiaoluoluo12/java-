package computer;

public class Cpu {
	int speed;
	private String band;
	int price;
	public int getSpeed() {
		return speed;
	}
    public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	Cpu(){
	    	
	    }
	Cpu(int speed,String band){
    	this.speed=speed;
    	this.band=band;
    
    }
    Cpu(int speed,String band,int price){
    	this.speed=speed;
    	this.band=band;
    	this.price=price;
    }
    public void setSpeed(int m) {
		this.speed = m;
	}
    private void judge(int speed){
    if(speed>3){
		System.out.println("错误");
	}}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Cpu cpu1=new Cpu(300,"intel");
    	System.out.println("Cpu的信息是:"+cpu1.speed+","+cpu1.band);
        cpu1.judge(cpu1.speed);
    	
	}
}
