package FooBarAlternative;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;

    private Semaphore fooSemafor = new Semaphore(1);
    private Semaphore barSemafor = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            fooSemafor.acquire();
            printFoo.run();
            barSemafor.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            barSemafor.acquire();
            printBar.run();
            fooSemafor.release();
        }
    }
}
