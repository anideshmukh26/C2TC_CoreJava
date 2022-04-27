

package com.tns.day49;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsDemo
{
  public static void findFile() throws IOException			// declaring the type of exception
  {
    // code that may generate IOException
    File newFile = new File("test.txt");
    FileInputStream stream = new FileInputStream(newFile);
    stream.close();
  }
  public static void main(String[] args)
  {
    try 
    {
      findFile();
    }
    catch (IOException e)
    {
      System.out.println(e);
    }
  }
}