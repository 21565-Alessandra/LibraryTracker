// STUDENT NAME: ALESSANDRA SILVA DOS REIS // STUDENT ID: 21565

package com.reis;

//Class to create the atributes for the library members
public class Member {

    //atributes
    private int memberId;
    public String memberName;

    //constructor
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    //method
    public void memberDetails() {
        System.out.println("Member ID: " + this.memberId);
        System.out.println("Member Name: " + this.memberName);
    }

}
