
package com.pcwk.ehr.licenses.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.pcwk.ehr.board.domain.BoardVO;
import com.pcwk.ehr.licenses.domain.LicensesVO;
import com.pcwk.ehr.user.domain.UserVO;

public interface LicensesService {
	public List<LicensesVO> getUserLicenses(UserVO inVO) throws SQLException;
	
	public List<LicensesVO> getLicensesName() throws SQLException;

	public int getLicensesSeq() throws SQLException;

	int doUpdate(LicensesVO inVO) throws SQLException;

	int doDelete(LicensesVO inVO) throws SQLException;

	LicensesVO doSelectOne(LicensesVO inVO) throws SQLException, EmptyResultDataAccessException;

	int doSave(LicensesVO inVO) throws SQLException;

	List<LicensesVO> doRetrieve(LicensesVO inVO) throws SQLException;
}
