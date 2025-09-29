package com.nacs.collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import com.nacs.collection.queue.entities.Menu;

public class BlockingQueueDemo {
	public static void main(String[] args) {
		Menu[] orderArray= {
				new Menu(1,"Papad Masasla", 50F),
				new Menu(2, "Chicken Masala", 250F),
				new Menu(3, "Palak Paneer", 200F),
				new Menu(4, "Shev Bhaji", 225F),
				new Menu(5, "Chicken Biryani", 275F),
				new Menu(6, "Gulab Jamun", 100F)
		};
		
		BlockingQueue<Menu> stow = new PriorityBlockingQueue<>(2,(m1,m2)->(int)(m1.getPrice()-m2.getPrice()));
		
		Thread waiter = new Thread(()->{
			try {
				for(Menu order:orderArray) {
					Thread.sleep(100);
					stow.put(order);
					System.out.println("Order Placed: " + order);
				}
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread kitchen = new Thread(()->{
			try {
				for(int i=0;i<orderArray.length;i++) {
					Thread.sleep(1000);
					System.out.println("Order Completed: " + stow.take());
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		waiter.start();
		kitchen.start();
	}
}













