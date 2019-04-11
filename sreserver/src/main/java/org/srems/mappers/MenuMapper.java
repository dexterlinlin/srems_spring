package org.srems.mappers;

import org.srems.models.Menu;

import java.util.List;

public interface MenuMapper {

    List<Menu> getAllMenu();

    List<Menu> getMenusBySreUserId(String sreUserId);

    List<Menu> menuTree();

    List<String> getMenusByRid(String rid);
}