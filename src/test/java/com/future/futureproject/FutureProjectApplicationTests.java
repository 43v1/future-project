package com.future.futureproject;

import com.future.futureproject.enums.Season;
import com.future.futureproject.domain.model.SeasonModel;
import com.future.futureproject.domain.model.TireModel;
import com.future.futureproject.service.TireService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FutureProjectApplicationTests {

    @Autowired
    private TireService tireService;

    @Test
    void changeSeasonTest() {
        TireModel tireModel = tireService.selectById(1);

        SeasonModel summer = SeasonModel.builder().id(Season.SUMMER).build();
        tireModel.setSeason(summer);

        TireModel save = tireService.save(tireModel);

        System.out.println(1);
    }

}
