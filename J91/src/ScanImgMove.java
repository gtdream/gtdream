/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author greg
 */
public class ScanImgMove {

    public static void main(String[] args) {
       
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
        Date currentTime = new Date();
        String today = formatter.format(currentTime);
      
        SimpleDateFormat formatter1 = new SimpleDateFormat("_hh_mm_ss", Locale.KOREA);
        String time=formatter1.format(currentTime);
        System.out.println(time);
        
        String choi = "Y:\\";
        String myCom = "C:\\Users\\greg\\Desktop\\";

        File choiFile = new File(choi);
        File[] fileList = choiFile.listFiles();
        //System.out.println(choiFile.);
        
        
        
        long start = System.currentTimeMillis();
        
        try {
            for (File file : fileList) {
                if (file.isDirectory()) {
                    if (file.getName().startsWith("20") && file.getName().substring(0, 10).equals(today)) {

                        String ft[] = file.list();
                        System.out.println(ft);
                        FileInputStream inputStream = new FileInputStream(file.getAbsoluteFile() + "\\" + ft[0]);
                        FileOutputStream outputStream = new FileOutputStream(myCom + file.getName() +time+ ".bmp");

                        
//                        BufferedInputStream bin = new BufferedInputStream(inputStream);
//                        BufferedOutputStream bout = new BufferedOutputStream(outputStream);
//                        int bytesRead = 0;
//                        byte[] buffer = new byte[1024];
//                        while ((bytesRead = bin.read(buffer, 0, 1024)) != -1) {
//                            bout.write(buffer, 0, bytesRead);
//                        }
//
//                        bout.close();
//                        bin.close();
                        
                        
                        FileChannel fcin = inputStream.getChannel();
                        FileChannel fcout = outputStream.getChannel();
                        fcout.transferFrom(fcin, 0, fcin.size());

                        fcin.close();
                        fcout.close();
                        

                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{

        }
        
        long end = System.currentTimeMillis();
        long real = end - start;
        
        System.out.println(real+"ms");
        
    }//end main
}
