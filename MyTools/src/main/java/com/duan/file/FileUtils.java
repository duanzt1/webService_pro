package com.duan.file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 */
public abstract class FileUtils {

    /**
     * 创建文件夹
     *
     * @param folderPath 要创建文件夹的路径
     * @return true 成功 ; false 失败
     */
    public boolean createFolder(String folderPath) {
        File myFolderPath = new File(folderPath);
        try {
            if (!myFolderPath.exists()) {
                myFolderPath.mkdir();
                return true;
            }
        } catch (Exception e) {
            System.out.println("新建目录操作出错");
            e.printStackTrace();
        }
        return false;
    }

    /**
     * @param filePath 创建文件的路径
     * @return true 成功 ; false 失败
     */
    public boolean createFile(String filePath) {
        File myFilePath = new File(filePath);
        try {
            if (!myFilePath.exists()) myFilePath.createNewFile();
            FileWriter resultFile = new FileWriter(myFilePath);
            PrintWriter myFile = new PrintWriter(resultFile);
            myFile.println(filePath);
            resultFile.close();
            return true;
        } catch (Exception e) {
            System.out.println("新建文件操作出错");
            e.printStackTrace();
        }
        return false;
    }

    /**
     * @param folderPath 要删除文件夹的路径
     * @return true 成功 ; false 失败
     */
    public boolean deleteFolder(String folderPath) {
        File delFolderPath = new File(folderPath);
        try {
            delFolderPath.delete(); //删除空文件夹
            return true;
        } catch (Exception e) {
            System.out.println("删除文件夹操作出错");
            e.printStackTrace();
        }
        return false;
    }

    /**
     * @param filePath 要删除文件夹的路径
     * @return true 成功 ; false 失败
     */
    public boolean deleteFile(String filePath) {
        File myDelFile = new File(filePath);
        try {
            myDelFile.delete();
            return true;
        } catch (Exception e) {
            System.out.println("删除文件操作出错");
            e.printStackTrace();
        }
        return false;
    }

    /**
     * @param folderPath 删除该文件夹下的所有文件夹
     * @return true 成功 ; false 失败
     */
    public boolean delFolderUnderTheFolder(String folderPath) {
        return false;
    }
}
