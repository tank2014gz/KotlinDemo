package com.dr.function01;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

import java.io.File;


public class FuctionExDemoJ {

    public static void main(String... args) {
        File file = new File("KotlinDemo01.iml");
        String content = FilesKt.readText(file, Charsets.UTF_8);
        String c = FileExKt.read(file, Charsets.UTF_8);
        System.out.println(content);

        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        }.start();

        new Thread(()->{

        }).start();
    }
}
