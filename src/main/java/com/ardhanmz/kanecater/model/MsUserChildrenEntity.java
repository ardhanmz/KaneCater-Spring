package com.ardhanmz.kanecater.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "ms_user_children", schema = "kanecater", catalog = "")
public class MsUserChildrenEntity {
    private int uuidMsUserChildren;
    private Timestamp dtmCrt;
    private String usrCrt;
    private Timestamp dtmUpd;
    private String usrUpd;
    private String childrenName;
    private Timestamp childrenBirthdate;
    private String childrenSex;
    private String childrenWeight;
    private String childrenHeight;
    private String childrenSchool;
    private String childrenClass;
    private byte[] childrenImage;
    private String birthDate;
    private String classSchool;
    private String height;
    private byte[] image;
    private String school;
    private String sex;
    private String weight;

    @Id
    @Column(name = "UUID_MS_USER_CHILDREN")
    public int getUuidMsUserChildren() {
        return uuidMsUserChildren;
    }

    public void setUuidMsUserChildren(int uuidMsUserChildren) {
        this.uuidMsUserChildren = uuidMsUserChildren;
    }

    @Basic
    @Column(name = "DTM_CRT")
    public Timestamp getDtmCrt() {
        return dtmCrt;
    }

    public void setDtmCrt(Timestamp dtmCrt) {
        this.dtmCrt = dtmCrt;
    }

    @Basic
    @Column(name = "USR_CRT")
    public String getUsrCrt() {
        return usrCrt;
    }

    public void setUsrCrt(String usrCrt) {
        this.usrCrt = usrCrt;
    }

    @Basic
    @Column(name = "DTM_UPD")
    public Timestamp getDtmUpd() {
        return dtmUpd;
    }

    public void setDtmUpd(Timestamp dtmUpd) {
        this.dtmUpd = dtmUpd;
    }

    @Basic
    @Column(name = "USR_UPD")
    public String getUsrUpd() {
        return usrUpd;
    }

    public void setUsrUpd(String usrUpd) {
        this.usrUpd = usrUpd;
    }

    @Basic
    @Column(name = "CHILDREN_NAME")
    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    @Basic
    @Column(name = "CHILDREN_BIRTHDATE")
    public Timestamp getChildrenBirthdate() {
        return childrenBirthdate;
    }

    public void setChildrenBirthdate(Timestamp childrenBirthdate) {
        this.childrenBirthdate = childrenBirthdate;
    }

    @Basic
    @Column(name = "CHILDREN_SEX")
    public String getChildrenSex() {
        return childrenSex;
    }

    public void setChildrenSex(String childrenSex) {
        this.childrenSex = childrenSex;
    }

    @Basic
    @Column(name = "CHILDREN_WEIGHT")
    public String getChildrenWeight() {
        return childrenWeight;
    }

    public void setChildrenWeight(String childrenWeight) {
        this.childrenWeight = childrenWeight;
    }

    @Basic
    @Column(name = "CHILDREN_HEIGHT")
    public String getChildrenHeight() {
        return childrenHeight;
    }

    public void setChildrenHeight(String childrenHeight) {
        this.childrenHeight = childrenHeight;
    }

    @Basic
    @Column(name = "CHILDREN_SCHOOL")
    public String getChildrenSchool() {
        return childrenSchool;
    }

    public void setChildrenSchool(String childrenSchool) {
        this.childrenSchool = childrenSchool;
    }

    @Basic
    @Column(name = "CHILDREN_CLASS")
    public String getChildrenClass() {
        return childrenClass;
    }

    public void setChildrenClass(String childrenClass) {
        this.childrenClass = childrenClass;
    }

    @Basic
    @Column(name = "CHILDREN_IMAGE")
    public byte[] getChildrenImage() {
        return childrenImage;
    }

    public void setChildrenImage(byte[] childrenImage) {
        this.childrenImage = childrenImage;
    }

    @Basic
    @Column(name = "birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "class_school")
    public String getClassSchool() {
        return classSchool;
    }

    public void setClassSchool(String classSchool) {
        this.classSchool = classSchool;
    }

    @Basic
    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MsUserChildrenEntity that = (MsUserChildrenEntity) o;
        return uuidMsUserChildren == that.uuidMsUserChildren && Objects.equals(dtmCrt, that.dtmCrt) && Objects.equals(usrCrt, that.usrCrt) && Objects.equals(dtmUpd, that.dtmUpd) && Objects.equals(usrUpd, that.usrUpd) && Objects.equals(childrenName, that.childrenName) && Objects.equals(childrenBirthdate, that.childrenBirthdate) && Objects.equals(childrenSex, that.childrenSex) && Objects.equals(childrenWeight, that.childrenWeight) && Objects.equals(childrenHeight, that.childrenHeight) && Objects.equals(childrenSchool, that.childrenSchool) && Objects.equals(childrenClass, that.childrenClass) && Arrays.equals(childrenImage, that.childrenImage) && Objects.equals(birthDate, that.birthDate) && Objects.equals(classSchool, that.classSchool) && Objects.equals(height, that.height) && Arrays.equals(image, that.image) && Objects.equals(school, that.school) && Objects.equals(sex, that.sex) && Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(uuidMsUserChildren, dtmCrt, usrCrt, dtmUpd, usrUpd, childrenName, childrenBirthdate, childrenSex, childrenWeight, childrenHeight, childrenSchool, childrenClass, birthDate, classSchool, height, school, sex, weight);
        result = 31 * result + Arrays.hashCode(childrenImage);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
