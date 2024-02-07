package com.exammer.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import com.exammer.model.AnswerForm;
import com.exammer.model.AnswerSheet;
import com.exammer.model.VoterCounts;
import com.exammer.repository.ExammerRepository;


@Service
public class ExammerService
{
	private static final Logger logger = LoggerFactory.getLogger(ExammerService.class);
	
	@Autowired
	ExammerRepository exammerRepository;

	public AnswerSheet getAnswerSheet(String sheet_name)
	{
		try
		{
			return exammerRepository.getAnswerSheet(sheet_name);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return null;
		}
	}
	
	public VoterCounts getAnswerFormVoterCount(String sheet_name, int question_number)
	{
		try
		{
			return exammerRepository.getAnswerFormVoterCount(sheet_name, question_number);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			return null;
		}
	}
	
	public Object createAnswerSheet(AnswerSheet answerSheet)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAnswerFormById(Long id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object updateAnswerSheet(Long id, AnswerSheet answerSheet)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object updateAnswerForm(Long id, AnswerForm answerForm)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAnswerSheet(Long id)
	{
		// TODO Auto-generated method stub
		
	}

	public void deleteAnswerForm(Long id)
	{
		// TODO Auto-generated method stub
		
	}

	

}
