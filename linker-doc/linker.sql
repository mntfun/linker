DROP INDEX `username_UNIQUE` ON `linker_user`;
DROP INDEX `email_UNIQUE` ON `linker_user`;
DROP INDEX `password_UNIQUE` ON `linker_user`;

DROP TABLE `linker_at_users`;
DROP TABLE `linker_collect`;
DROP TABLE `linker_comments`;
DROP TABLE `linker_like`;
DROP TABLE `linker_posts`;
DROP TABLE `linker_relation`;
DROP TABLE `linker_user`;

CREATE TABLE `linker_at_users` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`parent_id` int(11) NOT NULL,
`at_user_id` int(11) NOT NULL,
`created_at` timestamp NULL DEFAULT NULL,
`type` tinyint(1) NULL DEFAULT NULL COMMENT ' type=0 时(post中@人), parent_id 为post_id ；
type=1时（在comment中@人） parent_id为 comment_id',
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

CREATE TABLE `linker_collect` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(11) NULL DEFAULT NULL,
`post_id` int(11) NULL DEFAULT NULL,
`created_at` timestamp NULL DEFAULT NULL,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

CREATE TABLE `linker_comments` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`comments_content` varchar(200) NOT NULL,
`comments_status` tinyint(1) NULL DEFAULT NULL,
`created_at` timestamp NULL DEFAULT NULL,
`parent_comment_id` int(11) NULL DEFAULT NULL,
`post_id` int(11) NOT NULL,
`user_id` int(11) NOT NULL,
`img_url` varchar(1024) NULL DEFAULT NULL,
`comment_likenum` int(11) NULL DEFAULT NULL,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

CREATE TABLE `linker_like` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`post_id` int(11) NULL DEFAULT NULL,
`user_id` int(11) NULL DEFAULT NULL,
`comment_id` int(11) NULL DEFAULT NULL,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

CREATE TABLE `linker_posts` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(11) NOT NULL,
`post` varchar(140) NOT NULL,
`created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP(4) ON UPDATE CURRENT_TIMESTAMP,
`post_collectnum` int(11) NULL DEFAULT NULL,
`post_likenum` int(11) NULL DEFAULT NULL,
`post_commentnum` int(11) NULL DEFAULT NULL,
`post_readnum` int(11) NULL DEFAULT NULL,
`img_url` varchar(1024) NULL DEFAULT NULL,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

CREATE TABLE `linker_relation` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(11) NOT NULL,
`follower_id` int(11) NOT NULL,
`created_at` varchar(20) NULL DEFAULT NULL,
PRIMARY KEY (`id`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

CREATE TABLE `linker_user` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`gender` tinyint(1) NOT NULL,
`username` varchar(20) NOT NULL,
`password` varchar(64) NOT NULL,
`email` varchar(45) NOT NULL,
`avatar` varchar(45) NULL DEFAULT NULL,
`create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP(4) ON UPDATE CURRENT_TIMESTAMP,
`updated_at` timestamp NULL DEFAULT NULL,
PRIMARY KEY (`id`) ,
UNIQUE INDEX `username_UNIQUE` (`username` ASC) USING BTREE,
UNIQUE INDEX `email_UNIQUE` (`email` ASC) USING BTREE,
UNIQUE INDEX `password_UNIQUE` (`password` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
ROW_FORMAT = compact;

