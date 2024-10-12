package com.api.componentdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@SpringBootApplication

public class ComponentdbApplication {

	private static final ExecutorService threadpool
			= Executors.newFixedThreadPool(3);

	public static void main(String[] args) throws IOException {


		//Future future = threadpool.submit(checkMysqlService());
		checkMysqlService();
		SpringApplication.run(ComponentdbApplication.class, args);

   //https://javarevisited.blogspot.com/2015/01/how-to-use-future-and-futuretask-in-Java.html#axzz8oO1QAqTn


	}

	public static void checkMysqlService() throws IOException {
		String startMySql = "/home/andrei/Downloads/flashapp/database-properties/src/main/resources/sh/checkMysqlService.sh";

		String cmd = "systemctl is-active mysql";  //e.g test.sh -dparam1 -oout.txt
        //String startMySql = "systemctl start mysql";

		Process process = Runtime.getRuntime().exec(cmd);
        String output =  processOutput(process);
		System.out.println("process---x: " + output);
		if (output.contains("inactive")) {
			System.out.println("Mysql is not running");
			System.out.println("Starting mysql service");
			Process process1 = Runtime.getRuntime().exec(startMySql);
			System.out.println("process1---: " + process1.pid());
		} else {

			System.out.println("Mysql is running");
		}

	}


	public static String processOutput(Process process) throws IOException {
		StringBuilder output = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			output.append(line + "\n");
		}
		return output.toString();
	}

}
