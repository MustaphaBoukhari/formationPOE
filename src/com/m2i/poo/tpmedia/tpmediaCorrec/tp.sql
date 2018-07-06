select book.title, publisher.name from book,publisher
where book.publisherid=publisher.id
and price<20