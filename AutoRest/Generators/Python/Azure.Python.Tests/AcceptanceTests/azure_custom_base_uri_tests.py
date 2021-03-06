﻿# --------------------------------------------------------------------------
#
# Copyright (c) Microsoft Corporation. All rights reserved.
#
# The MIT License (MIT)
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the ""Software""), to
# deal in the Software without restriction, including without limitation the
# rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
# sell copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
# FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
# IN THE SOFTWARE.
#
# --------------------------------------------------------------------------

import unittest
import subprocess
import sys
import isodate
import tempfile
import json
from uuid import uuid4
from datetime import date, datetime, timedelta
import os
from os.path import dirname, pardir, join, realpath, sep, pardir

cwd = dirname(realpath(__file__))
root = realpath(join(cwd , pardir, pardir, pardir, pardir, pardir))
sys.path.append(join(root, "ClientRuntimes" , "Python", "msrest"))
sys.path.append(join(root, "ClientRuntimes" , "Python", "msrestazure"))
log_level = int(os.environ.get('PythonLogLevel', 30))

tests = realpath(join(cwd, pardir, "Expected", "AcceptanceTests"))
sys.path.append(join(tests, "CustomBaseUri"))

from msrest.serialization import Deserializer
from msrest.exceptions import DeserializationError
from msrest.authentication import BasicTokenAuthentication

from autorestparameterizedhosttestclient import (
    AutoRestParameterizedHostTestClient,
    AutoRestParameterizedHostTestClientConfiguration)

from autorestparameterizedhosttestclient.models import Error, ErrorException


class CustomBaseUriTests(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        cred = BasicTokenAuthentication({"access_token" :str(uuid4())})
        config = AutoRestParameterizedHostTestClientConfiguration(cred, host="host:3000")

        config.log_level = log_level
        cls.client = AutoRestParameterizedHostTestClient(config)
        return super(CustomBaseUriTests, cls).setUpClass()
    # TODO: re-enable all tests once x-ms-parameterized-host is functional in python
    # def test_custom_base_uri_positive(self):

    #     self.client.paths.get_empty("local")

    # def test_custom_base_uri_negative(self):

    #     with self.assertRaises(ErrorException):
    #         self.client.paths.get_empty("bad")

    #     with self.assertRaises(ValueError):
    #         self.client.paths.get_empty(None)

    #     self.client.config.host = "badhost:3000"
    #     with self.assertRaises(ErrorException):
    #         self.client.paths.get_empty("local")

if __name__ == '__main__':
    
    
    unittest.main()