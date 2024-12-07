CREATE TABLE diardon.users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

insert into users (id, name, email)
	values	(1, 'Juan', 'juan@empresa.com'),
			(2, 'Ana', 'ana@empresa.com'),
            (3, 'Jorge', 'jorge@empresa.com'),
            (4, 'María', 'maria@empresa.com'),
            (5, 'Pedro', 'pedro@empresa.com');

select * from users
