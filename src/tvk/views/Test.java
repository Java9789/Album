package tvk.views;

import java.io.File;

public class Test {
 
    public static void main(String... args){
        File folder = new File("F:/Java/Album/src/tvk/images");
        if(folder.exists()){
            File[] files = folder.listFiles();
            for(File f : files){
                System.out.println(f.getName());
            }
        } else {
            System.err.println("._.");
        }
    }
    
}