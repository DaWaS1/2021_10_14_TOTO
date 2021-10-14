package com.company;
import com.sun.source.tree.WhileLoopTree;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> csapatok = new ArrayList<>();
        ArrayList<String> eredmeny = new ArrayList<>();
        ArrayList<String> tippek = new ArrayList<>();
        try {
            System.setProperty("file.encodig", "UTF-8");
            FileReader fajl = new FileReader("toto.txt");
            BufferedReader br = new BufferedReader(fajl);
            System.out.println("A fajl tartalma: " );
            String sor = null;
            while ((sor = br.readLine()) != null)
            {
                csapatok.add(sor);
                sor = br.readLine();
                eredmeny.add(sor);
            }

        }catch (IOException error){
            System.out.println("Nincs meg a fajl!" + error);
        }
        Scanner INPUT = new Scanner(System.in);
        for (int i = 0; i < csapatok.size(); i++) {
            String tipp = null;
            do {
                System.out.println((i+i) + ". " + csapatok.get(i) + ": ");
                tipp = INPUT.next();

            }while (!tipp.equals("1") && !tipp.equals("2") && !tipp.equals("x") && !tipp.equals("X") );
            tippek.add(tipp);
        }
        System.out.println("Talallatok szama: " + talalat(eredmeny, tippek));



    }

    private static Integer talalat(ArrayList<String> eredmeny, ArrayList<String> tippek) {
        int talalat = 0;
        for (int i = 0; i < eredmeny.size(); i++) {
            if (eredmeny.get(i).equals(tippek.get(i)))
                talalat++;
        }
        return  talalat;
    }
}
