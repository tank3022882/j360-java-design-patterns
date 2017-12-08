package me.qsh.newborn.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文档 ConcretePrototype 角色，而 cloneable 是代表 prototype 角色
 * ============================================================================
 * 版权所有 2017 。
 *
 * @author fallenpanda
 * @version 1.0 2017-12-08 。
 * ============================================================================
 */
public class WordDocument implements Cloneable, Serializable {

    private static final long serialVersionUID = -8155582050206654607L;

    public WordDocument() {
        System.out.println("WordDocument构造函数");
    }

    private String text;

    private List<String>  images = new ArrayList<String>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getImages() {
        return images;
    }

    public void addImage(String img) {
        this.images.add(img);
    }

    /**
     * 克隆对象
     */
    @Override
    protected WordDocument clone() {
        try {
            // 深拷贝

            /* 写入当前对象的二进制流 */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            /* 读出二进制流产生的新对象 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            WordDocument doc = (WordDocument) ois.readObject();

            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("Text : " + text);
        System.out.println("Images List: ");
        for (String imgName : images) {
            System.out.println("image name : " + imgName);
        }
    }

}
