package org.sunnyframework.web.system.service;

import org.sunnyframework.core.common.service.CommonService;
import org.sunnyframework.web.system.pojo.base.TSCategoryEntity;

public interface CategoryServiceI extends CommonService{
	/**
	 * 保存分类管理
	 * @param category
	 */
	void saveCategory(TSCategoryEntity category);

}
