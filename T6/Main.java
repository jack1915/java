package T6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Set <Notebook> noteboo = new HashSet<>();
        Random rnd = new Random();

        Notebook noteboo1 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo1.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo1.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo1.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo1.setOs(os(rnd.nextInt(0, 3)));
        noteboo1.setRum(rum(rnd.nextInt(0, 5)));
        noteboo1.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo1);

        Notebook noteboo2 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo2.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo2.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo2.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo2.setOs(os(rnd.nextInt(0, 3)));
        noteboo2.setRum(rum(rnd.nextInt(0, 5)));
        noteboo2.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo2);

        Notebook noteboo3 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo3.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo3.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo3.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo3.setOs(os(rnd.nextInt(0, 3)));
        noteboo3.setRum(rum(rnd.nextInt(0, 5)));
        noteboo3.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo3);

        Notebook noteboo4 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo4.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo4.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo4.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo4.setOs(os(rnd.nextInt(0, 3)));
        noteboo4.setRum(rum(rnd.nextInt(0, 5)));
        noteboo4.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo4);

        Notebook noteboo5 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo5.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo5.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo5.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo5.setOs(os(rnd.nextInt(0, 3)));
        noteboo5.setRum(rum(rnd.nextInt(0, 5)));
        noteboo5.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo5);

        Notebook noteboo6 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo6.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo6.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo6.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo6.setOs(os(rnd.nextInt(0, 3)));
        noteboo6.setRum(rum(rnd.nextInt(0, 5)));
        noteboo6.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo6);

        Notebook noteboo7 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo7.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo7.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo7.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo7.setOs(os(rnd.nextInt(0, 3)));
        noteboo7.setRum(rum(rnd.nextInt(0, 5)));
        noteboo7.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo7);

        Notebook noteboo8 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo8.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo8.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo8.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo8.setOs(os(rnd.nextInt(0, 3)));
        noteboo8.setRum(rum(rnd.nextInt(0, 5)));
        noteboo8.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo8);

        Notebook noteboo9 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo9.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo9.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo9.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo9.setOs(os(rnd.nextInt(0, 3)));
        noteboo9.setRum(rum(rnd.nextInt(0, 5)));
        noteboo9.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo9);

        Notebook noteboo10 = new Notebook(brand(rnd.nextInt(0, 6)));
        noteboo10.setButtery(buttery(rnd.nextInt(0, 3)));
        noteboo10.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        noteboo10.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        noteboo10.setOs(os(rnd.nextInt(0, 3)));
        noteboo10.setRum(rum(rnd.nextInt(0, 5)));
        noteboo10.setScreenType(screenType(rnd.nextInt(0, 3)));
        noteboo.add(noteboo10);

        for (Notebook item : noteboo) {
            System.out.println(item);
        }

        filter(noteboo);

    }
    public static float diagonal (int x) {
        float[] diagonal = new float[] {10.1f, 11.6f, 12.5f, 13.3f, 14.1f, 15.6f, 17.3f, 18.4f};
        return diagonal[x];
    }
    public static String screenType (int x) {
        String[] screen = new String[] {"TN", "VA", "IPS"};
        return screen[x];
    }
    public static int rum (int x) {
        int[] rum = new int[] {2, 4, 8, 16, 32};
        return rum[x];
    }
    public static int memoryCapasity (int x) {
        int[] memory = new int[] {128, 256, 512, 1024, 2048};
        return memory[x];
    }
    public static int buttery (int x) {
        int[] buttery = new int[] {2200, 2400, 2600};
        return buttery[x];
    }
    public static String os (int x) {
        String[] os = new String[] {"Linux", "Windows", "MacOs"};
        return os[x];
    }
    public static String brand (int x) {
        String[] brand = new String[] {"Lenovo", "HP", "Aser", "Dell", "Apple", "Asus"};
        return brand[x];
    }
    public static void filter (Set <Notebook> note) {
        System.out.println("Введите критерии фильтрации через пробел:\n" + 
                            "1 - диагональ экрана\n" +
                            "2 - тип матрицы дисплея\n" +
                            "3 - размер ОЗУ\n" +
                            "4 - объем ЖД\n" +
                            "5 - емкость аккумулятора\n" +
                            "6 - операционная система");
        Scanner iScanner = new Scanner(System.in);
        String parametr = iScanner.nextLine();
        String[] filter1 = parametr.split(" ");
        ArrayList <String> morePar = new ArrayList<>();
        for (int i = 0; i < filter1.length; i++) {
            if (Integer.parseInt(filter1[i]) == 1) {
                System.out.println("Введите минимальное значение диагонали экрана в дюймах целым числом (например, 10): ");
                String d = iScanner.nextLine();
                morePar.add(d);
            }
            if (Integer.parseInt(filter1[i]) == 2) {
                System.out.println("Выберите тип матрицы:\n" +
                                        "1 - TN\n" +
                                        "2 - VA\n" +
                                        "3 - IPS");
                String t = iScanner.nextLine();
                morePar.add(t);
            }
            if (Integer.parseInt(filter1[i]) == 3) {
                System.out.println("Введите минимальное значение оперативной памяти в Гб: ");
                String rum = iScanner.nextLine();
                morePar.add(rum);
            }
            if (Integer.parseInt(filter1[i]) == 4) {
                System.out.println("Введите минимальное значение объема ЖД в Гб: ");
                String m = iScanner.nextLine();
                morePar.add(m);
            }
            if (Integer.parseInt(filter1[i]) == 5) {
                System.out.println("Введите минимальное значение емкости аккумулятора в мА/час: ");
                String b = iScanner.nextLine();
                morePar.add(b);
            }
            if (Integer.parseInt(filter1[i]) == 6) {
                System.out.println("Выберите операционную систему:\n" +
                                        "1 - MacOs\n" +
                                        "2 - Linux\n" +
                                        "3 - Windows");
                String os = iScanner.nextLine();
                morePar.add(os);
            }
        } 
        TreeMap <Integer, Integer> par = new TreeMap<>();
        for (int i = 0; i < filter1.length; i++) {
            par.put(Integer.parseInt(filter1[i]), Integer.parseInt(morePar.get(i)));
        }
        System.out.println(par);

        int matrix = 0;
        if(par.get(2) != null) {
            matrix = par.get(2);
        }
        
        int opSys = 0;
        if (par.get(6) != null) {
            opSys = par.get(6);
        }

        float diagonal = 0;
        if (par.get(1) != null) {
            diagonal = (float)par.get(1);
        }

        int r = 0;
        if (par.get(3) != null) {
            r = par.get(3);
        }

        int mem = 0;
        if (par.get(4) != null) {
            mem = par.get(4);
        }

        int b = 0;
        if (par.get(5) != null) {
            b = par.get(5);
        }
        
        Set <Notebook> newNote = new HashSet<>();
        for (Notebook item : note) {
            if (item.getDiagonal() >= diagonal && (item.getScreenType() == matrix || matrix == 0)
            && item.getRum() >= r && item.getMemoryCapacity() >= mem
            && item.getButtery() >= b && (item.getOs() == opSys || opSys == 0)) {
                newNote.add(item); 
            }
        }
        for (Notebook item : newNote) {
            System.out.println(item);
        }
    }   
}
