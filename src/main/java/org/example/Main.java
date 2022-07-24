package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @autor : ${USER_NAME} {@literal ${EMAIL}}
 * @created : ${DATE}, ${TIME}
 */
public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("ping ");
    Process process = Runtime.getRuntime().exec("ping www.stackabuse.com");
    printResults(process);
    System.out.println("ping end");
  }

  public static void printResults(Process process) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), "windows-1252"));
    String line = "";
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
  }
}
