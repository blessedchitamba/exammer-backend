INSERT INTO public.answer_sheets VALUES('CS2002S Exam 2022');

INSERT INTO public.answer_forms (question_number,option_a,option_b,option_c,option_d,sheet_id) 
	VALUES(1,'Inheritance','Polymorphism','Data Structures','I have no idea',1);
INSERT INTO public.answer_forms (question_number,option_a,option_b,option_c,option_d,sheet_id) 
	VALUES(2,'Object Oriented Programming','Functional Programming','Procedural Programming','Reactive programming',1);
INSERT INTO public.answer_forms (question_number,option_a,option_b,option_c,option_d,sheet_id) 
	VALUES(3,'Sorting algorithms','Searching algorithms','Graph algorithms','Dynamic programming',1);
INSERT INTO public.answer_forms (question_number,option_a,option_b,option_c,option_d,sheet_id) 
	VALUES(4,'Java','Python','Rust','Django',1);
INSERT INTO public.answer_forms (question_number,option_a,option_b,option_c,option_d,sheet_id) 
	VALUES(5,'HTML','CSS','XML','HTTP',1);

INSERT INTO public.voter_counts (question_id,option_a,option_b,option_c,option_d) 
	VALUES(1,0,0,0,0);
INSERT INTO public.voter_counts (question_id,option_a,option_b,option_c,option_d) 
	VALUES(2,0,0,0,0);
INSERT INTO public.voter_counts (question_id,option_a,option_b,option_c,option_d) 
	VALUES(3,0,0,0,0);
INSERT INTO public.voter_counts (question_id,option_a,option_b,option_c,option_d) 
	VALUES(4,0,0,0,0);
INSERT INTO public.voter_counts (question_id,option_a,option_b,option_c,option_d) 
	VALUES(5,0,0,0,0);

SELECT * FROM public.answer_forms;
SELECT * FROM public.voter_counts;