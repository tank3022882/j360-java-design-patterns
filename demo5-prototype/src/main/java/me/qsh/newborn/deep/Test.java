package me.qsh.newborn.deep;

/**
 * 测试
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class Test {

    /**
     * 浅拷贝
     */
    public static void main(String[] args) {
        WordDocument doc = new WordDocument();
        doc.setText("文档");
        doc.addImage("图片1");
        doc.addImage("图片2");
        doc.showDocument();

        WordDocument doc2 = doc.clone();
        doc2.showDocument();
        doc2.addImage("哈哈图片");

        doc2.setText("修改过的doc2");
        doc2.showDocument();

        doc.showDocument();
    }

}
