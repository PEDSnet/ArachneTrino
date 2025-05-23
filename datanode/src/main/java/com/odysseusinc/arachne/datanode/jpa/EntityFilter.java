/*
 * Copyright 2024 Odysseus Data Services, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.odysseusinc.arachne.datanode.jpa;

import jakarta.persistence.criteria.Predicate;

/**
 * Predicate-building function way to filter specific type of entities by an arbitrary criteria.
 *
 * @param <E> entity type
 */
@FunctionalInterface
public interface EntityFilter<E> extends JpaFunction<E, Predicate> {

}
