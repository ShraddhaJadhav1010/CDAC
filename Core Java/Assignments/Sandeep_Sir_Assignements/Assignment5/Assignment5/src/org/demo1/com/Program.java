package org.demo1.com;

/* 2. Design and implement a class named Logger to manage logging messages for an application. The class should be implemented as a singleton to ensure that only one instance of the Logger exists throughout the application.

	The class should include the following methods:
		• getInstance(): Returns the unique instance of the Logger class.
		• log(String message): Adds a log message to the logger.
		• getLog(): Returns the current log messages as a String.
		• clearLog(): Clears all log messages. */


class Logger {
    private static Logger instance;
		
		private StringBuilder logMessages;

		private Logger() {
			logMessages = new StringBuilder();
		}

		public static synchronized Logger getInstance() {
			if (instance == null) {
				instance = new Logger();
			}
			return instance;
		}

		public void log(String message) {
			logMessages.append(message).append("\n");
		}

		public String getLog() {
			return logMessages.toString();
		}

		public void clearLog() {
			logMessages.setLength(0);
		}
}

public class Program{
	public static void main(String[] args) {
		Logger logger=Logger.getInstance();
		logger.log("Application started");
		logger.log("logged in");
		System.out.println("Logs:\n"+logger.getLog());
		logger.clearLog();
		System.err.println("After logging clear \n"+logger.getLog());
	}
}
