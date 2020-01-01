/*
 *
 * Copyright 2015-2018 Vladimir Bukhtoyarov
 *
 *       Licensed under the Apache License, Version 2.0 (the "License");
 *       you may not use this file except in compliance with the License.
 *       You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package io.github.bucket4j;

import io.github.bucket4j.serialization.SerializationHandle;

import java.util.Collection;
import java.util.Collections;

/**
 * Represents an extension point of bucket4j library.
 *
 * @param <T> type of builder for buckets
 */
public interface Extension<T extends AbstractBucketBuilder<T>> {

    /**
     * Creates new instance of builder specific for this particular extension.
     *
     * @return new builder instance
     */
    T builder();


    /**
     * @return serializers
     */
    default Collection<SerializationHandle<?>> getSerializers() {
        return Collections.emptyList();
    }

}
