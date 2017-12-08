package me.qsh.newborn.shallow;

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
public class WordDocument implements Cloneable {

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
            // 浅拷贝（引用类型为原对象所指向的）
            WordDocument doc = (WordDocument) super.clone();
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
