package org.prog.session16;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.prog.session16.dto.ResultsDto;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RestTests {

    @Test
    public void testApiCall() {

        Response response = RestAssured
                .given()
                .baseUri("https://randomuser.me")
                .basePath("/api/")
                .queryParam("inc", "gender,name,nat")
                .get();

        ResultsDto dto = response.as(ResultsDto.class);

        System.out.println(dto.getResults().size());

        Assert.assertEquals(
                dto.getResults().get(0).getGender(),
                "female"
        );
    }
}