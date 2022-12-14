package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;




public class Main  {
    public static void main  (String[] args) {
        final UserService user = new UserServiceImpl();
        // реализуйте алгоритм здесь
        user.createUsersTable();
        user.saveUser("Zoay", "Petrova", (byte)87);
        user.saveUser("Zoay", "Petrova", (byte)87);
        user.saveUser("Zoay", "Petrova", (byte)87);
        user.saveUser("Zoay", "Petrova", (byte)87);
        user.removeUserById(1L);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
        }
    }

