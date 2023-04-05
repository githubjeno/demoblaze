package com.helper;

import java.io.IOException;

public class File_Reader {

	public static Configuration_Reader getinstance() throws IOException {
		Configuration_Reader cr= new Configuration_Reader();
		return cr;
	}
}
