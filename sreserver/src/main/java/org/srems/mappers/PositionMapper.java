package org.srems.mappers;

import org.srems.models.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}