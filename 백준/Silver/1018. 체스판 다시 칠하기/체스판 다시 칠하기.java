import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] board = new String[m][n];
        String[][] chess = new String[8][8];
        int min = 32;

        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.substring(j, j + 1);
            }
        }

        for (int k = 0; k <= m - 8; k++) {
            for (int l = 0; l <= n - 8; l++) {
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        chess[i][j] = board[i + k][j + l];
                    }
                }

                int count = 0;
                if (chess[0][0].equals("W")) {
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                                if (!chess[i][j].equals("W")) {
                                    count++;
                                }
                            } else {
                                if (!chess[i][j].equals("B")) {
                                    count++;
                                }
                            }

                        }
                    }

                    if (count < min) {
                        min = count;
                    }

                    count = 0;
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                                if (!chess[i][j].equals("B")) {
                                    count++;
                                }
                            } else {
                                if (!chess[i][j].equals("W")) {
                                    count++;
                                }
                            }

                        }
                    }

                    if (count < min) {
                        min = count;
                    }

                } else {
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                                if (!chess[i][j].equals("B")) {
                                    count++;
                                }
                            } else {
                                if (!chess[i][j].equals("W")) {
                                    count++;
                                }
                            }

                        }
                    }

                    if (count < min) {
                        min = count;
                    }

                    count = 0;

                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                                if (!chess[i][j].equals("W")) {
                                    count++;
                                }
                            } else {
                                if (!chess[i][j].equals("B")) {
                                    count++;
                                }
                            }

                        }
                    }
                    if (count < min) {
                        min = count;
                    }

                }

            }
        }

        System.out.println(min);

        scanner.close();
    }
}
