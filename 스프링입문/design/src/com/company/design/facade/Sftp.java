package com.company.design.facade;

public class Sftp {
    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public Sftp(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    public Sftp(String host, int port,String path, String fileName) {
        this.ftp = new Ftp(host,port,fileName);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void Connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect(){
        writer.fileDisconnect();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read(){
        reader.fileRead();
    }

    public void write(){
        writer.fileWrite();
    }
}
