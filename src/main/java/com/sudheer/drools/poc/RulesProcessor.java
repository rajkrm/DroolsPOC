package com.sudheer.drools.poc;


import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.Message;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

import java.util.List;

/**
 * Created by Sudheer Babu Gutha.
 */
public class RulesProcessor {

    public void processRules(List<Phone> phones, String rulesFilePath) {

        if (phones != null && rulesFilePath != null) {
            KieServices ks = KieServices.Factory.get();
            KieRepository kr = ks.getRepository();
            KieFileSystem kfs = ks.newKieFileSystem();
            kfs.write(ResourceFactory.newClassPathResource("properties/drool/rules.drl", this.getClass()));
            KieBuilder kb = ks.newKieBuilder(kfs);
            kb.buildAll();
            if (kb.getResults().hasMessages(Message.Level.ERROR)) {
                throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
            }
            KieContainer kContainer = ks.newKieContainer(kr.getDefaultReleaseId());
            KieSession kSession = kContainer.newKieSession();
            for(Phone phone: phones) {
                kSession.insert(phone);
            }
            kSession.fireAllRules();
            for (Phone phone : phones) {
                System.out.println("Before offer phone price : " + phone.getPhoneCost());
                int phoneCost = phone.getPhoneCost();
                double afterDiscountCost = (double) phoneCost * (1 - (double) phone.getOfferPercentage() / 100);
                phone.setPhoneCost((int) afterDiscountCost);
                System.out.println("After offer phone price : " + afterDiscountCost);
            }
            kSession.dispose();
        } else {
            System.out.println("Please check input and try again ...!!!");
        }
    }
}
