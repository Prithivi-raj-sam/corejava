package com.chainsys.threads;

public class Workerthread extends Thread  {
	 private int amount;
		@Override 
		public void run() 
		{
			execute();
		}
		public void execute()
		{
		  long id=Thread.currentThread().getId();
		  System.out.println("Inside execute ThreadID "+id+" Amount "+amount);
		  try{
		   for(int i=0;i<5;i++)
		   {
			amount=i+10;
		    System.out.println(id+ "  " + amount);
		    Thread.sleep(1000);
	       }
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
	}

}
