package com.orderplus.provider.dao;

import com.orderplus.provider.domain.DemoEntity;

/**
 * @author Arte
 * @create 21-8-30
 */
public interface DemoDao {

    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
