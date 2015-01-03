/**
 * Copyright 2012 Netflix, Inc.
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
package com.netflix.hystrix.contrib.javanica.exception;

/**
 * Indicates that something is going wrong with caching logic.
 *
 * @author dmgcodevil
 */
public class HystrixCacheKeyGeneratorException extends RuntimeException {

    public HystrixCacheKeyGeneratorException() {
    }

    public HystrixCacheKeyGeneratorException(String message) {
        super(message);
    }

    public HystrixCacheKeyGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public HystrixCacheKeyGeneratorException(Throwable cause) {
        super(cause);
    }
}
