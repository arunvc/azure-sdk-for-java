/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation;

import com.microsoft.azure.management.notificationhubs.v2017_04_01.CheckAvailabilityResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.notificationhubs.v2017_04_01.Sku;
import java.util.Map;

class CheckAvailabilityResultImpl extends WrapperImpl<CheckAvailabilityResultInner> implements CheckAvailabilityResult {
    private final NotificationHubsManager manager;
    CheckAvailabilityResultImpl(CheckAvailabilityResultInner inner, NotificationHubsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NotificationHubsManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAvailiable() {
        return this.inner().isAvailiable();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}