package com.spring.autowire.byname;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * Dummy implementation of logger.
 */

public class Logger {
    
	@Autowired
	private ConsoleWriter consoleWriter;
	@Autowired
	private FileWriter fileWriter;

	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}
