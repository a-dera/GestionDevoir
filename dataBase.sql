-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 21 juil. 2020 à 18:07
-- Version du serveur :  10.1.38-MariaDB
-- Version de PHP :  7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gest1`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `codeCl` varchar(20) NOT NULL,
  `niveau` varchar(20) NOT NULL,
  `codeF` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`codeCl`, `niveau`, `codeF`) VALUES
('L1ABF', 'Licence 1', '2'),
('L1ADB', 'Licence 1', '5'),
('L1CCA', 'Licence 1', '3'),
('L1MG', 'Licence 1', '4'),
('L1MIAGE', 'Licence 1', '1'),
('L2ABF', 'Licence 2', '2'),
('L2ADB', 'Licence 2', '5'),
('L2CCA', 'Licence 2', '3'),
('L2MG', 'Licence 2', '4'),
('L2MIAGE', 'Licence 2', '1'),
('L3ABF', 'Licence 3', '2'),
('L3ADB', 'Licence 3', '5'),
('L3CCA', 'Licence 3', '3'),
('L3MG', 'Licence 3', '4'),
('L3MIAGE', 'Licence 3', '1'),
('M1ABF', 'Master 1', '2'),
('M1CCA', 'Master 1', '3'),
('M1MIAGE', 'Master 1', '1'),
('M2ABF', 'Master 2', '2'),
('M2CCA', 'Master 2', '3'),
('M2MIAGE', 'Master 2', '1'),
('MAGE1', 'Master 1', '1'),
('MAGE2', 'Master 2', '1');

-- --------------------------------------------------------

--
-- Structure de la table `devoir`
--
create table `user`(
	`login` varchar(50) not null,
	`pass`  varchar(50) not null
);

INSERT INTO `user` (`login`, `pass`) VALUES ('root', '1234');


CREATE TABLE `devoir` (
  `codeD` varchar(20) NOT NULL,
  `dateD` varchar(20) NOT NULL,
  `heureD` varchar(20) NOT NULL,
  `salle` varchar(20) NOT NULL,
  `codeM` varchar(20) NOT NULL,
  `codeCl` varchar(20) NOT NULL,
  `codeP` varchar(20) NOT NULL,
  `codeS` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `devoir`
--

INSERT INTO `devoir` (`codeD`, `dateD`, `heureD`, `salle`, `codeM`, `codeCl`, `codeP`, `codeS`) VALUES
('D001', '25-07-2020', '14h00', '', 'ANG1541', 'L1MIAGE', 'N0010', 'S001'),
('D002', '28-07-2020', '13h30', '', 'INF1511', 'L1MIAGE', 'N001', 'S002'),
('D003', '23-3-2300', '11h40', '', 'ANG1541', 'L2MIAGE', 'N0010', 'S002'),
('D004', '23-3-2020', '15h00', '', 'INF1511', 'L2MIAGE', 'N001', 'S002');

-- --------------------------------------------------------

--
-- Structure de la table `enseigner`
--

CREATE TABLE `enseigner` (
  `codeM` varchar(20) NOT NULL,
  `codeCl` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `codeF` varchar(20) NOT NULL,
  `nom_f` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `filiere`
--

INSERT INTO `filiere` (`codeF`, `nom_f`) VALUES
('1', 'MIAGE'),
('2', 'ABF'),
('3', 'CCA'),
('4', 'MG'),
('5', 'ADB');

-- --------------------------------------------------------

--
-- Structure de la table `module`
--

CREATE TABLE `module` (
  `codeM` varchar(20) NOT NULL,
  `nom_m` varchar(20) NOT NULL,
  `coef` int(11) NOT NULL,
  `codeP` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `module`
--

INSERT INTO `module` (`codeM`, `nom_m`, `coef`, `codeP`) VALUES
('ANG1541', 'Anglais 2', 2, 'N0010'),
('COM1501', 'Communication 2', 2, 'N008'),
('INF1511', 'Algorithmique', 4, 'N001'),
('INF1521', 'Web', 4, 'N002'),
('INF1522', 'Architecture', 3, 'N003'),
('INF1523', 'Langage Assembleur', 2, 'N004'),
('MTH1541', 'Algebre lineaire', 3, 'N006'),
('MTH1542', 'Analyse 2', 4, 'N005'),
('MTH1551', 'Statistiques Descrip', 3, 'N007'),
('TCC1501', 'TEEO', 4, 'N009');

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

CREATE TABLE `professeur` (
  `codeP` varchar(20) NOT NULL,
  `nom_p` varchar(20) NOT NULL,
  `prenom_p` varchar(20) NOT NULL,
  `grade_p` varchar(20) NOT NULL,
  `adresse_p` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `professeur`
--

INSERT INTO `professeur` (`codeP`, `nom_p`, `prenom_p`, `grade_p`, `adresse_p`) VALUES
('N001', 'Guinko', 'Ferdinand', 'DR', '73257086'),
('N0010', 'Kabore', 'Oumarou', 'DR', '58257086'),
('N002', 'Ouedraogo', 'Desire', 'DR', '56257086'),
('N003', 'Kone', 'Lydie', 'PR', '57257086'),
('N004', 'Medah', 'Daniel', 'PR', '78257086'),
('N005', 'Inoussa', 'Traore', 'DR', '77257086'),
('N006', 'Han', 'Madou', 'DR', '72257086'),
('N007', 'Tankoano', 'Joackim', 'DR', '71257086'),
('N008', 'Traore', 'Yaya', 'DR', '74257086'),
('N009', 'Ouattara', 'Yacouba', 'DR', '79257086');

-- --------------------------------------------------------

--
-- Structure de la table `remise`
--

CREATE TABLE `remise` (
  `codeP` varchar(20) NOT NULL,
  `codeD` varchar(20) NOT NULL,
  `dateRemise` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `retrait`
--

CREATE TABLE `retrait` (
  `codeP` varchar(20) NOT NULL,
  `codeD` varchar(20) NOT NULL,
  `dateRetrait` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `codeSa` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`codeSa`) VALUES
('SC1'),
('SC2'),
('SC3'),
('SC5'),
('SC6'),
('SC7'),
('SI2'),
('SI3'),
('SI4');

-- --------------------------------------------------------

--
-- Structure de la table `surveillant`
--

CREATE TABLE `surveillant` (
  `codeS` varchar(20) NOT NULL,
  `nom_s` varchar(20) NOT NULL,
  `prenom_s` varchar(20) NOT NULL,
  `adresse_s` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `surveillant`
--

INSERT INTO `surveillant` (`codeS`, `nom_s`, `prenom_s`, `adresse_s`) VALUES
('S001', 'joe', 'dan', '7456634'),
('S002', 'salga', 'boris', '74345678'),
('S003', 'SALBRE', 'Rokia', '22556789');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`codeCl`),
  ADD KEY `classe_codeF` (`codeF`);

--
-- Index pour la table `devoir`
--
ALTER TABLE `devoir`
  ADD PRIMARY KEY (`codeD`),
  ADD KEY `devoir_codeCl` (`codeCl`),
  ADD KEY `devoir_codeM` (`codeM`),
  ADD KEY `devoir_codeP` (`codeP`),
  ADD KEY `devoir_codeS` (`codeS`);

--
-- Index pour la table `enseigner`
--
ALTER TABLE `enseigner`
  ADD PRIMARY KEY (`codeM`,`codeCl`),
  ADD KEY `surveille_codeCl` (`codeCl`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`codeF`);

--
-- Index pour la table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`codeM`),
  ADD KEY `module_codeP` (`codeP`);

--
-- Index pour la table `professeur`
--
ALTER TABLE `professeur`
  ADD PRIMARY KEY (`codeP`);

--
-- Index pour la table `remise`
--
ALTER TABLE `remise`
  ADD PRIMARY KEY (`codeP`,`codeD`),
  ADD KEY `remise_codeD` (`codeD`);

--
-- Index pour la table `retrait`
--
ALTER TABLE `retrait`
  ADD PRIMARY KEY (`codeP`,`codeD`),
  ADD KEY `retrait_codeD` (`codeD`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`codeSa`);

--
-- Index pour la table `surveillant`
--
ALTER TABLE `surveillant`
  ADD PRIMARY KEY (`codeS`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `classe`
--
ALTER TABLE `classe`
  ADD CONSTRAINT `classe_codeF` FOREIGN KEY (`codeF`) REFERENCES `filiere` (`codeF`);

--
-- Contraintes pour la table `devoir`
--
ALTER TABLE `devoir`
  ADD CONSTRAINT `devoir_codeCl` FOREIGN KEY (`codeCl`) REFERENCES `classe` (`codeCl`),
  ADD CONSTRAINT `devoir_codeM` FOREIGN KEY (`codeM`) REFERENCES `module` (`codeM`),
  ADD CONSTRAINT `devoir_codeP` FOREIGN KEY (`codeP`) REFERENCES `professeur` (`codeP`),
  ADD CONSTRAINT `devoir_codeS` FOREIGN KEY (`codeS`) REFERENCES `surveillant` (`codeS`);

--
-- Contraintes pour la table `enseigner`
--
ALTER TABLE `enseigner`
  ADD CONSTRAINT `surveille_codeCl` FOREIGN KEY (`codeCl`) REFERENCES `classe` (`codeCl`),
  ADD CONSTRAINT `surveille_codeM` FOREIGN KEY (`codeM`) REFERENCES `module` (`codeM`);

--
-- Contraintes pour la table `module`
--
ALTER TABLE `module`
  ADD CONSTRAINT `module_codeP` FOREIGN KEY (`codeP`) REFERENCES `professeur` (`codeP`);

--
-- Contraintes pour la table `remise`
--
ALTER TABLE `remise`
  ADD CONSTRAINT `remise_codeD` FOREIGN KEY (`codeD`) REFERENCES `devoir` (`codeD`),
  ADD CONSTRAINT `remise_codeP` FOREIGN KEY (`codeP`) REFERENCES `professeur` (`codeP`);

--
-- Contraintes pour la table `retrait`
--
ALTER TABLE `retrait`
  ADD CONSTRAINT `retrait_codeD` FOREIGN KEY (`codeD`) REFERENCES `devoir` (`codeD`),
  ADD CONSTRAINT `retrait_codeP` FOREIGN KEY (`codeP`) REFERENCES `professeur` (`codeP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
