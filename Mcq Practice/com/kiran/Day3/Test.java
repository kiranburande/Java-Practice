package com.kiran.Day3;

class Demo {
	int x;
	int y;
	public Demo() {
		x = 10;
		y = x++;
		x = this.y + this.x;
		this.y = x + this.y;
	}
	public Demo(int x, int y) {
		this.x = this.x + x;
		this.y = this.x + y;
	}
}
public class Test {
	public static void main(String[] args) {
		System.out.print(new Demo().x + new Demo().y);
		Demo demo = new Demo(20, 45);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}