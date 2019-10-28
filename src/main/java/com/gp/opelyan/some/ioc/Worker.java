package com.gp.opelyan.some.ioc;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/10/28 10:22
 */
public class Worker {
    private Tools tools;
    //set注入
    //容器会通过这个方法自动将Tools的子类对象传递进来
    private void setTools(Tools tools){
        this.tools = tools;
    }

    public void work(){
        tools.repair();
    }
}
