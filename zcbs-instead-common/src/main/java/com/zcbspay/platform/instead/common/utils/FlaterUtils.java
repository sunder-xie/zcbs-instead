package com.zcbspay.platform.instead.common.utils;

import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class FlaterUtils {

	/*public static String inflater(String input) {
		Inflater decompresser = new Inflater();
		String outputString = null;
		try {
			decompresser.setInput(Base64Utils.decode(input));
			byte[] result = new byte[10000];
			int resultLength = decompresser.inflate(result);
			decompresser.end();
			outputString = new String(result, 0, resultLength, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputString;
	}

	public static String deflater(String inputString) {
		System.out.println("input size:" + inputString.getBytes().length);
		byte[] input = null;
		String data = null;
		try {
			input = inputString.getBytes("UTF-8");
			// Compress the bytes
			byte[] output = new byte[10000];
			Deflater compresser = new Deflater();
			compresser.setInput(input);
			compresser.finish();
			int compressedDataLength = compresser.deflate(output);
			byte[] convert = new byte[compressedDataLength];
			DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(output));
			inputStream.read(convert);
			data = Base64Utils.encode(convert);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}*/

	public static void main(String[] args) throws Exception {
		// Encode a String into bytes
		String inputString = "我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人我是一个大好人大好人";
		System.out.println(inflater(deflater(inputString)));
		
	}

	public static String deflater(String inputString) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		Deflater compressor = new Deflater(5);
		String data=null;
		try {
			byte input[]=inputString.getBytes("UTF-8");
			compressor.setInput(input);
			compressor.finish();
			final byte[] buf = new byte[2048];
			while (!compressor.finished()) {
				int count = compressor.deflate(buf);
				bos.write(buf, 0, count);
			}
			data = Base64Utils.encode(bos.toByteArray());
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			compressor.end();
		}
		return data;
	}

	public static String inflater(String inputString) throws DataFormatException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		Inflater decompressor = new Inflater();
		String outputString=null;
		try {
			byte[] input=Base64Utils.decode(inputString);
			decompressor.setInput(input);
			final byte[] buf = new byte[2048];
			while (!decompressor.finished()) {
				int count = decompressor.inflate(buf);
				bos.write(buf, 0, count);
			}
			byte[] result=bos.toByteArray();
			return outputString = new String(result, 0, result.length, "UTF-8");
		}catch (Exception e) {
			// TODO: handle exception
		}  finally {
			decompressor.end();
		}
		return outputString;
	}
}
