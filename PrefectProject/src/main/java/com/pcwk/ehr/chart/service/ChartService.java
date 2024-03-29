package com.pcwk.ehr.chart.service;

import java.util.List;

import com.pcwk.ehr.chart.domain.AtdVO;
import com.pcwk.ehr.chart.domain.EduVO;
import com.pcwk.ehr.chart.domain.RatioVO;
import com.pcwk.ehr.chart.domain.ScoreVO;

public interface ChartService {
	List<ScoreVO> getWorkChartInfo(ScoreVO searchVO) throws Exception;
	List<EduVO> mainChartInfo(EduVO eduVO) throws Exception; 
	List<RatioVO> donutChartInfo(RatioVO ratioVO) throws Exception; 
	List<AtdVO> countChartInfo(AtdVO atdVO) throws Exception; 

}
