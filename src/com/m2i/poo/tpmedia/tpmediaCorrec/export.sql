--
-- PostgreSQL database dump
--

-- Dumped from database version 10.4
-- Dumped by pg_dump version 10.4

-- Started on 2018-07-09 13:28:48

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2837 (class 1262 OID 12938)
-- Name: postgres; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'French_France.1252' LC_CTYPE = 'French_France.1252';


ALTER DATABASE postgres OWNER TO postgres;

\connect postgres

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2838 (class 0 OID 0)
-- Dependencies: 2837
-- Name: DATABASE postgres; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON DATABASE postgres IS 'default administrative connection database';


--
-- TOC entry 2 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2840 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


--
-- TOC entry 1 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 2841 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 202 (class 1259 OID 16444)
-- Name: author; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.author (
    id integer NOT NULL,
    name character varying(50) NOT NULL
);


ALTER TABLE public.author OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16442)
-- Name: author_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.author_id_seq OWNER TO postgres;

--
-- TOC entry 2842 (class 0 OID 0)
-- Dependencies: 201
-- Name: author_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.author_id_seq OWNED BY public.author.id;


--
-- TOC entry 198 (class 1259 OID 16396)
-- Name: book; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.book (
    id integer NOT NULL,
    title character varying(50) NOT NULL,
    price double precision NOT NULL,
    nbpage integer,
    publisherid integer
);


ALTER TABLE public.book OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16394)
-- Name: book_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.book_id_seq OWNER TO postgres;

--
-- TOC entry 2843 (class 0 OID 0)
-- Dependencies: 197
-- Name: book_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.book_id_seq OWNED BY public.book.id;


--
-- TOC entry 203 (class 1259 OID 16474)
-- Name: bookauthor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bookauthor (
    bookid integer NOT NULL,
    authorid integer NOT NULL
);


ALTER TABLE public.bookauthor OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16415)
-- Name: publisher; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.publisher (
    id integer NOT NULL,
    name character varying(50) NOT NULL
);


ALTER TABLE public.publisher OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 16413)
-- Name: publisher_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.publisher_id_seq OWNER TO postgres;

--
-- TOC entry 2844 (class 0 OID 0)
-- Dependencies: 199
-- Name: publisher_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.publisher_id_seq OWNED BY public.publisher.id;


--
-- TOC entry 2689 (class 2604 OID 16447)
-- Name: author id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.author ALTER COLUMN id SET DEFAULT nextval('public.author_id_seq'::regclass);


--
-- TOC entry 2687 (class 2604 OID 16399)
-- Name: book id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book ALTER COLUMN id SET DEFAULT nextval('public.book_id_seq'::regclass);


--
-- TOC entry 2688 (class 2604 OID 16418)
-- Name: publisher id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publisher ALTER COLUMN id SET DEFAULT nextval('public.publisher_id_seq'::regclass);


