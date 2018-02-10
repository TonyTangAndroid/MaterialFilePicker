package com.nbsp.materialfilepicker.filter;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;

/**
 * Created by Tony Tang on 10.02.18.
 */
public class FolderFilter implements FileFilter, Serializable {

    @Override
    public boolean accept(File f) {
        return f.isDirectory();
    }
}
