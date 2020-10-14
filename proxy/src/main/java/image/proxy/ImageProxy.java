package image.proxy;

import image.DiskImage;
import image.Image;

public class ImageProxy implements Image {

    private String fileName;
    private DiskImage image;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            this.image = new DiskImage(fileName);
        }
        this.image.display();
    }
}
