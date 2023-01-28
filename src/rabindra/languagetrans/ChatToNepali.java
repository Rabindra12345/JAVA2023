package rabindra.languagetrans;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.Tensor;

public class ChatToNepali {
    public static void main(String[] args) throws Exception {
        // Load the pre-trained TensorFlow model
        byte[] graphDef = Files.readAllBytes(Paths.get("path/to/model.pb"));
        Graph graph = new Graph();
        graph.importGraphDef(graphDef);

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence in Nepali chatting language: ");
        String sentence = scanner.nextLine();

        // Create a TensorFlow session
        try (Session session = new Session(graph)) {
            // Run the model on the input sentence
            Tensor input = Tensor.create(sentence.getBytes());
            Tensor output = session.runner().feed("input", input).fetch("output").run().get(0);

            // Convert the output Tensor to a string
            byte[] result = new byte[(int) output.shape()[0]];
            output.writeTo(result);
            String formalSentence = new String(result);

            // Print the result
            System.out.println("The formal Nepali version of the sentence is: " + formalSentence);
        }
    }

    private static byte[] readAllBytesOrExit(Path path) {
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            System.err.println("Failed to read [" + path + "]: " + e.getMessage());
            System.exit(1);
        }
        return null;
    }
}
