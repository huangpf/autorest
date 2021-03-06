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

from .resource import Resource


class FlattenedProduct(Resource):
    """FlattenedProduct

    :param str id: Resource Id
    :param str type: Resource Type
    :param dict tags:
    :param str location: Resource Location
    :param str name: Resource Name
    :param str pname:
    :param str flattened_product_type:
    :param str provisioning_state_values: Possible values include:
     'Succeeded', 'Failed', 'canceled', 'Accepted', 'Creating', 'Created',
     'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'
    :param str provisioning_state:
    """

    _required = []

    _attribute_map = {
        'pname': {'key': 'properties.pname', 'type': 'str', 'flatten': True},
        'flattened_product_type': {'key': 'properties.type', 'type': 'str', 'flatten': True},
        'provisioning_state_values': {'key': 'properties.provisioningStateValues', 'type': 'str', 'flatten': True},
        'provisioning_state': {'key': 'properties.provisioningState', 'type': 'str', 'flatten': True},
    }

    def __init__(self, id=None, type=None, tags=None, location=None, name=None, pname=None, flattened_product_type=None, provisioning_state_values=None, provisioning_state=None):
        super(FlattenedProduct, self).__init__(id=id, type=type, tags=tags, location=location, name=name)
        self.pname = pname
        self.flattened_product_type = flattened_product_type
        self.provisioning_state_values = provisioning_state_values
        self.provisioning_state = provisioning_state
