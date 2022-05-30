create table if not exists students(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    age int);

insert into students (name, age) values
('Bob', 20),
('Alex', 19),
('John', 18),
('Mike', 20),
('Arnold', 20);
