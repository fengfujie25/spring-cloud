package letcode.threads;

import java.util.concurrent.CountDownLatch;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-22
 */
public class SequentialExecution {

    private CountDownLatch countDownLatchOne = new CountDownLatch(1);

    private CountDownLatch countDownLatchTwo = new CountDownLatch(1);

    public class Foo {

    }

    public void frist(Runnable one) {
        one.run();
        countDownLatchOne.countDown();
    }

    public void two(Runnable two) throws InterruptedException {
        countDownLatchOne.await();
        two.run();
        countDownLatchTwo.countDown();
    }

    public void three(Runnable three) throws InterruptedException {
        countDownLatchTwo.await();
        three.run();

    }

}
