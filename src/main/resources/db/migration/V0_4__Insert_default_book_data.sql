insert into book (id, author_id, title, release_date)
values (1, null, 'Company, The', '2022-01-01');
insert into book (id, author_id, title, release_date)
values (2, 1, 'American Adobo', '2022-01-01');
insert into book (id, author_id, title, release_date)
values (3, 2, 'Taxi Hunter (Di shi pan guan)', '2022-01-01');


alter sequence book_id_seq restart with 15;
