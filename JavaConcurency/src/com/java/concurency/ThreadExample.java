package com.java.concurency;

public class ThreadExample {

	public static class StoppableRunnable implements Runnable {
		private boolean stopRequested = false;
		
		public synchronized void requestStop() {
			this.stopRequested = true;
		}
		
		public synchronized boolean isStopRequested() {
			return this.stopRequested;
		}
		
		private void sleep(long mills) {
			try {
				Thread.sleep(mills);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
