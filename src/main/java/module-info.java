module base{
    requires MathParser.org.mXparser;
    requires json.simple;
    requires java.xml;
    exports BuilderFileReader;
    exports BuilderFileWriter;
    exports Cipher;
    exports Archiver;
    exports Interfaces;
    exports Parsers;
    exports Readers;
    exports Writers;
}