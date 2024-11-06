CREATE TABLE todo
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description TEXT,
    completed   BOOLEAN DEFAULT FALSE
);
