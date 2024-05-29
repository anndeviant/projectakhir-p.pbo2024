-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2024 at 08:46 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manajement-perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id` int(11) NOT NULL,
  `judul` varchar(255) NOT NULL,
  `penulis` varchar(255) NOT NULL,
  `penerbit` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `isbn` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id`, `judul`, `penulis`, `penerbit`, `genre`, `isbn`) VALUES
(14, 'Bagai Bulan', 'AA Dani', 'GM', 'Fiksi', '11002299'),
(15, 'Matahari Pagi', 'Ardian', 'GM', 'Fiksi', '33772299'),
(16, 'Berlarilan', 'Niji', 'GM', 'Fiksi', '22334455'),
(17, 'Laskar Pelangi', 'Niji', 'GM', 'Fiksi', '22334466'),
(18, 'Kapal Karam', 'Maulana', 'GM', 'Fiksi', '77886655'),
(19, 'Samudera Cinta', 'Jamal', 'GM', 'Fiksi', '66449900'),
(20, 'Algoritma', 'Budi', 'GM', 'NonFiksi', '22009988'),
(21, 'Bahasa Indonesia', 'Bagus', 'GM', 'NonFiksi', '66778899'),
(22, 'Yang Patah', 'Andin', 'GM', 'Fiksi', '33779988'),
(23, 'Berlari Jauh', 'Fuad', 'GM', 'Fiksi', '00998866');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id` int(11) NOT NULL,
  `kode_buku` int(11) NOT NULL,
  `nama_mhs` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id`, `kode_buku`, `nama_mhs`) VALUES
(5, 11, 'annas'),
(6, 10, 'lyan'),
(8, 20, 'hikmal'),
(9, 22, 'yusuf');

-- --------------------------------------------------------

--
-- Table structure for table `pengurus`
--

CREATE TABLE `pengurus` (
  `id` int(11) NOT NULL,
  `nama_lengkap` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pengurus`
--

INSERT INTO `pengurus` (`id`, `nama_lengkap`, `username`, `password`) VALUES
(3, 'Hikmal Haqiqi', 'hikmal', '123'),
(5, 'Galang Rakha', 'galang', '123'),
(7, 'Annas Sovianto', 'annas', '123'),
(8, 'Hendra Ramadan', 'hendra', '123'),
(9, 'Baik Alifah', 'alifah', '123'),
(10, 'Irkham galih', 'irkham', '123'),
(11, 'Caca Azizah', 'caca', '123'),
(12, 'Haikal Halim', 'haikal', '123'),
(13, 'Nanami ', 'nanami', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pengurus`
--
ALTER TABLE `pengurus`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `pengurus`
--
ALTER TABLE `pengurus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
