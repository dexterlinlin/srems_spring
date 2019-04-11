package org.srems.mappers;

import org.apache.ibatis.annotations.Param;
import org.srems.models.GenericRelation;

public interface GenericRelationMapper {
    int addRelation(@Param("rel")GenericRelation relation);
}
