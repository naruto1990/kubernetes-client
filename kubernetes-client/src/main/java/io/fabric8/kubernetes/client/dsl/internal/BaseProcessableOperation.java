/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.kubernetes.client.dsl.internal;

import com.ning.http.client.AsyncHttpClient;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.client.dsl.ProcessableClientResource;

import java.net.URL;

public abstract class BaseProcessableOperation<T extends HasMetadata, L extends KubernetesResourceList, D extends Doneable<T>, R extends ProcessableClientResource<T, D>>
  extends HasMetadataOperation<T, L, D, R> implements ProcessableClientResource<T,D> {

  protected BaseProcessableOperation(AsyncHttpClient httpClient, URL rootUrl, String resourceT, String namespace, String name) {
    super(httpClient, rootUrl, resourceT, namespace, name);
  }
}
