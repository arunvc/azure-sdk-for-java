/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.logic.v2018_07_01_preview.Workflows;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowVersions;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowTriggers;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowVersionTriggers;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowTriggerHistories;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRuns;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActions;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRepetitions;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRepetitionsRequestHistories;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionRequestHistories;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunActionScopeRepetitions;
import com.microsoft.azure.management.logic.v2018_07_01_preview.WorkflowRunOperations;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccounts;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountAssemblies;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountBatchConfigurations;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountSchemas;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountMaps;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountPartners;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountAgreements;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountCertificates;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountSessions;
import com.microsoft.azure.management.logic.v2018_07_01_preview.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Logic resource management.
 */
public final class LogicManager extends ManagerCore<LogicManager, LogicManagementClientImpl> {
    private Workflows workflows;
    private WorkflowVersions workflowVersions;
    private WorkflowTriggers workflowTriggers;
    private WorkflowVersionTriggers workflowVersionTriggers;
    private WorkflowTriggerHistories workflowTriggerHistories;
    private WorkflowRuns workflowRuns;
    private WorkflowRunActions workflowRunActions;
    private WorkflowRunActionRepetitions workflowRunActionRepetitions;
    private WorkflowRunActionRepetitionsRequestHistories workflowRunActionRepetitionsRequestHistories;
    private WorkflowRunActionRequestHistories workflowRunActionRequestHistories;
    private WorkflowRunActionScopeRepetitions workflowRunActionScopeRepetitions;
    private WorkflowRunOperations workflowRunOperations;
    private IntegrationAccounts integrationAccounts;
    private IntegrationAccountAssemblies integrationAccountAssemblies;
    private IntegrationAccountBatchConfigurations integrationAccountBatchConfigurations;
    private IntegrationAccountSchemas integrationAccountSchemas;
    private IntegrationAccountMaps integrationAccountMaps;
    private IntegrationAccountPartners integrationAccountPartners;
    private IntegrationAccountAgreements integrationAccountAgreements;
    private IntegrationAccountCertificates integrationAccountCertificates;
    private IntegrationAccountSessions integrationAccountSessions;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create LogicManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new LogicManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of LogicManager that exposes Logic resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the LogicManager
    */
    public static LogicManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new LogicManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of LogicManager that exposes Logic resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the LogicManager
    */
    public static LogicManager authenticate(RestClient restClient, String subscriptionId) {
        return new LogicManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of LogicManager that exposes Logic management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Logic management API entry points that work across subscriptions
        */
        LogicManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Workflows.
     */
    public Workflows workflows() {
        if (this.workflows == null) {
            this.workflows = new WorkflowsImpl(this);
        }
        return this.workflows;
    }

    /**
     * @return Entry point to manage WorkflowVersions.
     */
    public WorkflowVersions workflowVersions() {
        if (this.workflowVersions == null) {
            this.workflowVersions = new WorkflowVersionsImpl(this);
        }
        return this.workflowVersions;
    }

    /**
     * @return Entry point to manage WorkflowTriggers.
     */
    public WorkflowTriggers workflowTriggers() {
        if (this.workflowTriggers == null) {
            this.workflowTriggers = new WorkflowTriggersImpl(this);
        }
        return this.workflowTriggers;
    }

    /**
     * @return Entry point to manage WorkflowVersionTriggers.
     */
    public WorkflowVersionTriggers workflowVersionTriggers() {
        if (this.workflowVersionTriggers == null) {
            this.workflowVersionTriggers = new WorkflowVersionTriggersImpl(this);
        }
        return this.workflowVersionTriggers;
    }

    /**
     * @return Entry point to manage WorkflowTriggerHistories.
     */
    public WorkflowTriggerHistories workflowTriggerHistories() {
        if (this.workflowTriggerHistories == null) {
            this.workflowTriggerHistories = new WorkflowTriggerHistoriesImpl(this);
        }
        return this.workflowTriggerHistories;
    }

    /**
     * @return Entry point to manage WorkflowRuns.
     */
    public WorkflowRuns workflowRuns() {
        if (this.workflowRuns == null) {
            this.workflowRuns = new WorkflowRunsImpl(this);
        }
        return this.workflowRuns;
    }

    /**
     * @return Entry point to manage WorkflowRunActions.
     */
    public WorkflowRunActions workflowRunActions() {
        if (this.workflowRunActions == null) {
            this.workflowRunActions = new WorkflowRunActionsImpl(this);
        }
        return this.workflowRunActions;
    }

    /**
     * @return Entry point to manage WorkflowRunActionRepetitions.
     */
    public WorkflowRunActionRepetitions workflowRunActionRepetitions() {
        if (this.workflowRunActionRepetitions == null) {
            this.workflowRunActionRepetitions = new WorkflowRunActionRepetitionsImpl(this);
        }
        return this.workflowRunActionRepetitions;
    }

    /**
     * @return Entry point to manage WorkflowRunActionRepetitionsRequestHistories.
     */
    public WorkflowRunActionRepetitionsRequestHistories workflowRunActionRepetitionsRequestHistories() {
        if (this.workflowRunActionRepetitionsRequestHistories == null) {
            this.workflowRunActionRepetitionsRequestHistories = new WorkflowRunActionRepetitionsRequestHistoriesImpl(this);
        }
        return this.workflowRunActionRepetitionsRequestHistories;
    }

    /**
     * @return Entry point to manage WorkflowRunActionRequestHistories.
     */
    public WorkflowRunActionRequestHistories workflowRunActionRequestHistories() {
        if (this.workflowRunActionRequestHistories == null) {
            this.workflowRunActionRequestHistories = new WorkflowRunActionRequestHistoriesImpl(this);
        }
        return this.workflowRunActionRequestHistories;
    }

    /**
     * @return Entry point to manage WorkflowRunActionScopeRepetitions.
     */
    public WorkflowRunActionScopeRepetitions workflowRunActionScopeRepetitions() {
        if (this.workflowRunActionScopeRepetitions == null) {
            this.workflowRunActionScopeRepetitions = new WorkflowRunActionScopeRepetitionsImpl(this);
        }
        return this.workflowRunActionScopeRepetitions;
    }

    /**
     * @return Entry point to manage WorkflowRunOperations.
     */
    public WorkflowRunOperations workflowRunOperations() {
        if (this.workflowRunOperations == null) {
            this.workflowRunOperations = new WorkflowRunOperationsImpl(this);
        }
        return this.workflowRunOperations;
    }

    /**
     * @return Entry point to manage IntegrationAccounts.
     */
    public IntegrationAccounts integrationAccounts() {
        if (this.integrationAccounts == null) {
            this.integrationAccounts = new IntegrationAccountsImpl(this);
        }
        return this.integrationAccounts;
    }

    /**
     * @return Entry point to manage IntegrationAccountAssemblies.
     */
    public IntegrationAccountAssemblies integrationAccountAssemblies() {
        if (this.integrationAccountAssemblies == null) {
            this.integrationAccountAssemblies = new IntegrationAccountAssembliesImpl(this);
        }
        return this.integrationAccountAssemblies;
    }

    /**
     * @return Entry point to manage IntegrationAccountBatchConfigurations.
     */
    public IntegrationAccountBatchConfigurations integrationAccountBatchConfigurations() {
        if (this.integrationAccountBatchConfigurations == null) {
            this.integrationAccountBatchConfigurations = new IntegrationAccountBatchConfigurationsImpl(this);
        }
        return this.integrationAccountBatchConfigurations;
    }

    /**
     * @return Entry point to manage IntegrationAccountSchemas.
     */
    public IntegrationAccountSchemas integrationAccountSchemas() {
        if (this.integrationAccountSchemas == null) {
            this.integrationAccountSchemas = new IntegrationAccountSchemasImpl(this);
        }
        return this.integrationAccountSchemas;
    }

    /**
     * @return Entry point to manage IntegrationAccountMaps.
     */
    public IntegrationAccountMaps integrationAccountMaps() {
        if (this.integrationAccountMaps == null) {
            this.integrationAccountMaps = new IntegrationAccountMapsImpl(this);
        }
        return this.integrationAccountMaps;
    }

    /**
     * @return Entry point to manage IntegrationAccountPartners.
     */
    public IntegrationAccountPartners integrationAccountPartners() {
        if (this.integrationAccountPartners == null) {
            this.integrationAccountPartners = new IntegrationAccountPartnersImpl(this);
        }
        return this.integrationAccountPartners;
    }

    /**
     * @return Entry point to manage IntegrationAccountAgreements.
     */
    public IntegrationAccountAgreements integrationAccountAgreements() {
        if (this.integrationAccountAgreements == null) {
            this.integrationAccountAgreements = new IntegrationAccountAgreementsImpl(this);
        }
        return this.integrationAccountAgreements;
    }

    /**
     * @return Entry point to manage IntegrationAccountCertificates.
     */
    public IntegrationAccountCertificates integrationAccountCertificates() {
        if (this.integrationAccountCertificates == null) {
            this.integrationAccountCertificates = new IntegrationAccountCertificatesImpl(this);
        }
        return this.integrationAccountCertificates;
    }

    /**
     * @return Entry point to manage IntegrationAccountSessions.
     */
    public IntegrationAccountSessions integrationAccountSessions() {
        if (this.integrationAccountSessions == null) {
            this.integrationAccountSessions = new IntegrationAccountSessionsImpl(this);
        }
        return this.integrationAccountSessions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public LogicManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return LogicManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private LogicManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new LogicManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}