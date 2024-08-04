/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class OpenPdf {
    public static void OpenById(String Id){
        try{
            if(new File(InventoryUtils.BillPath+Id+".pdf").exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler " + InventoryUtils.BillPath + "" + Id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File dosen't Exist");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
