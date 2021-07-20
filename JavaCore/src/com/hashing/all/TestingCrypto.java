package com.hashing.all;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestingCrypto {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		final MessageDigest md5 = MessageDigest.getInstance("MD5");
		final MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
		final MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

		final byte[] data = "Compute Cryptographic Hashes".getBytes();

		System.out.println("MD5    hash: " + DatatypeConverter.printHexBinary(md5.digest(data)));
		System.out.println("SHA1   hash: " + DatatypeConverter.printHexBinary(sha1.digest(data)));
		System.out.println("SHA256 hash: " + DatatypeConverter.printHexBinary(sha256.digest(data)));

	}

}
