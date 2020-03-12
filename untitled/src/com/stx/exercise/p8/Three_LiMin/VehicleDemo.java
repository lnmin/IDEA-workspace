package com.stx.exercise.p8.Three_LiMin;

/**
 * Created by Administrator on 2020/3/9 0009.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        //启动demo 选择 查看车辆 的输出结果，思考结果是否和你想的一致，为什么
        /*运用多态的思维，初始化5辆共享单车和5辆电动车放在vehicleList 数组里面，
        当子类对象指向父类变量的时候，会覆盖重写的方法，所以在执行的当前类中，
          会执行本类的showInfo()方法。所以会输出不同的showInfo()方法。
        而初始化的 id 与 status 其实是对Vehicle类 中的成员变量的初始化。看上去好像是初始化了，Bike类和
         ElectricVehicle类 的构造函数，实则是对父类对象的实例变量初始化，然后再被调用在各自的子类中。
        * */
        manager.start();
    }
}
