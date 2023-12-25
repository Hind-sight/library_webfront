/*修改表字符集*/
alter table book convert to character set utf8mb4 collate utf8mb4_unicode_ci;
alter table bookself convert to character set utf8mb4 collate utf8mb4_unicode_ci;
alter table booktype convert to character set utf8mb4 collate utf8mb4_unicode_ci;
alter table borrow convert to character set utf8mb4 collate utf8mb4_unicode_ci;
alter table users convert to character set utf8mb4 collate utf8mb4_unicode_ci

/*初始化管理员用户*/
INSERT INTO book.users (id_, createtime, creatorid, lastupdatetime, age_, card_, password_, phone_, realname_, register_time_, role_, sex_, status_, username_) VALUES ('1', null, null, null, null, null, 'RaFutWeh0ww=', null, '管理员', null, '管理员', null, '1', 'sysadmin');