class Deposit implements Runnable {
    private static int bal = 0;
    public static int getbalance() {
    return bal;
    }
    public void run() {
    bal += 1;
    }
    }
    class Main {
    public static void main(String[] args) {
    Thread[] threads = new Thread[100];
    for (int i = 0; i < 100; i++) {
    threads[i] = new Thread(new Deposit());
    threads[i].start();
    }
    System.out.println(Deposit.getbalance());
    }
    }
    //SOLVING THE PROBLEM USING SYNCHRONIZATION
    class Deposit implements Runnable {
    private static int bal = 0;
    public static synchronized int getBalance() {
        return bal;
}
public synchronized void run() {
bal += 1;
}
}
class Main {
public static void main(String[] args) {
Thread[] threads = new Thread[100];
for (int i = 0; i < 100; i++) {
threads[i] = new Thread(new Deposit());
threads[i].start();
}
for (int i = 0; i < 100; i++) {
try {
threads[i].join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println(Deposit.getBalance());
}
}