/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.UserManagement;

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = UserManagement.menu();
            switch (choice) {
                case 1:
                    UserManagement.createNewAccount();
                    break;
                case 2:
                    UserManagement.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }
}
