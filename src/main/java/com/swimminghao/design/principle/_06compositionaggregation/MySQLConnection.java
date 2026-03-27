package com.swimminghao.design.principle._06compositionaggregation;

/**
 * Created by geely
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
