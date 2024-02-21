package com.fna.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="userrolemodule")
public class AssignRole{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private int rolemappingid;
		private int userid;
		private int roleid;
		private int moduleid;
		@Transient
		private List<Integer> modulelist;
		public int getRolemappingid() {
			return rolemappingid;
		}
		public void setRolemappingid(int rolemappingid) {
			this.rolemappingid = rolemappingid;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public int getRoleid() {
			return roleid;
		}
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
		public int getModuleid() {
			return moduleid;
		}
		public void setModuleid(int moduleid) {
			this.moduleid = moduleid;
		}
		public List<Integer> getModulelist() {
			return modulelist;
		}
		public void setModulelist(List<Integer> modulelist) {
			this.modulelist = modulelist;
		}
		@Override
		public String toString() {
			return "AssignRole [rolemappingid=" + rolemappingid + ", userid=" + userid + ", roleid=" + roleid
					+ ", moduleid=" + moduleid + ", modulelist=" + modulelist + "]";
		}
	
		
    }