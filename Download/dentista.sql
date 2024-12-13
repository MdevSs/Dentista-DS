-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13/12/2024 às 23:40
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `.dentista`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `atendimento`
--

CREATE TABLE `atendimento` (
  `atendimento_id` int(10) UNSIGNED NOT NULL,
  `dentista_id` int(10) UNSIGNED NOT NULL,
  `cliente_id` int(10) UNSIGNED NOT NULL,
  `servico_id` int(10) UNSIGNED NOT NULL,
  `funcionario_id` int(10) UNSIGNED NOT NULL,
  `data` datetime NOT NULL DEFAULT current_timestamp(),
  `ativo` tinyint(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `atendimento`
--

INSERT INTO `atendimento` (`atendimento_id`, `dentista_id`, `cliente_id`, `servico_id`, `funcionario_id`, `data`, `ativo`) VALUES
(3, 2, 1, 1, 1, '2025-01-01 00:00:00', 0),
(4, 1, 1, 1, 1, '2024-12-06 00:15:19', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `cliente_id` int(10) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `numero` varchar(100) NOT NULL,
  `rua` varchar(100) NOT NULL,
  `bairro` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `ativo` tinyint(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`cliente_id`, `nome`, `cpf`, `email`, `numero`, `rua`, `bairro`, `cidade`, `estado`, `ativo`) VALUES
(1, 'Lele', '1', 'leleque@gmail.com', '223', 'Aldair Pombo', 'VIla Clarice', 'São Paulo', 'SP', 1),
(2, 'ADadada', '22331231', 'dawdadawd', '234234242', '2342342', '2342424', 'adadadada', 'aawdawdaww', 0),
(3, 'Junior', '111.222.333.45', 'Juliãomandrake2011@hotmail.com', '11', 'Castelo Branco', 'Jaragua', 'São Paulo', 'SP', 0),
(4, 'JUberto', 'adaddawda', 'adawdawdaw', 'n', 'jjj', 'jn', 'kn', 'nknknk', 1),
(5, 'Claudio', 'dadawdawd', 'sfsfsfse', 'hjbjbjhhb', 'jhbjh', 'jbj', 'bjbjb', 'jhbj', 1),
(6, 'Bebelo', '333.444.555-67', 'Bebe@outlook.com', '00', 'Jacobalacobaco', 'Penha', 'Porto Alegre', 'Alagoas', 0),
(7, 'Junior', '111.222.333.45', 'Juliãomandrake2011@hotmail.com', '11', 'Castelo Branco', 'Jaragua', 'SP', 'São Paulo', 0),
(8, 'Bebelo', '333.444.555-67', 'Bebe@outlook.com', '00', 'Jacobalacobaco', 'Penha', 'Alagoas', 'Porto Alegre', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `dentista`
--

CREATE TABLE `dentista` (
  `dentista_id` int(10) UNSIGNED NOT NULL,
  `especialidade_id` int(10) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cro` varchar(100) NOT NULL,
  `telefone` varchar(100) NOT NULL,
  `ativo` tinyint(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `dentista`
--

INSERT INTO `dentista` (`dentista_id`, `especialidade_id`, `nome`, `cro`, `telefone`, `ativo`) VALUES
(1, 1, 'Marcelão', 'algo', '13213121', 0),
(2, 2, 'Novo', 'Novo', '123', 1),
(3, 1, 'Marcelão', 'algo', '13213121', 0),
(4, 1, 'Marcelão', 'algo', '13213121', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `especialidade`
--

CREATE TABLE `especialidade` (
  `especialidade_id` int(10) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descricao` varchar(1000) NOT NULL,
  `ativo` tinyint(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `especialidade`
--

INSERT INTO `especialidade` (`especialidade_id`, `nome`, `descricao`, `ativo`) VALUES
(1, 'Obturação', 'Ranca o dentão', 1),
(2, 'Limpeza', 'Limpa os dentes', 0),
(3, 'Limpeza', 'Limpa os dentes', 0),
(4, 'Limpeza', 'Limpa os Dentes', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `funcionario_id` int(10) UNSIGNED NOT NULL,
  `nome` varchar(100) NOT NULL,
  `ctps` varchar(100) NOT NULL,
  `telefone` varchar(100) NOT NULL,
  `ativo` tinyint(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`funcionario_id`, `nome`, `ctps`, `telefone`, `ativo`) VALUES
(1, 'JuBERTO', 'Registrado', '11 9123234', 1),
(2, 'Carla', 'Registrada', '11 91236543', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `servico`
--

CREATE TABLE `servico` (
  `servico_id` int(10) UNSIGNED NOT NULL,
  `descricao` varchar(1000) NOT NULL,
  `duracao` time NOT NULL,
  `valor` float NOT NULL,
  `ativo` tinyint(2) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `servico`
--

INSERT INTO `servico` (`servico_id`, `descricao`, `duracao`, `valor`, `ativo`) VALUES
(1, 'MUITO RUIM', '17:26:10', 10.5, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(300) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `senha`) VALUES
(1, 'Leandro', 'lele');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `atendimento`
--
ALTER TABLE `atendimento`
  ADD PRIMARY KEY (`atendimento_id`),
  ADD KEY `fk_dentista` (`dentista_id`),
  ADD KEY `fk_cliente` (`cliente_id`),
  ADD KEY `fk_servico` (`servico_id`),
  ADD KEY `fk_funcionario` (`funcionario_id`);

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cliente_id`);

--
-- Índices de tabela `dentista`
--
ALTER TABLE `dentista`
  ADD PRIMARY KEY (`dentista_id`),
  ADD KEY `fk_especialidade` (`especialidade_id`);

--
-- Índices de tabela `especialidade`
--
ALTER TABLE `especialidade`
  ADD PRIMARY KEY (`especialidade_id`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`funcionario_id`);

--
-- Índices de tabela `servico`
--
ALTER TABLE `servico`
  ADD PRIMARY KEY (`servico_id`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `atendimento`
--
ALTER TABLE `atendimento`
  MODIFY `atendimento_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cliente_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `dentista`
--
ALTER TABLE `dentista`
  MODIFY `dentista_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `especialidade`
--
ALTER TABLE `especialidade`
  MODIFY `especialidade_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `funcionario_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `servico`
--
ALTER TABLE `servico`
  MODIFY `servico_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `atendimento`
--
ALTER TABLE `atendimento`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`cliente_id`),
  ADD CONSTRAINT `fk_dentista` FOREIGN KEY (`dentista_id`) REFERENCES `dentista` (`dentista_id`),
  ADD CONSTRAINT `fk_funcionario` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`funcionario_id`),
  ADD CONSTRAINT `fk_servico` FOREIGN KEY (`servico_id`) REFERENCES `servico` (`servico_id`);

--
-- Restrições para tabelas `dentista`
--
ALTER TABLE `dentista`
  ADD CONSTRAINT `fk_especialidade` FOREIGN KEY (`especialidade_id`) REFERENCES `especialidade` (`especialidade_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
