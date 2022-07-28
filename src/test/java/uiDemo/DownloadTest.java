package uiDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import webPageObjects.pages.aboutUs.DownloadsPage;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DownloadTest extends BaseUITest {
    @Test
    @Tag("ui")
    void billerRequirementsDownloadTest() {
        DownloadsPage downloadsPage = new DownloadsPage();

        downloadsPage.openPage();
        File file = null;
        try {
            file = downloadsPage.billerRequirements().shouldBe(visible).download();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertNotNull(file);
    }
}
