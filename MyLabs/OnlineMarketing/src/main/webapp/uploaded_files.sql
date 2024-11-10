-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Oct 10, 2023 at 04:42 PM
-- Server version: 10.10.2-MariaDB
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aboutstudent`
--

-- --------------------------------------------------------

--
-- Table structure for table `uploaded_files`
--

DROP TABLE IF EXISTS `uploaded_files`;
CREATE TABLE IF NOT EXISTS `uploaded_files` (
  `iUploadsFilesId` int(10) NOT NULL AUTO_INCREMENT,
  `vFileName` varchar(255) DEFAULT NULL,
  `vFilePath` varchar(255) DEFAULT NULL,
  `vCropName` varchar(255) DEFAULT NULL,
  `iQuantity` int(11) DEFAULT NULL,
  `iPrice` int(11) DEFAULT NULL,
  `tDescription` text DEFAULT NULL,
  `dtUploadDate` datetime NOT NULL DEFAULT current_timestamp(),
  `iSales_Id` int(10) DEFAULT NULL,
  PRIMARY KEY (`iUploadsFilesId`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=greek COLLATE=greek_general_ci;

--
-- Dumping data for table `uploaded_files`
--

INSERT INTO `uploaded_files` (`iUploadsFilesId`, `vFileName`, `vFilePath`, `vCropName`, `iQuantity`, `iPrice`, `tDescription`, `dtUploadDate`, `iSales_Id`) VALUES
(1, 'WIN_20221130_22_09_36_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20221130_22_09_36_Pro.jpg', 'praveen', 4, 3, 'ddd', '2023-10-10 03:23:03', 1),
(2, 'WIN_20221130_22_09_36_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20221130_22_09_36_Pro.jpg', 'praveen', 4, 3, 'ddd', '2023-10-10 03:24:05', 2),
(3, 'WIN_20221114_20_15_03_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20221114_20_15_03_Pro.jpg', 'paddy', 4, 665, 'good', '2023-10-10 04:56:12', 3),
(4, 'WIN_20230423_17_16_27_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20230423_17_16_27_Pro.jpg', 'cotton', 4, 453, 'cotton Good.', '2023-10-10 11:55:18', 4),
(5, 'WIN_20221130_22_09_36_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20221130_22_09_36_Pro.jpg', 'raki', 23, 75, 'hbbjjbjb', '2023-10-10 13:15:04', 9),
(6, 'WIN_20221130_22_09_48_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20221130_22_09_48_Pro.jpg', 'babu sunta', 43, 3, 'gdfgdfg', '2023-10-10 13:20:22', 9),
(7, 'WIN_20221130_22_09_36_Pro.jpg', 'C:wamp64wamp64wwwphp-practicepraveenAgriGo/uploads/WIN_20221130_22_09_36_Pro.jpg', 'Crop jagadeesh', 56345, 5464, 'jagadeesh good boy', '2023-10-10 15:17:16', 10);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
