package org.sunnyframework.web.system.service;

import java.util.List;

import org.sunnyframework.core.common.service.CommonService;
import org.sunnyframework.web.system.pojo.base.DynamicDataSourceEntity;

public interface DynamicDataSourceServiceI extends CommonService{

	public List<DynamicDataSourceEntity> initDynamicDataSource();

	public void refleshCache();

	public DynamicDataSourceEntity getDynamicDataSourceEntityForDbKey(String dbKey);


}
