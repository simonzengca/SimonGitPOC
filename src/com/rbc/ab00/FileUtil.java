package com.rbc.ab00;

import com.sun.xml.ws.Closeable;
import java.rmi.RemoteException;

public class FileUtil {
    private static FileUtil me;
    
    private FileUtil() {
    }
    
    public FileUtil getInstance() {
      if (null == me) {
          synchronized(FileUtil.class) {
            if (null == me) {
               me = new FileUtil();
            }
          }
      }
      return me;
    }
    
    public int (int num1, int num2) {
       return num1 + num2;
    }
}
