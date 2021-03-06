/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
*/

import { ServiceClientOptions, RequestOptions, ServiceCallback } from 'ms-rest';
import * as moment from 'moment';
import * as models from '../models';


/**
 * @class
 * BasicOperations
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface BasicOperations {

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getValid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Basic>): void;
    getValid(callback: ServiceCallback<models.Basic>): void;

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}
     *
     * @param {object} complexBody Please put {id: 2, name: 'abc', color:
     * 'Magenta'}
     * 
     * @param {number} [complexBody.id]
     * 
     * @param {string} [complexBody.name]
     * 
     * @param {string} [complexBody.color] Possible values include: 'cyan',
     * 'Magenta', 'YELLOW', 'blacK'
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValid(complexBody: models.Basic, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValid(complexBody: models.Basic, callback: ServiceCallback<void>): void;

    /**
     * Get a basic complex type that is invalid for the local strong type
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getInvalid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Basic>): void;
    getInvalid(callback: ServiceCallback<models.Basic>): void;

    /**
     * Get a basic complex type that is empty
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getEmpty(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Basic>): void;
    getEmpty(callback: ServiceCallback<models.Basic>): void;

    /**
     * Get a basic complex type whose properties are null
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getNull(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Basic>): void;
    getNull(callback: ServiceCallback<models.Basic>): void;

    /**
     * Get a basic complex type while the server doesn't provide a response payload
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getNotProvided(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Basic>): void;
    getNotProvided(callback: ServiceCallback<models.Basic>): void;
}

/**
 * @class
 * Primitive
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface Primitive {

    /**
     * Get complex types with integer properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getInt(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.IntWrapper>): void;
    getInt(callback: ServiceCallback<models.IntWrapper>): void;

    /**
     * Put complex types with integer properties
     *
     * @param {object} complexBody Please put -1 and 2
     * 
     * @param {number} [complexBody.field1]
     * 
     * @param {number} [complexBody.field2]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putInt(complexBody: models.IntWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putInt(complexBody: models.IntWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with long properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getLong(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.LongWrapper>): void;
    getLong(callback: ServiceCallback<models.LongWrapper>): void;

    /**
     * Put complex types with long properties
     *
     * @param {object} complexBody Please put 1099511627775 and -999511627788
     * 
     * @param {number} [complexBody.field1]
     * 
     * @param {number} [complexBody.field2]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putLong(complexBody: models.LongWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putLong(complexBody: models.LongWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with float properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getFloat(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.FloatWrapper>): void;
    getFloat(callback: ServiceCallback<models.FloatWrapper>): void;

    /**
     * Put complex types with float properties
     *
     * @param {object} complexBody Please put 1.05 and -0.003
     * 
     * @param {number} [complexBody.field1]
     * 
     * @param {number} [complexBody.field2]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putFloat(complexBody: models.FloatWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putFloat(complexBody: models.FloatWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with double properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getDouble(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DoubleWrapper>): void;
    getDouble(callback: ServiceCallback<models.DoubleWrapper>): void;

    /**
     * Put complex types with double properties
     *
     * @param {object} complexBody Please put 3e-100 and
     * -0.000000000000000000000000000000000000000000000000000000005
     * 
     * @param {number} [complexBody.field1]
     * 
     * @param {number}
     * [complexBody.field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putDouble(complexBody: models.DoubleWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putDouble(complexBody: models.DoubleWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with bool properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getBool(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.BooleanWrapper>): void;
    getBool(callback: ServiceCallback<models.BooleanWrapper>): void;

    /**
     * Put complex types with bool properties
     *
     * @param {object} complexBody Please put true and false
     * 
     * @param {boolean} [complexBody.fieldTrue]
     * 
     * @param {boolean} [complexBody.fieldFalse]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putBool(complexBody: models.BooleanWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putBool(complexBody: models.BooleanWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with string properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getString(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.StringWrapper>): void;
    getString(callback: ServiceCallback<models.StringWrapper>): void;

    /**
     * Put complex types with string properties
     *
     * @param {object} complexBody Please put 'goodrequest', '', and null
     * 
     * @param {string} [complexBody.field]
     * 
     * @param {string} [complexBody.empty]
     * 
     * @param {string} [complexBody.null]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putString(complexBody: models.StringWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putString(complexBody: models.StringWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with date properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getDate(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DateWrapper>): void;
    getDate(callback: ServiceCallback<models.DateWrapper>): void;

    /**
     * Put complex types with date properties
     *
     * @param {object} complexBody Please put '0001-01-01' and '2016-02-29'
     * 
     * @param {date} [complexBody.field]
     * 
     * @param {date} [complexBody.leap]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putDate(complexBody: models.DateWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putDate(complexBody: models.DateWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with datetime properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getDateTime(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DatetimeWrapper>): void;
    getDateTime(callback: ServiceCallback<models.DatetimeWrapper>): void;

    /**
     * Put complex types with datetime properties
     *
     * @param {object} complexBody Please put '0001-01-01T12:00:00-04:00' and
     * '2015-05-18T11:38:00-08:00'
     * 
     * @param {date} [complexBody.field]
     * 
     * @param {date} [complexBody.now]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putDateTime(complexBody: models.DatetimeWrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putDateTime(complexBody: models.DatetimeWrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with datetimeRfc1123 properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getDateTimeRfc1123(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Datetimerfc1123Wrapper>): void;
    getDateTimeRfc1123(callback: ServiceCallback<models.Datetimerfc1123Wrapper>): void;

    /**
     * Put complex types with datetimeRfc1123 properties
     *
     * @param {object} complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and
     * 'Mon, 18 May 2015 11:38:00 GMT'
     * 
     * @param {date} [complexBody.field]
     * 
     * @param {date} [complexBody.now]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putDateTimeRfc1123(complexBody: models.Datetimerfc1123Wrapper, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putDateTimeRfc1123(complexBody: models.Datetimerfc1123Wrapper, callback: ServiceCallback<void>): void;

    /**
     * Get complex types with duration properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getDuration(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DurationWrapper>): void;
    getDuration(callback: ServiceCallback<models.DurationWrapper>): void;

    /**
     * Put complex types with duration properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {moment.duration} [options.field]
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putDuration(options: { field? : moment.Duration, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putDuration(callback: ServiceCallback<void>): void;

    /**
     * Get complex types with byte properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getByte(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.ByteWrapper>): void;
    getByte(callback: ServiceCallback<models.ByteWrapper>): void;

    /**
     * Put complex types with byte properties
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {buffer} [options.field]
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putByte(options: { field? : Buffer, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putByte(callback: ServiceCallback<void>): void;
}

/**
 * @class
 * ArrayModel
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface ArrayModel {

    /**
     * Get complex types with array property
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getValid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.ArrayWrapper>): void;
    getValid(callback: ServiceCallback<models.ArrayWrapper>): void;

    /**
     * Put complex types with array property
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {array} [options.arrayParameter]
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValid(options: { arrayParameter? : string[], customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValid(callback: ServiceCallback<void>): void;

    /**
     * Get complex types with array property which is empty
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getEmpty(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.ArrayWrapper>): void;
    getEmpty(callback: ServiceCallback<models.ArrayWrapper>): void;

    /**
     * Put complex types with array property which is empty
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {array} [options.arrayParameter]
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putEmpty(options: { arrayParameter? : string[], customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putEmpty(callback: ServiceCallback<void>): void;

    /**
     * Get complex types with array property while server doesn't provide a
     * response payload
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getNotProvided(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.ArrayWrapper>): void;
    getNotProvided(callback: ServiceCallback<models.ArrayWrapper>): void;
}

/**
 * @class
 * Dictionary
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface Dictionary {

    /**
     * Get complex types with dictionary property
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getValid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DictionaryWrapper>): void;
    getValid(callback: ServiceCallback<models.DictionaryWrapper>): void;

    /**
     * Put complex types with dictionary property
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.defaultProgram]
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValid(options: { defaultProgram? : { [propertyName: string]: string }, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValid(callback: ServiceCallback<void>): void;

    /**
     * Get complex types with dictionary property which is empty
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getEmpty(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DictionaryWrapper>): void;
    getEmpty(callback: ServiceCallback<models.DictionaryWrapper>): void;

    /**
     * Put complex types with dictionary property which is empty
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.defaultProgram]
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putEmpty(options: { defaultProgram? : { [propertyName: string]: string }, customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putEmpty(callback: ServiceCallback<void>): void;

    /**
     * Get complex types with dictionary property which is null
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getNull(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DictionaryWrapper>): void;
    getNull(callback: ServiceCallback<models.DictionaryWrapper>): void;

    /**
     * Get complex types with dictionary property while server doesn't provide a
     * response payload
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getNotProvided(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.DictionaryWrapper>): void;
    getNotProvided(callback: ServiceCallback<models.DictionaryWrapper>): void;
}

/**
 * @class
 * Inheritance
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface Inheritance {

    /**
     * Get complex types that extend others
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getValid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Siamese>): void;
    getValid(callback: ServiceCallback<models.Siamese>): void;

    /**
     * Put complex types that extend others
     *
     * @param {object} complexBody Please put a siamese with id=2, name="Siameee",
     * color=green, breed=persion, which hates 2 dogs, the 1st one named "Potato"
     * with id=1 and food="tomato", and the 2nd one named "Tomato" with id=-1 and
     * food="french fries".
     * 
     * @param {string} [complexBody.breed]
     * 
     * @param {string} [complexBody.color]
     * 
     * @param {array} [complexBody.hates]
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValid(complexBody: models.Siamese, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValid(complexBody: models.Siamese, callback: ServiceCallback<void>): void;
}

/**
 * @class
 * Polymorphism
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface Polymorphism {

    /**
     * Get complex types that are polymorphic
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getValid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Fish>): void;
    getValid(callback: ServiceCallback<models.Fish>): void;

    /**
     * Put complex types that are polymorphic
     *
     * @param {object} complexBody Please put a salmon that looks like this:
     * {
     * 'fishtype':'Salmon',
     * 'location':'alaska',
     * 'iswild':true,
     * 'species':'king',
     * 'length':1.0,
     * 'siblings':[
     * {
     * 'fishtype':'Shark',
     * 'age':6,
     * 'birthday': '2012-01-05T01:00:00Z',
     * 'length':20.0,
     * 'species':'predator',
     * },
     * {
     * 'fishtype':'Sawshark',
     * 'age':105,
     * 'birthday': '1900-01-05T01:00:00Z',
     * 'length':10.0,
     * 'picture': new Buffer([255, 255, 255, 255,
     * 254]).toString('base64'),
     * 'species':'dangerous',
     * },
     * {
     * 'fishtype': 'goblin',
     * 'age': 1,
     * 'birthday': '2015-08-08T00:00:00Z',
     * 'length': 30.0,
     * 'species': 'scary',
     * 'jawsize': 5
     * }
     * ]
     * };
     * 
     * @param {string} [complexBody.species]
     * 
     * @param {number} [complexBody.length]
     * 
     * @param {array} [complexBody.siblings]
     * 
     * @param {string} [complexBody.fishtype] Polymorhpic Discriminator
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValid(complexBody: models.Fish, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValid(complexBody: models.Fish, callback: ServiceCallback<void>): void;

    /**
     * Put complex types that are polymorphic, attempting to omit required
     * 'birthday' field - the request should not be allowed from the client
     *
     * @param {object} complexBody Please attempt put a sawshark that looks like
     * this, the client should not allow this data to be sent:
     * {
     * "fishtype": "sawshark",
     * "species": "snaggle toothed",
     * "length": 18.5,
     * "age": 2,
     * "birthday": "2013-06-01T01:00:00Z",
     * "location": "alaska",
     * "picture": base64(FF FF FF FF FE),
     * "siblings": [
     * {
     * "fishtype": "shark",
     * "species": "predator",
     * "birthday": "2012-01-05T01:00:00Z",
     * "length": 20,
     * "age": 6
     * },
     * {
     * "fishtype": "sawshark",
     * "species": "dangerous",
     * "picture": base64(FF FF FF FF FE),
     * "length": 10,
     * "age": 105
     * }
     * ]
     * }
     * 
     * @param {string} [complexBody.species]
     * 
     * @param {number} [complexBody.length]
     * 
     * @param {array} [complexBody.siblings]
     * 
     * @param {string} [complexBody.fishtype] Polymorhpic Discriminator
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValidMissingRequired(complexBody: models.Fish, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValidMissingRequired(complexBody: models.Fish, callback: ServiceCallback<void>): void;
}

/**
 * @class
 * Polymorphicrecursive
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AzureCompositeModel.
 */
