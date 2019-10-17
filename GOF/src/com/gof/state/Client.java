package com.gof.state;

/**
 * 状态模式测试类
 */
public class Client {

    public static void main(String[] args) {

        //创建活动对象，奖品有一个奖品
        RaffleActivity activity = new RaffleActivity(1);

        //我们连续抽30次将
        for (int i = 0; i < 30 ; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }
}
