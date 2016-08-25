/*
 * Copyright 2015 Time Warner Cable, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.twcable.spring.batch.repository

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

/**
 * A simple base class that is extended by all the DAOs
 */
@CompileStatic
@Slf4j
abstract class AbstractJcrDao {

    public static final String ROOT_RESOURCE_NAME = "/var/grabbit/job/repository"

    protected abstract void ensureRootResource()
}
