package com.hoperun.config;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hoperun.pojo.BulletinResource;
import com.hoperun.service.BulletinResourceService;


@Component
public class ScheduledTest {
	@Autowired 
	private BulletinResourceService bulletinResourceService;
	// 每天0点执行,当当前时间处于生效期和结束期之间有效，大于结束期为无效
	@Scheduled(cron="0 0 0 * * ?")
	public void executeTime(){
		List<BulletinResource> list = bulletinResourceService.selectAllBulletin();
		for(int i=0;i<list.size();i++){
			BulletinResource bulletinResource = list.get(i);
			if (bulletinResource.getStartDate().getTime()<=System.currentTimeMillis()&&bulletinResource.getEndDate().getTime()>System.currentTimeMillis()) {
				bulletinResource.setState("1");
				bulletinResourceService.updateByPrimaryKey(bulletinResource);
			}
			if (bulletinResource.getEndDate().getTime()<System.currentTimeMillis()) {
				bulletinResource.setState("0");
				bulletinResourceService.updateByPrimaryKey(bulletinResource);
			}
		}
	}
}
