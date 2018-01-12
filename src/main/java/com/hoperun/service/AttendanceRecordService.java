package com.hoperun.service;

import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.hoperun.pojo.AttendanceRecord;

/**
 * @description 考勤记录相关业务
 * @author XHX
 * @date 2017年12月26日 下午2:22:54
 */
public interface AttendanceRecordService {

	String EXCEL_NAME = "姓名";
	String EXCEL_EMPLOYEE_NUMBER = "员工工号";
	String EXCEL_PROJECT_CODE = "项目编码";
	String EXCEL_VACATE_REASON = "特殊情况说明";
	String EXCEL_VACATE_OVERTIME = "法定假期加班";
	String EXCEL_OVERTIME_TOTAL = "加班合计";
	String EXCEL_NO_SALARY_VACATE = "无薪假(事假)";
	String EXCEL_SILL_VACATE = "病假";
	String EXCEL_YEAR_VACATE = "年假";
	String EXCEL_ADJUST_VACATE = "调休";
	String EXCEL_OTHER_VACATE = "其他带薪假";
	String EXCEL_ADDITION = "餐费补贴";

	/**
	 * 查询所有考勤记录
	 * 
	 * @return
	 */
	List<AttendanceRecord> queryList();

	/**
	 * 查询指定id的考勤记录
	 * 
	 * @param attendanceRecordID
	 * @return AttendanceRecord
	 */
	public AttendanceRecord queryAttendanceRecord(Long attendanceRecordID);

	/**
	 * 审核
	 * 
	 * @param attendanceRecordID
	 * @param state
	 */
	public void verify(Long attendanceRecordID, String state);

	/**
	 * 更新指定id的考勤记录
	 * 
	 * @param attendanceRecordID
	 */
	public void updateAttendanceRecord(AttendanceRecord attendanceRecord);

	/**
	 * 导出个人考勤记录表为Excel
	 * 
	 * @param employeeNumber
	 *            指定工号
	 * @param date
	 *            指定年月
	 * @return
	 */
	public HSSFWorkbook exportAttendanceRecordToExcel(String employeeNumber, Date date);

	/**
	 * 导出项目组记录表为Excel
	 * 
	 * @param projectGroupID
	 *            指定项目群组id
	 * @param date
	 *            指定日期年月
	 * @return HSSFWorkbook
	 */
	public HSSFWorkbook exportAttendanceRecordToExcel(Long projectGroupID, Date date);
}
