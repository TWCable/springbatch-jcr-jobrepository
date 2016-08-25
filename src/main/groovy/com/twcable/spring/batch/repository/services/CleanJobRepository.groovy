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

package com.twcable.spring.batch.repository.services

interface CleanJobRepository {

    /**
     * This API is used to clean Grabbit's JCR Job Repository. It removes all job executions and all associated
     * job instances etc. that are @param hours older than NOW (time when this API is called)
     * @return Collection of JobExecutionIds that were removed
     */
    public Collection<String> cleanJobRepository(int hours)

}
