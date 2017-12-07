package me.qsh.newborn;

/**
 * 测试线程
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-07 。
 * ============================================================================
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println(Singleton.getInstance().hashCode());
//        System.out.println(LazySingleton.getInstance().hashCode());
//        System.out.println(LockingSingleton.getInstance().hashCode());
//        System.out.println(InternalClassSingleton.getInstance().hashCode());
//        System.out.println(EnumSingleton.getInstance().hashCode());
    }

    public static void main(String[] args) {
        TestThread[] mts = new TestThread[50];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new TestThread();
        }
        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }

}
