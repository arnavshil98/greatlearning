package com.gl.week2_test;

abstract class GovOffice {

    private String officeName;

    GovOffice(String officeName) {

        this.officeName = officeName;

    }

    public String getofficeName() {

        return officeName;

    }

}

 

class Office extends GovOffice {

  Office() {

    super("Post Office");

  }

  public static void main(String[] args) {

    Office obj = new Office();

    System.out.println(obj.getofficeName());

  }

}