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

from .pet import Pet


class Dog(Pet):
    """Dog

    :param int id:
    :param str name:
    :param str food:
    """

    _required = []

    _attribute_map = {
        'food': {'key': 'food', 'type': 'str'},
    }

    def __init__(self, id=None, name=None, food=None):
        super(Dog, self).__init__(id=id, name=name)
        self.food = food