export interface Polymorphicrecursive {

    /**
     * Get complex types that are polymorphic and have recursive references
     *
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    getValid(options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<models.Fish>): void;
    getValid(callback: ServiceCallback<models.Fish>): void;

    /**
     * Put complex types that are polymorphic and have recursive references
     *
     * @param {object} complexBody Please put a salmon that looks like this:
     * {
     * "fishtype": "salmon",
     * "species": "king",
     * "length": 1,
     * "age": 1,
     * "location": "alaska",
     * "iswild": true,
     * "siblings": [
     * {
     * "fishtype": "shark",
     * "species": "predator",
     * "length": 20,
     * "age": 6,
     * "siblings": [
     * {
     * "fishtype": "salmon",
     * "species": "coho",
     * "length": 2,
     * "age": 2,
     * "location": "atlantic",
     * "iswild": true,
     * "siblings": [
     * {
     * "fishtype": "shark",
     * "species": "predator",
     * "length": 20,
     * "age": 6
     * },
     * {
     * "fishtype": "sawshark",
     * "species": "dangerous",
     * "length": 10,
     * "age": 105
     * }
     * ]
     * },
     * {
     * "fishtype": "sawshark",
     * "species": "dangerous",
     * "length": 10,
     * "age": 105
     * }
     * ]
     * },
     * {
     * "fishtype": "sawshark",
     * "species": "dangerous",
     * "length": 10,
     * "age": 105
     * }
     * ]
     * }
     * 
     * @param {string} [complexBody.species]
     * 
     * @param {number} [complexBody.length]
     * 
     * @param {array} [complexBody.siblings]
     * 
     * @param {string} [complexBody.fishtype] Polymorhpic Discriminator
     * 
     * @param {object} [options] Optional Parameters.
     * 
     * @param {object} [options.customHeaders] Headers that will be added to the
     * request
     * 
     * @param {ServiceCallback} [callback] callback function; see ServiceCallback
     * doc in ms-rest index.d.ts for details
     */
    putValid(complexBody: models.Fish, options: { customHeaders? : { [headerName: string]: string; } }, callback: ServiceCallback<void>): void;
    putValid(complexBody: models.Fish, callback: ServiceCallback<void>): void;
}
