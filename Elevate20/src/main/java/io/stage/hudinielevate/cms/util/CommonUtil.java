package io.stage.hudinielevate.cms.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

public class CommonUtil {

	public static void shortWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mediumWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void longWait() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void deleteFiles() throws IOException
	{

		String screenshotfolderPath = System.getProperty("user.dir")+"\\screenshots";
		String reportsfolderPath = System.getProperty("user.dir") + "\\extentreports";

		File file1 = new File(screenshotfolderPath);
		File file2 = new File(reportsfolderPath);

		FileUtils.cleanDirectory(file1);
		FileUtils.cleanDirectory(file2);
	}

	public static String decryptPassword(String encryptedpassword)
	{

		byte[] decodedString = Base64.decodeBase64(encryptedpassword);
		//System.out.println("Decoded password is:"+new String(decodedString));

		return (new String(decodedString));
	}
}