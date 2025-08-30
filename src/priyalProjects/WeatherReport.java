package priyalProjects;

import java.util.Scanner;

public class WeatherReport {

    public int hottestday(int[][] calendars,int sizei, int sizej){
        int day = 0;
        int max = calendars[0][0];
        int temp = 1;
        for(int i=0; i<sizei; i++){
            for(int j=0; j<sizej; j++){
                if(calendars[i][j] > max){
                    max = calendars[i][j];
                    day = temp;
                }
                temp++;
            }
        }
        return day;
    }

    public int coldestDay(int[][] calendars,int sizei, int sizej){
        int day = 1;
        int min = calendars[0][0];
        int temp = 1;
        for(int i=0; i<sizei; i++){
            for(int j=0; j<sizej; j++){
                if(calendars[i][j] < min){
                    min = calendars[i][j];
                    day = temp;
                }
                temp++;
            }
        }
        return day;
    }


    public int avgtemp(int[][] calendars,int sizei, int sizej){
        int tempSum = 0;
        int totalDay = sizei*sizej;
        int avgTemp = 0;
        for(int i=0; i<sizei; i++){
            for(int j=0; j<sizej; j++){
                tempSum = tempSum + calendars[i][j];
            }
        }
        avgTemp = tempSum / totalDay;
        return avgTemp;
    }


    public static void main(String[] args){
        WeatherReport weatherReport = new WeatherReport();
        Scanner sc = new Scanner(System.in);
        int sizei = 7;
        int sizej = 4;
        int[][] calendar = new int[sizei][sizej];
        int min = 0;
        int max = 50;
        for(int i=0; i<sizei; i++){
            for(int j=0; j<sizej; j++){
                int randomA = (int)(Math.random() * (max - min + 1))+ min;
                calendar[i][j] = randomA;
            }
        }

        int day = weatherReport.hottestday(calendar,sizei,sizej);
        System.out.println("Hottest day: "+day);

        int coldday = weatherReport.coldestDay(calendar,sizei,sizej);
        System.out.println("Coldest day: "+coldday);

        int avg_temp = weatherReport.avgtemp(calendar,sizei,sizej);
        System.out.println("Average Temperature: "+avg_temp);

        sc.close();
    }
}
