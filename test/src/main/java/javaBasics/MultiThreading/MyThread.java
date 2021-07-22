package javaBasics.MultiThreading;

public class MyThread extends Thread{

    MyThread(){

    }

    MyThread(Runnable runnable){
        super(runnable);
    }

    public void run(){
        System.out.println("inside thread");
    }

}

class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("in runnable");
    }
}

class Test{

    public static void main(String[] args) {
        new MyThread().start();

        new MyThread(new MyRunnable()).start();
    }
}
