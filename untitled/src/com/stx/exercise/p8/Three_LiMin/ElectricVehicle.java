package com.stx.exercise.p8.Three_LiMin;

/**
 * 共享电动车
 */

// 继承 Vehicle
public class ElectricVehicle extends Vehicle {


    //写出当前类的构造方法，在构造方法里面调用父类的构造方法完成 id, 状态 的初始化
    public ElectricVehicle(String id, int status) {
        super(id, status);
    }
    // 从写 父类showInfo(){} 方法， 返回值为 : "共享电动车每小时收费5元";
    public String showInfo(){
        return "共享电动车每小时收费5元";
    }
}
