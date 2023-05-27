package com.leloz.controller;

import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.Menu;
import com.leloz.domain.vo.MenuTreeVo;
import com.leloz.domain.vo.MenuVo;
import com.leloz.domain.vo.RoleMenuTreeSelectVo;
import com.leloz.service.MenuService;
import com.leloz.utils.BeanCopyUtils;
import com.leloz.utils.SystemConverter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Leloz 
 */
@Api(description = "菜单接口")
@RestController
@RequestMapping("/system/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 获取菜单下拉树列表
     */
    @ApiOperation("获取菜单下拉树列表")
    @GetMapping("/treeselect")
    public ResponseResult treeselect() {
        //复用之前的selectMenuList方法。方法需要参数，参数可以用来进行条件查询，而这个方法不需要条件，所以直接new Menu()传入
        List<Menu> menus = menuService.selectMenuList(new Menu());
        List<MenuTreeVo> options =  SystemConverter.buildMenuSelectTree(menus);
        return ResponseResult.okResult(options);
    }

    /**
     * 加载对应角色菜单列表树
     */
    @ApiOperation("加载对应角色菜单列表树")
    @GetMapping(value = "/roleMenuTreeselect/{roleId}")
    public ResponseResult roleMenuTreeSelect(@PathVariable("roleId") Long roleId) {
        List<Menu> menus = menuService.selectMenuList(new Menu());
        List<Long> checkedKeys = menuService.selectMenuListByRoleId(roleId);
        List<MenuTreeVo> menuTreeVos = SystemConverter.buildMenuSelectTree(menus);
        RoleMenuTreeSelectVo vo = new RoleMenuTreeSelectVo(checkedKeys,menuTreeVos);
        return ResponseResult.okResult(vo);
    }

    /**
     * 获取菜单列表
     */
    @ApiOperation("获取菜单列表")
    @GetMapping("/list")
    public ResponseResult list(Menu menu) {
        List<Menu> menus = menuService.selectMenuList(menu);
        List<MenuVo> menuVos = BeanCopyUtils.copyBeanList(menus, MenuVo.class);
        return ResponseResult.okResult(menuVos);
    }

    @ApiOperation("新增菜单")
    @PostMapping
    public ResponseResult add(@RequestBody Menu menu)
    {
        menuService.save(menu);
        return ResponseResult.okResult();
    }


    /**
     * 根据菜单编号获取详细信息
     */
    @ApiOperation("根据菜单编号获取详细信息")
    @GetMapping(value = "/{menuId}")
    public ResponseResult getInfo(@PathVariable Long menuId)
    {
        return ResponseResult.okResult(menuService.getById(menuId));
    }

    /**
     * 修改菜单
     */
    @ApiOperation("修改菜单")
    @PutMapping
    public ResponseResult edit(@RequestBody Menu menu) {
        if (menu.getId().equals(menu.getParentId())) {
            return ResponseResult.errorResult(500,"修改菜单'" + menu.getMenuName() + "'失败，上级菜单不能选择自己");
        }
        menuService.updateById(menu);
        return ResponseResult.okResult();
    }

    /**
     * 删除菜单
     */
    @ApiOperation("删除菜单")
    @DeleteMapping("/{menuId}")
    public ResponseResult remove(@PathVariable("menuId") Long menuId) {
        if (menuService.hasChild(menuId)) {
            return ResponseResult.errorResult(500,"存在子菜单不允许删除");
        }
        menuService.removeById(menuId);
        return ResponseResult.okResult();
    }

}
