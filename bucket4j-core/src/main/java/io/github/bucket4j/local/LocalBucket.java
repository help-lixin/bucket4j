/*-
 * ========================LICENSE_START=================================
 * Bucket4j
 * %%
 * Copyright (C) 2015 - 2020 Vladimir Bukhtoyarov
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

package io.github.bucket4j.local;

import io.github.bucket4j.Bucket;
import io.github.bucket4j.BucketConfiguration;
import io.github.bucket4j.TimeMeter;

/**
 * Represents the bucket inside current JVM.
 */
public interface LocalBucket extends Bucket {

    /**
     * Returns configuration of this bucket.
     *
     * @return configuration
     */
    BucketConfiguration getConfiguration();

    TimeMeter getTimeMeter();

}
