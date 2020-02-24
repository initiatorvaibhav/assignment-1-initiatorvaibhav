package LinkedList;

import ADT.PersonADT;

public class person implements PersonADT {


    private String firstName;
    private String lastName;
    private String emailID;
    private String ContactNo;

    public person ( String firstName, String lastName, String emailID, String contactNo ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
        ContactNo = contactNo;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getEmailID () {
        return emailID;
    }

    public String getContactNo () {
        return ContactNo;
    }

    @Override
    public String toString () {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\n' +
                ", emailID='" + emailID + '\n' +
                ", ContactNo='" + ContactNo + '\'' +
                '}';
    }

    public void print () {
        System.out.println ( firstName + " " + lastName + " " + emailID + " " + ContactNo );
    }

    @Override
    public String personFirstName ( String firstName ) {
        return getFirstName ();
    }

    @Override
    public String personLastName ( String lastName ) {
        return getLastName ();
    }

    @Override
    public String personContact ( String contactNo ) {
        return getContactNo ();
    }

    @Override
    public String emailID ( String emailID ) {
        return getEmailID ();
    }
}
