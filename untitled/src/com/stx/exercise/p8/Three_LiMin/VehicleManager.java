package com.stx.exercise.p8.Three_LiMin;

import java.util.Scanner;

public class VehicleManager {
    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);


    //构造函数
    public VehicleManager() {
        //初始化5辆共享单车和5辆电动车放在vehicleList 数组里面
        for (int i = 0; i <vehicleList.length ; i++) {
            if (i < vehicleList.length/2){
                vehicleList[i] = new Bike("V"+(i+1),0);
            }else {
                vehicleList[i] = new ElectricVehicle("SV"+(i+1),0);

            }
        }
    }


    //开始菜单
    public void start() {

        System.out.println("**************************");
        System.out.println("*******共享车管理系统********");
        System.out.println("**************************");


        boolean isExit = false;
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            String choose = scanner.nextLine();
            System.out.println("---------------------------------------------------------------");
            // 完善菜单逻辑

            switch (choose) {
                case "1": {
                    view();
                    break;
                }
                case "2": {
                    rental();
                    break;
                }
                case "3": {
                    back();
                    break;
                }
                case "4": {
                    isExit = true;
                    break;
                }
                default:{
                    System.out.println("请输入1-4");
                }
            }
        } while (!isExit);
    }

    private void view() {

        System.out.println("编号\t\t状态\t\t租车说明");
        //打印全部车辆信息 编号，状态，租车说明
        for (int i = 0; i < vehicleList.length; i++) {
            Vehicle v = vehicleList[i];
            System.out.println(v.getId() + "\t\t" + (v.getStatus() == 0 ? "可租" : "已租") + "\t\t" + v.showInfo());
        }

    }

    //租车
    private void rental() {
        System.out.println("请输入租车编号：");
        String id = scanner.nextLine();
        //遍历数组找出车辆信息租车，
        for (int i = 0; i < vehicleList.length; i++) {
            if (id.equals(vehicleList[i].getId())) {
                if (vehicleList[i].getStatus() == 0) {
                    vehicleList[i].setStatus(1);
                    System.out.println("租车成功！");
                    return;
                } else {
                    System.out.println("车辆已经被出租了！");
                    return;
                }
            }
        }
        //修改车辆状态为已经出租
        System.out.println("没有找到该编号的车辆信息，请重新输入！");
    }

    //还车
    private void back() {
        System.out.println("请输入还车编号：");
        String id = scanner.nextLine();
        //遍历数组找出车辆信息还车，
        //遍历数组找出车辆信息租车，
        for (int i = 0; i < vehicleList.length; i++) {
            if (id.equals(vehicleList[i].getId())) {
                if (vehicleList[i].getStatus() == 1) {
                    vehicleList[i].setStatus(0);
                    System.out.println("还车成功！");
                    return;
                } else {
                    System.out.println("车辆还末出租了！");
                    return;
                }
            }
        }

        //修改车辆状态为可租
        System.out.println("没有找到该编号的车辆信息，请重新输入！");
    }


}
