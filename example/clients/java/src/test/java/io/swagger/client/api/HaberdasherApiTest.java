/*
 * service.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ExampleHat;
import io.swagger.client.model.ExampleSize;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HaberdasherApi
 */
@Ignore
public class HaberdasherApiTest {

    private final HaberdasherApi api = new HaberdasherApi();

    
    /**
     * MakeHat produces a hat of mysterious, randomly-selected color!
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void makeHatTest() throws ApiException {
        ExampleSize body = null;
        ExampleHat response = api.makeHat(body);

        // TODO: test validations
    }
    
}
