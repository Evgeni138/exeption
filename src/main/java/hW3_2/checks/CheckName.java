package hW3_2.checks;

import hW3_2.exceptions.NameException;

import java.util.Map;

public class CheckName {
    public Map<String, Object> checkInputName(StringBuilder sb, Map<String, Object> dicData) {
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dicData.put("lastName", fullName[0]);
            dicData.put("firstName", fullName[1]);
            dicData.put("patronymic", fullName[2]);

            return dicData;
        } else {
            throw new NameException();
        }
    }
}
