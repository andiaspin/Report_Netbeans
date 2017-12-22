-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Dec 22, 2017 at 03:32 AM
-- Server version: 5.0.51
-- PHP Version: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `dbtoko`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `penjualan`
-- 

CREATE TABLE `penjualan` (
  `no_transaksi` varchar(50) default NULL,
  `tgl_transaksi` date default NULL,
  `kd_barang` varchar(30) default NULL,
  `jumlah` int(10) default NULL,
  `totalharga` int(20) default NULL,
  `Kasir` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `penjualan`
-- 

INSERT INTO `penjualan` VALUES ('F-11-01-2016-10', '2016-01-11', 'B004', 2, 6000, 'ADMIN');
INSERT INTO `penjualan` VALUES ('F-11-01-2016-1', '2016-02-09', 'B006', 2, 14000, 'ADMIN');
INSERT INTO `penjualan` VALUES ('F-11-01-2016-1', '2017-01-13', 'B007', 2, 14000, 'ADMIN');
