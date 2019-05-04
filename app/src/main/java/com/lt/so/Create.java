package com.lt.so;

/**
 * 调用C方法的类
 * Created by lt on 2019/5/3.
 */

public class Create {



    /**
     * 声明本地方法,用关键字native,本地方法不用实现,具体的实现在C代码中
     */

    public static native String helloFromC();

    /**
     * 做一个加法运算
     *
     * @return 调用C方法返回的值
     */
    public static native int add(int a, int b);
}
