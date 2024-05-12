package com.svalero.bicistopegama.dao;

import com.svalero.bicistopegama.domain.Bike;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class BikeMapper implements RowMapper<Bike> {

    @Override
    public Bike map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Bike(rs.getInt("id_bike"),
            rs.getString("name_bike"),
            rs.getString("type_bike"),
            rs.getFloat("price_bike"),
            rs.getDate("date_bike"));


    }
}
