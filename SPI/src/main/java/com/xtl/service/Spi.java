package com.xtl.service;

import java.util.ServiceLoader;

/**
 * @author 31925
 * @className Spi
 * @description SPI测试
 * @date 2022/5/10 8:43
 */
public class Spi {
    public static void main(String[] args) {
        ServiceLoader<Superman> serviceLoader=ServiceLoader.load(Superman.class);
        System.out.println("Java SPI:");
        serviceLoader.forEach(Superman::introduce);
    }
}
