/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.lookout.api.composite;

import com.alipay.lookout.api.*;

/**
 * MixinMetric is a mixin of basic metric types.
 * This metric can build a sub metric(for examples: Counter, Timer, DistributionSummary, Gauge)
 * Created by kevin.luy@alipay.com on 2017/2/14.
 */
public interface MixinMetric extends Metric {

    Counter counter(String componentCounterName);

    Timer timer(String componentTimerName);

    DistributionSummary distributionSummary(String componentDistributionSummaryName);

    <T extends Number> Gauge<T> gauge(String componentGaugeName, Gauge<T> componentGauge);
}
