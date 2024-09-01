-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Εξυπηρετητής: 127.0.0.1
-- Χρόνος δημιουργίας: 01 Σεπ 2024 στις 13:58:52
-- Έκδοση διακομιστή: 10.4.32-MariaDB
-- Έκδοση PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `company`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `register`
--

CREATE TABLE `register` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_num` varchar(30) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `register`
--

INSERT INTO `register` (`id`, `name`, `lastname`, `email`, `phone_num`, `password`, `address`, `salary`, `department`) VALUES
(48, 'Mikel', 'Bazelli', 'mikel@worker.com', '6979277510', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 22', 50000.00, 'Software Development'),
(49, 'Milva', 'Smith', 'milva@admin.com', '1234567891', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 22', 100000.00, 'Administartion'),
(53, 'John', 'Doe', 'john@worker.com', '1234567892', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 23', 55000.00, 'Human Resources'),
(54, 'Jane', 'Doe', 'jane@worker.com', '1234567893', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 24', 60000.00, 'Marketing'),
(55, 'Alice', 'Johnson', 'alice@worker.com', '1234567894', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 25', 70000.00, 'Sales'),
(56, 'Bob', 'Smith', 'bob@worker.com', '1234567895', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 26', 75000.00, 'Engineering'),
(57, 'Charlie', 'Brown', 'charlie@worker.com', '1234567896', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 27', 80000.00, 'Finance'),
(58, 'David', 'Wilson', 'david@worker.com', '1234567897', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 28', 85000.00, 'Legal'),
(59, 'Eva', 'Davis', 'eva@worker.com', '1234567898', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 29', 90000.00, 'Operations'),
(60, 'Frank', 'Miller', 'frank@worker.com', '1234567899', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 30', 95000.00, 'Product Management'),
(61, 'Grace', 'Lee', 'grace@worker.com', '1234567800', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 31', 65000.00, 'Customer Support'),
(62, 'Henry', 'Walker', 'henry@worker.com', '1234567801', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 32', 72000.00, 'Quality Assurance'),
(63, 'Isabel', 'Martinez', 'isabel@worker.com', '1234567802', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 33', 68000.00, 'Design'),
(64, 'Jack', 'Taylor', 'jack@worker.com', '1234567803', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 34', 62000.00, 'Data Science'),
(65, 'Karen', 'Lewis', 'karen@worker.com', '1234567804', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 35', 58000.00, 'Research'),
(66, 'Liam', 'Clark', 'liam@worker.com', '1234567805', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 36', 64000.00, 'IT'),
(67, 'Mia', 'Harris', 'mia@worker.com', '1234567806', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 37', 67000.00, 'Human Resources'),
(68, 'Nathan', 'Lopez', 'nathan@worker.com', '1234567807', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 38', 72000.00, 'Security'),
(69, 'Olivia', 'Robinson', 'olivia@worker.com', '1234567808', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 39', 76000.00, 'Supply Chain'),
(70, 'Peter', 'White', 'peter@worker.com', '1234567809', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', 'Street 40', 82000.00, 'Strategy');

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `tasks`
--

CREATE TABLE `tasks` (
  `id` int(11) NOT NULL,
  `taskname` varchar(255) NOT NULL,
  `task_description` text DEFAULT NULL,
  `assigned_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `deadline_date` date DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `file_path` varchar(255) DEFAULT NULL,
  `report_text` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Άδειασμα δεδομένων του πίνακα `tasks`
--

INSERT INTO `tasks` (`id`, `taskname`, `task_description`, `assigned_date`, `deadline_date`, `user_id`, `file_path`, `report_text`) VALUES
(30, 'Sales', 'Count Last Year Sales ', '2024-09-01 09:51:24', '2024-12-16', 55, 'C:\\Users\\mpaze\\OneDrive\\Έγγραφα\\NetBeansProjects\\Myapp\\uploads\\Sales.txt', 'Very good, no need to fix anything '),
(31, 'Fix errors', 'With the help of your team, fix the errors \non the website', '2024-09-01 09:54:06', '2024-12-18', 48, 'C:\\Users\\mpaze\\OneDrive\\Έγγραφα\\NetBeansProjects\\Myapp\\uploads\\Fix_errors.docx', 'Good job, '),
(32, 'Design', 'Fix the front end design of the Website', '2024-09-01 09:54:58', '2024-12-18', 63, 'C:\\Users\\mpaze\\OneDrive\\Έγγραφα\\NetBeansProjects\\Myapp\\uploads\\Design.xlsx', NULL);

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`id`);

--
-- Ευρετήρια για πίνακα `tasks`
--
ALTER TABLE `tasks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `register`
--
ALTER TABLE `register`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;

--
-- AUTO_INCREMENT για πίνακα `tasks`
--
ALTER TABLE `tasks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Περιορισμοί για άχρηστους πίνακες
--

--
-- Περιορισμοί για πίνακα `tasks`
--
ALTER TABLE `tasks`
  ADD CONSTRAINT `tasks_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `register` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
