package Day5;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String mobileNumber;
    
    public Contact(String firstName, String middleName, String lastName, LocalDate dateOfBirth, String gender, String mobileNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public boolean isValid() {
        return firstName != null && !firstName.trim().isEmpty() &&
               lastName != null && !lastName.trim().isEmpty() &&
               gender != null && (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) &&
               mobileNumber != null && Pattern.matches("\\d{10}", mobileNumber);
    }
    @Override
    public String toString() {
        return String.format("Contact{FirstName='%s', MiddleName='%s', LastName='%s', DOB=%s, Gender='%s', Mobile='%s'}",
                firstName, middleName, lastName, dateOfBirth, gender, mobileNumber);
    }
}