package com.monco.service.impl;

import javax.annotation.Resource;

import com.monco.repository.RoleMenuRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monco.entity.RoleMenu;
import com.monco.service.RoleMenuService;

/**
 * 角色权限菜单关联Service实现类
 * @author java1234 小锋 老师
 *
 */
@Service("roleMenuService")
@Transactional
public class RoleMenuServiceImpl implements RoleMenuService{

	@Resource
	private RoleMenuRepository roleMenuRepository;

	@Override
	public void deleteByRoleId(Integer roleId) {
		roleMenuRepository.deleteByRoleId(roleId);
	}

	@Override
	public void save(RoleMenu roleMenu) {
		roleMenuRepository.save(roleMenu);
	}
	
	
}
