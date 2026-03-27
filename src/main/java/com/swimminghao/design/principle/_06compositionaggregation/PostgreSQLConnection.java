package com.swimminghao.design.principle._06compositionaggregation;

/**
 * Created by geely
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
