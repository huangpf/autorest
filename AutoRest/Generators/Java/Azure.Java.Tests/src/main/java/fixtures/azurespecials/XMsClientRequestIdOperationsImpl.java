/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in XMsClientRequestIdOperations.
 */
public final class XMsClientRequestIdOperationsImpl implements XMsClientRequestIdOperations {
    /** The Retrofit service to perform REST calls. */
    private XMsClientRequestIdService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClient client;

    /**
     * Initializes an instance of XMsClientRequestIdOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public XMsClientRequestIdOperationsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(XMsClientRequestIdService.class);
        this.client = client;
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> get() throws CloudException, IOException {
        Call<ResponseBody> call = service.get(this.client.getAcceptLanguage());
        return getDelegate(call.execute());
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getAsync(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.get(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return new AzureServiceResponseBuilder<Void, CloudException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> paramGet(String xMsClientRequestId) throws ErrorException, IOException, IllegalArgumentException {
        if (xMsClientRequestId == null) {
            throw new IllegalArgumentException("Parameter xMsClientRequestId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.paramGet(xMsClientRequestId, this.client.getAcceptLanguage());
        return paramGetDelegate(call.execute());
    }

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> paramGetAsync(String xMsClientRequestId, final ServiceCallback<Void> serviceCallback) {
        if (xMsClientRequestId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter xMsClientRequestId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.paramGet(xMsClientRequestId, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(paramGetDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> paramGetDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
