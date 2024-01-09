/*-- Record Label table
CREATE TABLE discografica (
  id int  not null PRIMARY KEY,
  nombre varchar(50) not null
);

-- Record Label data
INSERT INTO discografica VALUES(1,'Blackened');
INSERT INTO discografica VALUES(2,'Warner Bros');
INSERT INTO discografica VALUES(3,'Universal');
INSERT INTO discografica VALUES(4,'MCA');
INSERT INTO discografica VALUES(5,'Elektra');
INSERT INTO discografica VALUES(6,'Capitol');

-- Artist table
CREATE TABLE artista (
  id	int  not null PRIMARY KEY ,
  discografica_id 	int  not null,
  nombre varchar(50) not null,
  FOREIGN KEY (discografica_id) REFERENCES discografica (id)
);

-- Artist data
INSERT INTO artista VALUES(1, 1,'Metallica');
INSERT INTO artista VALUES(2, 1,'Megadeth');
INSERT INTO artista VALUES(3, 1,'Anthrax');
INSERT INTO artista VALUES(4, 2,'Eric Clapton');
INSERT INTO artista VALUES(5, 2,'ZZ Top');
INSERT INTO artista VALUES(6, 2,'Van Halen');
INSERT INTO artista VALUES(7, 3,'Lynyrd Skynyrd');
INSERT INTO artista VALUES(8, 3,'AC/DC');
INSERT INTO artista VALUES(9, 6,'The Beatles');


-- Album Table
CREATE TABLE album (
  id 	int not null PRIMARY KEY,
  artista_id  int not null ,
  nombre varchar(50)  not null,
  anio int not null,
  FOREIGN KEY (artista_id) REFERENCES artista (id)
);

-- Album data
INSERT INTO album VALUES(1, 1, '...And Justice For All',1988);
INSERT INTO album VALUES(2, 1, 'Black Album',1991);
INSERT INTO album VALUES(3, 1, 'Master of Puppets',1986);
INSERT INTO album VALUES(4, 2, 'Endgame',2009);
INSERT INTO album VALUES(5, 2, 'Peace Sells',1986);
INSERT INTO album VALUES(6, 3, 'The Greater of 2 Evils',2004);
INSERT INTO album VALUES(7, 4, 'Reptile',2001);
INSERT INTO album VALUES(8, 4, 'Riding with the King',2000);
INSERT INTO album VALUES(9, 5, 'Greatest Hits',1992);
INSERT INTO album VALUES(10, 6, 'Greatest Hits',2004);
INSERT INTO album VALUES(11, 7, 'All-Time Greatest Hits',1975);
INSERT INTO album VALUES(12, 8, 'Greatest Hits',2003);
INSERT INTO album VALUES(13, 9, 'Sgt. Pepper''s Lonely Hearts Club Band', 1967);


-- canciones table
CREATE TABLE canciones (
  id int not null PRIMARY KEY,
  album_id int not null,
  nombre varchar(50) not null,
  duracion real not null,
  FOREIGN KEY (album_id) REFERENCES album (id)
);


-- canciones data
INSERT INTO canciones VALUES(1,1,'One',7.25);
INSERT INTO canciones VALUES(2,1,'Blackened',6.42);

INSERT INTO canciones VALUES(3,2,'Enter Sandman',5.3);
INSERT INTO canciones VALUES(4,2,'Sad But True',5.29);

INSERT INTO canciones VALUES(5,3,'Master of Puppets',8.35);
INSERT INTO canciones VALUES(6,3,'Battery',5.13);

INSERT INTO canciones VALUES(7,4,'Dialectic Chaos',2.26);
INSERT INTO canciones VALUES(8,4,'Endgame',5.57);

INSERT INTO canciones VALUES(9,5,'Peace Sells',4.09);
INSERT INTO canciones VALUES(10,5,'The Conjuring',5.09);

INSERT INTO canciones VALUES(11,6,'Madhouse',4.26);
INSERT INTO canciones VALUES(12,6,'I am the Law',6.03);

INSERT INTO canciones VALUES(13,7,'Reptile',3.36);
INSERT INTO canciones VALUES(14,7,'Modern Girl',4.49);

INSERT INTO canciones VALUES(15,8,'Riding with the King',4.23);
INSERT INTO canciones VALUES(16,8,'Key to the Highway',3.39);

INSERT INTO canciones VALUES(17,9,'Sharp Dressed Man',4.15);
INSERT INTO canciones VALUES(18,9,'Legs',4.32);

INSERT INTO canciones VALUES(19,10,'Eruption',1.43);
INSERT INTO canciones VALUES(20,10,'Hot For Teacher',4.43);

INSERT INTO canciones VALUES(21,11,'Sweet Home Alabama',4.45);
INSERT INTO canciones VALUES(22,11,'Free Bird',14.23);

INSERT INTO canciones VALUES(23,12,'Thunderstruck',4.52);
INSERT INTO canciones VALUES(24,12,'T.N.T',3.35);

INSERT INTO canciones VALUES(25,13,'Sgt. Pepper''s Lonely Hearts Club Band', 2.0333);
INSERT INTO canciones VALUES(26,13,'With a Little Help from My Friends', 2.7333);
INSERT INTO canciones VALUES(27,13,'Lucy in the Sky with Diamonds', 3.4666);
INSERT INTO canciones VALUES(28,13,'Getting Better', 2.80);
INSERT INTO canciones VALUES(29,13,'Fixing a Hole', 2.60);
INSERT INTO canciones VALUES(30,13,'She''s Leaving Home', 3.5833);
INSERT INTO canciones VALUES(31,13,'Being for the Benefit of Mr. Kite!',2.6166);
INSERT INTO canciones VALUES(32,13,'Within You Without You',5.066);
INSERT INTO canciones VALUES(33,13,'When I''m Sixty-Four',2.6166);
INSERT INTO canciones VALUES(34,13,'Lovely Rita', 2.7);
INSERT INTO canciones VALUES(35,13,'Good Morning Good Morning', 2.6833);
INSERT INTO canciones VALUES(36,13,'Sgt. Pepper''s Lonely Hearts Club Band (Reprise)', 1.3166);
INSERT INTO canciones VALUES(37,13,'A Day in the Life', 5.65);*/


