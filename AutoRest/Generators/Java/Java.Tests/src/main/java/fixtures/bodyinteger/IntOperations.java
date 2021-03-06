/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in IntOperations.
 */
public interface IntOperations {
    /**
     * The interface defining all the services for IntOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/invalid")
        Call<ResponseBody> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint32")
        Call<ResponseBody> getOverflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint32")
        Call<ResponseBody> getUnderflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint64")
        Call<ResponseBody> getOverflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint64")
        Call<ResponseBody> getUnderflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/32")
        Call<ResponseBody> putMax32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/64")
        Call<ResponseBody> putMax64(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/32")
        Call<ResponseBody> putMin32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/64")
        Call<ResponseBody> putMin64(@Body long intBody);

    }
    /**
     * Get null Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getNull() throws ErrorException, IOException;

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getInvalid() throws ErrorException, IOException;

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getOverflowInt32() throws ErrorException, IOException;

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Integer> getUnderflowInt32() throws ErrorException, IOException;

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback);

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Long object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Long> getOverflowInt64() throws ErrorException, IOException;

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback);

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Long object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Long> getUnderflowInt64() throws ErrorException, IOException;

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback);

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMax32(int intBody) throws ErrorException, IOException;

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMax64(long intBody) throws ErrorException, IOException;

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMin32(int intBody) throws ErrorException, IOException;

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMin64(long intBody) throws ErrorException, IOException;

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback);

}
