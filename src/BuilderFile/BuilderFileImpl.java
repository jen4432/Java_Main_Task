package BuilderFile;

public class BuilderFileImpl extends File implements BuilderFile {

    private File file = new File();
    @Override
    public BuilderFile setFileName(String name) {
        file.name = name;
        return this;
    }

    @Override
    public File build() {
        return file;
    }
}
