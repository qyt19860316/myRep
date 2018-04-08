package org.sunnyframework.tag.core.easyui;

import java.io.IOException;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.sunnyframework.core.constant.Globals;
import org.sunnyframework.core.util.ApplicationContextUtil;
import org.sunnyframework.core.util.ResourceUtil;
import org.sunnyframework.core.util.oConvertUtils;
import org.sunnyframework.web.system.pojo.base.TSOperation;
import org.sunnyframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 
 * @Title:HasPermissionTag
 * @description:新权限JSP标签，通过标签的 “权限标示” 控制代码片段是否显示
 * @author chenj
 * @date 2016-08-19
 * @version V1.0
 */
public class HasPermissionTag extends TagSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**按钮code*/
	private  String name;
	@Autowired
	private SystemService systemService;
	public int doStartTag() throws JspException {
		String p = getName();
		
        boolean show = showTagBody(p);
        if (show) {
            return TagSupport.EVAL_BODY_INCLUDE;
        } else {
            return TagSupport.SKIP_BODY;
        }
	}
	public boolean showTagBody(String p) {
		
		if(ResourceUtil.getSessionUserName().getUserName().equals("admin")|| !Globals.BUTTON_AUTHORITY_CHECK){
			return true;
		}else{
			//权限判断；
			Set<String> operationCodes = (Set<String>) super.pageContext.getRequest().getAttribute(Globals.OPERATIONCODES);
			if (null!=operationCodes) {
				for (String MyoperationCode : operationCodes) {
					if (oConvertUtils.isEmpty(MyoperationCode))
						break;
					systemService = ApplicationContextUtil.getContext().getBean(SystemService.class);
					TSOperation operation = systemService.getEntity(TSOperation.class, MyoperationCode);
					if (operation.getOperationcode().equals(p)){
						return true;
					}
				}
			}
			
		}
//		if(p!=null&&p.trim().equals("show")){
//			return true;
//		}else if(p!=null&&p.trim().equals("hide")){
//			return false;
//		}
        return false;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
