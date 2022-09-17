INSERT INTO app.STUDENT(id, name, surname, grade_num, grade_letter) VALUES (1, 'Anna', 'Smith', 5, 'a');
INSERT INTO app.STUDENT(id, name, surname, grade_num, grade_letter) VALUES (2, 'John', 'Berns', 6, 'b');
INSERT INTO app.STUDENT(id, name, surname, grade_num, grade_letter) VALUES (3, 'Jessica', 'Taner', 7, 'c');

INSERT INTO app.TEACHER(id, name, surname) VALUES (1, 'Leslie', 'Nielsen');
INSERT INTO app.TEACHER(id, name, surname) VALUES (2, 'Ozzy', 'Osbourne');
INSERT INTO app.TEACHER(id, name, surname) VALUES (3, 'Adam', 'Ondra');

INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 900, 950, 'Math', 1, 1, 5, 'a')
INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 1000, 1050, 'Climbing', 21, 3, 5, 'a')
INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 1100, 1150, 'Music', 22, 2, 5, 'a')

INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 900, 950, 'Climbing', 21, 3, 6, 'b')
INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 1000, 1050, 'Music', 22, 2, 6, 'b')
INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 1100, 1150, 'Math', 1, 1, 6, 'b')

INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 900, 950, 'Music', 22, 2, 7, 'c')
INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 1000, 1050, 'Math', 1, 1, 7, 'c')
INSERT INTO app.TIMETABLE(day, time_start, time_end, lesson, room, teacher_id, grade_num, grade_letter) VALUES (1, 1100, 1150, 'Climbing', 21, 3, 7, 'c')