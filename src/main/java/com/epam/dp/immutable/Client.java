package com.epam.dp.immutable;

import java.util.Date;

/**
 * @author Ivan_Zhuravel
 */
public final class Client {

    private final String name;
    private final Date registrationDate;
    private final String phone;
    private final String lastName;
    private final Date birthday;
    private final String отчество;
    private final String inshuranceNumber;


    private Client(Builder builder) {
        this.name = builder.name;
        this.registrationDate = builder.registrationDate;
        this.phone = builder.phone;
        this.lastName = builder.lastName;
        this.birthday = builder.birthday;
        this.отчество = builder.отчество;
        this.inshuranceNumber = builder.inshuranceNumber;
    }

    public String getName() {
        return name;
    }

    public Date getRegistrationDate() {
        return new Date(registrationDate.getTime());
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return new Date(birthday.getTime());
    }

    public String getОтчество() {
        return отчество;
    }

    public String getInshuranceNumber() {
        return inshuranceNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", registrationDate=" + registrationDate +
                ", phone='" + phone + '\'' +
                '}';
    }

     static class Builder {

         private String name;
         private Date registrationDate;
         private String phone;
         private String lastName;
         private Date birthday;
         private String отчество;
         private String inshuranceNumber;

         public Builder setName(String name) {
             this.name = name;
             return this;
         }

         public Builder setRegistrationDate(Date registrationDate) {
             this.registrationDate = registrationDate;
             return this;
         }

         public Builder setPhone(String phone) {
             this.phone = phone;
             return this;
         }

         public Builder setLastName(String lastName) {
             this.lastName = lastName;
             return this;
         }

         public Builder setBirthday(Date birthday) {
             this.birthday = birthday;
             return this;
         }

         public Builder setОтчество(String отчество) {
             this.отчество = отчество;
             return this;
         }

         public Builder setInshuranceNumber(String inshuranceNumber) {
             this.inshuranceNumber = inshuranceNumber;
             return this;
         }

         public Client build () {
             return new Client(this);
         }
     }
}
