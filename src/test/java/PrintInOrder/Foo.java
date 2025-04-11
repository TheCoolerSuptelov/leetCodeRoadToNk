package PrintInOrder;

import java.util.concurrent.Semaphore;

class Foo {

    private Semaphore semaphoreForFirst = new Semaphore(1);
    private Semaphore semaphoreForSecond = new Semaphore(0);
    private Semaphore semaphoreForThird = new Semaphore(0);


    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        semaphoreForFirst.acquire();
        printFirst.run();
        semaphoreForSecond.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        semaphoreForSecond.acquire();
        printSecond.run();
        semaphoreForThird.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        semaphoreForThird.acquire();
        printThird.run();
    }
}