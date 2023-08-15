package bitmap.transformer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

class AppTest {

    @Test
    public void testConvertImageToGray() {
        String inputFilePath = "src/main/resources/imageBmp.bmp";
        String outputFilePath = "src/main/resources/imageBmpGray.bmp";

        App.testFunction(new String[]{inputFilePath, outputFilePath, "convertImageToGray"});

        String result = App.checkIfCreated(outputFilePath);

        assertEquals("Done .. New image saved to " + outputFilePath, result);
    }

    @Test
    public void testMirrorImageVertically() {
        String inputFilePath = "src/main/resources/imageBmp.bmp";
        String outputFilePath = "src/main/resources/imageBmpVertMirror.bmp";

        App.testFunction(new String[]{inputFilePath, outputFilePath, "mirrorImageVertically"});

        String result = App.checkIfCreated(outputFilePath);

        assertEquals("Done .. New image saved to " + outputFilePath, result);
    }

    @Test
    public void testMirrorImageHorizontally() {
        String inputFilePath = "src/main/resources/imageBmp.bmp";
        String outputFilePath = "src/main/resources/imageBmpHorizMirror.bmp";

        App.testFunction(new String[]{inputFilePath, outputFilePath, "mirrorImageHorizontally"});

        String result = App.checkIfCreated(outputFilePath);

        assertEquals("Done .. New image saved to " + outputFilePath, result);
    }

    @Test
    public void testCheckIfCreatedSuccess() throws IOException {
        String existingFilePath = "src/test/resources/existingImage.bmp";

        // Create an empty file to simulate a successfully created image
        File outputFile = new File(existingFilePath);
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        String result = App.checkIfCreated(existingFilePath);

        assertEquals("Done .. New image saved to " + existingFilePath, result);
    }

    @Test
    public void testCheckIfCreatedFailure() {
        String nonExistingFilePath = "src/test/resources/nonExistingImage.bmp";

        String result = App.checkIfCreated(nonExistingFilePath);

        assertEquals("Error: New image was not created.", result);
    }

}


