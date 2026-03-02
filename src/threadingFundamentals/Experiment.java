package threadingFundamentals;

public class Experiment {
    public static void main(String[] args) {

        Thread t1 = new MyThread();

        t1.setName("RaghvendraSecondThread");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int j=10;j>0;j--)
                {
                    System.out.println(Thread.currentThread().getName()+" = "+j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });



        t2.setName("RaghvendraThirdThread");

        t2.start();

    }

    public static class MyThread extends Thread{

        @Override
        public void run(){
            for (int i=1;i<=10;i++)
            {
                System.out.println(Thread.currentThread().getName()+" = "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
