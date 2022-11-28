package nl.schutte.adventofcode.aoc2022;

import nl.schutte.adventofcode.commons.IOUtil;

import java.io.IOException;
import java.util.List;

public class Dag202201 {


    private static List<String> input;
    private static final int dagnummer = 1;
    private static final int jaarnummer = 2022;

    public static void main(String[] args) throws IOException {
        input = IOUtil.readFileAsListOfStrings(jaarnummer, dagnummer);
        solvePuzzle1();
        solvePuzzle2();
    }

    private static void solvePuzzle1() {
        long result = 0;
        /*
                Uitwerking moet hier
         */
        IOUtil.printAnswer(dagnummer, 1, result);
    }

    private static void solvePuzzle2() {
        long result = 0;
        /*
                Uitwerking moet hier
         */
        IOUtil.printAnswer(dagnummer, 2, result);
    }

}
