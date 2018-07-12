select book.title, publisher.name from book,publisher
where book.publisherid=publisher.id
and price<20

-----------------
select book.title, author.name
from book,bookauthor, author
where bookauthor.bookid=book.id
and bookauthor.authorid=author.id
and book.title like '%F%'
order by book.id asc

---------------
CRUD
    CREATE : insert
    READ : select
    UPDATE : update
    DELETE : delete

Transaction : Coherence

begin;
	update book set price=price+1 where book.id<6;
	insert into book (title,price,nbpage) values ('Eleventh',66.66,500);
	delete from book where book.id=11;
commit;