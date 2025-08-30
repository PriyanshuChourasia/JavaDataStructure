package priyalProjects;

import java.util.ArrayList;

class SchoolClassRecord{
    int id;
    int subjectA;
    int subjectB;
    int subjectC;
    int avg_mark;

    public SchoolClassRecord(int id,int subA, int subB, int subC){
        this.id=id;
        this.subjectA = subA;
        this.subjectB = subB;
        this.subjectC = subC;
        this.avg_mark = (subA+subB+subC) / 3;
    }
    public void displayRecord(){
        System.out.println("Roll no:  "+this.id);
        System.out.println("Marks A:  "+this.subjectA);
        System.out.println("Marks B:  "+this.subjectB);
        System.out.println("Marks C:  "+this.subjectC);
        System.out.println("Avg Mark: "+this.avg_mark);
    }

}

public class SchoolArrayList {
    public static void main(String[] args){
        ArrayList<SchoolClassRecord> schoolClassRecords = new ArrayList<SchoolClassRecord>();
        int min = 15;
        int max = 100;
        for(int i=0; i<50; i++){
            int randomA = (int)(Math.random() * (max - min + 1))+ min;
            int randomB = (int)(Math.random() * (max - min + 1))+ min;
            int randomC = (int)(Math.random() * (max - min + 1))+ min;
            SchoolClassRecord schoolClassRecord = new SchoolClassRecord(i+1,randomA,randomB,randomC);
            schoolClassRecords.add(schoolClassRecord);
        }

        for (int j=0; j<schoolClassRecords.size(); j++){
            schoolClassRecords.get(j).displayRecord();
            System.out.println("------------------------------------------------------");
        }

        System.out.println("Record below 40");

        for (int j=0; j<schoolClassRecords.size(); j++){
            if (schoolClassRecords.get(j).avg_mark < 40){
                schoolClassRecords.get(j).displayRecord();
                System.out.println("------------------------------------------------------");
            }

        }

        System.out.println("Record Above 80");

        for(int k=0; k<schoolClassRecords.size(); k++){
            if(schoolClassRecords.get(k).avg_mark > 80){
                schoolClassRecords.get(k).displayRecord();
                System.out.println("-------------------------------------------------------");
            }
        }

    }
}
