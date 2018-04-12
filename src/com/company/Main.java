package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Poker poker = new Poker();


        // 添加元素
        for(int i=0;i<54;i++) {
            list.add(poker.poker(i));
        }



        // 随机输出扑克牌
        int length = list.size();
        for(int i=0;i<length;i++) {
            //随机生成数
            long randomNum = System.currentTimeMillis();
            int randomNumber = (int) randomNum%(list.size());
            if(randomNumber<0){
                randomNumber=-randomNumber;
            }


            System.out.println(list.get(randomNumber));
            //移除元素
            list.remove(randomNumber);

        }

    }
}

