package com.sudheer.drools.poc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sudheer Babu Gutha.
 */
public class Test {

    public static void main(String args[]) {
        Phone iPhone6S = new Phone(1, "IPhone 6S", "iPhone6S", 600);
        Phone samsung = new Phone(2, "SamSung Galaxy 7", "SamSung", 550);
        List<Phone> phones = new ArrayList<Phone>();
        phones.add(iPhone6S);
        phones.add(samsung);
        RulesProcessor rulesProcessor = new RulesProcessor();
        rulesProcessor.processRules(phones, "properties/drool/rules.drl");
    }
}
