package computer;

public class HardDisk {
	int account;
	int price;
	private float storage;
	HardDisk(){
		
	}
	HardDisk(int account,int price,float storage){
	this.account=account;
	this.price=price;
	this.storage=storage;
	}
	HardDisk(int account,int price){
	this.account=account;
	this.price=price;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int m) {
		this.account = m;
	}
	public void find(int account,int price,float storage){
		if(price>200&&price<800){
			if(storage>=20){
				System.out.println("该硬盘符合要求，可以购买");
			}
		}else{
			System.out.println("该硬盘不符合要求");
		}
	}
	public static void main(String[] args) {
		HardDisk HD=new HardDisk(800,800,20);
		
	}
	
}
