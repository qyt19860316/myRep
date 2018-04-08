package org.sunnyframework.web.system.service;

import java.util.List;

import org.sunnyframework.web.system.pojo.base.TSAttachment;

import org.sunnyframework.core.common.service.CommonService;

/**
 * 
 * @author  sunyard
 *
 */
public interface DeclareService extends CommonService{
	
	public List<TSAttachment> getAttachmentsByCode(String businessKey,String description);
	
}
