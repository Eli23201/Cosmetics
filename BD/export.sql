-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.8-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando datos para la tabla tic33.productos: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `fecha`, `precio`, `imagen`, `marca`, `detalles`) VALUES
	(1, 'Maquin', 'maquillaje base para el rostro', '2009-10-20', 500, '3.jpg', 'MAC', 'maquillaje en base de arroz y productos naturales'),
	(2, 'Blending', 'esponja Blending verde', '2009-10-20', 250, '2.jpg', 'MAC', 'esponja sueve para aplicacion de maquillaje'),
	(3, 'Rizado', 'enchinador de penstañas', '2009-10-20', 100, '1.jpg', 'NYC', 'encinado de pensañas con mucha suevidad'),
	(4, 'Mascara', 'mascara de penstañas', '2017-09-19', 150, '4.jpg', 'MAC', ' mascara de pensañas larga duración'),
	(5, 'Fijate', 'Fijador de maquillaje', '2017-09-19', 150, '5.jpg', 'MAC', 'Fijador e hidratante de rostro');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
