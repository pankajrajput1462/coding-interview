package util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class DSUtilTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getFilePathFromResource() {
        final String filePathFromResource = DSUtil.getFilePathFromResource("data1.csv");
        log.info("{}", filePathFromResource);
        Assertions.assertNotNull(filePathFromResource);
    }

    @Test
    void getFileNameFromResource() {
        final String fileNameFromResource = DSUtil.getFileNameFromResource("data1.csv");
        log.info("{}", fileNameFromResource);
        Assertions.assertNotNull(fileNameFromResource);

    }
}