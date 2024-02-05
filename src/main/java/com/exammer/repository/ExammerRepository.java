package com.exammer.repository;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exammer.model.AnswerForm;
import com.exammer.model.AnswerSheet;
import com.zaxxer.hikari.HikariDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class ExammerRepository
{
	@Autowired
	@Qualifier("exammer") HikariDataSource exammer_db;
	
	Logger log = LoggerFactory.getLogger(ExammerRepository.class);
	
	private Connection getConnection(HikariDataSource data_source) throws SQLException
	{
		return data_source.getConnection();
	}
	
	private PreparedStatement prepareStatement(String query, HikariDataSource data_source) throws SQLException
	{
		PreparedStatement ps = getConnection(data_source).prepareStatement(query);
		return ps;
	}
	
	public AnswerSheet getAnswerSheet(String sheet_name) throws Exception
	{
		AnswerSheet sheet;
		List<AnswerForm> answer_forms = new ArrayList<>();
		
		PreparedStatement ps = null;
		String forms_select_query = "SELECT af.* FROM answer_forms AS af JOIN answer_sheets AS a ON af.sheet_id = a.id WHERE a.name = ?;";
		
		try
		{
			ps = prepareStatement(forms_select_query, exammer_db);
			ps.setString(1, sheet_name);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				List<String> answers = new ArrayList<>();
				if(rs.getString("option_a") != null)
					answers.add(rs.getString("option_a"));
				if(rs.getString("option_b") != null)
					answers.add(rs.getString("option_b"));
				if(rs.getString("option_c") != null)
					answers.add(rs.getString("option_c"));
				if(rs.getString("option_d") != null)
					answers.add(rs.getString("option_d"));
				if(rs.getString("option_e") != null)
					answers.add(rs.getString("option_e"));
				AnswerForm answer_form = new AnswerForm(rs.getInt("question_number"), sheet_name, answers);
				answer_forms.add(answer_form);
			}
		}
		catch (SQLException e)
		{
			log.error(e.getMessage());
			throw e;
		}
		finally
		{
			if (ps != null)
			{
				ps.getConnection().close();
				ps.close();
			}
		}
		if(answer_forms.size()==0)
		{
			log.debug("found no answer forms for answer sheet with name "+sheet_name);
		}
		sheet = new AnswerSheet(sheet_name);
		sheet.setAnswerForms(answer_forms);
		return sheet;
	}

}
