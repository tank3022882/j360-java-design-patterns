package me.qsh.newborn;

/**
 * 代理组建
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class ProxyComponet implements Componet {

    private RealComponet realComponet;

    public ProxyComponet() {
        this.realComponet = new RealComponet();
    }

    public String operation() {
        before();
        String operation = realComponet.operation();
        atfer();
        return operation;
    }

    private void before() {
        System.out.println("执行代理之前...!");
    }

    private void atfer() {
        System.out.println("执行代理之后...!");
    }

}
