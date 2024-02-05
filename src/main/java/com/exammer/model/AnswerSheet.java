package com.exammer.model;

import java.util.List;

public class AnswerSheet
{
	private String name;
	private List<AnswerForm> answer_forms;
	
	public AnswerSheet(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<AnswerForm> getAnswerForms()
	{
		return answer_forms;
	}

	public void setAnswerForms(List<AnswerForm> answerForms)
	{
		this.answer_forms = answerForms;
	}

}
