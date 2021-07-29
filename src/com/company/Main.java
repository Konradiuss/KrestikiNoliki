package com.company;


import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean Win = false, check = false;
        String player1, player2;
        int indxI, indxJ, value;
        final int ROW = 3, COL = 3;
        int[][] fld = new int[ROW][COL];
        System.out.print("///////");
        for (int i = 0; i < fld.length; i++) {
              for (int j = 0; j < fld[i].length; j++) {
                  fld[i][j] = 0;
            }
        }

        for (int i = 0; i < fld.length; i++) {
            System.out.println();
            for (int j = 0; j < fld[i].length; j++) {
                System.out.print(fld[i][j]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("///////");

        System.out.println(" ");
        System.out.print("Первый игрок введите своё имя: ");
        player1 = in.nextLine();
        System.out.println(" ");

        System.out.print("Второй игрок введите своё имя: ");
        player2 = in.nextLine();
        System.out.println(" ");

        do {


            System.out.print("Первый игрок введите поля назначения" + "\n");

            System.out.print("I: ");
            indxI = in.nextInt();
            while (!check){

                if(indxI != 0 || indxI != 1 || indxI != 2)
                {
                    System.out.print("Введите 0, 1, 2. Вы ввели неправильное значнеие." + "\n");

                    System.out.print("I: ");
                    indxI = in.nextInt();
                }

                if(indxI == 0 || indxI == 1 || indxI == 2){
                    break;
                }
            }


            System.out.print("J: ");
            indxJ = in.nextInt();

            while (!check){

                if(indxJ != 0 || indxJ != 1 || indxJ != 2)
                {
                    System.out.print("Введите 0, 1, 2. Вы ввели неправильное значнеие." + "\n");

                    System.out.print("J: ");
                    indxJ = in.nextInt();
                }

                if(indxJ == 0 || indxJ == 1 || indxJ == 2){
                    break;
                }
            }
        while(!check){

            if(fld[indxI][indxJ] == 1 || fld[indxI][indxJ] == 2){

                System.out.print("Это значения поля уже занято, введите значение в другое поле" + "\n");
                System.out.print("I: ");
                indxI = in.nextInt();

                System.out.print("J: ");
                indxJ = in.nextInt();
            }


            if(fld[indxI][indxJ] != 1 && fld[indxI][indxJ] != 2){
                break;
            }

        }

            fld[indxI][indxJ] = 1;

            System.out.print("///////");
            for (int i = 0; i < fld.length; i++) {
                System.out.println();
                for (int j = 0; j < fld[i].length; j++) {
                    System.out.print(fld[i][j] + " ");
                }
            }
            System.out.println(" ");
            System.out.println("///////");

            System.out.print("Второй игрок введите поля назначения" + "\n");

            System.out.print("I: ");
            indxI = in.nextInt();

            System.out.print("J: ");
            indxJ = in.nextInt();

            while(!check){

                if(fld[indxI][indxJ] == 1 || fld[indxI][indxJ] == 2){

                    System.out.print("Это значения поля уже занято, введите значение в другое поле" + "\n");
                    System.out.print("I: ");
                    indxI = in.nextInt();

                    System.out.print("J: ");
                    indxJ = in.nextInt();
                }

                if(fld[indxI][indxJ] != 1 && fld[indxI][indxJ] != 2){
                    break;
                }

            }
            fld[indxI][indxJ] = 2;
            System.out.print("///////");



            for (int i = 0; i < fld.length; i++) {
                System.out.println();
                for (int j = 0; j < fld[i].length; j++) {
                    System.out.print(fld[i][j] + " ");
                }
            }
            System.out.println(" ");
            System.out.println("///////");

            ////////
            int count = 0;
            for (int i = 0; i < fld.length; i++) {

                if(fld[i][0] == 1){
                    count++;
                }
                if(count == 3){
                    System.out.println("Победа по вертикали игрока: " + player1);
                    Win = true;

                }
            }
            count = 0;
            for (int i = 0; i < fld.length; i++) {

                if(fld[i][0] == 2){
                    count++;
                }
                if(count == 3){
                    System.out.println("Победа по вертикали игрока: " + player2);
                    Win = true;

                }
            }
            count = 0;
            /////////
            for (int i = 0; i < fld.length; i++) {

                if(fld[0][i] == 1){
                    count++;
                }
                if(count == 3){
                    System.out.println("Победа по горизонтали горизонтали игрока: " + player1);
                    Win = true;

                }
            }
            count = 0;
            for (int i = 0; i < fld.length; i++) {

                if(fld[0][i] == 2){
                    count++;
                }
                if(count == 3){
                    System.out.println("Победа по горизонтали горизонтали игрока: " + player2);
                    Win = true;

                }
            }
            count = 0;

            ////////
            for (int i = 0; i < fld.length; i++) {
                for (int j = 0; j < fld[i].length; j++) {
                    if(i == j && fld[i][j] == 1){
                        count++;
                    }
                    if(count == 3){
                        System.out.println("Победа по главной диагонали игрока: " + player1);
                        Win = true;}
                }
            }
            count = 0;
            for (int i = 0; i < fld.length; i++) {
                for (int j = 0; j < fld[i].length; j++) {
                    if(i == j && fld[i][j] == 2){
                        count++;
                    }
                    if(count == 3){
                        System.out.println("Победа по главной диагонали игрока: " + player2);
                        Win = true;}
                }
            }
            count = 0;


            for (int i = 0; i < fld.length; i++) {
                for (int j = 0; j < fld[i].length; j++) {
                    if(i + j == ROW - 1 && fld[i][j] == 1){
                        count++;
                    }
                    if(count == 3){
                        System.out.println("Победа по побочной диагонали игрока: " + player1);
                        Win = true;
                        break;}
                }
            }
            count = 0;
            for (int i = 0; i < fld.length; i++) {
                for (int j = 0; j < fld[i].length; j++) {
                    if(i + j == ROW - 1 && fld[i][j] == 2){
                        count++;
                    }
                    if(count == 3){
                        System.out.println("Победа по побочной диагонали игрока: " + player2);
                        Win = true;
                        break;
                    }

                }
            }
            count = 0;

        }while (!Win);
    }
}
