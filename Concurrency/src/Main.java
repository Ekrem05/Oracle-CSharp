//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        printThreadInfo(Thread.currentThread());
//
//        Thread firstThread = new Thread(() -> {
//
//            for(int i=0;i<10;i++){
//                System.out.println("Thread 1");
//                try {
//                    Thread.sleep(800);
//                }
//                catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });Thread secondThread = new Thread(() -> {
//
//            for(int i=0;i<10;i++){
//                System.out.println("Thread 2");
//                try {
//                    Thread.sleep(800);
//                }
//                catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//        firstThread.start();
//        secondThread.start();
//        try {
//            firstThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Finished");

        BankAccount account = new BankAccount(10000);
        Thread depositThread = new Thread(() -> {account.deposit(3000);});
        Thread withdrawThread = new Thread(() -> {account.withdraw(4000);});
        Thread depositAgainThread = new Thread(() -> {account.deposit(3000);});

        depositThread.start();
        withdrawThread.start();
        depositAgainThread.start();
        try
        {
            depositThread.join();
            withdrawThread.join();
            depositAgainThread.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Current balance: "+account.getBalance());
    }

    public static void printThreadInfo(Thread thread) {
        System.out.println("----------------------");
        System.out.println("Thread ID: "+thread.getId());
        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread State: "+thread.getState());
        System.out.println("Thread Priority: "+thread.getPriority());
        System.out.println("Thread Group Name: "+thread.getThreadGroup().getName());
        System.out.println("IsAlive: "+thread.isAlive());

    }
}