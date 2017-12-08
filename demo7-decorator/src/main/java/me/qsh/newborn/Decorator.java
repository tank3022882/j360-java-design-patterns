package me.qsh.newborn;

/**
 * 装饰者
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Decorator implements Componet {

    private Decorated decorated;

    public Decorator(Decorated decorated) {
        this.decorated = decorated;
    }

    public String operation() {
        String operation = decorated.operation();
        operation = "优雅的" + operation;
        return operation;
    }

}
