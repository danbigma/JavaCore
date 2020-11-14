package com.java.utils;

import java.util.HashMap;
import java.util.Map;

public class MimeTypes {
	
	private static Map<String, String> MIMETYPE_MAPPING = new HashMap<>();
	
	public static void main(String[] args) {
		// Extension MIME Type
		MIMETYPE_MAPPING.put(".doc", "application/msword");
		MIMETYPE_MAPPING.put(".dot", "application/msword");
		MIMETYPE_MAPPING.put(".docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		MIMETYPE_MAPPING.put(".dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template");
		MIMETYPE_MAPPING.put(".docm", "application/vnd.ms-word.document.macroEnabled.12");
		MIMETYPE_MAPPING.put(".dotm", "application/vnd.ms-word.template.macroEnabled.12");
		MIMETYPE_MAPPING.put(".xls", "application/vnd.ms-excel");
		MIMETYPE_MAPPING.put(".xlt", "application/vnd.ms-excel");
		MIMETYPE_MAPPING.put(".xla", "application/vnd.ms-excel");
		MIMETYPE_MAPPING.put(".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		MIMETYPE_MAPPING.put(".xltx", "application/vnd.openxmlformats-officedocument.spreadsheetml.template");
		MIMETYPE_MAPPING.put(".xls", "application/vnd.ms-excel.sheet.macroEnabled.12");
		MIMETYPE_MAPPING.put(".xltm", "application/vnd.ms-excel.template.macroEnabled.12");
		MIMETYPE_MAPPING.put(".xlam", "application/vnd.ms-excel.addin.macroEnabled.12");
		MIMETYPE_MAPPING.put(".xlsb", "application/vnd.ms-excel.sheet.binary.macroEnabled.12");
		MIMETYPE_MAPPING.put(".ppt", "application/vnd.ms-powerpoint");
		MIMETYPE_MAPPING.put(".pot", "application/vnd.ms-powerpoint");
		MIMETYPE_MAPPING.put(".pps", "application/vnd.ms-powerpoint");
		MIMETYPE_MAPPING.put(".ppa", "application/vnd.ms-powerpoint");
		MIMETYPE_MAPPING.put(".pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
		MIMETYPE_MAPPING.put(".potx", "application/vnd.openxmlformats-officedocument.presentationml.template");
		MIMETYPE_MAPPING.put(".ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow");
		MIMETYPE_MAPPING.put(".ppam", "application/vnd.ms-powerpoint.addin.macroEnabled.12");
		MIMETYPE_MAPPING.put(".pptm", "application/vnd.ms-powerpoint.presentation.macroEnabled.12");
		MIMETYPE_MAPPING.put(".potm", "application/vnd.ms-powerpoint.template.macroEnabled.12");
		MIMETYPE_MAPPING.put(".ppsm", "application/vnd.ms-powerpoint.slideshow.macroEnabled.12");
		MIMETYPE_MAPPING.put(".mdb", "application/vnd.ms-access");
		
		System.out.println(MIMETYPE_MAPPING);
	}

}
