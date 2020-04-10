package util;

import java.net.URL;
import java.util.Objects;

public class DSUtil {
    public static String getFilePathFromResource(String fileName) {
        final URL resource = DSUtil.class.getClassLoader().getResource(fileName);
        if (Objects.nonNull(resource)) {
            return resource.getPath();
        }
        return "Path Not found";
    }

    public static String getFileNameFromResource(String fileName) {
        final URL resource = DSUtil.class.getClassLoader().getResource(fileName);
        if (Objects.nonNull(resource)) {
            return resource.getFile();
        }
        return "File Not found";
    }
}
