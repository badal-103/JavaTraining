package com.citibank.main;

import com.citibank.main.domain.GoodAfternonnGreeter;
import com.citibank.main.domain.GoodMorningGreeter;
import com.citibank.main.domain.Greeter;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter greeter = new GoodMorningGreeter();
		greeter.greet();
		System.out.println("-----------------------------------------");
		
		Greeter goodEveningGreeter = new Greeter() {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Good evening!!");
				
			}
			
		};
		goodEveningGreeter.greet();
		System.out.println("-----------------------------------------");
		
		Greeter greeter2 = () -> System.out.println("MyWayyyy");
		greeter2.greet();
		
		System.out.println("-----------------------------------------");
		Greeter goodNightGreeter = () -> System.out.println("Good Night");
		goodNightGreeter.greet();
		
		System.out.println("-----------------------------------------");
		
		Runnable runnable = () -> System.out.println("we are in thread");
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("-----------------------------------------");
		Thread thread2 = new Thread(
				() -> System.out.println("We are in thread")
		);
		thread2.start();
		
		System.out.println("-----------------------------------------");
		
		new Thread(() -> System.out.println("We are in thread")).start();
		
		System.out.println("-----------------------------------------");
		
		new Thread(() -> {
			for(int i =0; i<=10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("thread id running");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("catch block exception");
					e.printStackTrace();
				}
				System.out.println("Helleo");
			}
		}).start();
				
		
		
	}
}



		


