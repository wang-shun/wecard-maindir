package com.cn.thinkx.wxcms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.thinkx.core.page.Pagination;
import com.cn.thinkx.wechat.base.wxapi.domain.AccountFans;


public interface AccountFansDao {

	public AccountFans getById(String id);

	public AccountFans getByOpenId(String openId);
	
	public List<AccountFans> list(AccountFans searchEntity);

	public Integer getTotalItemsCount(AccountFans searchEntity);
	
	public List<AccountFans> paginationEntity(AccountFans searchEntity, @Param("param2")Pagination<AccountFans> pagination);

	public AccountFans getLastOpenId();
	
	public void add(AccountFans entity);
	
	public void addList(List<AccountFans> list);

	public void update(AccountFans entity);

	public void delete(AccountFans entity);

	public void deleteByOpenId(String openId);
	
	/**
	 * 修改商户粉丝表 关注 或取消关注时候，修改日期可用
	 * @param searchEntity
	 * @return
	 */
	public int updateAccountFansByStatus(AccountFans entity);
	
	/***
	 * 修改商户粉丝表 微信客户端修改状态，不修改日期可用
	 * @param searchEntity
	 * @return
	 */
	public int updateAccountFansByMcht(AccountFans entity);

}