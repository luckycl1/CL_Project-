package com.chenlong.guliorder.gmallorder;

import com.chenlong.gmall.product.entity.OmsOrderOperateHistoryEntity;
import com.chenlong.gmall.product.service.OmsOrderOperateHistoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallOrderApplicationTests {
    @Resource
    OmsOrderOperateHistoryService omeservice;

    @Test
    public void contextLoads() {
        OmsOrderOperateHistoryEntity omsOrderOperateHistoryEntity = new OmsOrderOperateHistoryEntity();
        omsOrderOperateHistoryEntity.setOrderId(1000L);
        omsOrderOperateHistoryEntity.setOperateMan("geitada");
        omeservice.save(omsOrderOperateHistoryEntity);
        System.out.println("ok");

    }

}
