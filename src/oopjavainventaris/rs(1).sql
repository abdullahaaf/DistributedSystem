-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 29, 2016 at 07:36 
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rs`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `deletedatasupplier`(IN `namaSupplier1` VARCHAR(100))
    NO SQL
DELETE FROM data_supplier WHERE namaSupplier = namaSupplier1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `editdatainventaris`(IN `namaInventaris1` VARCHAR(50), IN `tanggalmasuk1` VARCHAR(50), IN `namaSupplier1` VARCHAR(50), IN `jenisKategori1` VARCHAR(50), IN `namaMerk1` VARCHAR(50), IN `jenisKondisi1` VARCHAR(50), IN `type1` VARCHAR(50), IN `jumlah1` INT)
    NO SQL
UPDATE data_inventaris SET namaInventaris = namaInventaris1,tanggalmasuk = tanggalmasuk1, namaSupplier = namaSupplier1, jenisKategori = jenisKategori1 , namaMerk = namaMerk1, jenisKondisi = jenisKondisi1,type = type1,jumlah = jumlah1 WHERE namaInventaris = namaInventaris1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `hapusdatainventaris`(IN `namaInventaris1` VARCHAR(50))
    NO SQL
DELETE FROM data_inventaris WHERE data_inventaris.namaInventaris = namaInventaris1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `hapusdatakategori`(IN `jenisKategori1` VARCHAR(15))
    NO SQL
DELETE FROM kategori_inventaris WHERE jenisKategori = jenisKategori1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `hapusdatakondisi`(IN `jenisKondisi1` VARCHAR(50))
    NO SQL
DELETE FROM kondisi_inventaris WHERE kondisi_inventaris.jenisKondisi = jenisKondisi1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `hapusdatamerk`(IN `namaMerk1` VARCHAR(50))
    NO SQL
DELETE FROM merk_inventaris WHERE merk_inventaris.namaMerk = namaMerk1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertdatainventaris`(IN `namaInventaris1` VARCHAR(50), IN `tanggalmasuk1` VARCHAR(50), IN `namaSupplier1` VARCHAR(50), IN `jenisKategori1` VARCHAR(50), IN `namaMerk1` VARCHAR(50), IN `jenisKondisi1` VARCHAR(50), IN `type1` VARCHAR(50), IN `jumlah1` INT)
    NO SQL
INSERT INTO data_inventaris (namaInventaris,tanggalmasuk,namaSupplier,jenisKategori,namaMerk,jenisKondisi,type,jumlah) VALUES (namaInventaris1,tanggalmasuk1,namaSupplier1,jenisKategori1,namaMerk1,jenisKondisi1,type1,jumlah1)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertdatakategori`(IN `jenisKategori1` VARCHAR(100))
    NO SQL
INSERT INTO kategori_inventaris (jenisKategori) VALUES (jenisKategori1)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertdatakondisi`(IN `jenisKondisi1` VARCHAR(50))
    NO SQL
INSERT INTO kondisi_inventaris (jenisKondisi) VALUES (jenisKondisi1)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertdatamerk`(IN `namaMerk1` VARCHAR(50))
    NO SQL
INSERT INTO merk_inventaris(merk_inventaris.namaMerk) VALUES (namaMerk1)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertdatasupplier`(IN `namaSupplier1` VARCHAR(100), IN `alamat1` VARCHAR(100))
    NO SQL
INSERT INTO data_supplier (namaSupplier,alamat) VALUES (namaSupplier1,alamat1)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `updatedatasupplier`(IN `namaSupplier1` VARCHAR(100), IN `alamat1` VARCHAR(100))
    NO SQL
UPDATE data_supplier SET namaSupplier = namaSupplier1, alamat = alamat1 WHERE namaSupplier = namaSupplier1$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `data_inventaris`
--

