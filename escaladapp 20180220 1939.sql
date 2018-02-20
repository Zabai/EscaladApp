--
-- Script was generated by Devart dbForge Studio for MySQL, Version 7.2.78.0
-- Product home page: http://www.devart.com/dbforge/mysql/studio
-- Script date 20/02/2018 19:39:07
-- Server version: 5.5.5-10.1.26-MariaDB
-- Client version: 4.1
--


--
-- Definition for database escaladapp
--
DROP DATABASE IF EXISTS escaladapp;
CREATE DATABASE IF NOT EXISTS escaladapp
	CHARACTER SET latin1
	COLLATE latin1_swedish_ci;

-- 
-- Disable foreign keys
-- 
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;

-- 
-- Set SQL mode
-- 
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 
-- Set default database
--
USE escaladapp;

--
-- Definition for table mountains
--
CREATE TABLE IF NOT EXISTS mountains (
  id INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  altitude FLOAT DEFAULT NULL,
  location VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  image VARCHAR(255) DEFAULT NULL,
  description TEXT CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (id)
)
ENGINE = INNODB
AUTO_INCREMENT = 27
AVG_ROW_LENGTH = 1638
CHARACTER SET latin1
COLLATE latin1_swedish_ci;

--
-- Definition for table users
--
CREATE TABLE IF NOT EXISTS users (
  id INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(30) DEFAULT NULL,
  password VARCHAR(30) NOT NULL,
  name VARCHAR(50) DEFAULT NULL,
  surname VARCHAR(50) DEFAULT NULL,
  email VARCHAR(50) DEFAULT NULL,
  creationDate DATE NOT NULL,
  administrator TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (id),
  UNIQUE INDEX username (username)
)
ENGINE = INNODB
AUTO_INCREMENT = 10
AVG_ROW_LENGTH = 5461
CHARACTER SET latin1
COLLATE latin1_swedish_ci;

