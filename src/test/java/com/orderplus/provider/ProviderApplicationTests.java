package com.orderplus.provider;

import com.alibaba.fastjson.JSONObject;
import com.orderplus.provider.dao.DemoDao;
import com.orderplus.provider.domain.DemoEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Arte
 * @create 21-8-30
 */
@SpringBootTest
public class ProviderApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    void contextLoads() {
        System.out.println("test!");
    }

    @Test
    public void saveDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("西安澳鹏网络科技有限公司");
        demoEntity.setBy("orderplus");
        demoEntity.setUrl("http://www.orderplus.com");

        demoDao.saveDemo(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(2L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("西安澳鹏网络科技有限公司广州分公司");
        demoEntity.setBy("orderplus");
        demoEntity.setUrl("http://www.orderplus.com");

        demoDao.saveDemo(demoEntity);
    }

    @Test
    public void removeDemoTest() {
        demoDao.removeDemo(2L);
    }

    @Test
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB 更新数据");
        demoEntity.setDescription("西安澳鹏网络科技有限公司");
        demoEntity.setBy("orderplus");
        demoEntity.setUrl("http://www.orderplus.com");

        demoDao.updateDemo(demoEntity);
    }

    @Test
    public void findDemoByIdTest() {

        DemoEntity demoEntity = demoDao.findDemoById(1L);

        System.out.println(JSONObject.toJSONString(demoEntity));
    }
}
