package com.example.one.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by one on 2018/11/28.
 * 描述：省级
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
