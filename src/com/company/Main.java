package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException{

	 Jobs.addElement("Bäcker");
	 Jobs.addElement("hacker");
	 Jobs.addElement("tester");
	 Jobs.addElement("Rennfahrer");

		Thread[] threads = new Thread[8];
		for (int i = 0; i < 8; i++){
			threads[i] = new Fred();
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		System.out.println("All Done");

    }
}
