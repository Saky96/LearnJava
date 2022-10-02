package com.demo.assignments.infyUniversity;

import java.util.stream.IntStream;

@FunctionalInterface
interface MarksRequired{
    int MIN_MARKS = 65;
    int MAX_MARKS = 100;

    boolean validateMarks();
}


interface courseValidate{
    int[] COURSE_IDS = {1001, 1002, 1003, 1004, 1005};
    int[] COURSE_FEE = {55000, 35675, 28300, 22350, 115000};

    default int mapCourseIdToFee(int courseId){
        if(courseId == COURSE_IDS[0]){
            return COURSE_FEE[0];
        } else if (courseId == COURSE_IDS[1]) {
            return COURSE_FEE[1];
        }  else if (courseId == COURSE_IDS[2]) {
            return COURSE_FEE[2];
        }  else if (courseId == COURSE_IDS[3]) {
            return COURSE_FEE[3];
        }  else if (courseId == COURSE_IDS[4]) {
            return COURSE_FEE[4];
        }
        else {
            return 0;
        }
    }

    int DISCOUNT_SLAB_1 = 5;
    int DISCOUNT_SLAB_2 = 10;
    int DISCOUNT_SLAB_3 = 15;

    boolean validateCourseId();

    void calculateCourseFee();
}

public class CourseRegistration implements MarksRequired, courseValidate {
    private String studentName;
    private int registrationId;
    private float qualifyingMarks;
    private double courseFee;
    private int courseId;
    private boolean hostelRequired;

    public CourseRegistration(String studentName, int registrationId, float qualifyingMarks, int courseId, boolean hostelRequired) {
        this.studentName = studentName;
        this.registrationId = registrationId;
        this.qualifyingMarks = qualifyingMarks;
        this.courseId = courseId;
        this.hostelRequired = hostelRequired;

//        switch (courseId) {
//            case COURSE_IDS[0] -> this.courseFee = COURSE_FEE[0];
//            case COURSE_IDS[1] -> this.courseFee = COURSE_FEE[1];
//            case COURSE_IDS[2] -> this.courseFee = COURSE_FEE[2];
//            case COURSE_IDS[3] -> this.courseFee = COURSE_FEE[3];
//            case COURSE_IDS[4] -> this.courseFee = COURSE_FEE[4];
//            default -> {
//            }
//        }

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public float getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(float qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public boolean isHostelRequired() {
        return hostelRequired;
    }

    public void setHostelRequired(boolean hostelRequired) {
        this.hostelRequired = hostelRequired;
    }

    @Override
    public boolean validateMarks(){
        return this.qualifyingMarks >= MIN_MARKS && this.qualifyingMarks <= MAX_MARKS;
    }

    @Override
    public boolean validateCourseId(){
        return IntStream.of(COURSE_IDS).anyMatch(x -> x == this.courseId);
    }

    @Override
    public void calculateCourseFee(){
        int fee = mapCourseIdToFee(this.courseId);
        if(this.qualifyingMarks >= MIN_MARKS && this.qualifyingMarks <= 69){
            double discount =  DISCOUNT_SLAB_1 * (double) fee / 100;
            this.courseFee = fee - discount;
        } else if (this.qualifyingMarks >= 70 && this.qualifyingMarks <= 84) {
            double discount =  DISCOUNT_SLAB_2 * (double) fee / 100;
            this.courseFee = fee - discount;
        }
        else if (this.qualifyingMarks >= 85&& this.qualifyingMarks <= MAX_MARKS) {
            double discount =  DISCOUNT_SLAB_3 * (double) fee / 100;
            this.courseFee = fee - discount;
        }
        else {
            this.courseFee = 0;
        }
    }

}

class RegistrationTester{
    public static void main(String[] args) {
        CourseRegistration cr = new CourseRegistration("Peter", 5001, 68, 1005, true);
        if(!cr.validateMarks()){
            System.out.println("Marks is less than 65. You are not eligible for admission!");
        }
        else if(!cr.validateCourseId()){
            System.out.println("Invalid course Id. Please try again!");
        }
        else{
            cr.calculateCourseFee();
            System.out.println("************************************Course Allocation Details******************************************");
            System.out.println("Student Name:   "+cr.getStudentName());
            System.out.println("Course id:   "+cr.getCourseId());
            System.out.println("Qualifying Exam Marks:   "+cr.getQualifyingMarks());
            System.out.println("Student's registration id:   "+cr.getRegistrationId());
            System.out.println("Total course fee:   "+cr.getCourseFee());
            System.out.println("Hostel Required:   "+cr.isHostelRequired());
        }
    }
}
