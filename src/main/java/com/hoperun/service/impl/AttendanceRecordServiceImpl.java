package com.hoperun.service.impl;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoperun.common.util.DateUtil;
import com.hoperun.mapper.AttendanceRecordMapper;
import com.hoperun.pojo.AttendanceRecord;
import com.hoperun.pojo.AttendanceRecordExample;
import com.hoperun.pojo.RbacUserInfo;
import com.hoperun.pojo.RbacUserInfoExample;
import com.hoperun.service.AttendanceRecordService;
import com.hoperun.service.RbacUserInfoService;

@Service
public class AttendanceRecordServiceImpl implements AttendanceRecordService {

	@Autowired
	private AttendanceRecordMapper arm;
	@Autowired
	private RbacUserInfoService ruis;

	@Override
	public List<AttendanceRecord> queryList() {
		return arm.selectByExample(new AttendanceRecordExample());
	}

	@Override
	public AttendanceRecord queryAttendanceRecord(Long attendanceRecordID) {
		AttendanceRecordExample are = new AttendanceRecordExample();
		are.createCriteria().andIdEqualTo(attendanceRecordID);
		List<AttendanceRecord> list = arm.selectByExample(are);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void verify(Long attendanceRecordID, String state) {
		if (attendanceRecordID == null) {
			return;
		}
		if (state == null) {
			return;
		}
		AttendanceRecord ar = new AttendanceRecord();
		ar.setId(attendanceRecordID);
		ar.setState(state);
		arm.updateByPrimaryKeySelective(ar);
	}

	@Override
	public void updateAttendanceRecord(AttendanceRecord attendanceRecord) {
		arm.updateByPrimaryKeySelective(attendanceRecord);
	}

	@Override
	public HSSFWorkbook exportAttendanceRecordToExcel(String employeeNumber, Date date) {
		// 存放指定员工当月的考勤记录
		HashMap<RbacUserInfo, List<AttendanceRecord>> hashMap = new HashMap<>();
		// 据指定日期及工号查询考勤记录
		List<AttendanceRecord> arList = this.queryMonthly(employeeNumber, date);
		// 据指定工号查询员工信息
		RbacUserInfo rui = this.queryRbaUserInfo(employeeNumber);
		// 存入map
		hashMap.put(rui, arList);

		return this.createExcel(hashMap);

	}

	@Override
	public HSSFWorkbook exportAttendanceRecordToExcel(Long projectGroupID, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 据指定日期及工号查询考勤记录
	 * 
	 * @param employeeNumber
	 * @param date
	 * @return
	 */
	private List<AttendanceRecord> queryMonthly(String employeeNumber, Date date) {

		AttendanceRecordExample are = new AttendanceRecordExample();
		are.createCriteria().andCurrentTimeBetween(DateUtil.getStartOfMonth(date), DateUtil.getEndOfMonth(date))
				.andEmployeeNumberEqualTo(employeeNumber);
		List<AttendanceRecord> arList = arm.selectByExample(are);

		return arList;
	}

	/**
	 * 据指定工号查询员工信息
	 * 
	 * @param employeeNumber
	 *            工号
	 * @return
	 */
	private RbacUserInfo queryRbaUserInfo(String employeeNumber) {
		if (employeeNumber == null) {
			return null;
		}
		RbacUserInfoExample uie = new RbacUserInfoExample();
		uie.createCriteria().andEmployeeNumberEqualTo(employeeNumber);
		List<RbacUserInfo> list = ruis.selectByExample(uie);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 创建HSSFWorkbook
	 * 
	 * @param map
	 *            指定员工当月的考勤记录
	 * @return
	 */
	private HSSFWorkbook createExcel(HashMap<RbacUserInfo, List<AttendanceRecord>> map) {

		if (map == null || map.isEmpty()) {
			return null;
		}

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet();
		// 创建标题行
		HSSFRow title = sheet.createRow(0);
		title.createCell(0).setCellValue(EXCEL_NAME);

		// 遍历用户
		Set<RbacUserInfo> keySet = map.keySet();
		for (RbacUserInfo rui : keySet) {

			// 遍历每天的记录

		}

		if (wb != null)
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return wb;
	}
}
