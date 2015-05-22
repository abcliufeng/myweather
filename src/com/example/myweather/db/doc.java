package com.example.myweather.db;

public class doc {
/*�������ģʽ��
 *�����ĺ��Ľṹ��ֻ����һ������Ϊ������������ࡣͨ������ģʽ���Ա�֤ϵͳ��һ����ֻ��һ��ʵ�����Ҹ�ʵ������
 *�����ʣ��Ӷ������ʵ�������Ŀ��Ʋ���Լϵͳ��Դ�����ϣ����ϵͳ��ĳ����Ķ���ֻ�ܴ���һ��������ģʽ����õ�
 *���������
 *����ʵ�ֽǶ���˵�������������㣺һ�ǵ���ģʽ����ֻ�ṩ˽�еĹ��캯���������ඨ���к���һ������ľ�̬˽�ж���
 *���Ǹ����ṩ��һ����̬�Ĺ��еĺ������ڴ������ȡ������ľ�̬˽�ж���
 *Singletonģʽ��Ҫ�����Ǳ�֤��JavaӦ�ó����У�һ����Classֻ��һ��ʵ�����ڡ�
һ��Singletonģʽͨ����������ʽ:
��һ����ʽ:����ʽ��Ҳ�ǳ��õ���ʽ��	
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
�ڶ�����ʽ:����ʽ
�Ե�һ��static��һЩ����
java����������һ�������涨�徲̬�ࡣ�����ڲ��ࣨnested class����
��nested class�������������ⲿ�ࡣ
��java�У����ǲ�����static���ζ����ࣨtop level class����
ֻ���ڲ������Ϊstatic��
public static class Singleton{
    ���Լ��ڲ������Լ���һ��ʵ����ֻ���ڲ�����
    private static final Singleton instance = new Singleton();
    private Singleton(){
        //do something
    }
    �����ṩ��һ�����ⲿ���ʱ�class�ľ�̬����������ֱ�ӷ���
    public static Singleton getInstance(){
        return instance;
    }
}
��������ʽ: ˫��������ʽ��
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
