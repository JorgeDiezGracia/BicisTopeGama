package com.svalero.bicistopegama.dao;

import com.svalero.bicistopegama.domain.Bike;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface BikeDao {
    @SqlQuery("SELECT * FROM BIKES")
    @UseRowMapper(BikeMapper.class)
    List<Bike> getAllBikes();

}