--1 - Listar todos los artitas por Discografica, ordenados por el nombre del artista
SELECT a.nombre AS 'Nombre_Artista', d.nombre as 'Discografica'
from artista a
join discografica d ON a.discografica_id = d.id
order by Nombre_Artista


--2 - Que Discográfica NO tiene artistas?
Select d.nombre
from discografica d
left join artista a ON d.id = a.discografica_id
where a.id is null;

--segunda opcion
SELECT d.nombre
FROM discografica d
where d.id not in (Select a.discografica_id from artista a)


--3 - Listar el numero de canciones por artista en orden descendiente

Select count(c.id) as 'Numero Canciones', a.nombre as 'Nombre Artista'
from artista a
join album al on a.id = al.artista_id
join canciones c on al.id = c.album_id
group by a.nombre
order by [Nombre Artista] DESC



--4 - Que artista grabó el mayor numero de canciones?
Select TOP 1 count(c.id) as 'Numero Canciones',  a.nombre as 'Nombre Artista'
from artista a
join album al on a.id = al.artista_id
join canciones c on al.id = c.album_id
group by a.nombre
order by [Numero Canciones] DESC

--5 - Por cada artista y cada album, cuantas canciones tienen menos de 5 minutos de duracion?

select a.nombre as 'nombre artista', al.nombre as 'nombre album', count(c.id) as 'cantidad de canciones'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
where c.duracion < 5
group by a.nombre, al.nombre

--6 - En relación con la consulta anterior, muestra también las canciones y su duración

select a.nombre as 'nombre artista', al.nombre as 'nombre album', c.nombre as 'Nombre cancion', c.duracion as 'duracion'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
where c.duracion < 5
order by a.nombre, al.nombre
--7 - Qué artistas grabaron canciones mas largas que 5 minutos, y cuántas canciones fueron?

select count(c.id) as 'cantidad de canciones', a.nombre as ' Nombre'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
where c.duracion > 5
group by a.nombre
order by [cantidad de canciones]

--8 - En que año se grabaron la mayoría de las canciones?
select top 1 count(c.id) as 'cantidad', al.anio as 'Año de grabacion'
from canciones c
join album al on c.album_id = al.id
group by al.anio
order by cantidad DESC

--9 - Mostrar el ranking de los 5 artistas, album, canción y año con las canciones más largas
select top 5 a.nombre as 'artista', al.nombre as 'album', c.nombre, al.anio as 'año', c.duracion as 'duracion'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
order by c.duracion DESC

--10 - Duración total de todas las canciones grabadas por cada artista en orden descendente

select SUM(c.duracion) as 'Duracion total', a.nombre as 'Nombre'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
group by a.nombre
order by a.nombre DESC


--11 - Que artistas y album no tienen canciones de menos de 5 minutos?
select distinct a.nombre as 'Nombre', al.nombre as 'Album'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
where al.id in (select al.id
                FROM album al
                where al.id not in (select c.album_id
                                    From canciones c
                                    where c.duracion <5))


--12 - Mostrar el top 3 de artistas con el promedio de duración de las canciones, en orden descendente con la canción mas larga primero 

/*SELECT top 3 AVG(c.duracion) as 'Promedio', MAX(c.duracion) as 'Duracion',a.nombre as 'Artista'
from canciones c
join album al on al.id = c.album_id
join artista a on a.id = al.artista_id
where 
group by a.nombre
order by a.nombre DESC

(select top1 c.nombre
from canciones c
where al.id = c.albun_id
order by c.duracion desc) as 'cancion mas larga'*/



--13 - Qué artistas no lanzaron un album durante la decada de 1980 y 1990?

SELECT a.nombre as 'Artista'
from artista a
where a.id NOT IN(select al.artista_id
from album al
where al.anio between 1980 and 2000)

select * from album

--14 - Duración total del album Sgt. Pepper's de los Beatles (mostrar en minutos y segundos)

SELECT
    CAST(SUM(CAST(c.duracion * 60 AS INT)) / 60 AS INT) AS Minutos,
    SUM(CAST(c.duracion * 60 AS INT)) % 60 AS Segundos
FROM album al
JOIN canciones c ON al.id = c.album_id
WHERE al.nombre LIKE 'Sgt. Pepper%';