public class Family {
    private static final int MAX_FAMILY_SIZE = 10;
    private int numFamilyMembers;
    private Person[] familyInfo;
    private int age;


    public Family() {
        numFamilyMembers = 0;
        familyInfo = new Person[MAX_FAMILY_SIZE];
    }

    public int getNumberOfPeople() {
        return numFamilyMembers;
    }

    public boolean addPerson(String name, int age) {
        if (numFamilyMembers > MAX_FAMILY_SIZE) {
            System.out.println("Error");
            return false;
        } else {
            numFamilyMembers += 1;
            Person NewPerson = new Person(name, age);
            familyInfo[numFamilyMembers] = NewPerson;
            return true;
        }
    }

    public void birthday(String name) {
        for (int person = 0; person < numFamilyMembers; person++){
            if (familyInfo[person].getName().equals(name)){
                familyInfo[person].incrementAge();
            }
        }
    }

    public void display() {
        for (int FamilyMembersLeft = 0; FamilyMembersLeft < numFamilyMembers; FamilyMembersLeft++) {
            System.out.println(familyInfo[FamilyMembersLeft] + " ");
        }
    }

    public int getTotalAge() {
        int sum = 0;
        for (int numberOfPeopleLeft = 0; numberOfPeopleLeft < numFamilyMembers; numberOfPeopleLeft++) {
            sum = sum + familyInfo[numberOfPeopleLeft].getAge();
        }
        return sum;
    }


}

