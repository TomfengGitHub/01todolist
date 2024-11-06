CREATE TABLE todo
(
    id          BIGINT PRIMARY KEY AUTO_INCREMENT,
    title       VARCHAR(255) NOT NULL,
    description TEXT,
    completed   BOOLEAN DEFAULT FALSE
);

INSERT INTO `temp1`.`todo` (`id`, `title`, `description`, `completed`) VALUES (1, '任务1', '抽烟', 0);
INSERT INTO `temp1`.`todo` (`id`, `title`, `description`, `completed`) VALUES (2, '任务2', '喝酒', 1);
INSERT INTO `temp1`.`todo` (`id`, `title`, `description`, `completed`) VALUES (3, '任务3', '烫头', 0);
