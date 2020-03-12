package com.stx.exercise.p1;

import java.util.Scanner;

public class RegistSystem {
    public static void main(String[] args) {
        startMenu();
    }

    /* 开启菜单
     */
    public static void startMenu() {
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("---------------------------------");
            System.out.println("------这是一个注册系统-----------");
            System.out.println("选择: \n1.注册\n2.登录\n3.退出");
            System.out.println("---------------------------------");
            int input = sc.nextInt();
            switch (input) {
                case 1: {
                    regist();
                    break;
                }
                case 2: {
                    login();
                    break;
                }
                case 3: {
                    status = false;
                    break;
                }
                default: {
                    System.out.println("输入错误请选择1~3！");
                }
            }

        }
        System.out.println("你退出了系统！");
        sc.close();

    }

    /**
     * 注册流程
     */
    public static void regist() {
        System.out.println("恭喜你注册成功，输入1返回组菜单");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 1) {
                break;
            }
            System.out.println("你输入了：" + input + "输入1返回组菜单");
        }

    }

    /**
     * 登录流程
     */
    public static void login() {
        System.out.println("恭喜你登录成功，输入1返回组菜单");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 1) {
                break;
            }
            System.out.println("你输入了：" + input + "输入1返回组菜单");
        }

        /*Scanner sc  =new Scanner(System.in);
        System.in 在java中是静态变量，当前类所有的scanner对象共享它，
        当一个scanner对象执行close()操作后，其他所有的scanner对象都不可用了
        使用时需要注意！！*/


    }
}
