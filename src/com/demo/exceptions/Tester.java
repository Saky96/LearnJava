package com.demo.exceptions;

public class Tester {
    public static void main(String[] args) throws InfyBankException {
        Applicant a1 = new Applicant("", "Assistantqsfa", 37);

        Validator validator = new Validator();

        try {
            validator.validate(a1);
        }
        catch (InfyBankException e){
//            throw new InfyBankException(e.getMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Execution over!");
        }


    }
}
