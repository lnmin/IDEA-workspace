package com.stx.exercise.p1;



import java.util.Scanner;

public class Three_LiMin {
    public static void main(String[] args) {

        register();
        int n =1;
        int r =1;
        Scanner scanner = new Scanner(System.in);
        st: while (true){
            while (true){
                int s = scanner.nextInt();
                if (s ==3){
                    quit();
                    break st;
                }
                if (s == 1 && r%2 == 1){
                    System.out.println("恭喜你注册成功，输入1返回组菜单");
                    r += 1;
                    break ;
                }else if(s == 1 && r%2 == 0) {
                    register();
                    r += 1;
                    break;
                }

                if (s ==2 && n%2 == 1){
                    System.out.println("你输入了：2");
                    n += 1;
                    break ;
                }else if(s ==2 && n%2 == 0){
                    System.out.println("恭喜你登录成功，输入1返回组菜单");
                    n += 1;
                    r += 1;
                    break ;
                    }
                }
            }
        }
    public static void register(){
        System.out.println("------这是一个注册系统--");
        System.out.println("选择: ");
        System.out.println("1.注册");
        System.out.println("2.登录");
        System.out.println("3.退出");
        System.out.println("-----------------------");
    }
    public static void quit(){
        System.out.println("你退出了系统！");
    }
    }

