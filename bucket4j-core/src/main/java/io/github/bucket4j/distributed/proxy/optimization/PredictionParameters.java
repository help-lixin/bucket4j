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
package io.github.bucket4j.distributed.proxy.optimization;

import java.time.Duration;

public class PredictionParameters {

    public static final int DEFAULT_MIN_SAMPLES = 2;
    public static final int DEFAULT_MAX_SAMPLES = 10;

    public final int minSamples;
    public final int maxSamples;
    public final long sampleMaxAgeNanos;

    public PredictionParameters(int minSamples, int maxSamples, Duration sampleMaxAge) {
        this(minSamples, maxSamples, sampleMaxAge.toNanos());
    }

    public PredictionParameters(int minSamples, int maxSamples, long maxUnsynchronizedTimeoutNanos) {
        // TODO argument validation
        this.minSamples = minSamples;
        this.maxSamples = maxSamples;
        this.sampleMaxAgeNanos = maxUnsynchronizedTimeoutNanos;
    }

    public static PredictionParameters createDefault(DelayParameters delayParameters) {
        long sampleMaxAge = delayParameters.maxUnsynchronizedTimeoutNanos * 2;
        return new PredictionParameters(DEFAULT_MIN_SAMPLES, DEFAULT_MAX_SAMPLES, sampleMaxAge);
    }

    public int getMinSamples() {
        return minSamples;
    }

    public int getMaxSamples() {
        return maxSamples;
    }

    public long getSampleMaxAgeNanos() {
        return sampleMaxAgeNanos;
    }

}
