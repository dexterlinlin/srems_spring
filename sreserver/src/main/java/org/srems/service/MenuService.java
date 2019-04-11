package org.srems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.srems.mappers.MenuMapper;
import org.srems.models.Menu;
import org.srems.utils.SreUserUtils;

import java.util.List;

@Service
@Transactional
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenu();
    }

    public  List<Menu> menuTree()
    {
        return menuMapper.menuTree();
    }

    public List<String> getMenusByRid(String rid)
    {
        return menuMapper.getMenusByRid(rid);
    }

    /**
     * 根据登录人的角色返回菜单
     * 默认返回所有菜单，后续做权限控制，不同角色返回不同菜单
     *
     * @return
     */
    public List<Menu> getMenusByLoginRole() {
        return menuMapper.getMenusBySreUserId(SreUserUtils.getCurrentSreUser().getId());
    }
}