CREATE TABLE IF NOT EXISTS `data_inventaris` (
  `idInventaris` int(11) NOT NULL,
  `namaInventaris` varchar(50) NOT NULL,
  `tanggalmasuk` varchar(50) NOT NULL,
  `namaSupplier` varchar(50) NOT NULL,
  `jenisKategori` varchar(50) NOT NULL,
  `namaMerk` varchar(50) NOT NULL,
  `jenisKondisi` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `jumlah` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='in';

--
-- Dumping data for table `data_inventaris`
--

INSERT INTO `data_inventaris` (`idInventaris`, `namaInventaris`, `tanggalmasuk`, `namaSupplier`, `jenisKategori`, `namaMerk`, `jenisKondisi`, `type`, `jumlah`) VALUES
(1, 'Mobil Ambulance', 'Sunday, May 1, 2016', 'Abdullah', 'medis', 'asus', 'Baik', 'L300', '2'),
(2, 'Sepeda Motor', 'Friday, May 20, 2016', 'Abdullah', 'Non medis', 'asus', 'Baik', 'Ch22', '10');

-- --------------------------------------------------------

--
-- Table structure for table `data_supplier`
--

CREATE TABLE IF NOT EXISTS `data_supplier` (
  `idSupplier` int(11) NOT NULL,
  `namaSupplier` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `data_supplier`
--

INSERT INTO `data_supplier` (`idSupplier`, `namaSupplier`, `alamat`) VALUES
(7, 'Abdullah', 'Gresik'),
(9, 'Baiti Rahmi', 'Kalimantan'),
(10, 'Afrizal', 'Malang'),
(14, 'Satriyo', 'Surabaya');

-- --------------------------------------------------------

--
-- Table structure for table `kategori_inventaris`
--

CREATE TABLE IF NOT EXISTS `kategori_inventaris` (
  `idKategori` int(11) NOT NULL,
  `jenisKategori` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kategori_inventaris`
--

INSERT INTO `kategori_inventaris` (`idKategori`, `jenisKategori`) VALUES
(1, 'medis'),
(8, 'Non medis');

-- --------------------------------------------------------

--
-- Table structure for table `kondisi_inventaris`
--

CREATE TABLE IF NOT EXISTS `kondisi_inventaris` (
  `idKondisi` int(11) NOT NULL,
  `jenisKondisi` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kondisi_inventaris`
--

INSERT INTO `kondisi_inventaris` (`idKondisi`, `jenisKondisi`) VALUES
(1, 'Baik'),
(2, 'Kurang'),
(4, 'Rusak');

-- --------------------------------------------------------

--
-- Table structure for table `merk_inventaris`
--

CREATE TABLE IF NOT EXISTS `merk_inventaris` (
  `idMerk` int(11) NOT NULL,
  `namaMerk` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `merk_inventaris`
--

INSERT INTO `merk_inventaris` (`idMerk`, `namaMerk`) VALUES
(2, 'asus'),
(3, 'Canon'),
(4, 'Lenovo'),
(5, 'Mac');

-- --------------------------------------------------------

--
-- Table structure for table `nilai_inventaris`
--

CREATE TABLE IF NOT EXISTS `nilai_inventaris` (
  `idNilai` int(11) NOT NULL,
  `idInventaris` int(11) NOT NULL,
  `hargaInventaris` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_inventaris`
--
ALTER TABLE `data_inventaris`
  ADD PRIMARY KEY (`idInventaris`);

--
-- Indexes for table `data_supplier`
--
ALTER TABLE `data_supplier`
  ADD PRIMARY KEY (`idSupplier`);

--
-- Indexes for table `kategori_inventaris`
--
ALTER TABLE `kategori_inventaris`
  ADD PRIMARY KEY (`idKategori`);

--
-- Indexes for table `kondisi_inventaris`
--
ALTER TABLE `kondisi_inventaris`
  ADD PRIMARY KEY (`idKondisi`);

--
-- Indexes for table `merk_inventaris`
--
ALTER TABLE `merk_inventaris`
  ADD PRIMARY KEY (`idMerk`);

--
-- Indexes for table `nilai_inventaris`
--
ALTER TABLE `nilai_inventaris`
  ADD PRIMARY KEY (`idNilai`,`idInventaris`),
  ADD KEY `idInventaris` (`idInventaris`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_inventaris`
--
ALTER TABLE `data_inventaris`
  MODIFY `idInventaris` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `data_supplier`
--
ALTER TABLE `data_supplier`
  MODIFY `idSupplier` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `kategori_inventaris`
--
ALTER TABLE `kategori_inventaris`
  MODIFY `idKategori` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `kondisi_inventaris`
--
ALTER TABLE `kondisi_inventaris`
  MODIFY `idKondisi` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `merk_inventaris`
--
ALTER TABLE `merk_inventaris`
  MODIFY `idMerk` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `nilai_inventaris`
--
ALTER TABLE `nilai_inventaris`
  MODIFY `idNilai` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `nilai_inventaris`
--
ALTER TABLE `nilai_inventaris`
  ADD CONSTRAINT `nilai_inventaris_ibfk_1` FOREIGN KEY (`idInventaris`) REFERENCES `data_inventaris` (`idInventaris`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
