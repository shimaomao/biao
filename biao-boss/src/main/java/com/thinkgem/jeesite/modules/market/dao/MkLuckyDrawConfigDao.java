/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.market.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.market.entity.MkLuckyDrawConfig;

/**
 * 抽奖活动规则DAO接口
 * @author zzj
 * @version 2018-11-01
 */
@MyBatisDao
public interface MkLuckyDrawConfigDao extends CrudDao<MkLuckyDrawConfig> {
	
}