package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Info {
    private String Sname;
    private String auth;
    private boolean wantJS=false;
    private boolean wantCSS=false;


    public void UserInput(){
        //ask and set site name and author name
        Scanner in=new Scanner(System.in);
        System.out.print("What is your website name: ");
        Sname=in.nextLine();
        System.out.print("Who is the author: ");
        auth =in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String scan=in.nextLine();
        //ask for js and css folders check if yes or no and set boolean
        if(scan.equalsIgnoreCase("Y")){
            wantJS=true;
        }
        System.out.print("Do you want a folder for CSS? ");
        scan=in.nextLine();
        if(scan.equalsIgnoreCase("Y")){
            wantCSS=true;
        }
    }

    public void createWeb() throws IOException {
        //create file and html file
        String file="website/"+Sname;
        File register = new File(file);
        System.out.println("Created "+file);
        register.mkdirs();

        File Idx=new File(file+"/index.html");
        boolean x =Idx.createNewFile();
        if(x) {
            System.out.println("Created " + file + "/index.html");
        }


        //change author and title
        FileWriter bw = new FileWriter(Idx);
        bw.write("<head>\n" +
                " <title>"+Sname+"</title>\n" +
                " <meta name="+auth+">\n" +
                "</head>");

        //check if to add folder js and add it if true
        if(wantJS){
            file="website/"+Sname+"/js/";
            register=new File(file);
            boolean y = register.createNewFile();
            if (y) {

                System.out.println("Created " + file);
            }
        }

        //check if to add folder css and add it if true
        if(wantCSS){
            file="website/"+Sname+"/css/";
            register=new File(file);
            boolean z = register.createNewFile();
            if (z) {
                System.out.println("Created " + file);
            }
        }
    }
}