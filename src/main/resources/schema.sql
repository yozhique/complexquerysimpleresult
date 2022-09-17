CREATE SCHEMA IF NOT EXISTS app;
CREATE TABLE IF NOT EXISTS app.STUDENT(
    id int, name varchar(50), surname varchar(50), grade_num int, grade_letter char, personal_code varchar(12)
);
CREATE TABLE IF NOT EXISTS app.TEACHER(
    id int, name varchar(50), surname varchar(50), personal_code varchar(12)
);
CREATE TABLE IF NOT EXISTS app.TIMETABLE(
    day int, time_start int, time_end int, lesson varchar(50), room int, teacher_id int, grade_num int, grade_letter char
);