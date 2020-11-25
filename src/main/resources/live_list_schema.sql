--DDL
--usersテーブルが存在しなければ作成
CREATE TABLE IF NOT EXISTS ticketlayawaytool.live_list (
	dateId PRIMARY KEY NOT NULL,
	place VARCHAR(100) NOT NULL ,
	remarks VARCHAR(200)
	);