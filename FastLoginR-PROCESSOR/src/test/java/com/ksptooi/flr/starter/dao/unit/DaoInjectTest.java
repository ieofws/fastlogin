package com.ksptooi.flr.starter.dao.unit;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ksptooi.flr.dao.access.MybatisAccess;
import com.ksptooi.flr.module.export.DalModule;
import org.junit.Test;

public class DaoInjectTest {


    @Test
    public void test(){

        Injector injector = Guice.createInjector(new DalModule());

        MybatisAccess instance = injector.getInstance(MybatisAccess.class);

        System.out.println(instance);

    }

}
