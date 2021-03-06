/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A2A specific policy details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
public class A2APolicyDetails extends PolicyProviderSpecificDetails {
    /**
     * The recovery point threshold in minutes.
     */
    @JsonProperty(value = "recoveryPointThresholdInMinutes")
    private Integer recoveryPointThresholdInMinutes;

    /**
     * The duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistory")
    private Integer recoveryPointHistory;

    /**
     * The app consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /**
     * A value indicating whether multi-VM sync has to be enabled.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private String multiVmSyncStatus;

    /**
     * The crash consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /**
     * Get the recovery point threshold in minutes.
     *
     * @return the recoveryPointThresholdInMinutes value
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recovery point threshold in minutes.
     *
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the duration in minutes until which the recovery points need to be stored.
     *
     * @return the recoveryPointHistory value
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the duration in minutes until which the recovery points need to be stored.
     *
     * @param recoveryPointHistory the recoveryPointHistory value to set
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
        return this;
    }

    /**
     * Get the app consistent snapshot frequency in minutes.
     *
     * @return the appConsistentFrequencyInMinutes value
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the app consistent snapshot frequency in minutes.
     *
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get a value indicating whether multi-VM sync has to be enabled.
     *
     * @return the multiVmSyncStatus value
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set a value indicating whether multi-VM sync has to be enabled.
     *
     * @param multiVmSyncStatus the multiVmSyncStatus value to set
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the crash consistent snapshot frequency in minutes.
     *
     * @return the crashConsistentFrequencyInMinutes value
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crash consistent snapshot frequency in minutes.
     *
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

}
