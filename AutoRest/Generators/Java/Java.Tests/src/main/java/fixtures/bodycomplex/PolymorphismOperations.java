/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.Fish;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in PolymorphismOperations.
 */
public interface PolymorphismOperations {
    /**
     * The interface defining all the services for PolymorphismOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolymorphismService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("complex/polymorphism/valid")
        Call<ResponseBody> getValid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/polymorphism/valid")
        Call<ResponseBody> putValid(@Body Fish complexBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("complex/polymorphism/missingrequired/invalid")
        Call<ResponseBody> putValidMissingRequired(@Body Fish complexBody);

    }
    /**
     * Get complex types that are polymorphic.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Fish object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Fish> getValid() throws ErrorException, IOException;

    /**
     * Get complex types that are polymorphic.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getValidAsync(final ServiceCallback<Fish> serviceCallback);

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
 {
         'fishtype':'Salmon',
         'location':'alaska',
         'iswild':true,
         'species':'king',
         'length':1.0,
         'siblings':[
           {
             'fishtype':'Shark',
             'age':6,
             'birthday': '2012-01-05T01:00:00Z',
             'length':20.0,
             'species':'predator',
           },
           {
             'fishtype':'Sawshark',
             'age':105,
             'birthday': '1900-01-05T01:00:00Z',
             'length':10.0,
             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
             'species':'dangerous',
           },
           {
             'fishtype': 'goblin',
             'age': 1,
             'birthday': '2015-08-08T00:00:00Z',
             'length': 30.0,
             'species': 'scary',
             'jawsize': 5
           }
         ]
       };
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putValid(Fish complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types that are polymorphic.
     *
     * @param complexBody Please put a salmon that looks like this:
 {
         'fishtype':'Salmon',
         'location':'alaska',
         'iswild':true,
         'species':'king',
         'length':1.0,
         'siblings':[
           {
             'fishtype':'Shark',
             'age':6,
             'birthday': '2012-01-05T01:00:00Z',
             'length':20.0,
             'species':'predator',
           },
           {
             'fishtype':'Sawshark',
             'age':105,
             'birthday': '1900-01-05T01:00:00Z',
             'length':10.0,
             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
             'species':'dangerous',
           },
           {
             'fishtype': 'goblin',
             'age': 1,
             'birthday': '2015-08-08T00:00:00Z',
             'length': 30.0,
             'species': 'scary',
             'jawsize': 5
           }
         ]
       };
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
 {
     "fishtype": "sawshark",
     "species": "snaggle toothed",
     "length": 18.5,
     "age": 2,
     "birthday": "2013-06-01T01:00:00Z",
     "location": "alaska",
     "picture": base64(FF FF FF FF FE),
     "siblings": [
         {
             "fishtype": "shark",
             "species": "predator",
             "birthday": "2012-01-05T01:00:00Z",
             "length": 20,
             "age": 6
         },
         {
             "fishtype": "sawshark",
             "species": "dangerous",
             "picture": base64(FF FF FF FF FE),
             "length": 10,
             "age": 105
         }
     ]
 }
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putValidMissingRequired(Fish complexBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client.
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
 {
     "fishtype": "sawshark",
     "species": "snaggle toothed",
     "length": 18.5,
     "age": 2,
     "birthday": "2013-06-01T01:00:00Z",
     "location": "alaska",
     "picture": base64(FF FF FF FF FE),
     "siblings": [
         {
             "fishtype": "shark",
             "species": "predator",
             "birthday": "2012-01-05T01:00:00Z",
             "length": 20,
             "age": 6
         },
         {
             "fishtype": "sawshark",
             "species": "dangerous",
             "picture": base64(FF FF FF FF FE),
             "length": 10,
             "age": 105
         }
     ]
 }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidMissingRequiredAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback);

}
