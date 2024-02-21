package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "fileuploads")
public class FileUploads {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int fileuploadid;
	  @Column(name = "filemoduletype")
	  private Integer filemoduletype;
	  @Column(name = "filegeneratedname")
	  private String filegeneratedname;
	  @Column(name = "filedisplayname")
	  private String filedisplayname;
	  @Column(name = "fileuploadedtime",updatable = false)
	  @CreationTimestamp
	  private Date fileuploadedtime;	  
	  @Column(name = "moduleid")
	  private Integer moduleid;	  
	  @Column(name = "url")
	  private String url;
	public int getFileuploadid() {
		return fileuploadid;
	}
	public void setFileuploadid(int fileuploadid) {
		this.fileuploadid = fileuploadid;
	}
	public Integer getFilemoduletype() {
		return filemoduletype;
	}
	public void setFilemoduletype(Integer filemoduletype) {
		this.filemoduletype = filemoduletype;
	}
	public String getFilegeneratedname() {
		return filegeneratedname;
	}
	public void setFilegeneratedname(String filegeneratedname) {
		this.filegeneratedname = filegeneratedname;
	}
	public String getfiledisplayname() {
		return filedisplayname;
	}
	public void setfiledisplayname(String filedisplayname) {
		this.filedisplayname = filedisplayname;
	}
	public Date getFileuploadedtime() {
		return fileuploadedtime;
	}
	public void setFileuploadedtime(Date fileuploadedtime) {
		this.fileuploadedtime = fileuploadedtime;
	}
	public Integer getModuleid() {
		return moduleid;
	}
	public void setModuleid(Integer moduleid) {
		this.moduleid = moduleid;
	}
	public FileUploads(String filedisplayname, String url ) {
		super();
		this.filedisplayname = filedisplayname;
		this.url=url;

	}
	public FileUploads(int fileuploadid, Integer filemoduletype, String filegeneratedname, String filedisplayname,
			Date fileuploadedtime, Integer moduleid) {
		super();
		this.fileuploadid = fileuploadid;
		this.filemoduletype = filemoduletype;
		this.filegeneratedname = filegeneratedname;
		this.filedisplayname = filedisplayname;
		this.fileuploadedtime = fileuploadedtime;
		this.moduleid = moduleid;
	}
	  
	public FileUploads() {
		super();

	}
	@Override
	public String toString() {
		return "FileUploads [fileuploadid=" + fileuploadid + ", filemoduletype=" + filemoduletype
				+ ", filegeneratedname=" + filegeneratedname + ", filedisplayname=" + filedisplayname
				+ ", fileuploadedtime=" + fileuploadedtime + ", moduleid=" + moduleid + "]";
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	  
	  
	  
}
