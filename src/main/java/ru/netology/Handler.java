package ru.netology;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;

public interface Handler {
    void handle(BufferedReader request, BufferedOutputStream response);
}
