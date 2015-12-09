package com.hj.thread.create;

public class RabbitApp {

	public static void main(String[] args) {

		Rabbit rab = new Rabbit();
		Tortoise tor = new Tortoise();
		rab.start();
		tor.start();
	}

}
