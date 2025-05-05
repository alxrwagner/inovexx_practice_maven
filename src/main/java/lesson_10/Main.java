package lesson_10;

public class Main {
    public static void main(String[] args) {
        CREATE TABLE students (
                id SERIAL PRIMARY KEY,
                name VARCHAR(20) NOT NULL,
                passport_serial VARCHAR(4) NOT NULL,
                passport_number VARCHAR(6) NOT NULL,
                UNIQUE (passport_serial, passport_number)
        );


        CREATE TABLE subject (
                id SERIAL PRIMARY KEY,
                title VARCHAR(20) NOT NULL
        );

        CREATE TABLE progress (
                id SERIAL PRIMARY KEY,
                student BIGINT REFERENCES students (id),
                subject BIGINT REFERENCES subject (id),
                score INTEGER CHECK (score BETWEEN 2 AND 5)
        );

        INSERT INTO students (name, passport_serial, passport_number)
        VALUES ('Alex', 6015, 315900);

        INSERT INTO students (name, passport_serial, passport_number)
        VALUES ('Thomas', 30, 415872);

        INSERT INTO students (name, passport_serial, passport_number)
        VALUES ('Kate', 3018, 412092);

        INSERT INTO students (name, passport_serial, passport_number)
        VALUES ('Jane', 7380, 802342);

        INSERT INTO subject (title)
        VALUES ('Chemistry');

        INSERT INTO subject (title)
        VALUES ('Literature');

        INSERT INTO subject (title)
        VALUES ('Math');

        INSERT INTO progress (student, subject, score)
        VALUES (1, 1, 5),
                (1, 2, 3),
        (1, 3, 2),
        (2, 1, 2),
        (2, 2, 4),
        (2, 2, 5),
        (3, 1, 3),
        (3, 2, 3),
        (3, 2, 3),
        (4, 1, 4),
        (4, 2, 5),
        (4, 3, 3);


        SELECT s.name, p.score, s2.title
        FROM students s
        JOIN progress p ON s.id = p.student
        JOIN subject s2 ON p.subject = s2.id
        WHERE p.subject = 2 AND p.score > 3
        ORDER BY s.name;

        SELECT AVG(score)
                FROM progress
        WHERE subject = 3;

        SELECT AVG(score)
                FROM progress
        WHERE student = 1;

        SELECT subj.title, COUNT(p.student) AS passed_students
        FROM subject subj
        JOIN progress p ON subj.id = p.subject
        WHERE p.score > 2
        GROUP BY subj.title
        ORDER BY passed_students
        LIMIT 3;
    }
}
