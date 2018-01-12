package com.hoperun.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hoperun.pojo.AttendanceRecord;
import com.hoperun.service.AttendanceRecordService;

import io.swagger.annotations.ApiOperation;

/** 
* 
* @author XHX
* @date 2017年12月28日 上午11:13:13 
*/  
@RestController
public class AttendanceRecordController {

	@Autowired
	private AttendanceRecordService ars; 
	
	@RequestMapping(value = "/attendanceRecord",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value="查询所有出勤记录")
	public List<AttendanceRecord> attendanceRecord(){
		
		ars.exportAttendanceRecordToExcel("",new Date());
		
		return null;
	}
	
}
