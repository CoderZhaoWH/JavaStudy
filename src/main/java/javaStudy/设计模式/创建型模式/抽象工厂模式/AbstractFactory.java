package javaStudy.设计模式.创建型模式.抽象工厂模式;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
