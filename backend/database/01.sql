CREATE DATABASE IF NOT EXISTS `auth_db`;
GRANT ALL ON `auth_db`.* TO 'user'@'%';
GRANT ALL ON `auth_db`.* TO 'root'@'%';

CREATE DATABASE IF NOT EXISTS `user_notification`;
GRANT ALL ON `user_notification`.* TO 'user'@'%';
GRANT ALL ON `user_notification`.* TO 'root'@'%';

CREATE DATABASE IF NOT EXISTS `schedule_matching`;
GRANT ALL ON `schedule_matching`.* TO 'user'@'%';
GRANT ALL ON `schedule_matching`.* TO 'root'@'%';
