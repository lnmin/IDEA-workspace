package com.stx.exercise.p4.Three_LiMin;


class Member {
     String name;
     String like;

    public Member(String name, String like) {
        this.name = name;
        this.like = like;
    }

    public void oneselfInfo(){
         System.out.println("大家好我是:"+ name +"，我最喜欢的事情就是:"+like);
     }


}
