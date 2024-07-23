CREATE TABLE `component` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cpa` double DEFAULT NULL,
  `cpb` double DEFAULT NULL,
  `cpc` double DEFAULT NULL,
  `cpd` double DEFAULT NULL,
  `mole_wt` double DEFAULT NULL,
  `pvapa` double DEFAULT NULL,
  `pvapb` double DEFAULT NULL,
  `pvapc` double DEFAULT NULL,
  `pc` double DEFAULT NULL,
  `tc` double DEFAULT NULL,
  `vc` double DEFAULT NULL,
  `zc` double DEFAULT NULL,
  `name` varchar(128) NOT NULL,
  `omega` double DEFAULT NULL,
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `name_2` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=473 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
