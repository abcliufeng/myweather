package com.example.myweather.db;

public class doc {
/*单例设计模式：
 *在它的核心结构中只包含一个被称为单例类的特殊类。通过单例模式可以保证系统中一个类只有一个实例而且该实例易于
 *外界访问，从而方便对实例个数的控制并节约系统资源。如果希望在系统中某个类的对象只能存在一个，单例模式是最好的
 *解决方案。
 *具体实现角度来说，就是以下三点：一是单例模式的类只提供私有的构造函数，二是类定义中含有一个该类的静态私有对象，
 *三是该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象。
 *Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。
一般Singleton模式通常有三种形式:
第一种形式:懒汉式，也是常用的形式。	
public class SingletonClass{
    private static SingletonClass instance=null;
    public static SingletonClass getInstance()
    {
        if(instance==null)
        {
            synchronized(SingletonClass.class)
            {
                if(instance==null)
                    instance=new SingletonClass();
            }
        }
        return instance;
    }
    private SingletonClass(){
    }
}
第二种形式:饿汉式
对第一行static的一些解释
java允许我们在一个类里面定义静态类。比如内部类（nested class）。
把nested class封闭起来的类叫外部类。
在java中，我们不能用static修饰顶级类（top level class）。
只有内部类可以为static。
public static class Singleton{
    在自己内部定义自己的一个实例，只供内部调用
    private static final Singleton instance = new Singleton();
    private Singleton(){
        //do something
    }
    这里提供了一个供外部访问本class的静态方法，可以直接访问
    public static Singleton getInstance(){
        return instance;
    }
}
第三种形式: 双重锁的形式。
public static class Singleton{
    private static Singleton instance=null;
    private Singleton(){
        //do something
    }
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(null==instance){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}

 */
}
