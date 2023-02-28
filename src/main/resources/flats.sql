CREATE SCHEMA 'flats' DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE `test_db`.`flats`
(
    'flat_id'      INT         NOT NULL AUTO_INCREMENT,
    'region'       VARCHAR(80) NOT NULL,
    'address'      VARCHAR(80) NOT NULL,
    'area'         INT         NOT NULL,
    'rooms_amount' INT         NOT NULL,
    'price'        VARCHAR(45) NOT NULL,
    PRIMARY KEY ('flat_id')
)
    DEFAULT CHARACTER SET = utf8
    COLLATE = utf8_general_ci;