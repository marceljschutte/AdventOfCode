package nl.schutte.adventofcode.commons;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOUtil {

    public static List<String> readFileAsListOfStrings(int jaar, int dag) throws IOException {

        String filePath = "./resources/"+jaar+"/inputDag"+dag+".txt";
        try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
            return stream.collect(Collectors.toList());
        }
    }

    /*
    INPUT Methods
     */
    public static List<BigDecimal> readFileAsListOfBigDecimals(int jaar, int dag) throws IOException {
        String filePath = "./resources/"+jaar+"/inputDag"+dag+".txt";
        try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
            return stream.map(BigDecimal::new).collect(Collectors.toList());
        }
    }

    public static String readFileAsString(int jaar, int dagnummer) throws IOException {
        String filePath = "./resources/"+jaar+"/inputDag"+dagnummer+".txt";
        try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
            return stream.collect(Collectors.toList()).get(0);
        }
    }
    /*
     * OUTPUT Methods
     */


    public static void printAnswer(int dag, int puzzle, int result){
        System.out.println("The answer to puzzle " + puzzle + " of day " + dag + " is: " + result );
    }

    public static void printAnswer(int dag, int puzzle, long result){
        System.out.println("The answer to puzzle " + puzzle + " of day " + dag + " is: " + result );
    }

    public static void printAnswer(int dag, int puzzle, String result) {
        System.out.println("The answer to puzzle " + puzzle + " of day " + dag + " is: " + result );
    }

    public static void printStringArray(String[] input) {
        System.out.println(Arrays.toString(input));
    }

    public static void printIntArray(int[] input) {
        System.out.println(Arrays.toString(input));
    }

    public static void print2DIntArray(int[][] input) {
        for (int x = 0; x < input.length;x++){
            System.out.println(Arrays.toString(input[x]));
        }
    }

    public static void printBigDecimalArray(BigDecimal[] input) {
        System.out.println(Arrays.toString(input));
    }

    public static void print2DBooleanArray(boolean[][] input) {
        for (int x = 0; x < input.length;x++){
            System.out.println(Arrays.toString(input[x]));
        }
    }

    public static void printList(List<Object> list) {
        for (Object obj: list
             ) {
            System.out.println(obj);
        }
    }
}
