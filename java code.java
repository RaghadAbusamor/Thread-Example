
class OddNumber implements Runnable
{
   Thread mythread ;
   OddNumber()
   {
      mythread = new Thread(this, "my runnable thread");
      System.out.println("my thread created" + mythread);
      mythread.start();
   }
   public void run()
   {
        System.out.println("Started oddnumbers thread");

           for (int i=0;i<5;i++){
           System.out.println("Number"+ (2*i+1));
               }
               System.out.println("Ended oddnumbers thread");
   }



}
class RunnableExample
{
    public static void main(String args[])
    {
       OddNumber num = new OddNumber();
       try
       {
          while(num.mythread.isAlive())
          {
            System.out.println("Main thread will be alive till the child thread is live");
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}
