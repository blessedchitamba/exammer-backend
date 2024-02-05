package com.exammer.model;

import java.util.List;

public class AnswerForm
{
	private int question_number;
	private String sheet_name;
	private List<String> answer_options;
	
	public AnswerForm(int q_num, String sheet_name, List<String> answers)
	{
		this.question_number = q_num;
		this.sheet_name = sheet_name;
		this.answer_options = answers;
	}
	
	public int getQuestionNumber() {
        return this.question_number;
    }

    public void setQuestionNumber(int questionNumber) {
        this.question_number = questionNumber;
    }

    public String getSheetId() {
        return this.sheet_name;
    }

    public void setSheetId(String sheetName) {
        this.sheet_name = sheetName;
    }

    public List<String> getAnswerOptions() {
        return this.answer_options;
    }

    public void setAnswerOptions(List<String> answerOptions) {
        this.answer_options = answerOptions;
    }
}
