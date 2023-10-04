package com.nguyenanhthu.ptm.upload_files.exceptions;

public class StorageFileNotFoundException extends RuntimeException{
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}