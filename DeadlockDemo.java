package Deadlock;
class Crane
{
	  synchronized void Eat(Frog frog)
	  {
 
		  String name=Thread.currentThread().getName();
	  System.out.println(name+" entered Crane.Eat");
	    
	  //  System.out.println(" entered Crane.Eat");
	    try
	    {
	    //  Thread.sleep(1000);
	    }catch(Exception e){
	      System.out.println("Crane interrupted ");
	    }
	   System.out.println(name+" trying to call Frog last() ");
	//    System.out.println(" trying to call Frog last() ");
	    frog.LeaveF();
	  }
	  synchronized void LeaveC()
	  {
	    System.out.println("Inside Crane.last");
	  }
	}
	class Frog
	{
	  synchronized void Escape(Crane crane)
	  {
	    String name=Thread.currentThread().getName();
	    System.out.println(name+" entered Frog.Escape");
	   // System.out.println(" entered Frog.Escape");
	    try{
	   //   Thread.sleep(1000);
	    }catch(Exception e){
	      System.out.println("B interrupted");
	    }
	   System.out.println(name+" trying to call Crane.last()");
	   // System.out.println(" trying to call Crane.last()");
	      crane.LeaveC();
	    }
	    synchronized void LeaveF()
	    {
	      System.out.println("Crane Last");
	    }
	}
	
	class deadlock implements Runnable{
		  Crane crane=new Crane();
		  Frog frog =new Frog();
		  deadlock(){
		    Thread.currentThread().setName("MainThread");
		    Thread t = new Thread(this, "RunningThread");
		    t.start();
		    crane.Eat(frog);
		    System.out.println("Back in main thread"); 
		  }
		  public void run(){
		    frog.Escape(crane);
		    System.out.println("Back in other thread");
		  }
		   public static void main(String args[]){
		     new deadlock();
		   }
		}
	
	