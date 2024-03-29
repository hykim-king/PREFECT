package com.pcwk.ehr.subject.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.pcwk.ehr.subject.dao.SubjectDao;
import com.pcwk.ehr.subject.domain.SubjectVO;
import com.pcwk.ehr.cmn.PcwkLogger;
import com.pcwk.ehr.code.domain.CodeVO;

@Service
public class SubjectServiceImpl implements SubjectService, PcwkLogger {

	@Autowired
	SubjectDao dao;

	public SubjectServiceImpl() {
	}

	@Override
	public int doUpdate(SubjectVO inVO) throws SQLException {
		return dao.doUpdate(inVO);
	}

	@Override
	public SubjectVO doSelectOne(SubjectVO inVO) throws SQLException, EmptyResultDataAccessException {
		return dao.doSelectOne(inVO);
	}

	@Override
	public int doSave(SubjectVO inVO) throws SQLException {
		return dao.doSave(inVO);
	}

	@Override
	public List<SubjectVO> doRetrieve(SubjectVO inVO) throws SQLException {
		return dao.doRetrieve(inVO);
	}

	@Override
	public List<SubjectVO> doRetrieveBySubjectCode(SubjectVO inVO) throws SQLException {
		return dao.doRetrieveBySubjectCode(inVO);
	}

	@Override
	public int doSaveSubject(CodeVO inVO) throws SQLException {
		return dao.doSaveSubject(inVO);
	}

	@Override
	public int doDeleteSubject(String detCode) throws SQLException {
		return dao.doDeleteSubject(detCode);
	}
}
