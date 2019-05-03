package com.monco.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.monco.repository.GoodsTypeRepository;
import org.springframework.stereotype.Service;

import com.monco.entity.GoodsType;
import com.monco.service.GoodsTypeService;

/**
 * 商品类别Service实现类
 * @author java1234 小锋 老师
 *
 */
@Service("goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService{

	@Resource
	private GoodsTypeRepository goodsTypeRepository;
	
	@Override
	public void save(GoodsType goodsType) {
		goodsTypeRepository.save(goodsType);
	}

	@Override
	public void delete(Integer id) {
		goodsTypeRepository.delete(id);
	}

	@Override
	public List<GoodsType> findByParentId(int parentId) {
		return goodsTypeRepository.findByParentId(parentId);
	}

	@Override
	public GoodsType findById(Integer id) {
		return goodsTypeRepository.findOne(id);
	}

}
