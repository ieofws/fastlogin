package com.ksptooi.flr.service.test;


import com.google.inject.Injector;
import com.ksptooi.flr.entity.player.FLRPlayer;
import com.ksptooi.flr.module.export.ProcModule;
import com.ksptooi.flr.service.player.PlayerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.UUID;

/**
 * 测试玩家服务类
 */
public class PlayerServiceTest {

    PlayerService service = null;

    @Before
    public void before(){
        System.out.println("初始化Service");
        this.service = ProcModule.getInject().getInstance(PlayerService.class);
    }


    //注册玩家
    @Test
    public void regPlayer(){

        FLRPlayer player = new FLRPlayer();
        player.setAccount("KspTooi");
        player.setPassword("123456");
        service.playerRegister(player);

    }

    //批量注册玩家
    @Test
    public void regPlayerBatch(){

        long startTime = System.currentTimeMillis();

        for(int i=0;i<1280;i++){

            String uuid = UUID.randomUUID().toString();

            FLRPlayer player = new FLRPlayer();
            player.setAccount(uuid);
            player.setPassword(uuid);

            service.playerRegister(player);
            /*System.out.println("已注册玩家:"+uuid);*/

            if(i%50==0){
                System.out.println("已注册:"+i);
            }

        }

        double stopTime = System.currentTimeMillis();
        double elapsedTime = stopTime - startTime;
        double time = elapsedTime/1000;
        System.out.println(time);
    }




}
