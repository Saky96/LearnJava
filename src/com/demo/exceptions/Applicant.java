package com.demo.exceptions;

import java.util.Arrays;

public class Applicant {
    String applicantName;
    String postApplied;
    int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public void setPostApplied(String postApplied) {
        this.postApplied = postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }
}

class InfyBankException extends Exception{
//    public InfyBankException(String message, Exception exception) {
//        super(message, exception);
//    }

    public InfyBankException(String message) {
        super(message);
    }
}

interface Posts{
    String[] validPosts = {"Probationary Officer", "Assistant", "Special Cadre Officer"};
}

class Validator implements Posts{


    void validate(Applicant applicant) throws InfyBankException {

        if(!isValidName(applicant.applicantName)){
            throw new InfyBankException("Invalid name!");
        }
        else if(!isValidPost(applicant.postApplied)){
            throw new InfyBankException("Invalid post!");
        }
        else if(!isValidAge(applicant.applicantAge)){
            throw new InfyBankException("Invalid age!");
        }
        else {
            System.out.println("All the values are valid.");
        }
    }



    boolean isValidName(String name){
        if(name.equals("") || name == null){
            return false;
        }
        return true;
    }

    boolean isValidPost(String post){
        if(Arrays.asList(validPosts).contains(post)){
            return true;
        }
        return false;
    }

    boolean isValidAge(int age){
        if(age >= 18 && age <= 35){
            return true;
        }
        return false;
    }
}
