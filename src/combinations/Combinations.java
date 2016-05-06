package combinations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Combinations {

    static int max = 45;
    static int counter = 0;
    static int howMany = 5;

    private static void findInResults(String[] dane2) {
        String csvFile = "C:\\Users\\AMaslowiec\\Downloads\\test.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        int n = 0;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] digit = line.split(cvsSplitBy);
                if (Arrays.asList(digit).containsAll(Arrays.asList(dane2))) {
                    n += 1;
                }
            }
            if (n > 0) {
                switch (howMany) {
                    case 1:
                        System.out.println(dane2[0] + ": " + n);
                        break;
                    case 2:
                        System.out.println(dane2[0] + "," + dane2[1] + ": " + n);
                        break;
                    case 3:
                        System.out.println(dane2[0] + "," + dane2[1] + "," + dane2[2] + ": " + n);
                        break;
                    case 4:
                        System.out.println(dane2[0] + "," + dane2[1] + "," + dane2[2] + "," + dane2[3] + ": " + n);
                        break;
                    case 5:
                        System.out.println(dane2[0] + "," + dane2[1] + "," + dane2[2] + "," + dane2[3] + "," + dane2[4] + ": " + n);
                        break;
                    case 6:
                        System.out.println(dane2[0] + "," + dane2[1] + "," + dane2[2] + "," + dane2[3] + "," + dane2[4] + "," + dane2[5] + ": " + n);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        switch (howMany) {
            case 1:
                countFor1();
                break;
            case 2:
                countFor2();
                break;
            case 3:
                countFor3();
                break;
            case 4:
                countFor4();
                break;
            case 5:
                countFor5();
                break;
            case 6:
                countFor6();
                break;
        }
    }

    public static void countFor1() {
        for (int a = 1; a < max + 1; a += 1) {
            counter += 1;
//            System.out.println(counter + ": " + a);
            findInResults(new String[]{String.valueOf(a)});
        }
    }

    public static void countFor2() {
        for (int a = 1; a < max; a += 1) {
            for (int b = a + 1; b < max + 1; b += 1) {
                counter += 1;
//                System.out.println(counter + ": " + a + "," + b);
                findInResults(new String[]{String.valueOf(a), String.valueOf(b)});
            }
        }
    }

    public static void countFor3() {
        for (int a = 1; a < max - 1; a += 1) {
            for (int b = a + 1; b < max; b += 1) {
                for (int c = b + 1; c < max + 1; c += 1) {
                    counter += 1;
//                    System.out.println(a + "," + b + "," + c);
                    findInResults(new String[]{String.valueOf(a), String.valueOf(b), String.valueOf(c)});
                }
            }
        }
    }

    public static void countFor4() {
        for (int a = 1; a < max - 2; a += 1) {
            for (int b = a + 1; b < max - 1; b += 1) {
                for (int c = b + 1; c < max; c += 1) {
                    for (int d = c + 1; d < max + 1; d += 1) {
                        counter += 1;
//                        System.out.println(counter + ": " + a + "," + b + "," + c + "," + d);
                        findInResults(new String[]{String.valueOf(a), String.valueOf(b), String.valueOf(c), String.valueOf(d)});
                    }
                }
            }
        }
    }

    public static void countFor5() {
        for (int a = 1; a < max - 3; a += 1) {
            for (int b = a + 1; b < max - 2; b += 1) {
                for (int c = b + 1; c < max - 1; c += 1) {
                    for (int d = c + 1; d < max; d += 1) {
                        for (int e = d + 1; e < max + 1; e += 1) {
                            counter += 1;
//                            System.out.println(counter + ": " + a + "," + b + "," + c + "," + d + "," + e);
                            findInResults(new String[]{String.valueOf(a), String.valueOf(b), String.valueOf(c), String.valueOf(d), String.valueOf(e)});
                        }
                    }
                }
            }
        }
    }

    public static void countFor6() {
        for (int a = 1; a < max - 4; a += 1) {
            for (int b = a + 1; b < max - 3; b += 1) {
                for (int c = b + 1; c < max - 2; c += 1) {
                    for (int d = c + 1; d < max - 1; d += 1) {
                        for (int e = d + 1; e < max; e += 1) {
                            for (int f = e + 1; f < max + 1; f += 1) {
                                counter += 1;
//                                System.out.println(counter + ": " + a + "," + b + "," + c + "," + d + "," + e + "," + f);
                                findInResults(new String[]{String.valueOf(a), String.valueOf(b), String.valueOf(c), String.valueOf(d), String.valueOf(e), String.valueOf(f)});
                            }
                        }
                    }
                }
            }
        }
    }

}
