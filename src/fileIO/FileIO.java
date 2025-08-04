package fileIO;


import java.io.*;
import java.util.Scanner;

public class FileIO {

    private boolean filecreated;
    private String filePath;

    private BufferedWriter bufferedWriter;

    public BufferedWriter getBufferedWriter(){
        return this.bufferedWriter;
    }

    public void setBufferedWriter(BufferedWriter writer){
        this.bufferedWriter = writer;
    }

    public boolean getFileCreated(){
        return this.filecreated;
    }

    public void setFilecreated(boolean create){
        this.filecreated = create;
    }

    public String getFilePath(){
        return this.filePath;
    }

    public void setFilePath(String name){
        this.filePath = name;
    }

    void createDatabase(String tableName){
        try{
            String userDir = System.getProperty("user.dir");
            String newDirName = userDir +  File.separator + "src" + File.separator +"fileIO"+ File.separator + "db" + File.separator + tableName.toLowerCase()+".txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newDirName));
            bufferedWriter.write("write into a file.");
            bufferedWriter.write("\n This is new File.");
            bufferedWriter.write("\n This not new");
            bufferedWriter.close();
            this.setFilecreated(true);
            this.setFilePath(newDirName);
            System.out.println("Your database has been created");
        }catch (IOException e){
            this.setFilecreated(false);
            e.printStackTrace();
        }
    }

    void writeNameInDB(String name, BufferedWriter writer){
        try{
            writer.write(name);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    void readFile(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(this.getFilePath()));
            String line;
            int cnt = 0;
            while((line = reader.readLine()) != null){
                System.out.println(line);
                cnt++;
            }
            System.out.println(cnt+" :count");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        FileIO fileIO = new FileIO();
        Scanner sc = new Scanner(System.in);
        if(!fileIO.getFileCreated()){
            System.out.println("Enter table name: ");
            String tableName = sc.nextLine();
            fileIO.createDatabase(tableName);
            fileIO.readFile();

        }

//        int end = 0;
//
//        do {
//
//
//            System.out.println("Enter name to save into db: ");
//            String name = sc.nextLine();
//
//            fileIO.writeNameInDB(name,fileIO.getBufferedWriter());
//
//            System.out.println("Do you want to save again: ");
//            System.out.println("0: stop");
//            System.out.println("1: continue");
//            end = sc.nextInt();
//            sc.nextLine();
//
//        }while (end > 0);





        sc.close();
    }
}
