package com.spring.autowire.byconstructor;

/*
 * Dummy implementation of logger.
 */

public class Logger {

	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}