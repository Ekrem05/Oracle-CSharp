
 class MessageReposity{
    private String message;
    private boolean hasMessage = false;

    public synchronized String read(){
        while(!hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        hasMessage = false;
        notifyAll();
        return message;
    }
    public synchronized void write(String message){
        while(hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hasMessage = true;
        notifyAll();
        this.message = message;
    }
}
public class Main {
    public static void main(String[] args) {

        MessageReposity mr = new MessageReposity();
        Thread thread = new Thread(()->mr.write("Helloооо"));
        Thread threadRead = new Thread(()->{String mess=mr.read(); System.out.println(mess);});
        threadRead.start();
        thread.start();

    }
}