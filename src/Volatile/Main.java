package Volatile;

public class Main {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();
        System.out.println("Shared Resouce Created and it's flag value is "+sharedResources.getFlag());
        Thread A = new Thread(()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResources.toggleFlag();
            System.out.println("ThreadA Finished, flag is "+sharedResources.getFlag());
        });
        A.start();
        Thread B = new Thread(()->{
            while(!sharedResources.getFlag()){
            System.out.println("Inside loop "+sharedResources.getFlag());
            }
            System.out.println("In Thread B, Flag is :"+sharedResources.getFlag());
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        });
        B.start();
    }
}
