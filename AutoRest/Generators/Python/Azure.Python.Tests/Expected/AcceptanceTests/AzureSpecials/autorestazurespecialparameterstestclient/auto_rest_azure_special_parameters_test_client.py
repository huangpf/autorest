# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import ServiceClient
from msrest import Serializer, Deserializer
from msrestazure import AzureConfiguration
from .operations.xms_client_request_id_operations import XMsClientRequestIdOperations
from .operations.subscription_in_credentials_operations import SubscriptionInCredentialsOperations
from .operations.subscription_in_method_operations import SubscriptionInMethodOperations
from .operations.api_version_default_operations import ApiVersionDefaultOperations
from .operations.api_version_local_operations import ApiVersionLocalOperations
from .operations.skip_url_encoding_operations import SkipUrlEncodingOperations
from .operations.odata_operations import OdataOperations
from .operations.header_operations import HeaderOperations
from . import models


class AutoRestAzureSpecialParametersTestClientConfiguration(AzureConfiguration):
    """Configuration for AutoRestAzureSpecialParametersTestClient
    Note that all parameters used to create this instance are saved as instance
    attributes.

    :param credentials: Gets Azure subscription credentials.
    :type credentials: credentials
    :param subscription_id: The subscription id, which appears in the path,
     always modeled in credentials. The value is always '1234-5678-9012-3456'
    :type subscription_id: str
    :param api_version: The api version, which appears in the query, the
     value is always '2015-07-01-preview'
    :type api_version: str
    :param accept_language: Gets or sets the preferred language for the
     response.
    :type accept_language: str
    :param long_running_operation_retry_timeout: Gets or sets the retry
     timeout in seconds for Long Running Operations. Default value is 30.
    :type long_running_operation_retry_timeout: int
    :param generate_client_request_id: When set to true a unique
     x-ms-client-request-id value is generated and included in each request.
     Default is true.
    :type generate_client_request_id: bool
    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, credentials, subscription_id, api_version='2015-07-01-preview', accept_language='en-US', long_running_operation_retry_timeout=30, generate_client_request_id=True, base_url=None, filepath=None):

        if credentials is None:
            raise ValueError('credentials must not be None.')
        if subscription_id is None:
            raise ValueError('subscription_id must not be None.')
        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestAzureSpecialParametersTestClientConfiguration, self).__init__(base_url, filepath)

        self.add_user_agent('autorestazurespecialparameterstestclient/2015-07-01-preview')

        self.credentials = credentials
        self.subscription_id = subscription_id
        self.api_version = api_version
        self.accept_language = accept_language
        self.long_running_operation_retry_timeout = long_running_operation_retry_timeout
        self.generate_client_request_id = generate_client_request_id


class AutoRestAzureSpecialParametersTestClient(object):
    """Test Infrastructure for AutoRest

    :param config: Configuration for client.
    :type config: AutoRestAzureSpecialParametersTestClientConfiguration

    :ivar xms_client_request_id: XMsClientRequestId operations
    :vartype xms_client_request_id: .operations.XMsClientRequestIdOperations
    :ivar subscription_in_credentials: SubscriptionInCredentials operations
    :vartype subscription_in_credentials: .operations.SubscriptionInCredentialsOperations
    :ivar subscription_in_method: SubscriptionInMethod operations
    :vartype subscription_in_method: .operations.SubscriptionInMethodOperations
    :ivar api_version_default: ApiVersionDefault operations
    :vartype api_version_default: .operations.ApiVersionDefaultOperations
    :ivar api_version_local: ApiVersionLocal operations
    :vartype api_version_local: .operations.ApiVersionLocalOperations
    :ivar skip_url_encoding: SkipUrlEncoding operations
    :vartype skip_url_encoding: .operations.SkipUrlEncodingOperations
    :ivar odata: Odata operations
    :vartype odata: .operations.OdataOperations
    :ivar header: Header operations
    :vartype header: .operations.HeaderOperations
    """

    def __init__(self, config):

        self._client = ServiceClient(config.credentials, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.xms_client_request_id = XMsClientRequestIdOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.subscription_in_credentials = SubscriptionInCredentialsOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.subscription_in_method = SubscriptionInMethodOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.api_version_default = ApiVersionDefaultOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.api_version_local = ApiVersionLocalOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.skip_url_encoding = SkipUrlEncodingOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.odata = OdataOperations(
            self._client, self.config, self._serialize, self._deserialize)
        self.header = HeaderOperations(
            self._client, self.config, self._serialize, self._deserialize)
