package HomeWork_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson5 {

    public static void writeFile(AppData appData){
        try(PrintWriter out = new PrintWriter("file.csv")){
            for (String v: appData.getHeader()){
                out.print(v + ";");
            }
            out.println();

            int[][] valListData = appData.getData();
            for (int i = 0;i< valListData.length; i++){
                for ( int j =0; j < valListData[i].length; j++){
                    out.print(valListData[i][j] + ";");
                }
                out.write("\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("file.csv"));
        List<int[]> data = new ArrayList<>();
        String[] dataHead = in.readLine().split(";");
        String line = null;
        while ((line= in.readLine()) != null){
            List <Integer> list = new ArrayList<>();
            String [] string = line.split(";");
            for (String s : string) {
                list.add(Integer.parseInt(s));
            }
            data.add(list.stream().mapToInt(i -> i).toArray());
        }
        AppData appData = new AppData(dataHead, data.toArray(new int[0][]));
        int[][] array = appData.getData();
    }

    public static void main(String[] args) throws IOException {
        String[] header = {"Value1", "Value2", "Value3"};
        int [][] data = {{100, 400, 600}, { 400,240,358}};
        AppData appData = new AppData(header, data);
        writeFile(appData);
        readFile();
    }
}

