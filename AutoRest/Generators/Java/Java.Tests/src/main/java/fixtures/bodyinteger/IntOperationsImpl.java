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

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in IntOperations.
 */
public final class IntOperationsImpl implements IntOperations {
    /** The Retrofit service to perform REST calls. */
    private IntService service;
    /** The service client containing this operation class. */
    private AutoRestIntegerTestService client;

    /**
     * Initializes an instance of IntOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntOperationsImpl(Retrofit retrofit, AutoRestIntegerTestService client) {
        this.service = retrofit.create(IntService.class);
        this.client = client;
    }

    /**
     * Get null Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>()
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute());
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInvalidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>()
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getOverflowInt32() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowInt32();
        return getOverflowInt32Delegate(call.execute());
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowInt32();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOverflowInt32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getOverflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>()
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Integer object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getUnderflowInt32() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt32();
        return getUnderflowInt32Delegate(call.execute());
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowInt32();
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUnderflowInt32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Integer> getUnderflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>()
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Long object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Long> getOverflowInt64() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowInt64();
        return getOverflowInt64Delegate(call.execute());
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        Call<ResponseBody> call = service.getOverflowInt64();
        call.enqueue(new ServiceResponseCallback<Long>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOverflowInt64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Long> getOverflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>()
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Long object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Long> getUnderflowInt64() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt64();
        return getUnderflowInt64Delegate(call.execute());
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) {
        Call<ResponseBody> call = service.getUnderflowInt64();
        call.enqueue(new ServiceResponseCallback<Long>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUnderflowInt64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Long> getUnderflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>()
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMax32(int intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMax32(intBody);
        return putMax32Delegate(call.execute());
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMax32(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMax32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMax32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMax64(long intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMax64(intBody);
        return putMax64Delegate(call.execute());
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMax64(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMax64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMax64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMin32(int intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMin32(intBody);
        return putMin32Delegate(call.execute());
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMin32(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMin32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMin32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMin64(long intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMin64(intBody);
        return putMin64Delegate(call.execute());
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putMin64(intBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMin64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putMin64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
