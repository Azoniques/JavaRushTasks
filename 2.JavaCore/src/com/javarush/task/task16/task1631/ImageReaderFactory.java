package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory(){

    }
    public static ImageReader getImageReader(ImageTypes type) {
        if(type == null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        ImageReader toReturn;
        switch (type){
            case JPG:
                toReturn = new JpgReader();
                break;
            case BMP:
                toReturn = new BmpReader();
                break;
            case PNG:
                toReturn = new PngReader();
                break;
            default: throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return toReturn;
    }


}