--
-- TOC entry 2830 (class 0 OID 16444)
-- Dependencies: 202
-- Data for Name: author; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.author VALUES (1, 'Sam
');
INSERT INTO public.author VALUES (2, 'Bambam
');
INSERT INTO public.author VALUES (3, 'Moonman');
INSERT INTO public.author VALUES (4, 'PickeRick');


--
-- TOC entry 2826 (class 0 OID 16396)
-- Dependencies: 198
-- Data for Name: book; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.book VALUES (6, 'Sixth', 45, 450, 3);
INSERT INTO public.book VALUES (7, 'Seventh', 5.5, 30, 1);
INSERT INTO public.book VALUES (8, 'Eight', 9.9900000000000002, 45, 2);
INSERT INTO public.book VALUES (9, 'Ninth', 20, 256, 2);
INSERT INTO public.book VALUES (10, 'Tenth', 29.690000000000001, 245, 3);
INSERT INTO public.book VALUES (1, 'Java', 24.989999999999998, 200, 1);
INSERT INTO public.book VALUES (2, 'Python', 16.990000000000002, 686, 2);
INSERT INTO public.book VALUES (3, 'Third', 17, 100, 1);
INSERT INTO public.book VALUES (4, 'Fourth', 35, 300, 2);
INSERT INTO public.book VALUES (5, 'Fifth', 70, 650, 3);
INSERT INTO public.book VALUES (12, 'Eleventh', 66.659999999999997, 500, NULL);


--
-- TOC entry 2831 (class 0 OID 16474)
-- Dependencies: 203
-- Data for Name: bookauthor; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.bookauthor VALUES (1, 1);
INSERT INTO public.bookauthor VALUES (1, 2);
INSERT INTO public.bookauthor VALUES (1, 3);
INSERT INTO public.bookauthor VALUES (2, 2);
INSERT INTO public.bookauthor VALUES (2, 4);
INSERT INTO public.bookauthor VALUES (3, 1);
INSERT INTO public.bookauthor VALUES (4, 1);
INSERT INTO public.bookauthor VALUES (4, 4);
INSERT INTO public.bookauthor VALUES (5, 1);
INSERT INTO public.bookauthor VALUES (5, 3);
INSERT INTO public.bookauthor VALUES (6, 2);
INSERT INTO public.bookauthor VALUES (7, 2);
INSERT INTO public.bookauthor VALUES (7, 3);
INSERT INTO public.bookauthor VALUES (7, 4);
INSERT INTO public.bookauthor VALUES (8, 1);
INSERT INTO public.bookauthor VALUES (8, 2);
INSERT INTO public.bookauthor VALUES (9, 2);
INSERT INTO public.bookauthor VALUES (9, 4);
INSERT INTO public.bookauthor VALUES (10, 3);
INSERT INTO public.bookauthor VALUES (5, 4);


--
-- TOC entry 2828 (class 0 OID 16415)
-- Dependencies: 200
-- Data for Name: publisher; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.publisher VALUES (1, 'Flamant');
INSERT INTO public.publisher VALUES (2, 'Gil');
INSERT INTO public.publisher VALUES (3, 'Dean');


--
-- TOC entry 2845 (class 0 OID 0)
-- Dependencies: 201
-- Name: author_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.author_id_seq', 4, true);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 197
-- Name: book_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.book_id_seq', 12, true);


--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 199
-- Name: publisher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.publisher_id_seq', 2, true);


--
-- TOC entry 2696 (class 2606 OID 16449)
-- Name: author author_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.author
    ADD CONSTRAINT author_pkey PRIMARY KEY (id);


--
-- TOC entry 2691 (class 2606 OID 16401)
-- Name: book book_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (id);


--
-- TOC entry 2698 (class 2606 OID 16478)
-- Name: bookauthor bookauthor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookauthor
    ADD CONSTRAINT bookauthor_pkey PRIMARY KEY (bookid, authorid);


--
-- TOC entry 2694 (class 2606 OID 16420)
-- Name: publisher publisher_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.publisher
    ADD CONSTRAINT publisher_pkey PRIMARY KEY (id);


--
-- TOC entry 2699 (class 1259 OID 16490)
-- Name: fki_fk_bookauthor_authorid; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_bookauthor_authorid ON public.bookauthor USING btree (authorid);


--
-- TOC entry 2700 (class 1259 OID 16484)
-- Name: fki_fk_bookauthor_book; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_bookauthor_book ON public.bookauthor USING btree (bookid);


--
-- TOC entry 2692 (class 1259 OID 16431)
-- Name: fki_fk_publisherid_id; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_fk_publisherid_id ON public.book USING btree (publisherid);


--
-- TOC entry 2703 (class 2606 OID 16485)
-- Name: bookauthor fk_bookauthor_authorid; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookauthor
    ADD CONSTRAINT fk_bookauthor_authorid FOREIGN KEY (authorid) REFERENCES public.author(id);


--
-- TOC entry 2702 (class 2606 OID 16479)
-- Name: bookauthor fk_bookauthor_book; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bookauthor
    ADD CONSTRAINT fk_bookauthor_book FOREIGN KEY (bookid) REFERENCES public.book(id);


--
-- TOC entry 2701 (class 2606 OID 16426)
-- Name: book fk_publisherid_id; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.book
    ADD CONSTRAINT fk_publisherid_id FOREIGN KEY (publisherid) REFERENCES public.publisher(id);


-- Completed on 2018-07-09 13:28:51

--
-- PostgreSQL database dump complete
--

