package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.hibernate.engine.transaction.jta.platform.internal.JRun4JtaPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;
    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("Olmec", "Mexico");
        estateRepository.save(estate1);

        Estate estate2 = new Estate("Maya", "Panama");
        estateRepository.save(estate2);

        Chocolate chocolate1 = new Chocolate("Literally just cocoa powder", 100, estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Dairy Milk", 20, estate1);
        chocolateRepository.save(chocolate2);

        Chocolate chocolate3 = new Chocolate("Easter egg chocolate", 2, estate2);
        chocolateRepository.save(chocolate3);

        Chocolate chocolate4 = new Chocolate("Dank chocolate", 70, estate2);
        chocolateRepository.save(chocolate4);
    }
}
