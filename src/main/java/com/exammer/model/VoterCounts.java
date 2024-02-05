package com.exammer.model;

import java.util.List;

public class VoterCounts
{
	private List<Integer> voter_counts;
	private int answer_form_id;
	
	public VoterCounts(List<Integer> counts, int answer_form_id)
	{
		this.voter_counts = counts;
		this.answer_form_id = answer_form_id;
	}
	
	public List<Integer> getVoterCounts() {
        return voter_counts;
    }

    public void setVoterCounts(List<Integer> voterCounts) {
        this.voter_counts = voterCounts;
    }

    public int getAnswerFormId() {
        return answer_form_id;
    }

    public void setAnswerFormId(int answerFormId) {
        this.answer_form_id = answerFormId;
    }

}
