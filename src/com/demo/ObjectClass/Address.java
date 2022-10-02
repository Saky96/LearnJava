package com.demo.ObjectClass;

//public class Address {
//
//    private String doorNo;
//    private String street;
//
//    public Address(String doorNo, String street) {
//        this.doorNo = doorNo;
//        this.street = street;
//    }
//
//    public String getDoorNo() {
//        return doorNo;
//    }
//
//    public void setDoorNo(String doorNo) {
//        this.doorNo = doorNo;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    //Uncomment the code given below
//    @Override
//    public String toString() {
//		return "Address\nDoor No: "+doorNo+"\nStreet: "+street;
//	}
//}
//
//class Tester {
//
//    public static void main(String[] args) {
//        Address addressOne = new Address("11","Oxford Street");
//
//        System.out.println();
//        System.out.println("Address details of addressOne");
//        System.out.println(addressOne);
//
//    }
//}

//public class Address {
//
//    private String doorNo;
//    private String street;
//
//    public Address(String doorNo, String street) {
//        this.doorNo = doorNo;
//        this.street = street;
//    }
//
//    public String getDoorNo() {
//        return doorNo;
//    }
//
//    public void setDoorNo(String doorNo) {
//        this.doorNo = doorNo;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//}
//
//class Tester {
//
//    public static void main(String[] args) {
//        Address addressOne = new Address("11","Oxford Street");
//        Address addressTwo=new Address("11","Oxford Street");
//
//        //The equality of two objects are being checked using == operator
//        if (addressOne == addressTwo) {
//            System.out.println("The address objects are same!");
//        } else {
//            System.out.println("The address objects are different!");
//        }
//    }
//}

class Address {

    private String doorNo;
    private String street;

    public Address(String doorNo, String street) {
        this.doorNo = doorNo;
        this.street = street;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    @Override
    public boolean equals(Object address) {
        Address otherAddress=(Address) address;
        if(this.doorNo.equals(otherAddress.doorNo) && this.street.equals(otherAddress.street))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return 1+doorNo.hashCode()+street.hashCode();
    }

}

class Tester {

    public static void main(String[] args) {
        Address addressOne = new Address("11","Oxford Street");
        Address addressTwo=new Address("11","Oxford Street");

        //The equality of two objects are being checked using equals() method
//        if (addressOne.equals(addressTwo)) {
//            System.out.println("The address objects are same!");
//        } else {
//            System.out.println("The address objects are different!");
//        }


//		    Compare the following input with the addressOne and see the result
        Address addressThree=new Address("11","Hillview Street");
        if (addressOne.equals(addressThree)) {
            System.out.println("The address objects are same!");
        } else {
            System.out.println("The address objects are different!");
        }


    }
}

