package com.exammer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


import com.exammer.service.ExammerService;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/v1")
public class ExammerController {

	@Autowired
	ExammerService exammerService;
	
    @GetMapping("/answersheet")
    public ResponseEntity<Object> getAnswersheet() {
        return ResponseEntity.ok(exammerService.getAnswerSheet());
    }
}

