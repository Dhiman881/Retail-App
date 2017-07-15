

import java.io.BufferedReader;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhiman Sarma
 */
public class Data_Save {
    private FileWriter fw=null;
    private String directory ="";
    public void saveData( javax.swing.JTable table,int rowNo){
     
        if(directory!=null && !directory.equals("") && new File(directory).isDirectory()){
            
            try{
                fw = new FileWriter(directory+"/table.txt",true);

                for (int row = rowNo; row < table.getRowCount(); row++) {
                    for (int col = 0; col < table.getColumnCount(); col++) {

                             fw.write(table.getValueAt(row, col)+"//");


                    }
                    fw.write("\n");
                }
                fw.close();
            }catch(IOException  e){
               System.out.println("error");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Directory Not Valid","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    public int  loadData(javax.swing.JTable table){
       
        if(directory!=null || !directory.equals("") && new File(directory).isDirectory()){
            int rowNo=0;
            try {

                        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(directory+"/table.txt")));
                        String line;
                        // Uncomment the line below if you want to skip the fist line (e.g if headers)
                        // line = br.readLine();
                         DefaultTableModel model = (DefaultTableModel)table.getModel();
                        while ((line = br.readLine()) != null) {
                            //String line_table = line.toString();
                            String[] parts = line.split("//");

                             model.insertRow(model.getRowCount(),new Object[]{parts[0],parts[1],parts[2]} );
                             rowNo++;
                        }
                        br.close();

            } catch (IOException e) {
                    System.out.println("ERROR: unable to read file ");
                    
            }
            return rowNo; 
        }
        else{
            JOptionPane.showMessageDialog(null,"Directory Not Valid","Error",JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
public void saveMeta(String directory1){
     try{
            fw = new FileWriter(System.getProperty("user.home")+"/Documents/meta_data.txt");
                fw.write(directory1);
            directory=directory1;
            fw.close();
        }catch(IOException  e){
           System.out.println("error");
        }

}
public String loadMeta() throws FileNotFoundException{
     BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.home")+"/Documents/meta_data.txt")));
        try {
            directory = br.readLine();
            System.out.println(directory);
            return directory;
        } catch (IOException ex) {
            Logger.getLogger(Data_Save.class.getName()).log(Level.SEVERE, null, ex);
            directory ="";
            return "";
        }
}
   
    
}
