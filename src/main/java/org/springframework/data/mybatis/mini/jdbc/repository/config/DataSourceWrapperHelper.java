package org.springframework.data.mybatis.mini.jdbc.repository.config;

import com.vonchange.jdbc.abstractjdbc.model.DataSourceWrapper;

public interface DataSourceWrapperHelper {
     DataSourceWrapper getDataSourceWrapperByKey(String key);
}
