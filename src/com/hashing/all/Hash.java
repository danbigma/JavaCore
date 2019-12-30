package com.hashing.all;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;

import org.apache.commons.io.IOUtils;

public enum Hash {
	MD5("MD5"), SHA1("SHA1"), SHA256("SHA-256"), SHA512("SHA-512");

	private String name;

	Hash(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String checksum(ByteArrayInputStream input) {

		try {

			MessageDigest md = MessageDigest.getInstance(getName());

			byte[] dataBytes = new byte[1024];

			int nread = 0;
			while ((nread = input.read(dataBytes)) != -1) {
				md.update(dataBytes, 0, nread);
			}
			byte[] mdbytes = md.digest();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mdbytes.length; i++) {
				sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
			}

			return sb.toString();

		} catch (Exception e) {
			System.out.println("Error calculado el Hash " + e.getMessage().toString());
			e.getStackTrace();
		}
		return null;

	}

	public static void main(String args[]) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("PATHtoFILE"));
			System.out.println(Hash.MD5.checksum(new ByteArrayInputStream(IOUtils.toByteArray(fis))));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error" + e.getMessage());
			e.getStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error" + e.getMessage());
			e.getStackTrace();
		}

	}
}
