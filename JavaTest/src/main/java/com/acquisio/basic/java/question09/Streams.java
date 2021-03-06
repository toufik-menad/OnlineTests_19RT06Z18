package com.acquisio.basic.java.question09;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;

/**
 * QUESTION 09: Streams (https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
 * Using JDK8 Streams, add the code to transform the input file to apply those rules.
 * 1- Filter out lines where the amount is lower than 50$
 * 2- Add a Taxes column right after the Amount column, which is 15% of the Amount.
 * 3- Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
 * 4- Remove the ShoppingCartTitle columns.
 * <p>
 * The input file contains those columns
 * User,Amount,ShoppingCartTitle,NbItems
 * <p>
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class Streams {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Streams instance = new Streams();
        File input = new File(Thread.currentThread().getContextClassLoader().getResource("./carts.csv").toURI());
        File output = new File("./carts_output.csv");
        output.delete();

        instance.convertCarts(input, output);

        if (output.exists()) {
            Files.lines(output.toPath()).forEachOrdered(line -> System.out.println(line));
        }
    }

    private void convertCarts(File input, File output) throws IOException {
        // TODO: Insert your code here.
    }

}
