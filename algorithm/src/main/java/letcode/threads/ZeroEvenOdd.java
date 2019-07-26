package letcode.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-22
 */
public class ZeroEvenOdd {
    private int n;

    private ReentrantLock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();
    private volatile int count = 1;
    private volatile boolean zero = true;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            lock.lock();
            if (!zero) {
                c1.await();
            }
            printNumber.accept(0);
            zero = false;
            if (count % 2 == 0) {
                c2.signalAll();
            } else {
                c3.signalAll();
            }
            lock.unlock();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n / 2; i++) {
            lock.lock();
            if (zero || count % 2 == 1) {
                c2.await();
            }
            printNumber.accept(count);
            count++;
            zero = true;
            c1.signalAll();
            lock.unlock();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        int l = n % 2 == 0 ? n / 2 : n / 2 + 1;
        for (int i = 0; i < l; i++) {
            lock.lock();
            if (zero || count % 2 == 0) {
                c3.await();
            }
            printNumber.accept(count);
            count++;
            zero = true;
            c1.signalAll();
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd a = new ZeroEvenOdd(2);
    }
}
