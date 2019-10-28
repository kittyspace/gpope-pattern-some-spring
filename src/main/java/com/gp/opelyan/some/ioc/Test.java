package com.gp.opelyan.some.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/10/28 10:23
 */
public class Test {

    public static void main(String[] args){
        //工厂容器
        BeanFactory factory = new DefaultListableBeanFactory();
        //从容器中直接获取Worker对象
        Worker worker = factory.getBean("worker", Worker.class);
        worker.work();
    }

}
