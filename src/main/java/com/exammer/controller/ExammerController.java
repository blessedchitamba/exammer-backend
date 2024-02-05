package com.exammer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.exammer.model.AnswerForm;
import com.exammer.model.AnswerSheet;
import com.exammer.service.ExammerService;
import com.exammer.utils.GsonUtils;
import com.google.gson.*;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/v1")
public class ExammerController {

	@Autowired
	ExammerService exammerService;
	
	Gson gson = GsonUtils.getGson();
	
    @GetMapping("/answersheet/{name}")
    public ResponseEntity<Object> getAnswersheet(@PathVariable String name) {
        return ResponseEntity.ok(gson.toJson(exammerService.getAnswerSheet(name)));
    }

    @PostMapping("/answersheet")
    public ResponseEntity<Object> createAnswerSheet(@RequestBody AnswerSheet answerSheet) {
        return ResponseEntity.ok(exammerService.createAnswerSheet(answerSheet));
    }

    @GetMapping("/answerform/{id}")
    public ResponseEntity<Object> getAnswerFormById(@PathVariable Long id) {
        return ResponseEntity.ok(exammerService.getAnswerFormById(id));
    }

    @PutMapping("/answersheet/{id}")
    public ResponseEntity<Object> updateAnswerSheet(@PathVariable Long id, @RequestBody AnswerSheet answerSheet) {
        return ResponseEntity.ok(exammerService.updateAnswerSheet(id, answerSheet));
    }

    @PutMapping("/answerform/{id}")
    public ResponseEntity<Object> updateAnswerForm(@PathVariable Long id, @RequestBody AnswerForm answerForm) {
        return ResponseEntity.ok(exammerService.updateAnswerForm(id, answerForm));
    }

    @DeleteMapping("/answersheet/{id}")
    public ResponseEntity<Void> deleteAnswerSheet(@PathVariable Long id) {
        exammerService.deleteAnswerSheet(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/answerform/{id}")
    public ResponseEntity<Void> deleteAnswerForm(@PathVariable Long id) {
        exammerService.deleteAnswerForm(id);
        return ResponseEntity.noContent().build();
    }
}

