package com.gmail.shared.entity;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import java.util.Date;

//@Entity
public class Passport extends Identifier {
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String firstName;
    private String familyName;
    private String patronymic;
    private int series;
    private int number;
    private int departmentCode;
    private Date dateIssue;
    private String placeIssue;
    private int personalCode;
    private Sex sex;
    private String placeBirth;
    private Date DateBirth;


    public enum Sex{
        Man, Woman
    }

    public Passport() {}

    public Passport(String firstName, String familyName, String patronymic, int series, int number,
                    int departmentCode, Date dateIssue, String placeIssue, int personalCode,
                    Sex sex, String placeBirth, Date dateBirth) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.patronymic = patronymic;
        this.series = series;
        this.number = number;
        this.departmentCode = departmentCode;
        this.dateIssue = dateIssue;
        this.placeIssue = placeIssue;
        this.personalCode = personalCode;
        this.sex = sex;
        this.placeBirth = placeBirth;
        DateBirth = dateBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public String getPlaceIssue() {
        return placeIssue;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public Sex getSex() {
        return sex;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public Date getDateBirth() {
        return DateBirth;
    }
}


