package HomeWork_5;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

    public class AppData implements Serializable {
        private final String[] header;
        private final int[][] data;

        public AppData(String[] header, int[][] data) {
            this.header = header;
            this.data = data;
        }

        public String[] getHeader() {
            return header;
        }

        public int[][] getData() {
            return data;
        }
    }


