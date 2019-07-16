package ThreadDemo;

public class ThreadDemo01{


    public static int tickets = 10;
    public static void main(String[] args) {
        new Thread(new ChangeThread()).start();
        new Thread(new ChangeThread()).start();

    }
}

class ChangeThread implements Runnable{


    @Override
    public void run() {

        while (ThreadDemo01.tickets>0){
            synchronized (ThreadDemo01.class){
                ThreadDemo01.tickets--;
                System.out.println(Thread.currentThread().getId()+"窗口，卖出一张票，剩余票数为："+ThreadDemo01.tickets);
            }
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}