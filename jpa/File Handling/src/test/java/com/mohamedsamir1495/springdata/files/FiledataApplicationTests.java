package com.mohamedsamir1495.springdata.files;

import com.mohamedsamir1495.springdata.files.entities.Image;
import com.mohamedsamir1495.springdata.files.repos.ImageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootTest
public class FiledataApplicationTests {

	@Autowired
	ImageRepository repository;

	@Test
	public void testImageSave() throws IOException {
		Image image = new Image();
		image.setId(1);
		image.setName("Puss_In_Boots.JPG");

		File file = new File("src/test/resources/Save_Puss_In_Boots.png");
		byte fileContent[] = new byte[(int) file.length()];
		FileInputStream inputStream = new FileInputStream(file);
		inputStream.read(fileContent);

		image.setData(fileContent);
		repository.save(image);
		inputStream.close();

	}

	@Test
	public void testReadImage() {
		Image image = repository.findById(1L).get();
		File file = new File("src/test/resources/"+image.getName());

		try(FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(image.getData());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
