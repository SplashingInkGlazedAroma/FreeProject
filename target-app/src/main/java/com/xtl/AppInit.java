package com.xtl;

/**
 * @author 31925
 * @ClassName AppInit
 * @Description 初始化
 * @date 2022/5/7 9:56
 */
public class AppInit {
    public static void init() {
        try {
            System.out.println("APP初始化中...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
