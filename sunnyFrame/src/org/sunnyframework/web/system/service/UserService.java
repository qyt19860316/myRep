package org.sunnyframework.web.system.service;

import org.sunnyframework.core.common.service.CommonService;

import org.sunnyframework.web.system.pojo.base.TSUser;
/**
 * 
 * @author  sunyard
 *
 */
public interface UserService extends CommonService{

	public TSUser checkUserExits(TSUser user);
	public String getUserRole(TSUser user);
	public void pwdInit(TSUser user, String newPwd);
	/**
	 * 判断这个角色是不是还有用户使用
	 *@author sunyard
	 *@date   2013-11-12
	 *@param id
	 *@return
	 */
	public int getUsersOfThisRole(String id);
}
