package com.kiran.Day3;

class Demo333 {
	int x;
	int y;
	public Demo333() {
		x = 10;
		y = x++;
	}
	public Demo333(int x, int y) {
		this.x += this.x + x++;
		this.y -= this.x + --y;
	}
}
public class Test333 {
	public static void main(String[] args) {
		System.out.print(new Demo().x + new Demo().y);
		Demo demo = new Demo(30, 50);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}
