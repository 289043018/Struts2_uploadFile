package com.hand.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class uploadFile extends ActionSupport {
	private File myFile;
	private String MyFileContentType;
	private String myFileFileName;
	private String destPath;
	@Override
	public String execute() throws Exception {
		destPath="e:/Program Files/";
		try {
			System.out.println("Src File name:"+myFile);
			System.out.println("Dst File name:"+myFileFileName);
			File destFile = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getMyFileContentType() {
		return MyFileContentType;
	}
	public void setMyFileContentType(String myFileContentType) {
		MyFileContentType = myFileContentType;
	}
	public String getMyFileFileName() {
		return myFileFileName;
	}
	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
	public String getDestPath() {
		return destPath;
	}
	public void setDestPath(String destPath) {
		this.destPath = destPath;
	}
	
	
}
