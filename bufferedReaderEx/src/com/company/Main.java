package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        StringBuilder stringBuilders = new StringBuilder();

        for(int i=0;i<N;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(),",");

            while(stringTokenizer.hasMoreTokens()) {
                stringBuilders.append(stringTokenizer.nextToken());
                stringBuilders.append(' ');
            }
            stringBuilders.append('\n');
        }
        System.out.println(stringBuilders.toString());
    }
}
