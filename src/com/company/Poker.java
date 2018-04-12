package com.company;

/**
 * Created by COCOMiss on 2018/4/12.
 */
public class Poker {

    public static String poker(int num) {
        String str = "";
        String[] type = {"红桃","黑桃","梅花","方块"};
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        if(num/4 > 12) {
            if(num%4 == 0) {
                str += "小王";
            } else if(num%4 == 1) {
                str += "大王";
            }
        } else {
            str += type[num%4] + number[num/4] ;
        }
        return str;
    }


}
