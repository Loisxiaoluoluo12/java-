# java-
Java作业
# 实验内容
1.project：Computer  
2.Package: computer  
3.Class:Pc   Cpu   HardDisk   Test  
(1)Pc类中先定义Pc的属性，建立Pc的两个构造方法，得到属性相关的set和get方法用来传值，创建check（）和show（）方法，这两个方法分别用来进行判断和输出相关的内容。   
(2)Cpu类中先定义Pc的属性，建立Cpu的三个构造方法，得到属性相关的set和get方法用来传值，创建judge（）方法，用来进行逻辑判断，主方法中实例化一个Cpu，并同时调用构造方法，输出相关内容，调用judge（）。  
(3)HardDisk类中先定义HardDisk的属性，建立HardDisk的三个构造方法，得到属性相关的set和get方法用来传值，创建find（）方法，用来进行逻辑判断，主方法中实例化一个HD，并同时调用构造方法。  
(4)Test类中分别实例化Pc，Cpu，HardDisk，通过调用get和set方法，构造方法进行传值。
## 实验目的
1.学会类中属性和方法的定义。   
2.学会构造方法的定义和使用。  
3.熟悉private protected public等四个权限的使用。   
## 实验过程
1.首先建立四个不同的类。  
2.完善类中的内容。   
3.调用类中的相关信息。  
4.运行程序，展示结果。  
## 核心方法
(1)构造方法
```
Pc(float price,String brand){
		this.price=price;
		this.brand=brand;
	}
```
(2)set和get方法
```
public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
```
  (3)逻辑判断的普通方法
```
  public void check(float price){
		if(price>8000){
			System.out.println("审批通过");
		}else{
			System.out.println("审核不通过，请购买其他的商品");
		}
		}
```
## 实验结果
(1)Test类运行结果  
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/ruAMsa53pVQWN7FLK88i5nTUByIa3bhU1B8LNwNvb.*hnBco1JpOT*iH2wTjDxO8bofGVmVdpZGNM1uVPOdr.ebN*8F0loqZWTAKBm3AdE0!/b&bo=nAG3AAAAAAADBwg!&rf=viewer_4)）   
(2)Cpu类运行结果  
![alt console](http://m.qpic.cn/psc?/V52yqGBZ0K1FfT4VLt0D434dKK44lH1q/ruAMsa53pVQWN7FLK88i5izmTt4TtH05AzIVY7Jo1auNte6YTSeF1XsTW049spv25eKmPvxo2wajO454*l.3LX6M9bJjQPsnRcux1fWu7E4!/b&bo=DgK8AAAAAAADB5I!&rf=viewer_4)
## 实验感想
在该实验中，我掌握如何写构造方法、掌握了权限的使用要求，并知道了如何向方法中传递信息和从方法中返回信息。
