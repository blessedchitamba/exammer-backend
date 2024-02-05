package com.exammer.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import com.exammer.model.AnswerForm;
import com.exammer.model.AnswerSheet;
import com.exammer.repository.ExammerRepository;


@Service
public class ExammerService
{
	private static final Logger logger = LoggerFactory.getLogger(ExammerService.class);
	
	@Autowired
	ExammerRepository exammerRepository;

	public AnswerSheet getAnswerSheet(String sheet_name)
	{
//		JSONArray jsonArray = new JSONArray(jsonStr);
//        String jsonString = jsonArray.toString();
//        return jsonString;
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
	
	private String jsonStr = 
	    "[{" +
	        "\"question\": \"question_1\"," +
	        "\"answers\": [" +
	            "{" +
	                "\"id\": 0," +
	                "\"answer_option\": \"A\"," +
	                "\"text\": \"Inheritance\"," +
	                "\"voter_count\": 2" +
	            "}," +
	            "{" +
	                "\"id\": 1," +
	                "\"answer_option\": \"B\"," +
	                "\"text\": \"Polymorphism\"," +
	                "\"voter_count\": 4" +
	            "}," +
	            "{" +
	                "\"id\": 2," +
	                "\"answer_option\": \"C\"," +
	                "\"text\": \"Data Structures\"," +
	                "\"voter_count\": 3" +
	            "}," +
	            "{" +
	                "\"id\": 3," +
	                "\"answer_option\": \"D\"," +
	                "\"text\": \"I have no idea\"," +
	                "\"voter_count\": 1" +
	            "}" +
	        "]" +
	    "}," +
	    "{" +
	        "\"question\": \"question_2\"," +
	        "\"answers\": [" +
	            "{" +
	                "\"id\": 4," +
	                "\"answer_option\": \"A\"," +
	                "\"text\": \"Sorting Algorithms\"," +
	                "\"voter_count\": 2" +
	            "}," +
	            "{" +
	                "\"id\": 5," +
	                "\"answer_option\": \"B\"," +
	                "\"text\": \"Searching Algorithms\"," +
	                "\"voter_count\": 4" +
	            "}," +
	            "{" +
	                "\"id\": 6," +
	                "\"answer_option\": \"C\"," +
	                "\"text\": \"Graph Algorithms\"," +
	                "\"voter_count\": 3" +
	            "}," +
	            "{" +
	                "\"id\": 7," +
	                "\"answer_option\": \"D\"," +
	                "\"text\": \"I have no idea\"," +
	                "\"voter_count\": 1" +
	            "}" +
	        "]" +
	    "}," +
	    "{" +
	        "\"question\": \"question_3\"," +
	        "\"answers\": [" +
	            "{" +
	                "\"id\": 8," +
	                "\"answer_option\": \"A\"," +
	                "\"text\": \"Object Oriented Programming\"," +
	                "\"voter_count\": 2" +
	            "}," +
	            "{" +
	                "\"id\": 9," +
	                "\"answer_option\": \"B\"," +
	                "\"text\": \"Functional Programming\"," +
	                "\"voter_count\": 4" +
	            "}," +
	            "{" +
	                "\"id\": 10," +
	                "\"answer_option\": \"C\"," +
	                "\"text\": \"Procedural Programming\"," +
	                "\"voter_count\": 3" +
	            "}," +
	            "{" +
	                "\"id\": 11," +
	                "\"answer_option\": \"D\"," +
	                "\"text\": \"I have no idea\"," +
	                "\"voter_count\": 1" +
	            "}" +
	        "]" +
	    "}," +
	    "{" +
	        "\"question\": \"question_4\"," +
	        "\"answers\": [" +
	            "{" +
	                "\"id\": 12," +
	                "\"answer_option\": \"A\"," +
	                "\"text\": \"Java\"," +
	                "\"voter_count\": 2" +
	            "}," +
	            "{" +
	                "\"id\": 13," +
	                "\"answer_option\": \"B\"," +
	                "\"text\": \"Python\"," +
	                "\"voter_count\": 4" +
	            "}," +
	            "{" +
	                "\"id\": 14," +
	                "\"answer_option\": \"C\"," +
	                "\"text\": \"JavaScript\"," +
	                "\"voter_count\": 3" +
	            "}," +
	            "{" +
	                "\"id\": 15," +
	                "\"answer_option\": \"D\"," +
	                "\"text\": \"I have no idea\"," +
	                "\"voter_count\": 1" +
	            "}" +
	        "]" +
	    "}," +
	    "{" +
	        "\"question\": \"question_5\"," +
	        "\"answers\": [" +
	            "{" +
	                "\"id\": 16," +
	                "\"answer_option\": \"A\"," +
	                "\"text\": \"HTML\"," +
	                "\"voter_count\": 2" +
	            "}," +
	            "{" +
	                "\"id\": 17," +
	                "\"answer_option\": \"B\"," +
	                "\"text\": \"CSS\"," +
	                "\"voter_count\": 4" +
	            "}," +
	            "{" +
	                "\"id\": 18," +
	                "\"answer_option\": \"C\"," +
	                "\"text\": \"XML\"," +
	                "\"voter_count\": 3" +
	            "}," +
	            "{" +
	                "\"id\": 19," +
	                "\"answer_option\": \"D\"," +
	                "\"text\": \"I have no idea\"," +
	                "\"voter_count\": 1" +
	            "}" +
	        "]" +
	    "}]";

	

}
