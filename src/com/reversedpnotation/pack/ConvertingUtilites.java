package com.reversedpnotation.pack;

import java.io.BufferedReader;
import java.io.IOException;

public class ConvertingUtilites {


    public ConvertingUtilites() {
    }
    static void myMethod()
    {
        System.out.println("myMethod");
    }

    public static String[] convertFromSysIn (BufferedReader bufferedReader, int n) throws IOException {
        char[] q = new char[400];
        char[] stack = new char[400];
        char[] str = new char[400];
        char ch;
        int top, i, front;
        String[] rezult = new String[n];
        int p = 0;
        while (n-- != 0) {
            front = 0;
            top = 0;

            try {
                str = bufferedReader.readLine().toCharArray();
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (i = 0; i < str.length; i++) {
                if (str[i] != '+' && str[i] != '-' && str[i] != '*' && str[i] != '/' && str[i] != '^' && str[i] != '(' && str[i] != ')') {
                    q[front++] = str[i];
                } else {
                    if (str[i] == '+') {
                        while (top > 0) {
                            ch = stack[top - 1];
                            if (ch != '(') {
                                q[front++] = ch;
                                top--;
                            } else
                                break;
                        }
                    } else if (str[i] == '-') {
                        while (top > 0) {
                            ch = stack[top - 1];
                            if (ch != '+' && ch != '(') {
                                q[front++] = ch;
                                top--;
                            } else
                                break;
                        }
                    } else if (str[i] == '*') {
                        while (top > 0) {
                            ch = stack[top - 1];
                            if (ch != '+' && ch != '-' && ch != '(') {
                                q[front++] = ch;
                                top--;
                            } else
                                break;
                        }
                    } else if (str[i] == '/') {
                        while (top > 0) {
                            ch = stack[top - 1];
                            if (ch != '+' && ch != '-' && ch != '*' && ch != '(') {
                                q[front++] = ch;
                                top--;
                            } else
                                break;
                        }
                    } else if (str[i] == '^') {
                        while (top > 0) {
                            ch = stack[top - 1];
                            if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '(') {
                                q[front++] = ch;
                                top--;
                            } else
                                break;
                        }
                    } else if (str[i] == ')') {
                        while (stack[top - 1] != '(') {
                            ch = stack[top - 1];
                            q[front++] = ch;
                            top = top - 1;
                        }
                        top = top - 1;
                    }
                    if (str[i] != ')')
                        stack[top++] = str[i];
                }
            }
            while (top > 0) {
                q[front++] = stack[top - 1];
                top = top - 1;
            }
            q[front] = 0;


            String temp = new String();

            int k = 0;
            boolean Anend = true;
            while (Anend) {
                if (q[k] != 0) {
                    temp = temp + q[k];
                    k++;
                } else {
                    Anend = false;
                }

            }
            rezult[p] = temp;
            p++;


        }
        return rezult;

    }}
