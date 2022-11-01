package hW3_2;

import hW3_2.checks.CheckBirthDate;
import hW3_2.checks.CheckName;
import hW3_2.checks.CheckSex;
import hW3_2.exceptions.BirthDateException;
import hW3_2.exceptions.SexException;
import hW3_2.exceptions.TelephoneException;

import java.util.HashMap;
import java.util.Map;

public class ParsData {

    public Map<String, Object> parsInputData() {
        boolean flag = true;
        Map<String, Object> dicData = new HashMap<>();
        while (flag) {
            InputData input = new InputData();
            CheckSex checkInputSex = new CheckSex();
            CheckName checkName = new CheckName();
            CheckBirthDate checkBirthDate = new CheckBirthDate();
            StringBuilder sb = new StringBuilder();
            String[] data = input.enterData();
            for (String i : data) {
                if (i.length() == 1) {
                    if (!checkInputSex.checkSex(i)) {
                        throw new SexException();
                    }
                    dicData.put("sex", i);
                } else if (i.matches("[0-9]+")) {
                    dicData.put("tel", i);
                } else if (i.matches("[A-Za-z]+")) {
                    sb.append(i + " ");
                } else if (i.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                    if (checkBirthDate.checkDate(i)) {
                        throw new BirthDateException();
                    } else {
                        dicData.put("BirthDate", i);
                    }
                }
            }
            checkName.checkInputName(sb, dicData);
            if (dicData.size() == 6) {
                flag = false;
            }
            if (!dicData.containsKey("tel")) {
                throw new TelephoneException();
            }
            if (!dicData.containsKey("sex")) {
                throw new SexException();
            }
            if (!dicData.containsKey("BirthDate")) {
                throw new BirthDateException();
            }
        }

        return dicData;
    }
}
