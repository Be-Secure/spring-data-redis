/*
 * Copyright 2017-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.redis.connection;

import org.springframework.dao.support.PersistenceExceptionTranslator;

/**
 * Thread-safe factory of reactive Redis connections.
 *
 * @author Mark Paluch
 * @since 2.0
 * @see reactor.core.publisher.Mono
 * @see reactor.core.publisher.Flux
 * @see ReactiveRedisConnection
 * @see ReactiveRedisClusterConnection
 */
public interface ReactiveRedisConnectionFactory extends PersistenceExceptionTranslator {

	/**
	 * @return a reactive Redis connection.
	 * @throws IllegalStateException if the connection factory requires initialization and the factory was not yet
	 *           initialized.
	 */
	ReactiveRedisConnection getReactiveConnection();

	/**
	 * @return a reactive Redis Cluster connection.
	 * @throws IllegalStateException if the connection factory requires initialization and the factory was not yet
	 *           initialized.
	 */
	ReactiveRedisClusterConnection getReactiveClusterConnection();
}