-- 
-- Dumping data for table mountains
--
INSERT INTO mountains VALUES
(17, 'Teide', 3718, 'Tenerife', 'https://es.wikipedia.org/wiki/Teide#/media/File:Teide2007.jpg', '<p>El <strong>Teide</strong> es un volc�n situado en la isla de Tenerife (Canarias, Espa�a). Tiene una altitud de 3.718 metros sobre el nivel del mar y 7.500 metros sobre el lecho oce�nico, es el pico m�s alto del pa�s, el de cualquier tierra emergida del oc�ano Atl�ntico y el tercer mayor volc�n de la Tierra desde su base en el lecho oce�nico, despu�s del Mauna Kea y el Mauna Loa, ambos en Haw�i. La altitud del Teide convierte adem�s a la isla de Tenerife en la d�cima isla m�s alta del mundo.<br /></p>'),
(18, 'Mulhac�n', 3479, 'Granada', 'https://es.wikipedia.org/wiki/Mulhac%C3%A9n#/media/File:Mulhacen_north_face.JPG', '<p>El <strong>Mulhac�n</strong>, con una altitud de 3.478,6&nbsp;msnm, es el pico m�s alto de la pen�nsula ib�rica y el segundo de Espa�a tras el Teide, de 3.718&nbsp;msnm (Tenerife, Canarias). El Mulhac�n forma parte del parque nacional de Sierra Nevada. Est� enclavado en la provincia de Granada, en el sur peninsular de Espa�a, y pertenece a Sierra Nevada, en la cordillera Penib�tica.<br /></p>'),
(19, 'Aneto', 3404, 'Arag�n', 'https://es.wikipedia.org/wiki/Pico_Aneto#/media/File:Cima_aneto-01.jpg', '<p>El <strong>Aneto</strong> es el pico m�s elevado de los Pirineos, con una altitud de 3404 metros sobre el nivel del mar. Se encuentra situado en el Parque Natural Posets-Maladeta, en el municipio de Benasque, provincia de Huesca, comunidad aut�noma de Arag�n, en Espa�a.<br /></p>'),
(20, 'Veleta', 3396, 'Andaluc�a', 'https://es.wikipedia.org/wiki/Pico_Veleta#/media/File:450px-CILINDRO.JPG', '<p>El <strong>Pico del Veleta</strong> es, con una altitud de 3395,68&nbsp;msnm, la cuarta cumbre m�s alta de Espa�a y segunda de su cordillera, s�lo por detr�s del Teide (Tenerife), Mulhac�n (Sierra Nevada) y Aneto (Pirineos). Est� enclavado en la provincia de Granada, en Andaluc�a (Espa�a), y pertenece a Sierra Nevada, en la cordillera Penib�tica. Su coordenada UTM es 30S 675013, tomando el elipsoide Hayford. Su superficie se reparte entre los Parques Natural y Nacional de Sierra Nevada. Administrativamente en su cumbre confluyen los t�rminos muncipales de D�lar, Monachil, G��jar Sierra y Capileira. Jurisdiccionalmente, sus caras noreste y oeste pertenecen al partido judicial de Granada, mientras que la sureste, al de �?rgiva.<br /></p>'),
(21, 'Posets o Llardana', 3371, 'Arag�n', 'https://es.wikipedia.org/wiki/Pico_Posets#/media/File:Pico_Posets_from_Forqueta.jpg', '<p>El <strong>pico Posets</strong> o <strong>Punta de Llardana</strong> es el segundo pico m�s alto de los Pirineos, tras el Aneto. Tiene una altitud de 3.375 metros y se encuentra en el norte de la provincia de Huesca (Arag�n). Forma parte de la ruta: Pico Posets, Pico Perdiguero y Pico Aneto.<br /></p>'),
(22, 'La Alcazaba', 3366, 'Andaluc�a', 'https://es.wikipedia.org/wiki/Pico_Alcazaba#/media/File:JDCANO_ALCAZABA.JPG', '<p>La <strong>Alcazaba</strong> es, con 3.371 metros, la sexta cumbre m�s alta de Espa�a, por detr�s del Teide (3.718 m), Mulhac�n (3.482 m), Pico de Aneto (3.404 m), Pico del Veleta (3.396 m) y Pico Posets (3.375 m).<br /></p>'),
(23, ' Monte Perdido', 3355, 'Arag�n', 'https://es.wikipedia.org/wiki/Monte_Perdido#/media/File:Macizo_perdido.jpg', '<p><strong>Monte Perdido</strong> (en aragon�s <em>As Tres Serols</em>) es el macizo calc�reo m�s alto de Europa. Se encuentra situado dentro de la vertiente sur del Pirineo central, al norte de la provincia de Huesca, en el parque nacional de Ordesa y Monte Perdido, en la comunidad aut�noma de Arag�n, Espa�a. Su pico m�s elevado es el Monte Perdido con una altitud de 3.355 metros sobre el nivel del mar.<br /></p>'),
(24, 'Cilindro', 3328, 'Arag�n', 'https://es.wikipedia.org/wiki/Pico_Cilindro#/media/File:450px-CILINDRO.JPG', '<p>El <strong>pico Cilindro</strong>, tambi�n llamado <strong>Cilindro de Marbor�</strong>, es un pico de 3.328 m de altitud del macizo de Monte Perdido, dentro de la cordillera del Pirineo y que se sit�a �ntegramente en Espa�a (Valle de Ordesa), pero muy cerca de la frontera con Francia (Circo de Gavarnie) con la que limita el Pico Marbor�, estando incluido en el espa�ol Parque Nacional de Ordesa y Monte Perdido y cercano al Parque Nacional de los Pirineos.<br /></p>'),
(25, 'Perdiguero', 3321, 'Arag�n', 'https://es.wikipedia.org/wiki/Pico_Perdiguero#/media/File:Pico_Perdiguero_1.jpg', '<p>El <strong>pico Perdiguero</strong> (<em>franc�s: Pic de Perdigu�re</em>) es una cumbre de los Pirineos, situada entre Arag�n y Alto Garona, como frontera divisoria entre Espa�a y Francia.</p>\r\n<p>Tiene tres v�as principales de ascensi�n: La que parte desde el Barranco de Literola, la que se inicia en el Valle de Est�s y la que asciende en el Valle de Remu�e.</p>\r\n<p>Desde su cumbre hay un amplia visi�n del Pirineo oscense y franc�s. Y del macizo de la Maladeta y Posets</p>\r\n<p><br /></p>'),
(26, 'Maladeta', 3308, 'Arag�n', 'https://es.wikipedia.org/wiki/Maladeta#/media/File:Maladeta.jpg', '<p>El <strong>Pico de la Maladeta</strong> es una cumbre monta�osa de 3.308 metros de altitud, pr�xima al Pico Aneto. Se encuentra situado en el Parque natural Posets-Maladeta, en el municipio de Benasque, provincia de Huesca, comunidad aut�noma de Arag�n, en Espa�a. En su ladera norte se encuentra el denominado Glaciar de la Maladeta, con unas 37&nbsp;ha de superficie total. Est� fraccionado en dos partes, Maladeta occidental (6 ha) y oriental (31 ha).<br /></p>');

-- 
-- Dumping data for table users
--
INSERT INTO users VALUES
(7, 'admin', 'YWRtaW4=', NULL, NULL, 'admin@istra.dor', '2018-02-20', 1),
(8, 'user', 'dXNlcg==', NULL, NULL, 'us@ua.rio', '2018-02-20', 0),
(9, 'test', 'dGVzdA==', NULL, NULL, 'testeo@test.com', '2018-02-20', 0);

-- 
-- Restore previous SQL mode
-- 
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

-- 
-- Enable foreign keys
-- 
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;