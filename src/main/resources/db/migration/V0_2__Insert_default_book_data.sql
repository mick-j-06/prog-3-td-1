insert into book (id, author, title, release_date)
values (1, null, 'Company, The', '2022-01-01');
insert into book (id, author, title, release_date)
values (2, null, 'American Adobo', '2022-01-01');
insert into book (id, author, title, release_date)
values (3, 'Elsworth', 'Taxi Hunter (Di shi pan guan)', '2022-01-01');
insert into book (id, author, title, release_date)
values (4, 'Amby', 'Man with the Gun', '2022-01-01');
insert into book (id, author, title, release_date)
values (5, 'Tamas', 'They Live by Night', '2022-01-01');
insert into book (id, author, title, release_date)
values (6, 'Stacie', 'Importance of Being Earnest, The','2022-02-01');
insert into book (id, author, title, release_date)
values (7, 'Kirsti', 'Train','2022-02-01');
insert into book (id, author, title, release_date)
values (8, 'Kara', 'Standing Up','2022-02-01');
insert into book (id, author, title, release_date)
values (9, 'Kariotta', 'Broken Bridges','2022-02-01');
insert into book (id, author, title, release_date)
values (10, 'Alleen', 'Frontier of the Dawn (La frontière de l''aube)','2023-02-01');

alter sequence book_id_seq restart with 11;
