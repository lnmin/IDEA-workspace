package com.stx.exercise.p7.Three_LiMin;

import java.util.Scanner;

public class VehicleManager {
    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);

    //构造函数
    public VehicleManager() {
        //初始化10辆共享车放在vehicleList 数组里面
        for (int i = 0; i < vehicleList.length; i++) {
            vehicleList[i] = new Vehicle("v" + (i + 1), 0);

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
            switch (Integer.parseInt(choose)) {
                case 1: {
                    view();
                    break;
                }
                case 2: {
                    rental();
                    break;
                }
                case 3: {
                    back();
                    break;
                }
                case 4:{
                    isExit = true;
                }


            }

        } while (!isExit);
    }

    private void view() {
        for (Vehicle vehicle :
                vehicleList) {
            System.out.println(vehicle.getId() + "  " + vehicle.getStatus() + "  " + vehicle.showInfo());
        }
//        System.out.println("编号\t\t状态\t\t租车说明");
        //打印全部车辆信息 编号，状态，租车说明

    }

    //租车
    private void rental() {

        System.out.println("请输入租车编号：");
        st:
        while (true) {
            String id = scanner.nextLine();
            //遍历数组找出车辆信息租车，
            for (Vehicle vehicle :
                    vehicleList) {
                System.out.println(vehicle.getId());
                if (id.equalsIgnoreCase(vehicle.getId())) {
                    vehicle.setStatus(1);
                    break st;
                }
            }
            //修改车辆状态为已经出租
            System.out.println("没有找到该编号的车辆信息，请重新输入！");

        }

    }


    //还车
    private void back() {
        System.out.println("请输入还车编号：");
        st:
        while (true) {
            String id = scanner.nextLine();
            //遍历数组找出车辆信息还车，
            for (Vehicle vehicle :
                    vehicleList) {
                if (id.equalsIgnoreCase(vehicle.getId())) {
                    vehicle.setStatus(0);
                    break st;
                }
            }
            //修改车辆状态为可租
            System.out.println("没有找到该编号的车辆信息，请重新输入！");
        }

    }


}
