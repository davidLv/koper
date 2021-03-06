/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhaimi.message.demo.dataevent.listener;

import com.zhaimi.message.demo.dataevent.entity.Order;
import com.zhaimi.message.event.DataListener;
import org.springframework.stereotype.Component;

/**
 * @author caie
 * @since 1.2
 */
@Component
@DataListener(dataObject = "com.zhaimi.message.demo.dataevent.mapper.impl.OrderMapperImpl")
public class OrderListener {

    public void onInsertOrder(Order order) {
        System.out.println("orderNo : " + order.getOrderNo());
        System.out.println("create time : " + order.getCreatedTime());
    }

    public void onUpdateOrder(Order order) {
        System.out.println("orderNo : " + order.getOrderNo());
        System.out.println("create time :" + order.getCreatedTime());
    }

}
