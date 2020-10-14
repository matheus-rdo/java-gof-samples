package image;

public class DiskImage implements Image {

    private String fileName;


    // Objeto "caro" de se criar
    public DiskImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
