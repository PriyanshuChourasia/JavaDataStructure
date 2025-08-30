package priyalProjects;
class ClassRecord{
    int rollNo;
    int subjectA;
    int subjectB;
    int subjectC;
    int avg_mark;


    public void insertRecord(int roll, int subA, int subB, int subC){
        this.rollNo = roll;
        this.subjectA = subA;
        this.subjectB = subB;
        this.subjectC = subC;
        this.avg_mark = (subA+subB+subC) / 3;
    }

    public void displayRecord(){
        System.out.println("Roll no: "+this.rollNo);
        System.out.println("Marks A: "+this.subjectA);
        System.out.println("Marks B: "+this.subjectB);
        System.out.println("Marks C: "+this.subjectC);
        this.avg_marks();
    }

    public void avg_marks(){
        int mark = (this.subjectA + this.subjectB + this.subjectC) / 3;
        avg_mark= mark;
        System.out.println("Average marks: "+mark);
    }
}
public class School {
    public static void main(String[] args){
        ClassRecord[] classRecord = new ClassRecord[50];
        int min = 15;
        int max = 100;
        for (int i=0; i<50; i++){
            int randomA = (int)(Math.random() * (max - min + 1))+ min;
            int randomB = (int)(Math.random() * (max - min + 1))+ min;
            int randomC = (int)(Math.random() * (max - min + 1))+ min;
            classRecord[i] = new ClassRecord();
            classRecord[i].insertRecord(i+1,randomA,randomB,randomC);
        }

        for (int j=0; j<50; j++){
            classRecord[j].displayRecord();
        }

        for (int j=0; j<50; j++){
            if(classRecord[j].avg_mark < 40){
                classRecord[j].displayRecord();
            }
        }

        for (int j=0; j<50; j++){
            if(classRecord[j].avg_mark > 80){
                classRecord[j].displayRecord();
            }
        }
    }
}
