INSERT INTO users (userid, name, creationdate, lastlogindate, isactived, isdeleted, age, email, status, password)
VALUES (1,'long', '2023-06-15', '2023-06-15', 1, 0, 30, 'john@example.com', 1, '123');
INSERT INTO users (userid, name, creationdate, lastlogindate, isactived, isdeleted, age, email, status, password)
VALUES (2,'long1', '2023-06-15', '2023-06-15', 1, 0, 30, 'john@example.com', 1, '123');
INSERT INTO users (userid, name, creationdate, lastlogindate, isactived, isdeleted, age, email, status, password)
VALUES (3, 'long2', '2023-06-15', '2023-06-15', 1, 0, 30, 'john@example.com', 1, '123');
INSERT INTO roles (id, name, isactived, isdeleted)
VALUES (1,'ADMIN', 1, 0);
INSERT INTO roles (id, name, isactived, isdeleted)
VALUES (2,'USER', 1, 0);
INSERT INTO roles (id, name, isactived, isdeleted)
VALUES (3,'GUEST', 1, 0);
INSERT INTO usersroles (userid, roleid)
VALUES (1, 1), (2, 2), (3, 3);