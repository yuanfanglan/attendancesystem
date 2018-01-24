package com.hoperun.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hoperun.json.AjaxResult;
import com.hoperun.mapper.BulletinResourceMapper;
import com.hoperun.pojo.BulletinResource;
import com.hoperun.pojo.RbacUserInfo;
import com.hoperun.service.BulletinResourceService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class BulletinResourceController {
	@Autowired
	private BulletinResourceService bulletinResourceService;
	@Autowired
	private BulletinResourceMapper bulletinResourceMapper;
	
	/**公告新增页
	 * */
	@RequestMapping(value="/updateBulletinResource",method=RequestMethod.GET)
	public ModelAndView Index(ModelAndView mv){
		mv.setViewName("updateBulletin");
		return mv;
}

	/**
	 * 查询所有公告信息
	 * @return
	 * */
	@ApiOperation(value="查询所有公告信息")
	@RequestMapping(value="selectAllBulletin",method=RequestMethod.GET)
	public AjaxResult selectAllBulletin(){
		List<BulletinResource> list = bulletinResourceService.selectAllBulletin();
		return new AjaxResult().success(list);
	}

	/**
	 * 根据id删除公告
	 * @param id
	 * @return*/
	@ApiOperation(value="根据id删除公告")
	@RequestMapping(value="deleteByPrimaryKey",method=RequestMethod.POST)
	public AjaxResult deleteByPrimaryKey(@ApiParam(value="公告id",required=true) @RequestParam("id") Long id){
		if (id!=null) {
			int key = bulletinResourceService.deleteByPrimaryKey(id);
			if (key>0) {
				return new AjaxResult().success("删除成功");
			}else {
				return new AjaxResult().failure("删除失败");
			}
		}else {
			return new AjaxResult().failure("删除失败");
		}

	}

	/**
	 * 批量删除公告
	 * @param delets
	 * @return 
	 * */
	@ApiOperation(value="批量删除公告")
	@RequestMapping(value="batchDeletesBulletin",method=RequestMethod.POST)
	@Transactional
	public AjaxResult batchDeletes(@RequestParam("deletes") String deletes[]){
		if (deletes!=null) {
			for(int i=0;i<deletes.length;i++){
				Long deleteId=Long.parseLong(deletes[i]);
				int key = bulletinResourceMapper.deleteByPrimaryKey(deleteId);
			}
			return new AjaxResult().success("你已经成功删除"+deletes.length+"条记录");
		}else {
			return new AjaxResult().failure("请先选择需要删除的选项");
		}
	}
	
	/**
	 * 新增公告
	 * @param bulletinResource
	 * @return
	 * @throws ParseException 
	 * */
	@ApiOperation("公告新增")
	@RequestMapping(value="insertBulletin",method=RequestMethod.POST)
	public AjaxResult insertBulletin(BulletinResource bulletinResource,HttpSession session) throws ParseException{
		RbacUserInfo rbacUserInfo=(RbacUserInfo)session.getAttribute("user");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		bulletinResource.setCreateTime(df.parse(df.format(System.currentTimeMillis())));
		bulletinResource.setFounder(rbacUserInfo.getName());
		bulletinResource.setState("2");
		int insert = bulletinResourceService.insert(bulletinResource);
		if (insert>0) {
			return new AjaxResult().success("新增公告成功");
		}
		return new AjaxResult().failure("新增失败");
	}
	
	/**
	 * 公告修改
	 * @param bulletinResource
	 * @param id
	 * @return
	 * */
	@ApiOperation("公告修改")
	@RequestMapping(value="updateBulletin" ,method=RequestMethod.POST)
	public AjaxResult updateBulletin(BulletinResource bulletinResource,HttpSession session,@RequestParam("bid") Long bid) throws ParseException{
		RbacUserInfo rbacUserInfo=(RbacUserInfo)session.getAttribute("user");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		BulletinResource bulletinResource2 = bulletinResourceService.selectByPrimaryKey(bid);
		bulletinResource2.setModifyTime(df.parse(df.format(System.currentTimeMillis())));
		bulletinResource2.setModifier(rbacUserInfo.getName());
		bulletinResource2.setTittle(bulletinResource.getTittle());
		bulletinResource2.setContent(bulletinResource.getContent());
		bulletinResource2.setStartDate(bulletinResource.getStartDate());
		bulletinResource2.setEndDate(bulletinResource.getEndDate());
		int update = bulletinResourceService.updateByPrimaryKey(bulletinResource2);
		if (update>0) {
			return new AjaxResult().success("修改成功");
		}
		return new AjaxResult().failure("修改失败");
	}
}
