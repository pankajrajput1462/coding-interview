package filesio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceDataTest {

    @Test
    void replace() {
        ReplaceData replaceData = new ReplaceData();

        String basePath = "C:\\Users\\pankajkumar.s\\IdeaProjects\\coding-interview\\src\\main\\java\\filesio\\";
        String filePath = basePath + "source.json";
        String targetPath = basePath + "target.json";
        replaceData.replace(filePath, targetPath, "center", "center-md");
    }


    @Test
    void replaceByLine() {
        ReplaceData replaceData = new ReplaceData();

        String basePath = "C:\\Users\\pankajkumar.s\\IdeaProjects\\coding-interview\\src\\main\\java\\filesio\\";
        String filePath = basePath + "source.json";
        String targetPath = basePath + "target.json";
        replaceData.replaceByLine(filePath, targetPath, "center", "center-md");
    }
}