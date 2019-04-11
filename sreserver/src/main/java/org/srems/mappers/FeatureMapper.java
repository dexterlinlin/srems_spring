package org.srems.mappers;

import org.srems.models.Feature;

public interface FeatureMapper {
    int deleteByPrimaryKey(String id);

    int insert(Feature record);

    int insertSelective(Feature record);

    Feature selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Feature record);

    int updateByPrimaryKey(Feature record);
}