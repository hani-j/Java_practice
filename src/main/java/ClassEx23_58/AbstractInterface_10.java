package ClassEx23_58;

interface PersonalNumberStorage2 {
    public abstract void addPersonalInfo(String name, String perNum);
    public abstract String searchName(String perNum);
}

class PersonalNumInfo2 {
    String name;
    String number;

    PersonalNumInfo2(String name, String number) {
        this.name = name;
        this.number = number;
    }

    String getName() {
        return name;
    }

    String getNumber() {
        return number;
    }
}

class PersonalNumberStorageImpl2 implements PersonalNumberStorage2 {
    PersonalNumInfo2[] perArr;
    int numOfperInfo;

    public PersonalNumberStorageImpl2(int sz) {
        perArr = new PersonalNumInfo2[sz];
        numOfperInfo = 0;
    }

    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfperInfo] = new PersonalNumInfo2(name, perNum);
        numOfperInfo++;
    }

    public String searchName(String perNum) {
        for (int i = 0; i < numOfperInfo; i++) {
            if (perNum.compareTo(perArr[i].getNumber()) == 0) // 일치할 때 반환 값 0
                return perArr[i].getName();
        }
        return null;
    }
}

public class AbstractInterface_10 {
    public static void main(String[] args) {
        PersonalNumberStorageImpl2 storage = new PersonalNumberStorageImpl2(100);
        storage.addPersonalInfo("홍길동", "950000-1122333");
        storage.addPersonalInfo("홍길무", "970000-1122334");

        System.out.println(storage.searchName("950000-1122333"));
        System.out.println(storage.searchName("970000-1122334"));
    }
}
